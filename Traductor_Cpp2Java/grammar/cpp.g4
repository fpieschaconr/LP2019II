grammar cpp;

@parser::members{
    public static String tran = "";
}

translationunit
:
	components EOF { tran = $components.trad; }
;

components returns [String trad]: global {$trad = $global.trad;}
          | resource_specification {$trad = $resource_specification.trad;} (t1=components {$trad += $t1.trad;})?
          | resource_body {$trad = $resource_body.trad;}
          ;

global returns [String trad] : GLOBAL ID {$trad = "";} (constant {$trad += $constant.trad;} | type {$trad += $type.trad;}) END {$trad += System.lineSeparator();}
        ;

resource_specification returns [String trad, String ca]: RESOURCE ID {$trad = "procedure " + $ID.text +"(";} (IMPORT ID)? {$ca = "";}(declarations{$ca += $declarations.trad+System.lineSeparator();})* (spec_body[$ca]{$trad += $spec_body.trad;})*
                      | RESOURCE ID LPARENT {$trad = "procedure "+ $ID.text +"(";} (parameters {$trad += $parameters.trad;})? RPARENT {$trad+= ");"+System.lineSeparator();}(declarations{$trad += $declarations.trad;})* {$trad += System.lineSeparator()+ "begin" + System.lineSeparator();}(statements{$trad += $statements.trad;})* (INITIAL t1=block END {$trad += System.lineSeparator()+$t1.trad;})? (proc {$trad += $proc.trad;})+ (FINAL t2=block END{$trad += System.lineSeparator()+$t2.trad;})? END{$trad += System.lineSeparator()+ "end;" + System.lineSeparator();}
                      ;

resource_body returns [String trad]: BODY ID {$trad = "";}(declarations{$trad += $declarations.trad;})? (INITIAL t1=block END {$trad += $t1.trad;})? (proc {$trad += $proc.trad;})+ (FINAL t2=block END {$trad += $t2.trad;})? END{$trad += System.lineSeparator()+ "end" + System.lineSeparator();}
             ;

spec_body[String declar] returns [String trad]:
       END {$trad = ");"+System.lineSeparator()+$declar;}{$trad += System.lineSeparator()+ "begin" + System.lineSeparator()+ "end;" + System.lineSeparator();}
   |   BODY ID {$trad = "";} LPARENT (parameters{$trad += $parameters.trad;})? RPARENT {$trad += ");"+System.lineSeparator()+$declar + System.lineSeparator()+ "begin" + System.lineSeparator();} t1=block{$trad += $t1.trad;} (INITIAL t2=block END{$trad += $t2.trad;})? (proc)* (FINAL t3=block END{$trad += $t3.trad;})? END (ID)? {$trad += System.lineSeparator()+ "end;" + System.lineSeparator();}
   |   RESOURCE ID {$trad = "";} LPARENT (parameters{$trad += $parameters.trad;})? RPARENT SEPARATE{$trad += ");"+System.lineSeparator();}
   ;

proc returns [String trad] : PROC ID LPARENT {$trad = "function "+ $ID.text +"(";} (id_subs_lp {$trad += $id_subs_lp.trad;})? RPARENT {$trad+= ")";} (RETURNS result_id {$trad += " : "+$result_id.trad;})? block {$trad += ";"+System.lineSeparator()+$block.trad;} END {$trad += System.lineSeparator()+ "end;" + System.lineSeparator();}
     ;

block returns [String trad]: block_items {$trad = $block_items.trad;}
   ;

block_items returns [String trad]: {$trad = "";}(block_item {$trad += $block_item.trad;})?
   |   t1=block_items {$trad = $t1.trad;} (';' {$trad += ";" + System.lineSeparator();})? block_item {$trad += $block_item.trad;}
   ;

block_item returns [String trad]: declarations {$trad = $declarations.trad;}
   |   statements {$trad = $statements.trad;}
   |   expression {$trad = $expression.trad;}
   ;

declarations returns [String trad]: constant{$trad = $constant.trad;} (declarations {$trad += $declarations.trad;})?
            | type {$trad = $type.trad;} (declarations{$trad += $declarations.trad;})?
            | op_type {$trad = $op_type.trad;} (declarations{$trad += $declarations.trad;})?
            | variable {$trad = $variable.trad;}
            | operation {$trad = $operation.trad;} (declarations{$trad += $declarations.trad;})?
            ;

