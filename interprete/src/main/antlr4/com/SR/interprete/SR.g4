grammar SR;

@parser::header {
	import java.util.Map;
	import java.util.HashMap;
}

@parser::members {
	Map<String, Object> symbolTable = new HashMap<String, Object>();
}
/*************************  productions & actions  *************************/
component:
	    /* null */
	|   spec_component     TK_SEPARATOR	{ YYACCEPT; }
	|   combined_component TK_SEPARATOR	{ YYACCEPT; }
	|   separate_body      TK_SEPARATOR	{ YYACCEPT; }
	//|   error				/* re-sync */
	;

spec_component:
	    comp_label spec_stmt_ls spec_body	{ restree->e_l->e_l = $2; }
	;

combined_component:
	    combined_specpart body_stmt_ls end_id {
						checkid (resid, "end", $3); 
						restree->e_r = bnode
						    (O_BODY, NULLNODE, $2);
						}
	;

combined_specpart:
	    comp_label comp_params		{ stop_echo ($2);
						  restree->e_l->e_r = $2;
						}
	;

comp_label:
	    comp_kwd TK_ID			{ restree = $1;
						  restree->e_l=newnode(O_SPEC);
						  resid = $2;
						  root = bnode (O_COMPONENT,
						      resid, restree);
						  start_echo (root);
						}
	;

comp_kwd:
	    TK_GLOBAL				{ $$ = newnode (O_GLOBAL); }
	|   TK_RESOURCE				{ $$ = newnode (O_RESOURCE); }
	;


spec_body:
	    {stop_echo(NULLNODE);} end_id	/* no explicit body */
						/* (invent one if global) */
						{ checkid (resid, "end", $2);
						  if (restree->e_opr==O_GLOBAL)
						      restree->e_r =
							  newnode (O_BODY);
						}

	|   TK_BODY TK_ID maybe_params {stop_echo($3);} body_stmt_ls end_id {
						checkid (resid, "body", $2);
						checkid (resid, "end", $6);
						restree->e_l->e_r = $3;
						restree->e_r = bnode
						    (O_BODY, NULLNODE, $5);
						}

	|   TK_BODY TK_ID maybe_params {stop_echo($3);} TK_SEPARATE {
						checkid (resid, "body", $2);
						restree->e_l->e_r = $3;
						restree->e_r = bnode (O_BODY,
						    NULLNODE,
						    newnode(O_SEPARATE));
						}
	;

maybe_params:
	    /* null */	{ $$ = NULLNODE; 
			  if (restree->e_opr != O_GLOBAL)
			      FATAL ("missing parameter list for resource");
			}
	|   comp_params
	;

comp_params:
	    parameters	{ $$ = $1;
			  if (restree->e_opr == O_GLOBAL && $$ != NULLNODE) {
			      FATAL("a global cannot have a parameter list");
			      $$ = NULLNODE;
			  }
			}
	;

separate_body:
	    TK_BODY TK_ID body_stmt_ls end_id	{
					checkid ($2, "body", $4);
					resid = $2;
					restree = bnode (O_RESOURCE, NULLNODE,
						bnode (O_BODY, NULLNODE, $3));
					root = bnode 
						(O_COMPONENT, resid, restree); 
					}
	;



/*************************  spec/body contents  *************************/

spec_stmt_ls:
	    spec_stmt				{ $$ = $1; }
	|   spec_stmt_ls TK_SEPARATOR spec_stmt	{ $$ = bnode (O_SEQ, $1, $3); }
	;

spec_stmt:
	    common_stmt				{ $$ = $1; }
	|   extend_clause			{ $$ = $1; }
	|   body_only	{ FATAL ("statement not allowed in specification part");
						  $$ = NULLNODE; }
	;


body_stmt_ls:
	    body_stmt				{ $$ = $1; }
	|   body_stmt_ls TK_SEPARATOR body_stmt	{ $$ = bnode (O_SEQ, $1, $3); }
	;

body_stmt:
	    common_stmt				{ $$ = $1; }
	|   expr  /* causes s/r if in _only */	{ $$ = $1; }
	|   body_only				{ $$ = $1; }
	|   extend_clause  { FATAL ("extend is not allowed in component body");
						  $$ = NULLNODE; }
	;

body_only:
	    stmt				{ $$ = $1; }
	|   proc				{ $$ = $1; }
	|   process				{ $$ = $1; }
	|   procedure				{ $$ = $1; }
	|   initial_block			{ $$ = $1; }
	|   final_block				{ $$ = $1; }
	;


common_stmt:
	    /* null */				{ $$ = NULLNODE; }
	|   decl				{ $$ = $1; }
	|   import_clause			{ $$ = $1; }
	;


import_clause:
	    TK_IMPORT {*dopr=O_IMPORT;} import_list	{ $$ = $3; }
	;

extend_clause:
	    TK_EXTEND {*dopr=O_EXTEND;} import_list
		{ $$ = $3;
		  if (restree->e_opr == O_GLOBAL)
		      FATAL ("`extend' is not allowed in a global");
		}
	;

import_list:
	    import_name				{ $$ = $1; }
	|   import_list TK_COMMA import_name	{ $$ = bnode (O_SEQ, $1, $3); }
	;

import_name:
	    TK_ID				{ $$ = unode (*dopr, $1); }
	;


/*************************  top-level body stmtents  *************************/

op_decl:
	    op_or_ext oper_def_lp		{ $$ = $2; }
	;