constant returns [String trad] : CONST ID ASIGNACION expression {$trad = "const"+System.lineSeparator()+$ID.text+" := "+$expression.trad;}
         ;

type returns [String trad]: TYPE ID OPERADOR_COMPARACION t type_res {$trad = $TYPE.text + " " + $ID.text +" "+ $OPERADOR_COMPARACION.text +" "+ $t.trad + $type_res.trad;}
    ;

op_type returns [String trad]: OPTYPE ID OPERADOR_COMPARACION LPARENT {$trad = $OPTYPE.text+ " "+$ID.text+ " "+$OPERADOR_COMPARACION.text+ " ( ";}(parameters{$trad += $parameters.trad;})?  RPARENT {$trad += ") ";}(RETURNS result_id {$trad += " : "+$result_id.trad;})? {$trad += ";";}
       ;

variable returns [String trad]: VAR id_subs_lp ':' t {$trad = "var"+System.lineSeparator() + $id_subs_lp.trad+" : "+ $t.trad;} (ASIGNACION expression{$trad += " = "+$expression.trad;})?{$trad += ";"+System.lineSeparator();}
        | VAR id_subs_lp ASIGNACION expression {$trad = "var"+System.lineSeparator()+$id_subs_lp.trad+" := "+$expression.trad+";"+ System.lineSeparator();}
        ;

operation returns [String trad]: OP id_subs_lp op_prototype {$trad = $OP.text+ " " + $id_subs_lp.trad +" "+$op_prototype.trad; }(RETURNS result_id{$trad += " : "+$result_id.trad;})?{$trad += ";"+ System.lineSeparator();}
         | OP {$trad = $OP.text +" ";}((id_subs_lp{$trad += $id_subs_lp.trad + " ";})? ':' ID {$trad +=": "+$ID.text;}(','{$trad += " , ";})? )*{$trad += ";" + System.lineSeparator();}
         ;

statements returns [String trad]: sequential {$trad = $sequential.trad;}
          | op_invocation {$trad = $op_invocation.trad;}
          | op_service {$trad = $op_service.trad;}
          | resource_control {$trad = $resource_control.trad;}
          | explicit_call {$trad = $explicit_call.trad;}
          ;

explicit_call returns [String trad]: CALL invocation {$trad = $CALL.text +" "+$invocation.trad+";"+System.lineSeparator();}
        ;

invocation returns [String trad]: expression LPARENT {$trad = $expression.trad + " (";}(actuals{$trad += $actuals.trad;})? RPARENT {$trad += ")";}
        ;

sequential returns [String trad]: SKP {$trad = "skip";}
          | variable ASIGNACION expression {$trad = $variable.trad + " := " + $expression.trad+";"+System.lineSeparator();}
          | variable INCREMENTO {$trad = "inc("+ $variable.trad+");"+System.lineSeparator();}
          | variable DECREMENTO {$trad = "dec("+ $variable.trad+");"+System.lineSeparator();}
          | IF expr1 EJECUTA block (SEPARA)? FI {$trad = "if "+ $expr1.trad + " then"+System.lineSeparator()+$block.trad+System.lineSeparator();}
          | DO expr1 EJECUTA block (SEPARA)? OD {$trad = "do "+ $expr1.trad + " then"+System.lineSeparator()+$block.trad+System.lineSeparator();}
          | FA quantifier1 EJECUTA block AF {$trad = "for "+$quantifier1.trad+" do"+System.lineSeparator()+$block.trad+System.lineSeparator();}
          | EXIT {$trad = "exit";}
          | NEXT {$trad = "next";}
          ;

op_invocation returns [String trad]: {$trad = "";}(CALL{$trad = "call ";})? operation {$trad += $operation.trad;}(expression{$trad += " "+$expression.trad;})?{$trad += ";"+System.lineSeparator();}
             | SEND invocation {$trad = "send "+ $invocation.trad+ ";"+System.lineSeparator();}
             | CO {$trad = "co ";}(quantifier{$trad += $quantifier.trad+" ";})? (CALL{$trad += "call ";})? operation {$trad += $operation.trad+" ";}(expression{$trad += $expression.trad+" ";})? (EJECUTA block {$trad += "do "+$block.trad+" ";})? OC{$trad += "oc;"+System.lineSeparator();}
             ;