op_or_ext:
	    TK_OP				{ *dopr = O_OP; }
	|   TK_EXTERNAL				{ *dopr = O_EXTERNAL; }
	;

oper_def_lp:
	    oper_def				{ $$ = $1; }
	|   oper_def_lp TK_COMMA oper_def	{ $$ = bnode (O_SEQ, $1, $3); }
	;

oper_def:
	    id_subs_lp op_prototype		{ $$ = blist (*dopr,$1,$2); }
	|   id_subs_lp colon_opt qualified_id	{ $$ = blist (*dopr,$1,$3); }
	;

colon_opt:
	    /* null */				{ $$ = NULLNODE; }
	|   TK_COLON				{ $$ = NULLNODE; }
	;


sem_decl:
	    TK_SEM sem_def_lp			{ $$ = $2; }
	;

sem_def_lp:
	    sem_def				{ $$ = $1; }
	|   sem_def_lp TK_COMMA sem_def		{ $$ = bnode (O_SEQ, $1, $3); }
	;

sem_def:
	    id_subs sem_proto sem_init		{ $$ = bnode (O_SEM,
						    bnode (O_OP, $1, $2),
						    $3); }
	;

sem_proto:
	    return_spec_null			{ $$ = bnode(O_PROTO,
						    unode (O_LIST, $1),
						    newnode (O_RSEND)); }
	;

sem_init:
	    /* null */				{ $$ = NULLNODE; }
	|   TK_ASSIGN expr			{ $$ = $2; }
	;



proc:
	    TK_PROC TK_ID param_names
	        block
	    end_id				{ checkid ($2, "end", $5);
						  $$ = bnode (O_PROC, $3, $4);
						  $4->e_l = $2; }
	;


procedure:
	    TK_PROCEDURE TK_ID prototype
		block
	    end_id	{		/* make an OP followed by a PROC */

	    Nodeptr o, prc, e;
	    checkid ($2, "end", $5);
	    $3->e_r = newnode (O_RCALL);
	    $4->e_l = idnode ($2->e_name);

	    o = bnode (O_OP, unode (O_SUBS, $2), $3);
	    prc = bnode (O_PROC, NULLNODE, $4); 
	    prc->e_locn = $2->e_locn;
	    for (e = $3->e_l; e != NULL; e = e->e_r)
		prc->e_l = lcat (prc->e_l, idnode (e->e_l->e_l->e_l->e_name));
	    $$ = bnode (O_SEQ, o, prc);
	    }
	;


process:
	    TK_PROCESS TK_ID return_spec_null quantifiers_opt
		block
	    end_id	{		/* make PROCESS above OP and PROC */

	    Nodeptr o, prc, e, l;
	    checkid ($2, "end", $6);
	    $5->e_l = idnode ($2->e_name);

	    l = unode (O_LIST, $3);			/* proto param list */
	    o = bnode (O_OP, 				/* op declaration */
		unode (O_SUBS, $2),
		bnode (O_PROTO, l, newnode (O_RSEND)));
	    for (e = $4; e != NULL; e = e->e_r)		/* add quant params */
		l = lcat (l, bnode (O_PARDCL,
		    unode (O_SUBS, idnode (e->e_l->e_r->e_l->e_l->e_name)),
		    bnode (O_PARATT, newnode (O_INT), newnode (O_VAL))));

	    prc = bnode (O_PROC, NULLNODE, $5);		/* proc */
	    prc->e_locn = $2->e_locn;
	    for (e = l; e != NULL; e = e->e_r)		/* quant params again */
		prc->e_l = lcat (prc->e_l, idnode (e->e_l->e_l->e_l->e_name));

	    $$ = bnode (O_PROCESS, bnode (O_SEQ, o, prc), $4);
	    }
	;


initial_block:					/* for compatibility */
	    TK_INITIAL
		{ WARN ("`initial' treated as `begin'"); }
		block
	    TK_END initial_opt			{ $3->e_l = idnode("[initial]");
						  $$ = $3; }
	;

initial_opt:
	    /* null */				{ $$ = NULLNODE; }
	|   TK_INITIAL				{ $$ = NULLNODE; }
	;


final_block:
	    TK_FINAL
	        block
	    TK_END final_opt			{ $$ = unode (O_FINAL, $2); }
	;

final_opt:
	    /* null */				{ $$ = NULLNODE; }
	|   TK_FINAL				{ $$ = NULLNODE; }
	;



/******************************  parameters  ******************************/



prototype:
	    parameters return_spec_opt		{ $$ = bnode (O_PROTO,
						    bnode (O_LIST, $2, $1),
						    newnode (O_RNONE)); }
	;

parameters:
	    TK_LPAREN param_spec_ls TK_RPAREN	{ $$ = $2; }
	;

param_spec_ls:
	    /* null */				{ $$ = NULLNODE; }
	|   param_spec_lp			{ $$ = $1; }
	;

param_spec_lp:
	    param_spec				{ $$ = $1; }
	|   param_spec TK_SEPARATOR		{ $$ = $1; }
	|   param_spec TK_SEPARATOR param_spec_lp  { $$ = lcat ($1, $3); }
	;

param_spec:
	    param_kind_opt type			{ $$ = unode (O_LIST,
						    bnode (O_PARDCL,
						      unode (O_SUBS,
						        idnode (NULLSTR)),
						      bnode (O_PARATT,
							$2, $1))); }
	|   param_kind_opt id_subs_lp TK_COLON type
						{ $$ = blist (O_PARDCL, $2,
						    bnode (O_PARATT, $4, $1)); }
	;

param_kind_opt:
	    /* null */				{ $$ = newnode (O_VAL); }
	|   TK_VAL				{ $$ = newnode (O_VAL); }
	|   TK_VAR				{ $$ = newnode (O_VAR); }
	|   TK_RES				{ $$ = newnode (O_RES); }
	|   TK_REF				{ $$ = newnode (O_REF); }
	;

/*  For uniformity, a parameter list always begins with an entry for the
 *  return value.  This is always present; if nothing is returned, a VOID
 *  parameter is entered.
 */

return_spec_opt:
	    return_spec_null			{ $$ = $1; }

	|   TK_RETURNS type			{ $$ = bnode (O_PARDCL,
						    unode (O_SUBS,
						      idnode (NULLSTR)),
						    bnode (O_PARATT,
						      $2, newnode (O_RES))); }
	|   TK_RETURNS id_subs TK_COLON type	{ $$ = bnode (O_PARDCL,
						    $2,
						    bnode (O_PARATT,
						      $4, newnode (O_RES))); }
	|   TK_RETURNS TK_ID TK_BOGUS	/* never possible, prevents r/r confl */
	;

return_spec_null:
	    /* null */				{ $$ = bnode (O_PARDCL,
						    unode (O_SUBS,
						      idnode (NULLSTR)),
						    bnode (O_PARATT,
						      newnode (O_VOID),
						      newnode (O_RES))); }
	;



/* param list without types, with optional return */
param_names:
	    TK_LPAREN id_ls TK_RPAREN return_name_opt
						{ $$ = bnode (O_LIST,$4,$2); }
	;

return_name_opt:
	    /* null */				{ $$ = idnode (NULLSTR); }
	|   TK_RETURNS TK_ID			{ $$ = $2; }
	;



/******************************  declaration  ******************************/

decl:
	//    error TK_SEPARATOR	/* re-sync */	{ $$ = NULLNODE; }
	   type_decl				{ $$ = $1; }
	|   obj_decl				{ $$ = $1; }
	|   optype_decl				{ $$ = $1; }
	|   sem_decl				{ $$ = $1; }
	|   op_decl				{ $$ = $1; }
	;


type_decl:
	    TK_TYPE TK_ID TK_EQ type type_restriction
						{ $$ = bnode (O_TYPE, $2, $4); }
	;

type_restriction:		/* to give decent err msg for v1 construct */
	    /* null */			{ }
	|   TK_LBRACE TK_ID TK_RBRACE	{ WARN("type restriction ignored"); }
	;

obj_decl:
	    var_or_const var_def_lp		{ $$ = $2; }
	;

var_or_const:
	    TK_VAR	/* illegal in spec */	{ *dopr = O_VARDCL; }
	|   TK_CONST				{ *dopr = O_CONDCL; }
	;

var_def_lp:
	    var_def				{ $$ = $1; }
	|   var_def_lp TK_COMMA var_def		{ $$ = lcat ($1, $3); }
	;

var_def:
	    id_subs_lp var_att		{ if ($1->e_r && $2->e_r)
					      FATAL ("multiple initialization");
					  $$ = blist (*dopr, $1, $2);
					}
	;

var_att:
	    TK_COLON type		  { $$ = bnode (O_VARATT,$2,NULLNODE); }
	|   TK_COLON type TK_ASSIGN expr  { $$ = bnode (O_VARATT,$2,$4); }
	|                 TK_ASSIGN expr  { $$ = bnode (O_VARATT,NULLNODE,$2); }
	|   TK_SEPARATOR
			    { FATAL("missing type and/or initial value");
			      $$ = bnode (O_VARATT,newnode(O_INT),NULLNODE); }
	;



/*************************  type specification  *************************/

type:
	    subscripts unsub_type		{ $$ = mkarray($1, $2); }
	|   unsub_type				{ $$ = $1; }
	;

unsub_type:
	    basic_type				{ $$ = $1; }
	|   string_def				{ $$ = $1; }
	|   enum_def				{ $$ = $1; }
	|   pointer_def				{ $$ = $1; }
	|   record_def				{ $$ = $1; }
	|   union_def				{ $$ = $1; }
	|   capability_def			{ $$ = $1; }
	|   qualified_id			{ $$ = unode (O_TYPENAME, $1); }
	;

basic_type:
	    TK_BOOL				{ $$ = newnode (O_BOOL); }
	|   TK_CHAR				{ $$ = newnode (O_CHAR); }
	|   TK_INT				{ $$ = newnode (O_INT); }
	|   TK_FILE				{ $$ = newnode (O_FFILE); }
	|   TK_REAL				{ $$ = newnode (O_REAL); }
	;

string_def:
	    TK_STRING TK_LBRACKET string_lim TK_RBRACKET
						{ $$ = unode (O_STRING, $3); }
	|   TK_STRING TK_LPAREN string_lim TK_RPAREN {
					  WARN ("old-style string declaration");
						  $$ = unode (O_STRING, $3); }
	;

string_lim:
	    expr				{ $$ = $1; }
	|   TK_ASTER				{ $$ = newnode (O_ASTER); }
	;

enum_def:
	    TK_ENUM TK_LPAREN id_lp TK_RPAREN	{ $$ = unode (O_ENUM, $3); }
	;