op_service returns [String trad]: IN {$trad = "in ";} (in_cmd{$trad += $in_cmd.trad+" ";})* NI{$trad += "ni;"+System.lineSeparator();}
          | RECEIVE operation {$trad = "recieve "+$operation.trad + " ";}(variable{$trad += $variable.trad+" ";})?{$trad += ";"+System.lineSeparator();}
          | RETURN {$trad = "return;"+System.lineSeparator();}
          | REPLY {$trad = "reply;"+System.lineSeparator();}
          ;

in_cmd returns [String trad]: {$trad = "";}(quantifier{$trad = $quantifier.trad+" ";})? qualified_id{$trad += $qualified_id.trad+" ";} (subscripts{$trad += $subscripts.trad+" ";})? LPARENT{$trad += "(";} (id_list{$trad += $id_list.trad;})? RPARENT{$trad += ") ";} ('&' expr1{$trad += "and "+$expr1.trad+" ";})? (BY expression{$trad += "by "+$expression.trad+" ";})? (RETURNS result_id{$trad += ": "+$result_id.trad+" ";})? EJECUTA block {$trad += "do "+$block.trad;}(SEPARA)?
    ;

resource_control returns [String trad]: t1=ID ASIGNACION CREATE t2=ID LPARENT {$trad = $t1.text+" := create "+$t2.text+"(";}(actuals{$trad += $actuals.trad;})? RPARENT {$trad += ") ";}(ON t3=ID{$trad += "on "+$t3.text;})?
                | DESTROY expression {$trad = "destroy "+$expression.trad+";"+System.lineSeparator();}
                ;

t returns [String trad]: basic_type {$trad = $basic_type.trad;}
   |   enum_def {$trad = $enum_def.trad;}
   |   pointer_def {$trad = $pointer_def.trad;}
   |   record_def {$trad = $record_def.trad;}
   |   union_def {$trad = $union_def.trad;}
   |   capability_def {$trad = $capability_def.trad;}(t{$trad += " "+$t.trad;})?
   |   qualified_id {$trad = $qualified_id.trad;}
   ;

basic_type returns [String trad]:
       BOOL {$trad = "boolean";}
   |   CHAR {$trad = "char";}
   |   INT {$trad = "integer";}
   |   FILE {$trad = "file";}
   |   REAL {$trad = "real";}
   ;

enum_def returns [String trad]:
       ENUM LPARENT id_list RPARENT {$trad = "enum("+$id_list.trad+")";}
   ;

pointer_def returns [String trad]:
       PTR type {$trad = "^"+$type.trad;}
   |   PTR ANY {$trad = "^any";}
   ;

record_def returns [String trad]:
       REC LPARENT  id_subs_lp ':' t{$trad = "rec("+$id_subs_lp.trad+" : "+$t.trad;}(ASIGNACION expression{$trad += " = "+$expression.trad;})? RPARENT{$trad += ")";}
      | REC LPARENT id_subs_lp ASIGNACION expression RPARENT{$trad = "rec("+$id_subs_lp.trad+" := "+$expression.trad+")";}
   ;

union_def returns [String trad]:
       UNION LPARENT id_subs_lp ':' t{$trad = "union("+$id_subs_lp.trad+" : "+$t.trad;}(ASIGNACION expression{$trad += " = "+$expression.trad;})? RPARENT{$trad += ")";}
     | UNION LPARENT id_subs_lp ASIGNACION expression RPARENT{$trad = "union("+$id_subs_lp.trad+" := "+$expression.trad+")";}
   ;

capability_def returns [String trad]:
      CAP cap_for {$trad = "cap "+ $cap_for.trad;}
   ;

cap_for returns [String trad]:
       qualified_id {$trad = $qualified_id.trad;}
   |   op_prototype {$trad = $op_prototype.trad;}
   |   SEM {$trad = "sem";}
   |   VM {$trad = "vm";}
   ;

prototype returns [String trad]: LPARENT parameters RPARENT {$trad ="("+$parameters.trad+")";}(RETURNS result_id{$trad += " : "+$result_id.trad;})?
    ;