pointer_def:
	    TK_PTR type			{ $$ = unode (O_PTR, $2); }
	|   TK_PTR TK_ANY		{ $$ = unode (O_PTR, newnode (O_ANY)); }
	;

record_def:
	    TK_REC TK_LPAREN field_lp TK_RPAREN	{ $$ = unode (O_REC, $3); }
	;

union_def:
	    TK_UNION TK_LPAREN field_lp TK_RPAREN {
					  WARN ("`union' treated as `rec'"); 
					  $$ = unode (O_REC, $3); 
					}
	;

field_lp:
	    field				{ $$ = $1; }
	|   field TK_SEPARATOR			{ $$ = $1; }
	|   field TK_SEPARATOR field_lp		{ $$ = lcat ($1, $3); }
	;

field:
	    {*++dopr = O_FLDDCL;} var_def_lp	{ $$ = $2; --dopr; }
	;

capability_def:
	   TK_CAP cap_for			{ $$ = unode (O_CAP, $2); }
	;

cap_for:
	    qualified_id			{ $$ = $1; }
	|   op_prototype			{ $$ = $1; }
	|   TK_SEM sem_proto			{ $$ = $2; }
	|   TK_VM				{ $$ = newnode (O_VM); }
	;




/******************************  optype  ******************************/

optype_decl:
	    TK_OPTYPE TK_ID eq_opt op_prototype { $$ = bnode (O_OPTYPE,$2,$4); }
	;

op_prototype:
	    prototype op_restriction_opt	{ $1->e_r = $2; $$ = $1; }
	;

eq_opt:
	    /* null */				{ $$ = NULLNODE; }
	|   TK_EQ				{ $$ = NULLNODE; }
	;

op_restriction_opt:
	    /* null */		 TK_LBRACE	{ $$ = newnode (O_RNONE); }
	|   TK_LBRACE op_restriction TK_RBRACE	{ $$ = $2; }
	;

op_restriction:	
	    TK_CALL				{ $$ = newnode (O_RCALL); }
	|   TK_SEND				{ $$ = newnode (O_RSEND); }
	|   TK_CALL TK_COMMA TK_SEND		{ $$ = newnode (O_RNONE); }
	|   TK_SEND TK_COMMA TK_CALL		{ $$ = newnode (O_RNONE); }
	;


/*************************  blocks and statements  *************************/

block:
	    block_items				{ $$ = bnode 
						    (O_BLOCK, NULLNODE, $1); }
	;

block_items:
	    block_item				{ $$ = $1; }
	|   block_items TK_SEPARATOR block_item	{ $$ = bnode (O_SEQ, $1, $3); }
	;

block_item:
	    /* null */				{ $$ = NULLNODE; }
	|   decl				{ $$ = $1; }
	|   stmt				{ $$ = $1; }
	|   expr				{ $$ = $1; }
	|   import_clause			{ $$ = $1; }
	;

stmt:
	    skip_stmt				{ $$ = $1; }
	|   stop_stmt				{ $$ = $1; }
	|   exit_stmt				{ $$ = $1; }
	|   next_stmt				{ $$ = $1; }
	|   return_stmt				{ $$ = $1; }
	|   reply_stmt				{ $$ = $1; }
	|   forward_stmt			{ $$ = $1; }
	|   send_stmt				{ $$ = $1; }
	|   explicit_call			{ $$ = $1; }
	|   destroy_stmt			{ $$ = $1; }
	|   begin_end				{ $$ = $1; }
	|   if_stmt				{ $$ = $1; }
	|   do_stmt				{ $$ = $1; }
	|   for_all_stmt			{ $$ = $1; }
	|   V_stmt				{ $$ = $1; }
	|   input_stmt				{ $$ = $1; }
	|   receive_stmt			{ $$ = $1; }
	|   P_stmt				{ $$ = $1; }
	|   concurrent_stmt			{ $$ = $1; }
	;

skip_stmt:
	    TK_SKIP				{ $$ = newnode (O_SKIP); }
	;

stop_stmt:
	    TK_STOP exit_code_opt		{ $$ = unode (O_STOP, $2); }
	;

exit_code_opt:
	    /* null */				{ $$ = intnode (0); }
	|   TK_LPAREN expr TK_RPAREN		{ $$ = $2; }
	;

exit_stmt:
	    TK_EXIT				{ $$ = newnode (O_EXIT); }
	;

next_stmt:
	    TK_NEXT				{ $$ = newnode (O_NEXT); }
	;

return_stmt:
	    TK_RETURN				{ $$ = newnode (O_RETURN); }
	;

reply_stmt:
	    TK_REPLY				{ $$ = newnode (O_REPLY); }
	;

forward_stmt:
	    TK_FORWARD invocation		{ $$ = $2;
						  $$->e_opr = O_FORWARD; }
	;

send_stmt:
	    TK_SEND invocation			{ $$ = $2;
						  $$->e_opr = O_SEND; }
	;

receive_stmt:
	    TK_RECEIVE expr paren_list		{ $$ = bnode (O_RECEIVE,
						    bnode(O_INOP,NULLNODE,$2),
						    $3);}
	;

V_stmt:
	    TK_V TK_LPAREN expr TK_RPAREN	{ $$ = unode (O_SEND, $3); }
	;

P_stmt:
	    TK_P TK_LPAREN expr TK_RPAREN	{ $$ = unode (O_RECEIVE,
						    bnode(O_INOP,NULLNODE,$3));}
	;

explicit_call:
	    TK_CALL invocation			{ $$ = $2;
						  $$->e_opr = O_CALL; }
	;

destroy_stmt:
	    TK_DESTROY expr			{ $$ = unode (O_DESTROY, $2); }
	;

begin_end:
	    TK_BEGIN block TK_END		{ $2->e_l = idnode ("[begin]");
						  $$ = $2; }
	;

if_stmt:
	    TK_IF guarded_cmd_lp else_cmd_opt TK_FI
						{ $$ = bnode (O_IF, $2, $3); }
	;

do_stmt:
	    TK_DO guarded_cmd_lp else_cmd_opt TK_OD
						{ $$ = bnode (O_DO, $2, $3); }
	;

guarded_cmd_lp:
	    guarded_cmd				{ $$ = unode (O_LIST, $1);}
	|   guarded_cmd_lp TK_SQUARE guarded_cmd
						{ $$ = lcat ($1, $3); }
	;

guarded_cmd:
	    expr TK_ARROW block			{ $3->e_l = idnode ("[->]");
						  $$ = bnode (O_GUARD, $1, $3);}
	;

else_cmd_opt:
	    /* null */				{ $$ = NULLNODE; }
	|   TK_SQUARE TK_ELSE TK_ARROW block	{ $4->e_l = idnode ("[else]");
						  $$ = $4; }
	;


for_all_stmt:
	    TK_FA quantifier_lp TK_ARROW block TK_AF
						{ $$ = bnode (O_FA, $2, $4); }
	;

	

/*************************  input statement *************************/

input_stmt:
	    TK_IN in_cmd_lp else_cmd_opt TK_NI	{ $$ = bnode (O_IN, $2, $3); }
	;

in_cmd_lp:
	    in_cmd				{ $$ = unode (O_LIST, $1); }
	|   in_cmd_lp TK_SQUARE in_cmd		{ $$ = lcat ($1, $3); }
	;

in_cmd:
	    quantifiers_opt in_spec sync_expr_opt sched_expr_opt TK_ARROW block
					    { $$ = bnode (
						O_ARM,
						bnode (
						    O_SCHED,
						    bnode (
							O_SYNC,
							bnode (O_SELECT,$1,$2),
							$3),
						    $4),
						$6); }
	;

in_spec:
	    in_op param_names			{ $$ = bnode (O_INPARM,$1,$2); }
	;

in_op:
	    qualified_id			{ $$ = bnode
						    (O_INOP, NULLNODE, $1);}
	|   qualified_id subscripts		{ $$ = bnode (O_INOP,
						    NULLNODE, indx($1, $2));}
	;

sync_expr_opt:
	    /* null */				{ $$ = NULLNODE; }
	|   TK_AND expr				{ $$ = $2; }
	|   TK_SUCHTHAT expr			{ $$ = $2; }
	;

sched_expr_opt:
	    /* null */				{ $$ = NULLNODE; }
	|   TK_BY expr				{ $$ = $2; }
	;



/*************************  co statement *************************/

concurrent_stmt:
	    TK_CO concurrent_cmd_lp TK_OC	{ $$ = unode (O_CO, $2); }
	;

concurrent_cmd_lp:
	    concurrent_cmd			{ $$ = unode (O_LIST, $1); }
	|   concurrent_cmd_lp TK_PARALLEL concurrent_cmd
						{ $$ = lcat ($1, $3); }
	;

concurrent_cmd:
	quantifiers_opt separator_opt concurrent_invocation post_processing_opt
			{ $$ = bnode (O_COINV, bnode (O_COSEL, $1, $3), $4); }
	;

separator_opt:		/* allow \n where it can't be handled in scanner */
	    /* null */				{ $$ = NULLNODE; }
	|   separator_opt TK_SEPARATOR		{ $$ = NULLNODE; }
	;

concurrent_invocation:
	    explicit_call			{ $$ = $1; }
	|   send_stmt				{ $$ = $1; }
	|   expr				{ $$ = $1; }
	;

post_processing_opt:
	    /* null */				{ $$ = NULLNODE; }
	|   TK_ARROW block			{ $$ = $2; }
	;



/******************************  quantifier  ******************************/

quantifiers_opt:
	    /* null */				{ $$ = NULLNODE; }
	|   TK_LPAREN quantifier_lp TK_RPAREN	{ $$ = $2; }
	;

quantifier_lp:
	    quantifier				{ $$ = unode (O_LIST, $1); }
	|   quantifier_lp TK_COMMA quantifier	{ $$ = lcat ($1, $3); }
	;

quantifier:
	    TK_ID TK_ASSIGN expr direction expr step_opt such_that_opt
						{ $4->e_l = $1;
						  $4->e_r = $5;
						  $$ = bnode ( O_QUANT,
						    bnode (O_QSTEP, $3, $6),
						    bnode (O_QTEST, $4, $7)); }
	;

direction:
	    TK_TO			{ $$ = newnode (O_LE); defstep = 1; }
	|   TK_DOWNTO			{ $$ = newnode (O_GE); defstep = -1; }
	;

step_opt:
	    /* null */				{ $$ = intnode (defstep); }
	|   TK_BY expr				{ $$ = $2; }
	;

such_that_opt:
	    /* null */				{ $$ = NULLNODE; }
	|   TK_SUCHTHAT expr			{ $$ = $2; }
	;



/******************************  expression  ******************************/