op_prototype returns [String trad]: prototype {$trad = $prototype.trad;}(LBRACE op_res RBRACE{$trad += "{"+$op_res.trad+"}";})?
    ;

op_res returns [String trad]: CALL {$trad = "call";}
    | SEND {$trad = "send";}
    | CALL ',' SEND {$trad = "call, send";}
    | SEND ',' CALL {$trad = "send, call";}
    ;

id_list returns [String trad]: expression {$trad = $expression.trad;}
        | {$trad = "";}(expression ',' id_list{$trad = $expression.trad+", "+$id_list.trad;})?
        | {$trad = "";}(expression ':' id_list{$trad = $expression.trad+" : "+$id_list.trad;})?
        ;

result_id returns [String trad]: t {$trad = $t.trad;}
        | {$trad = "";}(id_list ':' t{$trad = $id_list.trad+" : "+$t.trad;})?
        ;

type_res returns [String trad]: {$trad = "";}(LBRACE ID RBRACE{$trad = "{"+$ID.text+"}";})?
        ;

subscripts returns [String trad]: LBRACKET id_list RBRACKET{$trad ="["+$id_list.trad+"]";}
          ;

id_subs_lp returns [String trad]: id_subs {$trad = $id_subs.trad;}
          | t1=id_subs_lp ',' id_subs {$trad = $t1.trad+", "+$id_subs.trad;}
          ;

id_subs returns [String trad]: ID {$trad = $ID.text;}
       | ID subscripts {$trad = $ID.text+" "+$subscripts.trad;}
       ;

parameters returns [String trad]: parameters2 {$trad = $parameters2.trad;}
        | parameters2 ';' parameters {$trad = $parameters2.trad+"; "+$parameters.trad;}
        ;

parameters2 returns [String trad]: id_subs_lp ':' t {$trad = $id_subs_lp.trad+" : "+$t.trad;}
            ;

expression returns [String trad]: expr1 op_log expression {$trad = $expr1.trad+" "+$op_log.trad+" "+$expression.trad;}
          | '!' expr1 {$trad = "!"+$expr1.trad;}
          | expr1 {$trad = $expr1.trad;}
          | expr1 ASIGNACION expression {$trad = $expr1.trad + " := "+$expression.trad;}
          | {$trad = "";}(ID{$trad = $ID.text;})? LPARENT {$trad += "(";}(actuals{$trad += $actuals.trad;})? RPARENT{$trad += ")";}
          ;

op_log returns [String trad]: '&' {$trad = " and ";}
      | '||' {$trad = " or ";}
      ;

expr1 returns [String trad]: expr2 OPERADOR_COMPARACION expr2 {$trad = $expr2.trad+" "+$OPERADOR_COMPARACION.text+" "+$expr2.trad;}
     | expr2 {$trad = $expr2.trad;}
     ;

expr2 returns [String trad]: expr3 OPERADOR_ARITMETICO expr2 {$trad = $expr3.trad+" "+$OPERADOR_ARITMETICO.text+" "+$expr2.trad;}
     | expr3 {$trad = $expr3.trad;}
     ;

expr3 returns [String trad]: ID {$trad = $ID.text;}
     | NUM {$trad = $NUM.text;}
     | TRUE {$trad = $TRUE.text;}
     | FALSE {$trad = $FALSE.text;}
     | id_subs_lp {$trad = $id_subs_lp.trad;}
     | qualified_id {$trad = $qualified_id.trad;}
     | CADENA {$trad = $CADENA.text;}
     | NULL {$trad = $NULL.text;}
     ;

quantifier returns [String trad]: '(' quantifier1 ')' {$trad = "("+$quantifier1.trad+")";}
          ;

quantifier1 returns [String trad]: quantifier2 {$trad = $quantifier2.trad;}
           | quantifier2 ',' quantifier1 {$trad = $quantifier2.trad + ", "+ $quantifier1.trad;}
           ;

quantifier2 returns [String trad]: ID ASIGNACION t1=expression direction t2=expression step_opt such_that_opt {$trad = $ID.text + " := "+$t1.trad+" "+$direction.trad+" "+$t2.trad+" "+$step_opt.trad+" "+$such_that_opt.trad;}
           ;