expr:
	    TK_ID				{ $$ = $1; }
	|   literal				{ $$ = $1; }
	|   invocation				{ $$ = $1; }
	|   constructor				{ $$ = $1; }
	|   binary_expr				{ $$ = $1; }
	|   prefix_expr				{ $$ = $1; }
	|   suffix_expr				{ $$ = $1; }
	|   create_expr				{ $$ = $1; }
	;

literal:
	    TK_ILIT				{ $$ = $1; }
	|   TK_RLIT				{ $$ = $1; }
	|   TK_BLIT				{ $$ = $1; }
	|   TK_CLIT				{ $$ = $1; }
	|   TK_SLIT				{ $$ = $1; }
	|   TK_NLIT				{ $$ = $1; }
	|   TK_FLIT				{ $$ = $1; }
	;

binary_expr:
	    expr TK_EXPON	expr	{ $$ = bnode (O_EXPON,	$1, $3); }
	|   expr TK_ASTER	expr	{ $$ = bnode (O_MUL,	$1, $3); }
	|   expr TK_DIV		expr	{ $$ = bnode (O_DIV,	$1, $3); }
	|   expr TK_MOD		expr	{ $$ = bnode (O_MOD,	$1, $3); }
	|   expr TK_REMDR	expr	{ $$ = bnode (O_REMDR,	$1, $3); }
	|   expr TK_PLUS	expr	{ $$ = bnode (O_ADD,	$1, $3); }
	|   expr TK_MINUS	expr	{ $$ = bnode (O_SUB,	$1, $3); }
	|   expr TK_CONCAT	expr	{ $$ = bnode (O_CONCAT,	$1, $3); }
	|   expr TK_EQ		expr	{ $$ = bnode (O_EQ,	$1, $3); }
	|   expr TK_NE		expr	{ $$ = bnode (O_NE,	$1, $3); }
	|   expr TK_GE		expr	{ $$ = bnode (O_GE,	$1, $3); }
	|   expr TK_LE		expr	{ $$ = bnode (O_LE,	$1, $3); }
	|   expr TK_GT		expr	{ $$ = bnode (O_GT,	$1, $3); }
	|   expr TK_LT		expr	{ $$ = bnode (O_LT,	$1, $3); }
	|   expr TK_AND		expr	{ $$ = bnode (O_AND,	$1, $3); }
	|   expr TK_OR		expr	{ $$ = bnode (O_OR,	$1, $3); }
	|   expr TK_XOR		expr	{ $$ = bnode (O_XOR,	$1, $3); }
	|   expr TK_RSHIFT	expr	{ $$ = bnode (O_RSHIFT,	$1, $3); }
	|   expr TK_LSHIFT	expr	{ $$ = bnode (O_LSHIFT,	$1, $3); }
	|   expr TK_SWAP	expr	{ $$ = bnode (O_SWAP,	$1, $3); }
	|   expr TK_ASSIGN	expr	{ $$ = bnode (O_ASSIGN,	$1, $3); }
	|   expr TK_AUG_PLUS	expr	{ $$ = bnode (O_AUG_ADD,    $1, $3); }
	|   expr TK_AUG_MINUS	expr	{ $$ = bnode (O_AUG_SUB,    $1, $3); }
	|   expr TK_AUG_ASTER	expr	{ $$ = bnode (O_AUG_MUL,    $1, $3); }
	|   expr TK_AUG_DIV	expr	{ $$ = bnode (O_AUG_DIV,    $1, $3); }
	|   expr TK_AUG_REMDR	expr	{ $$ = bnode (O_AUG_REMDR,  $1, $3); }
	|   expr TK_AUG_EXPON	expr	{ $$ = bnode (O_AUG_EXPON,  $1, $3); }
	|   expr TK_AUG_OR	expr	{ $$ = bnode (O_AUG_OR,     $1, $3); }
	|   expr TK_AUG_AND	expr	{ $$ = bnode (O_AUG_AND,    $1, $3); }
	|   expr TK_AUG_CONCAT	expr	{ $$ = bnode (O_AUG_CONCAT, $1, $3); }
	|   expr TK_AUG_RSHIFT	expr	{ $$ = bnode (O_AUG_RSHIFT, $1, $3); }
	|   expr TK_AUG_LSHIFT	expr	{ $$ = bnode (O_AUG_LSHIFT, $1, $3); }
	;

prefix_expr:
	    TK_NOT	expr	   TK_NOT	{ $$ = unode (O_NOT, $2); }
	|   TK_PLUS	expr	   TK_NOT	{ $$ = unode (O_POS, $2); }
	|   TK_MINUS	expr	   TK_NOT	{ $$ = unode (O_NEG, $2); }
	|   TK_ADDR	expr	   TK_NOT	{ $$ = unode (O_ADDR, $2); }
	|   TK_QMARK	expr	   TK_NOT	{ $$ = unode (O_QMARK, $2); }
	|   TK_INCR expr	   TK_NOT	{ $$ = unode (O_PREINC, $2); }
	|   TK_DECR expr	   TK_NOT	{ $$ = unode (O_PREDEC, $2); }
	|   basic_type paren_expr  TK_NOT	{ $$ = bnode (O_CAST, $1, $2); }
	|   TK_STRING paren_expr   TK_NOT
	       { $$ = bnode (O_CAST, unode (O_STRING, newnode (O_ASTER)), $2); }
	|   TK_LOW  TK_LPAREN type TK_RPAREN	{ $$ = unode (O_LOW, $3); }
	|   TK_HIGH TK_LPAREN type TK_RPAREN	{ $$ = unode (O_HIGH, $3); }
	|   TK_NEW  TK_LPAREN subscripts_opt new_item TK_RPAREN
				{ $$ = unode ($4->e_opr, mkarray($3,$4->e_l)); }
	;

new_item:
	    unsub_type				{ if ($1->e_opr == O_TYPENAME)
						      /* allow optype name */
						      $1->e_r = intnode(1);
						  $$ = unode (O_NEW, $1); }
	|   TK_SEM sem_proto	{ $$ = unode (O_NEWOP, unode (O_CAP, $2)); }
	|   TK_OP op_prototype	{ $$ = unode (O_NEWOP, unode (O_CAP, $2)); }
	;

paren_expr:
	    TK_LPAREN expr TK_RPAREN		{ $$ = $2; }
	;

suffix_expr:
	    expr TK_INCR			{ $$ = unode (O_POSTINC, $1); }
	|   expr TK_DECR			{ $$ = unode (O_POSTDEC, $1); }
	|   expr TK_HAT				{ $$ = unode (O_PTRDREF, $1); }
	|   expr TK_PERIOD TK_ID		{ $$ = bnode (O_FIELD,$1,$3); }
	|   expr TK_LBRACKET bound_lp TK_RBRACKET { $$ = indx ($1, $3); }
	;

invocation:
	    expr paren_list			{ $$ = bnode (O_CALL,$1,$2); }
	;
	    
paren_list:
	    TK_LPAREN paren_item_ls TK_RPAREN	{ $$ = $2; }
	;

paren_item_ls:
	    /* null */				{ $$ = NULLNODE; }
	|   expr_lp				{ $$ = $1; }
	;

expr_lp:
	    expr				{ $$ = unode (O_LIST, $1); }
	|   expr_lp TK_COMMA expr		{ $$ = lcat ($1, $3); }
	;


constructor:
	    TK_LPAREN constr_item_lp TK_RPAREN	{ if ($2->e_r != NULL
						  ||  $2->e_l->e_opr == O_CLONE)
							/* array constructor */
							$$ = unode(O_ARCONS,$2);
						  else
							/* simple paren expr */
							$$ = $2->e_l;
						}
	;

constr_item_lp:
	    constr_item				{ $$ = unode (O_LIST, $1); }
	|   constr_item_lp TK_COMMA constr_item	{ $$ = lcat ($1, $3); }
	;

constr_item:
	    expr				{ $$ = $1; }
	|   TK_LBRACKET expr TK_RBRACKET expr	{ $$ = bnode (O_CLONE, $2,$4); }
	;


create_expr:
	    TK_CREATE create_call location_opt	{ if ($2->e_l->e_opr == O_VM)
						    $$ = bnode (O_CREVM,$2,$3);
						  else
						    $$ = bnode (O_CREATE,$2,$3);
						}
	;

create_call:
	    rsrc_name paren_list		{ $$ = bnode(O_CREVOKE,$1,$2); }
	;

rsrc_name:
	    TK_ID				{ $$ = $1; }
	|   TK_VM				{ $$ = newnode (O_VM); }
	;

location_opt:
	    /* null */				{ $$ = NULLNODE; }
	|   TK_ON expr				{ $$ = $2; }
	;



/******************************  miscellaneous  ******************************/

qualified_id:
	    TK_ID				{ $$ = $1; }
	|   TK_ID TK_PERIOD TK_ID		{ $$ = bnode (O_FIELD,$1,$3); }
	;

end_id:
	    TK_END id_opt			{ $$ = $2; }
	;

id_opt:
	    /* null */				{ $$ = NULLNODE; }
	|   TK_ID				{ $$ = $1; }
	;

id_ls:
	    /* null */				{ $$ = NULLNODE; }
	|   id_lp				{ $$ = $1; }
	;

id_lp:
	    TK_ID				{ $$ = unode (O_LIST, $1); }
	|   id_lp TK_COMMA TK_ID		{ $$ = lcat ($1, $3); }
	;

id_subs_lp:
	    id_subs				{ $$ = unode (O_LIST, $1); }
	|   id_subs_lp TK_COMMA id_subs		{ $$ = lcat ($1, $3); }
	;

id_subs:
	    TK_ID				{ $$ = unode (O_SUBS, $1); }
	|   TK_ID subscripts			{ $$ = bnode (O_SUBS, $1, $2); }
	;

subscripts:
	    bracketed_list			{ $$ = $1; }
	|   bracketed_list subscripts		{ $$ = lcat ($1, $2); }
	;

subscripts_opt:
	    /* null */				{ $$ = NULLNODE; }
	|   subscripts				{ $$ = $1; }
	;

bracketed_list:
	    TK_LBRACKET bound_lp TK_RBRACKET	{ $$ = $2; }
	;

bound_lp:
	    bounds				{ $$ = unode (O_LIST, $1); }
	|   bound_lp TK_COMMA bounds		{ $$ = lcat ($1, $3); }
	;

bounds:
	    bound			        { $$ = bnode
							(O_BOUNDS,NULLNODE,$1);}
	|   bound TK_COLON bound		{ $$ = bnode (O_BOUNDS,$1,$3);}
	;

bound:
	    expr				{ $$ = $1; }
	|   TK_ASTER				{ $$ = newnode (O_ASTER); }
	;

	
/*  lex spec for SR  */