direction returns [String trad]: TO {$trad = "to";}
          | DOWNTO {$trad = "down to";}
          ;

step_opt returns [String trad]: {$trad = "";}(BY expression{$trad = $BY.text+" "+$expression.trad;})?
        ;

such_that_opt returns [String trad]: {$trad = "";}(SUCHTHAT expression{$trad = $SUCHTHAT.text+" "+$expression.trad;})?
            ;

actuals returns [String trad]: expression {$trad = $expression.trad;}
       | expression ',' actuals {$trad = $expression.trad + ", " + $actuals.trad;}
       ;

qualified_id returns [String trad]:
        ID {$trad = $ID.text;}
      | t1=ID '.' t2=ID {$trad = $t1.text +"."+ $t2.text;}
      ;

GLOBAL   : 'global';
END      : 'end';
IMPORT   : 'import';
RESOURCE : 'resource';
INT      : 'int';
VAR      : 'var';
IF       : 'if';
FI       : 'fi';
ELSE     : 'else';
EXTEND   : 'extend';
BODY     : 'body';
IN       : 'in';
NI       : 'ni';
CALL     : 'call';
FA       : 'fa';
AF       : 'af';
LPARENT  : '(';
RPARENT  : ')';
LBRACKET : '[';
RBRACKET : ']';
INITIAL  : 'inital';
CONST    : 'const';
RETURNS  : 'returns';
RETURN   : 'return';
TO       : 'to';
DOWNTO   : 'downto';
FINAL    : 'final';
OP       : 'op';
DO       : 'do';
OD       : 'od';
PROC     : 'proc';
CO       : 'co';
OC       : 'oc';
CAP      : 'cap';
SEND     : 'send';
DESTROY  : 'destroy';
BEGIN    : 'begin';
RECEIVE  : 'receive';
CREATE   : 'create';
OPTYPE   : 'optype';
BY       : 'by';
SUCHTHAT : 'st';
TYPE     : 'type';
NULL     : 'null';
BOOL     : 'bool';
VAL      : 'val';
RES      : 'res';
REF      : 'ref';
EXIT     : 'exit';
NEXT     : 'next';
FILE     : 'file';
PRIVATE  : 'private';
OR       : 'or';
INDEX    : 'index';
MOD      : 'mod';
STOP     : 'stop';
PROCEDURE: 'procedure';
AND      : 'and';
REAL     : 'real';
ON       : 'on';
ROW      : 'row';
TRUE     : 'true';
SENDER   : 'sender';
LEFT     : 'left';
UP       : 'up';
ABORT    : 'abort';
REPLY    : 'reply';
PROCESS  : 'process';
CHAR     : 'char';
STRING   : 'string';
FALSE    : 'false';
LOW      : 'low';
HIGH     : 'high';
NEW      : 'new';
ENUM     : 'enum';
ANY      : 'any';
REC      : 'rec';
PTR      : 'ptr';
UNION    : 'union';
VM       : 'vm';
SEM      : 'sem';
XOR      : 'xor';
SKP     : 'skip';
FORWARD  : 'forward';
SEPARATE : 'separate';
V        : 'V';
P        : 'P';
EJECUTA  : '->';
NUM      : ( '-'?[0-9]+ | '-'?[0-9]+( | [.][0-9]+) ) ;
SEPARA   : '[]';
LBRACE   : '{' ;
RBRACE   : '}' ;
ASIGNACION : ':=';
SWAP       : ':=:';
INCREMENTO : '++';
DECREMENTO : '--';
DESPLAZAR_IZQ : '<<';
DESPLAZAR_DER : '>>';
AUG        : ( '+:=' | '-:=' | '*:=' | '/:=' | '%:=' | '+:=' | '**:=' );
OPERADOR_ARITMETICO    : ('+' | '-' | '*' | '/' | '%' | '**' );
OPERADOR_COMPARACION   : ( '=' | '>' | '<' | '<=' | '>=' | '!=' );
CADENA          : ('"' .*? '"' | '“' .*? '”' | '\'' .*? '\'');
ESP      : [ \t\r\n]+ -> skip ;
LINE_COMMENT   : '#' ~[\r\n]* -> skip ;
ID       : [a-zA-Z][a-zA-Z0-9_]* ;