TK_P:'P';
TK_V:'V';
TK_AF:'af';
//TK_AND:'and';
TK_ANY:'any';
TK_BEGIN:'begin';
TK_BODY:'body';
TK_BOOL:'bool';
TK_BY:'by';
TK_CALL:'call';
TK_CAP:'cap';
TK_CHAR:'char';
TK_CO:'co';
TK_CONST:'const';
TK_CREATE:'create';
TK_DESTROY:'destroy';
TK_DO:'do';
TK_DOWNTO:'downto';
TK_ELSE:'else';
TK_END:'end';
TK_ENUM:'enum';
TK_EXIT:'exit';
TK_EXTEND:'extend';
TK_EXTERNAL:'external';
TK_FA:'fa';
//TK_BLIT:'false';		  //(, O_BLIT, bool_sig, FALSE);
TK_FI:'fi';
TK_FILE:'file';
TK_FINAL:'final';
TK_FORWARD:'forward';
TK_GLOBAL:'global';
TK_HIGH:'high';
TK_IF:'if';
TK_IMPORT:'import';
TK_IN:'in';
TK_INITIAL:'initial';
TK_INT:'int';
TK_LOW:'low';
TK_MOD:'mod';
TK_NEW:'new';
TK_NEXT:'next';
TK_NI:'ni';
//TK_NLIT:'noop';		  //(, O_NLIT, nlit_sig, NOOP_SEQN);
//TK_NOT:'not';
TK_NLIT:'null'|'noop';		  //(, O_NLIT, nlit_sig, NULL_SEQN);
TK_OC:'oc';
TK_OD:'od';
TK_ON:'on';
TK_OP:'op';
TK_OPTYPE:'optype';
//TK_OR:'or';
TK_PROC:'proc';
TK_PROCEDURE:'procedure';
TK_PROCESS:'process';
TK_PTR:'ptr';
TK_REAL:'real';
TK_REC:'rec';
TK_RECEIVE:'receive';
TK_REF:'ref';
TK_REPLY:'reply';
TK_RES:'res';
TK_RESOURCE:'resource';
TK_RETURN:'return';
TK_RETURNS:'returns';
TK_SEM:'sem';
TK_SEND:'send';
TK_SEPARATE:'separate';
TK_SKIP:'skip';
TK_SUCHTHAT:'st';
//TK_FLIT:'stderr';		  //(, O_FLIT, file_sig, STDERR);
//TK_FLIT:'stdin';		  //(, O_FLIT, file_sig, STDIN);
TK_FLIT:'stdout'|'stderr'|'stdin';	  //(, O_FLIT, file_sig, STDOUT);
TK_STOP:'stop';	
TK_STRING:'string';	
TK_TO:'to';
TK_BLIT:'true'|'false';		  //(, O_BLIT, bool_sig, TRUE);
TK_TYPE:'type';
TK_UNION:'union';
TK_VAL:'val';
TK_VAR:'var';
TK_VM:'vm';
TK_XOR:'xor';

TK_COMMA:',';
TK_COLON:':';
TK_EQ:'=';
TK_INCR:'++';
TK_PLUS:'+';
TK_DECR:'--';
TK_MINUS:'-';
TK_ASTER:'*';
TK_EXPON:'**';
TK_DIV:'/';
TK_REMDR:'%';
TK_LPAREN:'(';
TK_RPAREN:')';
TK_ARROW:'->';
TK_SQUARE:'[]';
TK_ASSIGN:':=';
TK_SWAP:':=:';
TK_LBRACKET:'[';
TK_RBRACKET:']';
TK_GE:'>=';
TK_LE:'<=';
TK_GT:'>';
TK_LT:'<';
//TK_NE:'!=';
TK_NE:'~='|'!=';
TK_OR:'|'|'or';
TK_AND:'&'|'and';
TK_PERIOD:'.';
TK_NOT:'~'|'not';
TK_ADDR:'@';
TK_HAT:'^';
TK_CONCAT:'||';
TK_LBRACE:'{';
TK_RBRACE:'}';
TK_QMARK:'?';
TK_PARALLEL:'//';
TK_RSHIFT:'>>';
TK_LSHIFT:'<<';

TK_AUG_PLUS:'+:=';
TK_AUG_MINUS:'-:=';
TK_AUG_ASTER:'*:=';
TK_AUG_EXPON:'**:=';
TK_AUG_DIV:'/:=';
TK_AUG_REMDR:'%:=';
TK_AUG_OR:'|:=';
TK_AUG_AND:'&:=';
TK_AUG_CONCAT:'||:=';
TK_AUG_RSHIFT:'>>:=';
TK_AUG_LSHIFT:'<<:=';

TK_ID:[A-Za-z][A-Za-z0-9_]*;		/* identifier */
TK_RLIT:[0-9]+[\.][0-9]*([eE][+-]?[0-9]+)?	
		|[\.][0-9]+([eE][+-]?[0-9]+)?
		|[0-9]+([eE][+-]?[0-9]+);		/* real literal */
TK_ILIT:[0-7]+[qQ]
		|[0-9]+
		|[0-9][0-9a-fA-F]*[Xx];	/*integer literal */		
TK_CLIT:[\u0027].*[\u0027]; 	/* character literal */
TK_SLIT:[\u0022].*[\u0022];	/* string literal */
TK_COMMENT:[\u002F][\u002A].*[\u002A][\u002F]|[\u0023].*;

WS:[\t\f\v] -> skip;			/* whitespace */
TK_SEPARATOR:';';
TK_NEWLINE:[\n];