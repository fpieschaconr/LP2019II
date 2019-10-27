/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintax;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sintax {


    /**
     * @param args the command line arguments
     */
    public static HashMap<String,ArrayList<ArrayList<String>>> Gramatica = new HashMap<String,ArrayList<ArrayList<String>>>();
    public static HashMap<String,ArrayList<ArrayList<String>>> Prediccion = new HashMap<String,ArrayList<ArrayList<String>>>();

    public static HashMap<String,ArrayList<String>> First = new HashMap<String,ArrayList<String>>();
    public static HashMap<String,ArrayList<String>> Next = new HashMap<String,ArrayList<String>>();
    public static ArrayList<String> keys = new ArrayList<String>();
    private LexicAnalizer lexic=new LexicAnalizer();

    public Sintax() throws IOException{
        lexic=new LexicAnalizer();
    }

    public static void fillG(){
        ArrayList<ArrayList<String>> rules = new ArrayList<ArrayList<String>>();
        ArrayList<String> rul = new ArrayList<String>();
    /*component*/
        rul.add("spec_component");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("separate_body");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("S",rules);keys.add("S");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("comp_label");rul.add("spec_stmt_ls");rul.add("spec_body");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("spec_component",rules);keys.add("spec_component");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_body");rul.add("tk_id");rul.add("body_stmt_ls");rul.add("end_id");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("separate_body",rules);keys.add("separate_body");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_global");rul.add("tk_id");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_resource");rul.add("tk_id");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("comp_label",rules);keys.add("comp_label");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("spec_stmt");rul.add("spec_stmt_ls'");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("spec_stmt_ls",rules);keys.add("spec_stmt_ls");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_separator");rul.add("spec_stmt");rul.add("spec_stmt_ls'");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("spec_stmt_ls'",rules);keys.add("spec_stmt_ls'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("common_stmt");rul.add("spec_stmt_ls'");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("extend_clause");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("spec_stmt",rules);keys.add("spec_stmt");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("decl");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("import_clause");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("common_stmt",rules);keys.add("common_stmt");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_extend");rul.add("import_list");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("extend_clause",rules);keys.add("extend_clause");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("end_id");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_body");rul.add("tk_id");rul.add("maybe_params");rul.add("spec_body'");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("spec_body",rules);keys.add("spec_body");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("body_stmt_ls");rul.add("end_id");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_separate");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("spec_body'",rules);keys.add("spec_body'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("body_stmt");rul.add("body_stmt_ls'");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("body_stmt_ls",rules);keys.add("body_stmt_ls");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_separator");rul.add("body_stmt");rul.add("body_stmt_ls'");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("body_stmt_ls'",rules);keys.add("body_stmt_ls'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("common_stmt");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("body_only");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("body_stmt",rules);keys.add("body_stmt");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("stmt");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("proc");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("process");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("procedure");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("initial_block");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("final_block");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("body_only",rules);keys.add("body_only");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_initial");rul.add("block");rul.add("tk_end");rul.add("initial_opt");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("initial_block",rules);keys.add("initial_block");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_initial");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("initial_opt",rules);keys.add("initial_opt");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_final");rul.add("block");rul.add("tk_end");rul.add("final_opt");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("final_block",rules);keys.add("final_block");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_final");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("final_opt",rules);keys.add("final_opt");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("parameters");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("maybe_params",rules);keys.add("maybe_params");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();

    
    /*proc*/
        rul.add("tk_proc");rul.add("tk_id");rul.add("param_names");rul.add("block");rul.add("end_id");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("proc",rules);keys.add("proc");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
    
    /*process*/
        rul.add("tk_process");rul.add("tk_id");rul.add("quantifiers_opt");rul.add("block");rul.add("end_id");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("process",rules);keys.add("process");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
    
    /*procedure*/
        rul.add("tk_procedure");rul.add("tk_id");rul.add("prototype");rul.add("block");rul.add("end_id");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("procedure",rules);keys.add("procedure");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
    /*block*/
        rul.add("block_item");rul.add("block'");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("block",rules);keys.add("block");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_separator");rul.add("block_item");rul.add("block'");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("block'",rules);keys.add("block'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("decl");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("stmt");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("import_clause");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("block_item",rules);keys.add("block_item");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_import");rul.add("import_list");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("import_clause",rules);keys.add("import_clause");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_id");rul.add("import_list'");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("import_list",rules);keys.add("import_list");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_comma");rul.add("tk_id");rul.add("import_list'");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("import_list'",rules);keys.add("import_list'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();  
        
    /*op_prototype*/
    rul.add("prototype");rul.add("op_restriction_opt");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("op_prototype",rules);keys.add("op_prototype");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("parameters");rul.add("return_spec_opt");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("prototype",rules);keys.add("prototype");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_lparen");rul.add("param_spec_lp");rul.add("tk_rparen");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("parameters",rules);keys.add("parameters");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("param_spec");rul.add("param_spec_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("param_spec_lp",rules);keys.add("param_spec_lp");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_separator");rul.add("param_spec");rul.add("param_spec_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("param_spec_lp'",rules);keys.add("param_spec_lp'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("param_kind_opt");rul.add("param_spec'");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("param_spec",rules);keys.add("param_spec");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("type");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("id_subs_lp");rul.add("tk_colon");rul.add("type");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("param_spec'",rules);keys.add("param_spec'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_lbrace");rul.add("op_restriction");rul.add("tk_rbrace");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("op_restriction_opt",rules);keys.add("op_restriction_opt");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
    
        rul.add("tk_returns");rul.add("return_spec_opt'");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("return_spec_opt",rules);keys.add("return_spec_opt");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("type");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("id_subs");rul.add("tk_colon");rul.add("type");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("return_spec_opt'",rules);keys.add("return_spec_opt'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_val");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_var");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_res");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_ref");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("param_kind_opt",rules);keys.add("param_kind_opt");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("id_subs");rul.add("id_subs_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("id_subs_lp",rules);keys.add("id_subs_lp");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_comma");rul.add("id_subs");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("id_subs_lp'",rules);keys.add("id_subs_lp'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_id");rul.add("subscripts_opt");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("id_subs",rules);keys.add("id_subs");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_call");rul.add("restriction'");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_send");rul.add("restriction''");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("op_restriction",rules);keys.add("op_restriction");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_comma");rul.add("tk_send");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("restriction'",rules);keys.add("restriction'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_comma");rul.add("tk_call");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("restriction''",rules);keys.add("restriction''");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
    
        
        
        
    /*type*/
        
        rul.add("subscripts");rul.add("unsub_type");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("unsub_type");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("type",rules);keys.add("type");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("basic_type");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("string_def");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("enum_def");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("pointer_def");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("record_def");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("union_def");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("capability_def");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("qualified_id");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("unsub_type",rules);keys.add("unsub_type");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_bool");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_char");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_int");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_file");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_real");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("basic_type",rules);keys.add("basic_type");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_string");rul.add("string_def'");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("string_def",rules);keys.add("string_def");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_lbracket");rul.add("string_lim");rul.add("tk_rbracket");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_lparen");rul.add("string_lim");rul.add("tk_rparen");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("string_def'",rules);keys.add("string_def'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_enum");rul.add("tk_lparen");rul.add("id_lp");rul.add("tk_rparen");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("enum_def",rules);keys.add("enum_def");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_aster");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("string_lim",rules);keys.add("string_lim");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_ptr");rul.add("pointer_def'");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("pointer_def",rules);keys.add("pointer_def");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("basic_type");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_any");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("pointer_def'",rules);keys.add("pointer_def'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_rec");rul.add("tk_lparen");rul.add("field_lp");rul.add("tk_rparen");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("record_def",rules);keys.add("record_def");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_union");rul.add("tk_lparen");rul.add("field_lp");rul.add("tk_rparen");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("union_def",rules);keys.add("union_def");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_cap");rul.add("cap_for");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("capability_def",rules);keys.add("capability_def");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("field");rul.add("field_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("field_lp",rules);keys.add("field_lp");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_separator");rul.add("field");rul.add("field_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("field_lp'",rules);keys.add("field_lp'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("var_def_lp");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("field",rules);keys.add("field");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("var_def");rul.add("var_def_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("var_def_lp",rules);keys.add("var_def_lp");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_comma");rul.add("var_def");rul.add("var_def_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("var_def_lp'",rules);keys.add("var_def_lp'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("id_subs_lp");rul.add("var_att");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("var_def",rules);keys.add("var_def");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_colon");rul.add("basic_type");rul.add("var_att'");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_assign");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_separator");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("var_att",rules);keys.add("var_att");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_assign");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("var_att'",rules);keys.add("var_att'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("qualified_id");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("op_prototype");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_sem");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_vm");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("cap_for",rules);keys.add("cap_for");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
    /*stmt*/
        
        rul.add("tk_skip");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_stop");rul.add("exit_code_opt");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_exit");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_next");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_return");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_reply");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_forward");rul.add("expr");rul.add("paren_list");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_send");rul.add("expr");rul.add("paren_list");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_call");rul.add("expr");rul.add("paren_list");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_destroy");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_begin");rul.add("block");rul.add("tk_end");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_if");rul.add("guarded_cmd_lp");rul.add("else_cmd_opt");rul.add("tk_fi");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_do");rul.add("guarded_cmd_lp");rul.add("else_cmd_opt");rul.add("tk_od");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_fa");rul.add("quantifier_lp");rul.add("tk_arrow");rul.add("block");rul.add("tk_af");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("stmt",rules);keys.add("stmt");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("expr");rul.add("tk_arrow");rul.add("block");rul.add("guarded_cmd_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("guarded_cmd_lp",rules);keys.add("guarded_cmd_lp");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("guarded_cmd_lp");rul.add("guarded_cmd_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("guarded_cmd_lp'",rules);keys.add("guarded_cmd_lp'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_square");rul.add("tk_else");rul.add("tk_arrow");rul.add("block");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("else_cmd_opt",rules);keys.add("else_cmd_opt");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("quantifier");rul.add("quantifier_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("quantifier_lp",rules);keys.add("quantifier_lp");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("quantifier_lp");rul.add("quantifier_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("quantifier_lp'",rules);keys.add("quantifier_lp'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_id");rul.add("tk_assign");rul.add("expr");rul.add("direction");rul.add("expr");rul.add("step_opt");rul.add("such_that_opt");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("quantifier",rules);keys.add("quantifier");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_to");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_downto");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("direction",rules);keys.add("direction");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_by");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("step_opt",rules);keys.add("step_opt");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_suchthat");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("such_that_opt",rules);keys.add("such_that_opt");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
    /*input_stament*/
        rul.add("in_cmd");rul.add("in_cmd_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("in_cmd_lp",rules);keys.add("in_cmd_lp");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_square");rul.add("in_cmd");rul.add("in_cmd_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("in_cmd_lp'",rules);keys.add("in_cmd_lp'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("quantifiers_opt");rul.add("in_spec");rul.add("sync_expr_opt");rul.add("sched_expr_opt");rul.add("tk_arrow");rul.add("block");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("in_cmd",rules);keys.add("in_cmd");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_lparen");rul.add("quantifier_lp");rul.add("tk_rparen");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("quantifiers_opt",rules);keys.add("quantifiers_opt");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("in_op");rul.add("param_names");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("in_spec",rules);keys.add("in_spec");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("qualified_id");rul.add("subscripts_opt");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("in_op",rules);keys.add("in_op");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_id");rul.add("qualified_id'");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("qualified_id",rules);keys.add("qualified_id");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_period");rul.add("tk_id");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("qualified_id'",rules);keys.add("qualified_id'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_lparen");rul.add("id_lp");rul.add("tk_rparen");rul.add("return_name_opt");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("param_names",rules);keys.add("param_names");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_returns");rul.add("tk_id");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("return_name_opt",rules);keys.add("return_name_opt");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_id");rul.add("id_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("id_lp",rules);keys.add("id_lp");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_comma");rul.add("tk_id");rul.add("id_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("id_lp'",rules);keys.add("id_lp'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_and");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_suchthat");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("sync_expr_opt",rules);keys.add("sync_expr_opt");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_by");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("sched_expr_opt",rules);keys.add("sched_expr_opt");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        /*Concurrent_statement*/
        rul.add("concurrent_cmd");rul.add("concurrent_cmd_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("concurrent_cmd_lp",rules);keys.add("concurrent_cmd_lp");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_parallel");rul.add("concurrent_cmd");rul.add("concurrent_cmd_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("concurrent_cmd_lp'",rules);keys.add("concurrent_cmd_lp'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("quantifiers_opt");rul.add("separator_opt");rul.add("concurrent_invocation");rul.add("post_processing_opt");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("concurrent_cmd",rules);keys.add("concurrent_cmd");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_separator");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("separator_opt",rules);keys.add("separator_opt");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_call");rul.add("expr");rul.add("paren_list");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_send");rul.add("expr");rul.add("paren_list");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("concurrent_invocation",rules);keys.add("concurrent_invocation");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_arrow");rul.add("block");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("post_processing_opt",rules);keys.add("post_processing_opt");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
    /*expr*/
        rul.add("tk_id");rul.add("expr''");rules.add(rul); //Literal
        rul = new ArrayList<String>();
        rul.add("tk_Ilit");rul.add("expr''");rules.add(rul); //Literal
        rul = new ArrayList<String>();
        rul.add("tk_Rlit");rul.add("expr''");rules.add(rul); //Literal
        rul = new ArrayList<String>();
        rul.add("tk_Blit");rul.add("expr''");rules.add(rul); //Literal
        rul = new ArrayList<String>();
        rul.add("tk_Clit");rul.add("expr''");rules.add(rul); //Literal
        rul = new ArrayList<String>();
        rul.add("tk_Slit");rul.add("expr''");rules.add(rul); //Literal
        rul = new ArrayList<String>();
        rul.add("tk_Nlit");rul.add("expr''");rules.add(rul); //Literal
        rul = new ArrayList<String>();
        rul.add("tk_Flit");rul.add("expr''");rules.add(rul); //Literal
        rul = new ArrayList<String>();
        rul.add("tk_lparen");rul.add("constr_item_lp");rul.add("tk_rparen");rul.add("expr''");rules.add(rul); // Constructor
        rul = new ArrayList<String>();
        rul.add("tk_not");rul.add("expr");rules.add(rul); //Prefix_expr
        rul = new ArrayList<String>();
        rul.add("tk_plus");rul.add("expr");rules.add(rul); //Prefix_expr
        rul = new ArrayList<String>();
        rul.add("tk_minus");rul.add("expr");rules.add(rul); //Prefix_expr
        rul = new ArrayList<String>();
        rul.add("tk_addr");rul.add("expr");rules.add(rul); //Prefix_expr
        rul = new ArrayList<String>(); 
        rul.add("tk_qmark");rul.add("expr");rules.add(rul); //Prefix_expr
        rul = new ArrayList<String>();
        rul.add("tk_incr");rul.add("expr");rules.add(rul); //Prefix_expr
        rul = new ArrayList<String>();
        rul.add("tk_decr");rul.add("expr");rules.add(rul); //Prefix_expr
        rul = new ArrayList<String>();
        rul.add("basic_type");rul.add("paren_expr");rul.add("expr''");rules.add(rul); //Prefix_expr
        rul = new ArrayList<String>();
        rul.add("tk_string");rul.add("paren_expr");rul.add("expr''");rules.add(rul); //Prefix_expr
        rul = new ArrayList<String>();
        rul.add("tk_low");rul.add("tk_lparen");rul.add("type");rul.add("tk_rparen");rul.add("expr''");rules.add(rul); //Prefix_expr
        rul = new ArrayList<String>();
        rul.add("tk_high");rul.add("tk_lparen");rul.add("type");rul.add("tk_rparen");rul.add("expr''");rules.add(rul); //Prefix_expr
        rul = new ArrayList<String>();
        rul.add("tk_new");rul.add("tk_lparen");rul.add("subscripts_opt");rul.add("new_item");rul.add("tk_rparen");rul.add("expr''");rules.add(rul); //Prefix_expr
        rul = new ArrayList<String>();
        rul.add("tk_create");rul.add("create_call");rul.add("location_opt");rul.add("expr''");rules.add(rul);//Create_expr
        rul = new ArrayList<String>();
        Gramatica.put("expr",rules);keys.add("expr");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
       
        /*binary_expr*/
        rul.add("tk_expon");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_aster");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_div");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_mod");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_remdr");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_plus");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_minus");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_concat");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_eq");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_ne");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_ge");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_le");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_gt");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_lt");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_and");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_or");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_xor");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_rshift");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_lshift");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_swap");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_assign");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_aug_plus");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_aug_minus");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_aug_aster");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_aug_div");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_aug_remdr");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_aug_expon");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_aug_or");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_aug_and");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_aug_concat");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_aug_rshift");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_aug_lshift");rul.add("expr");rules.add(rul);
        /*Suffix_expr*/
        rul = new ArrayList<String>();
        rul.add("tk_incr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_decr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_hat");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_period");rul.add("tk_id");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_lbracket");rul.add("bound_lp");rul.add("tk_rbracket");rules.add(rul);
        rul = new ArrayList<String>();
        /*invocation*/
        rul.add("paren_list");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("expr'",rules);keys.add("expr'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        
        rul.add("expr'");rul.add("expr''");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("expr''",rules);keys.add("expr''");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
    /*constructor*/    
        rul.add("constr_item");rul.add("constr_item_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("constr_item_lp",rules);keys.add("constr_item_lp");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_comma");rul.add("constr_item");rul.add("constr_item_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("constr_item_lp'",rules);keys.add("constr_item_lp'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_lbracket");rul.add("expr");rul.add("tk_rbracket");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("constr_item",rules);keys.add("constr_item");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
    /*Subscripts*/
        rul.add("bracketed_list");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("subscripts_opt",rules);keys.add("subscripts_opt");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
                
        rul.add("tk_lbracket");rul.add("bound_lp");rul.add("tk_rbracket");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("bracketed_list",rules);keys.add("bracketed_list");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
    /*Bounds*/
        rul.add("bounds");rul.add("bound_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("bound_lp",rules);keys.add("bound_lp");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_comma");rul.add("bounds");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("bound_lp'",rules);keys.add("bound_lp'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("bound");rul.add("bounds'");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("bounds",rules);keys.add("bounds");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_colon");rul.add("bound");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("bounds'",rules);keys.add("bounds'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_aster");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("bound",rules);keys.add("bound");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
    /*paren_expr*/
        rul.add("tk_lparen");rul.add("expr");rul.add("tk_rparen");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("paren_expr",rules);keys.add("paren_expr");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
    
    /*new_item*/
        rul.add("unsub_type");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_sem");rul.add("sem_proto");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_op");rul.add("op_prototype");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("new_item",rules);keys.add("new_item");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
    /*create_expr*/
        rul.add("rsrc_name");rul.add("paren_list");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("create_call",rules);keys.add("create_call");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_id");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_vm");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("rsrc_name",rules);keys.add("rsrc_name");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_lparen");rul.add("paren_item_ls");rul.add("tk_rparen");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("paren_list",rules);keys.add("paren_list");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("expr_lp");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("paren_item_ls",rules);keys.add("paren_item_ls");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("expr");rul.add("expr_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("expr_lp",rules);keys.add("expr_lp");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_comma");rul.add("expr");rul.add("expr_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("expr_lp'",rules);keys.add("expr_lp'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_on");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("location_opt",rules);keys.add("location_opt");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
    
    /*decl*/    
        rul.add("type_decl");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("obj_decl");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("optype_decl");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("op_decl");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("sem_decl");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("decl",rules);keys.add("decl");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_type");rul.add("tk_id");rul.add("tk_eq");rul.add("type");rul.add("type_restriction");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("type_decl",rules);keys.add("type_decl");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_lbrace");rul.add("tk_id");rul.add("tk_rbrace");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("type_restriction",rules);keys.add("type_restriction");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("var_or_const");rul.add("var_def_lp");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("obj_decl",rules);keys.add("obj_decl");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_var");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_const");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("var_or_const",rules);keys.add("var_or_const");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_optype");rul.add("tk_id");rul.add("eq_opt");rul.add("op_prototype");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("optype_decl",rules);keys.add("optype_decl");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_eq");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("eq_opt",rules);keys.add("eq_opt");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("op_or_ext");rul.add("oper_def_lp");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("op_decl",rules);keys.add("op_decl");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_op");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("tk_external");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("op_or_ext",rules);keys.add("op_or_ext");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("oper_def");rul.add("oper_def_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("oper_def_lp",rules);keys.add("oper_def_lp");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_comma");rul.add("oper_def");rul.add("oper_def_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("oper_def_lp'",rules);keys.add("oper_def_lp'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("id_subs_lp");rul.add("oper_def'");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("oper_def",rules);keys.add("oper_def");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("op_prototype");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add("colon_opt");rul.add("qualified_id");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("oper_def'",rules);keys.add("oper_def'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_colon");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("colon_opt",rules);keys.add("colon_opt");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_sem");rul.add("sem_def_lp");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("sem_decl",rules);keys.add("sem_decl");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("sem_def");rul.add("sem_def_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("sem_def_lp",rules);keys.add("sem_def_lp");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_comma");rul.add("sem_def");rul.add("sem_def_lp'");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("sem_def_lp'",rules);keys.add("sem_def_lp'");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("id_subs");rul.add("sem_init");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("sem_def",rules);keys.add("sem_def");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_assign");rul.add("expr");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("sem_init",rules);keys.add("sem_init");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_end");rul.add("id_opt");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("end_id",rules);keys.add("end_id");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
        
        rul.add("tk_id");rules.add(rul);
        rul = new ArrayList<String>();
        rul.add(" ");rules.add(rul);
        rul = new ArrayList<String>();
        Gramatica.put("id_opt",rules);keys.add("id_opt");

        rul = new ArrayList<String>();rules = new ArrayList<ArrayList<String>>();
    }

    public static void showH(HashMap<String,ArrayList<ArrayList<String>>> a){
        for (int i = 0; i < a.size(); i++) {
            System.out.println("No Teminal: "+keys.get(i));
            for (int j = 0; j < a.get(keys.get(i)).size(); j++) {
                for (int k = 0; k < a.get(keys.get(i)).get(j).size() ; k++) {
                    System.out.print(" "+a.get(keys.get(i)).get(j).get(k));
                }
                System.out.println();
            }
        }
    }

    public static void showHA(HashMap<String,ArrayList<String>> a){
        String key ;
        for (int i = 0; i < a.size() ; i++) {
            key = keys.get(i);
            System.out.println("NO Terminal: "+key);
            for (int j = 0; j < a.get(key).size() ; j++) {
                System.out.println(a.get(key).get(j));
            }
            System.out.println();
        }
    }

    public static ArrayList join(ArrayList a, ArrayList b){
        ArrayList c = new ArrayList<String>();
        for (int i = 0; i < a.size(); i++)
            c.add(a.get(i));

        for (int i = 0; i < b.size(); i++)
            c.add(b.get(i));

        return c;
    }

    public static ArrayList CalFirst(String key){

        //System.out.println("calFirst of Key: "+key);
        String rule,rule2 ;
        ArrayList<String> elem = new ArrayList<String>();
        ArrayList<String> aux = new ArrayList<String>();
        int index = 0;
        // recorre todas las producciones del no terminal key
        //System.out.println("Tamaño de la regla: "+Gramatica.get(key).size());
        for (int i = 0; i < Gramatica.get(key).size(); i++) {
            // recorre cada caracter de cada produccion
            rule = Gramatica.get(key).get(i).get(index);
            //System.out.println("RULE: "+rule);
            System.out.println("rule: "+rule);
            // si es no terminal
            if (keys.contains(rule) == false){
                System.out.println("TERMINAL");
                elem.add(rule);
                //System.out.println("elemNT: "+elem);
            }else {
                System.out.println("NO TERMINAL");
                aux = CalFirst(rule);
                System.out.println("aux: "+aux);
                if (aux.contains(" ")) {
                    System.out.println("contains epsilon ");
                    elem = join(elem,aux);
                    aux = new ArrayList<String>();
                    System.out.println("RULE+1: "+Gramatica.get(key).get(i).get(index));
                    System.out.println("RULE+1: "+Gramatica.get(key).get(i).get(index+1));
                    rule2 = Gramatica.get(key).get(i).get(index+1);
                    if(keys.contains(rule2) == false){
                        elem.add(rule2);
                        System.out.println("elemNT2: "+elem);
                    }else{
                        if (key == rule2){
                            aux = elem;
                        }else {
                            //index++;
                            aux = CalFirst(Gramatica.get(key).get(i).get(index+1));
                            //System.out.println("nequal, aux: "+aux);
                        }
                        elem = join(elem,aux);
                        //System.out.println("elem: "+elem);
                    }

                }
                elem = join(elem,aux) ;
            }

        }
        return elem;
    }


    public static ArrayList CalNext(String key){

        //System.out.println("CALNEXT of key: "+key);
        String em,em1=" ";
        ArrayList<String> elem = new ArrayList<String>();
        ArrayList<String> aux = new ArrayList<String>();
        int tam = 0 ;
        // Recorre toda la gramatica para buscar KEY
        for (int i = 0; i < Gramatica.size() ; i++) {

            // Busca en cada una de las Reglas
            for (int j = 0; j < Gramatica.get(keys.get(i)).size()  ; j++) {
                // Tamaño de las expresiones de cada regla
                tam = Gramatica.get(keys.get(i)).get(j).size();


                for (int k = 0; k < tam ; k++) {
                    em = Gramatica.get(keys.get(i)).get(j).get(k);
                    if (k < tam-1){
                        em1 = Gramatica.get(keys.get(i)).get(j).get(k+1);
                    }

                    if(em == key ){
                        if(k == tam - 1 ){
                            //System.out.println("En el limite");
                            if(key == keys.get(i)){
                                //System.out.println("equalsQ");
                                aux = elem;
                            }else{
                                //System.out.println("NequalsQ");
                                aux = CalNext(keys.get(i));
                            }
                            //System.out.println("aux: "+aux);
                            elem = join(aux,elem);
                            //System.out.println("elem: "+elem);
                        }else{
                            //si es un NO terminal
                            //System.out.println("No esta en el Limite");
                            if(keys.contains(em1) == true){
                                //elem = join(First.get(em1),elem);
                                //System.out.println("EM1: "+em1);
                                elem = join(First.get(em1),elem);
                                if (First.get(em1).contains(" ")){
                                    elem.remove(" ");
                                }
                                elem = join(aux,elem);
                                //System.out.println("elem: "+elem);
                            }else {
                                //System.out.println("NL es no terminal");
                                elem.add(em1);
                                break;
                            }
                        }

                    }
                }
            }
        }
        return elem;
    }
    public static ArrayList CalPred(String key){
        ArrayList<String> elem = new ArrayList<String>();
        String el;
        ArrayList<ArrayList<String>> all = new ArrayList<>();
        //ArrayList<String> aux = new ArrayList<String>();
        for (int i = 0; i < Gramatica.get(key).size() ; i++) {
            el = Gramatica.get(key).get(i).get(0);
            elem = new ArrayList<String>();
            //System.out.println("el: "+el);
            if(keys.contains(el)){
                //System.out.println("no terminal");
                if(First.get(el).contains(" ")==true){
                    //System.out.println("contains e");
                    First.get(el).remove(" ");
                    elem = join(elem,First.get(el));
                    elem = join(elem,Next.get(key));
                }else{
                    //System.out.println("no contains e");
                    elem = join(elem,First.get(el));
                }
            }else
                elem.add(el);

            if(el.equals(" ")== true)
                elem = Next.get(key);

            all.add(elem);


        }
        return all;
    }

    public static void ClaSets(){
        ArrayList<String> elem ;
        ArrayList<ArrayList<String>> all ;


        //Calcular primeros por cada No terminal
        for (int i = 0; i < Gramatica.size(); i++) {
            elem = new ArrayList<String>();
            elem = CalFirst(keys.get(i));
            First.put(keys.get(i),elem);

        }

        //retira los repetidos
        First = UnicoN(First);
        //retira epsilon
        First = quitE(First);

        // Mostrar primeros
        System.out.println("Primeros: ");
        showHA(First);

        System.out.println();

        //Calcular siguientes por cada No terminal
        for (int i = 0; i < Gramatica.size(); i++) {
            elem = new ArrayList<String>();
            elem = CalNext(keys.get(i));
            if (elem.size()==0)elem.add("$");
            Next.put(keys.get(i),elem);

        }

        // Mostrar siguientes
        System.out.println("Siguientes: ");
        Next = UnicoN(Next);
        showHA(Next);

        System.out.println();

        //Calcular predicción por cada Regla
        for (int i = 0; i < Gramatica.size(); i++) {
            all = new ArrayList<ArrayList<String>>();
            elem = new ArrayList<String>();
            elem = CalPred(keys.get(i));
            all.add(elem);
            Prediccion.put(keys.get(i),all);
        }

        // Mostrar conjunto de predicción
        System.out.println("Predicción: ");
        //s.showH(Prediccion);
        for (int i = 0; i < Prediccion.size() ; i++) {

            //System.out.println(keys.get(i)+" = "+Prediccion.get(keys.get(i)));
            System.out.println(keys.get(i)+": ");
            for (int j = 0; j < Prediccion.get(keys.get(i)).size() ; j++) {
                System.out.println(Prediccion.get(keys.get(i)).get(j));
            }

        }
    }

    public static HashMap UnicoN(HashMap<String,ArrayList<String>> a){
        String key ;
        HashSet<String> hashSet;
        for (int i = 0; i < a.size() ; i++) {
            key = keys.get(i);
            hashSet = new HashSet<String>(a.get(key));
            a.get(key).clear();
            a.get(key).addAll(hashSet);

        }
        return a;
    }
    // para saber si esta epsilon en una de las producciones
    public static boolean exE(String key){
        boolean ans = false;
        for (int i = 0; i < Gramatica.get(key).size() ; i++) {
            for (int j = 0; j < Gramatica.get(key).get(i).size() ; j++) {
                if(Gramatica.get(key).get(i).contains(" ")){
                    ans = true;
                    break;
                }
            }
        }
        return ans;
    }

    public static HashMap quitE(HashMap<String,ArrayList<String>> a){
        String key ;
        String val;
        ArrayList<String> temp;
        for (int i = 0; i < a.size() ; i++) {
            key = keys.get(i);
            if(a.get(key).contains(" ") && exE(key) == false)
                a.get(key).remove(" ");
        }
        return a;
    }
    
    //análisis sintáctico como tal
    String token=lexic.nextToken();
    ArrayList<String> pred;
    
    public void Emparejar(String spected){
        if(token == null ? spected == null : token.equals(spected)){
            token=lexic.nextToken();
        }else{
            System.out.println("error sintáctico, se esperaba " + spected);
        }
    }
    
    public void S(){
            for (int i = 0; i < Prediccion.get("S").size() ; i++) {
                pred =Prediccion.get("S").get(i);
                if(pred.contains(token) && i==0){
                    spec_component();
                }else if(pred.contains(token) && i==1){
                    separate_body();
                    Emparejar("$");
                }else{
                    System.out.println("error sintáctico");
                }
            }
        }
    
    private void spec_component() {
        for (int i = 0; i < Prediccion.get("spec_component").size() ; i++) {
            pred =Prediccion.get("spec_component").get(i);
            if(pred.contains(token)){
                comp_label();
                spec_stmt_ls();
                spec_body();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }

    private void separate_body() {
        for (int i = 0; i < Prediccion.get("separate_body").size() ; i++) {
            pred =Prediccion.get("separate_body").get(i);
            if(pred.contains(token)){
                Emparejar("tk_body");
                Emparejar("tk_id");
                body_stmt_ls();
                end_id();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void comp_label() {
        for (int i = 0; i < Prediccion.get("comp_label").size() ; i++) {
            pred =Prediccion.get("comp_label").get(i);
            if(pred.contains(token) && token.equals("tk_global")){
                Emparejar("tk_global");
                Emparejar("tk_id");
            }else if(pred.contains(token) && token.equals("tk_resource")){
                Emparejar("tk_resource");
                Emparejar("tk_id");
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void spec_stmt_ls() {
        for (int i = 0; i < Prediccion.get("spec_stmt_ls").size() ; i++) {
            pred =Prediccion.get("spec_stmt_ls").get(i);
            if(pred.contains(token)){
                spec_stmt();
                spec_stmt_ls1();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void spec_stmt_ls1() {
        for (int i = 0; i < Prediccion.get("spec_stmt_ls'").size() ; i++) {
            pred =Prediccion.get("spec_stmt_ls'").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_separator");
                spec_stmt();
                spec_stmt_ls1();
                Emparejar("$");
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void spec_stmt() {
        for (int i = 0; i < Prediccion.get("spec_stmt").size() ; i++) {
            pred =Prediccion.get("spec_stmt").get(i);
            if(pred.contains(token) && i==0){
                common_stmt();
                spec_stmt_ls1();
            }else if(pred.contains(token) && i==1){
                extend_clause();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void common_stmt() {
        for (int i = 0; i < Prediccion.get("common_stmt").size() ; i++) {
            pred =Prediccion.get("common_stmt").get(i);
            if(pred.contains(token) && i==0){
                decl();
            }else if(pred.contains(token) && i==1){
                import_clause();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void extend_clause() {
        for (int i = 0; i < Prediccion.get("extend_clause").size() ; i++) {
            pred =Prediccion.get("extend_clause").get(i);
            if(pred.contains(token)){
                Emparejar("tk_extend");
                import_list();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void spec_body() {
        for (int i = 0; i < Prediccion.get("spec_body").size() ; i++) {
            pred =Prediccion.get("spec_body").get(i);
            if(pred.contains(token) && i==0){
                end_id();
            }else if(pred.contains(token) && i==1){
                Emparejar("tk_body");
                Emparejar("tk_id");
                maybe_params();
                spec_body1();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void spec_body1() {
        for (int i = 0; i < Prediccion.get("spec_body'").size() ; i++) {
            pred =Prediccion.get("spec_body'").get(i);
            if(pred.contains(token) && i==0){
                body_stmt_ls();
                end_id();
            }else if(pred.contains(token) && i==1){
                Emparejar("tk_separate");
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void body_stmt_ls() {
        for (int i = 0; i < Prediccion.get("body_stmt_ls").size() ; i++) {
            pred =Prediccion.get("body_stmt_ls").get(i);
            if(pred.contains(token)){
                body_stmt();
                body_stmt_ls1();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void body_stmt_ls1() {
        for (int i = 0; i < Prediccion.get("body_stmt_ls'").size() ; i++) {
            pred =Prediccion.get("body_stmt_ls'").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_separator");
                body_stmt();
                body_stmt_ls1();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void body_stmt() {
        for (int i = 0; i < Prediccion.get("body_stmt").size() ; i++) {
            pred =Prediccion.get("body_stmt").get(i);
            if(pred.contains(token) && i==0){
                common_stmt();
            }else if(pred.contains(token) && i==1){
                expr();
            }else if(pred.contains(token) && i==2){
                body_only();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void body_only() {
        for (int i = 0; i < Prediccion.get("body_only").size() ; i++) {
            pred =Prediccion.get("body_only").get(i);
            if(pred.contains(token) && i==0){
                stmt();
            }else if(pred.contains(token) && i==1){
                proc();
            }else if(pred.contains(token) && i==2){
                process();
            }else if(pred.contains(token) && i==3){
                procedure();
            }else if(pred.contains(token) && i==4){
                initial_block();
            }else if(pred.contains(token) && i==5){
                final_block();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void initial_block() {
        for (int i = 0; i < Prediccion.get("initial_block").size() ; i++) {
            pred =Prediccion.get("initial_block").get(i);
            if(pred.contains(token)){
                Emparejar("tk_initial");
                block();
                Emparejar("tk_end");
                initial_opt();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void initial_opt() {
        for (int i = 0; i < Prediccion.get("initial_opt").size() ; i++) {
            pred =Prediccion.get("initial_opt").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_initial");
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void final_block() {
        for (int i = 0; i < Prediccion.get("final_block").size() ; i++) {
            pred =Prediccion.get("final_block").get(i);
            if(pred.contains(token)){
                Emparejar("tk_final");
                block();
                Emparejar("tk_end");
                final_opt();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void final_opt() {
        for (int i = 0; i < Prediccion.get("final_opt").size() ; i++) {
            pred =Prediccion.get("final_opt").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_final");
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void maybe_params() {
        for (int i = 0; i < Prediccion.get("maybe_params").size() ; i++) {
            pred =Prediccion.get("maybe_params").get(i);
            if(pred.contains(token) && i==0){
                parameters();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void proc() {
        for (int i = 0; i < Prediccion.get("proc").size() ; i++) {
            pred =Prediccion.get("proc").get(i);
            if(pred.contains(token)){
                Emparejar("tk_proc");
                Emparejar("tk_id");
                param_names();
                block();
                end_id();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void process() {
        for (int i = 0; i < Prediccion.get("process").size() ; i++) {
            pred =Prediccion.get("process").get(i);
            if(pred.contains(token)){
                Emparejar("tk_process");
                Emparejar("tk_id");
                quantifiers_opt();
                block();
                end_id();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void procedure() {
        for (int i = 0; i < Prediccion.get("procedure").size() ; i++) {
            pred =Prediccion.get("procedure").get(i);
            if(pred.contains(token)){
                Emparejar("tk_procedure");
                Emparejar("tk_id");
                prototype();
                block();
                end_id();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void block() {
        for (int i = 0; i < Prediccion.get("block").size() ; i++) {
            pred =Prediccion.get("block").get(i);
            if(pred.contains(token)){
                block_item();
                block1();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void block1() {
        for (int i = 0; i < Prediccion.get("block'").size() ; i++) {
            pred =Prediccion.get("block'").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_separator");
                block_item();
                block1();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void block_item() {
        for (int i = 0; i < Prediccion.get("block_item").size() ; i++) {
            pred =Prediccion.get("block_item").get(i);
            if(pred.contains(token) && i==0){
                decl();
            }else if(pred.contains(token) && i==1){
                stmt();
            }else if(pred.contains(token) && i==2){
                expr();
            }else if(pred.contains(token) && i==3){
                import_clause();
            }else if(pred.contains(token) && i==4){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void import_clause() {
        for (int i = 0; i < Prediccion.get("import_clause").size() ; i++) {
            pred =Prediccion.get("import_clause").get(i);
            if(pred.contains(token)){
                Emparejar("tk_import");
                import_list();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void import_list() {
        for (int i = 0; i < Prediccion.get("import_list").size() ; i++) {
            pred =Prediccion.get("import_list").get(i);
            if(pred.contains(token)){
                Emparejar("tk_id");
                import_list1();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void import_list1() {
        for (int i = 0; i < Prediccion.get("import_list'").size() ; i++) {
            pred =Prediccion.get("import_list'").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_id");
                import_list1();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void op_prototype() {
        for (int i = 0; i < Prediccion.get("op_prototype").size() ; i++) {
            pred =Prediccion.get("op_prototype").get(i);
            if(pred.contains(token)){
                prototype();
                op_restriction_opt();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void prototype() {
        for (int i = 0; i < Prediccion.get("prototype").size() ; i++) {
            pred =Prediccion.get("prototype").get(i);
            if(pred.contains(token)){
                parameters();
                return_spec_opt();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void parameters() {
        for (int i = 0; i < Prediccion.get("parameters").size() ; i++) {
            pred =Prediccion.get("parameters").get(i);
            if(pred.contains(token)){
                Emparejar("tk_lparen");
                param_spec_lp();
                Emparejar("tk_rparen");
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void param_spec_lp() {
        for (int i = 0; i < Prediccion.get("param_spec_lp").size() ; i++) {
            pred =Prediccion.get("param_spec_lp").get(i);
            if(pred.contains(token) && i==0){
                param_spec();
                param_spec_lp1();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void param_spec_lp1() {
        for (int i = 0; i < Prediccion.get("param_spec_lp'").size() ; i++) {
            pred =Prediccion.get("param_spec_lp'").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_separator");
                param_spec();
                param_spec_lp1();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void param_spec() {
        for (int i = 0; i < Prediccion.get("param_spec").size() ; i++) {
            pred =Prediccion.get("param_spec").get(i);
            if(pred.contains(token)){
                param_kind_opt();
                param_spec1();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void param_spec1() {
        for (int i = 0; i < Prediccion.get("param_spec'").size() ; i++) {
            pred =Prediccion.get("param_spec'").get(i);
            if(pred.contains(token) && i==0){
                type();
            }else if(pred.contains(token) && i==1){
                id_subs_lp();
                Emparejar("tk_colon");
                type();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void op_restriction_opt() {
        for (int i = 0; i < Prediccion.get("op_restriction_opt").size() ; i++) {
            pred =Prediccion.get("op_restriction_opt").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_lbrace");
                op_restriction();
                Emparejar("tk_rbrace");
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void return_spec_opt() {
        for (int i = 0; i < Prediccion.get("return_spec_opt").size() ; i++) {
            pred =Prediccion.get("return_spec_opt").get(i);
            if(pred.contains(token)){
                Emparejar("tk_returns");
                return_spec_opt1();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void return_spec_opt1() {
        for (int i = 0; i < Prediccion.get("return_spec_opt'").size() ; i++) {
            pred =Prediccion.get("return_spec_opt'").get(i);
            if(pred.contains(token) && i==0){
                type();
            }else if(pred.contains(token) && i==1){
                id_subs();
                Emparejar("tk_colon");
                type();
            }else if(pred.contains(token) && i==2){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void param_kind_opt() {
        for (int i = 0; i < Prediccion.get("param_kind_opt").size() ; i++) {
            pred =Prediccion.get("param_kind_opt").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_val");
            }else if(pred.contains(token) && i==1){
                Emparejar("tk_var");
            }else if(pred.contains(token) && i==2){
                Emparejar("tk_res");
            }else if(pred.contains(token) && i==3){
                Emparejar("tk_ref");
            }else if(pred.contains(token) && i==4){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void id_subs_lp() {
        for (int i = 0; i < Prediccion.get("id_subs_lp").size() ; i++) {
            pred =Prediccion.get("id_subs_lp").get(i);
            if(pred.contains(token)){
                id_subs();
                id_subs_lp1();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void id_subs_lp1() {
        for (int i = 0; i < Prediccion.get("id_subs_lp'").size() ; i++) {
            pred =Prediccion.get("id_subs_lp'").get(i);
            if(pred.contains(token)){
                Emparejar("tk_comma");
                id_subs();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void id_subs() {
        for (int i = 0; i < Prediccion.get("id_subs").size() ; i++) {
            pred =Prediccion.get("id_subs").get(i);
            if(pred.contains(token)){
                Emparejar("tk_id");
                subscripts_opt();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void op_restriction() {
        for (int i = 0; i < Prediccion.get("op_restriction").size() ; i++) {
            pred =Prediccion.get("op_restriction").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_call");
                restriction1();
            }else if(pred.contains(token) && i==1){
                id_subs();
                Emparejar("tk_send");
                restriction2();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void restriction1() {
        for (int i = 0; i < Prediccion.get("restriction'").size() ; i++) {
            pred =Prediccion.get("restriction'").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_comma");
                Emparejar("tk_send");
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void restriction2() {
        for (int i = 0; i < Prediccion.get("restriction''").size() ; i++) {
            pred =Prediccion.get("restriction''").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_comma");
                Emparejar("tk_call");
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void type() {
        for (int i = 0; i < Prediccion.get("type").size() ; i++) {
            pred =Prediccion.get("type").get(i);
            if(pred.contains(token) && i==0){
                subscripts();
                unsub_type();
            }else if(pred.contains(token) && i==1){
                unsub_type();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void unsub_type() {
        for (int i = 0; i < Prediccion.get("unsub_type").size() ; i++) {
            pred =Prediccion.get("unsub_type").get(i);
            if(pred.contains(token) && i==0){
                basic_type();
            }else if(pred.contains(token) && i==1){
                string_def();
            }else if(pred.contains(token) && i==2){
                enum_def();
            }else if(pred.contains(token) && i==3){
                pointer_def();
            }else if(pred.contains(token) && i==4){
                record_def();
            }else if(pred.contains(token) && i==5){
                union_def();
            }else if(pred.contains(token) && i==6){
                capability_def();
            }else if(pred.contains(token) && i==7){
                qualified_id();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void basic_type() {
        for (int i = 0; i < Prediccion.get("basic_type").size() ; i++) {
            pred =Prediccion.get("basic_type").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_bool");
            }else if(pred.contains(token) && i==1){
                Emparejar("tk_char");
            }else if(pred.contains(token) && i==2){
                Emparejar("tk_int");
            }else if(pred.contains(token) && i==3){
                Emparejar("tk_file");
            }else if(pred.contains(token) && i==4){
                Emparejar("tk_real");
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void string_def() {
        for (int i = 0; i < Prediccion.get("string_def").size() ; i++) {
            pred =Prediccion.get("string_def").get(i);
            if(pred.contains(token)){
                Emparejar("tk_string");
                string_def1();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void string_def1() {
        for (int i = 0; i < Prediccion.get("string_def'").size() ; i++) {
            pred =Prediccion.get("string_def'").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_lbracket");
                string_lim();
                Emparejar("tk_rbracket");
            }else if(pred.contains(token) && i==1){
                Emparejar("tk_lparen");
                string_lim();
                Emparejar("tk_rparen");
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void enum_def() {
        for (int i = 0; i < Prediccion.get("enum_def").size() ; i++) {
            pred =Prediccion.get("enum_def").get(i);
            if(pred.contains(token)){
                Emparejar("tk_enum");
                Emparejar("tk_lparen");
                id_lp();
                Emparejar("tk_rparen");
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void string_lim() {
        for (int i = 0; i < Prediccion.get("string_lim").size() ; i++) {
            pred =Prediccion.get("string_lim").get(i);
            if(pred.contains(token) && i==0){
                expr();
            }else if(pred.contains(token) && i==1){
                Emparejar("tk_aster");
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void pointer_def() {
        for (int i = 0; i < Prediccion.get("pointer_def").size() ; i++) {
            pred =Prediccion.get("pointer_def").get(i);
            if(pred.contains(token)){
                Emparejar("tk_ptr");
                pointer_def1();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void pointer_def1() {
        for (int i = 0; i < Prediccion.get("pointer_def'").size() ; i++) {
            pred =Prediccion.get("pointer_def'").get(i);
            if(pred.contains(token) && i==0){
                basic_type();
            }else if(pred.contains(token) && i==1){
                Emparejar("tk_any");
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void record_def() {
        for (int i = 0; i < Prediccion.get("record_def").size() ; i++) {
            pred =Prediccion.get("record_def").get(i);
            if(pred.contains(token)){
                Emparejar("tk_rec");
                Emparejar("tk_lparen");
                field_lp();
                Emparejar("tk_rparen");
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void union_def() {
        for (int i = 0; i < Prediccion.get("union_def").size() ; i++) {
            pred =Prediccion.get("union_def").get(i);
            if(pred.contains(token)){
                Emparejar("tk_union");
                Emparejar("tk_lparen");
                field_lp();
                Emparejar("tk_rparen");
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void capability_def() {
        for (int i = 0; i < Prediccion.get("capability_def").size() ; i++) {
            pred =Prediccion.get("capability_def").get(i);
            if(pred.contains(token)){
                Emparejar("tk_cap");
                cap_for();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void field_lp() {
        for (int i = 0; i < Prediccion.get("field_lp").size() ; i++) {
            pred =Prediccion.get("field_lp").get(i);
            if(pred.contains(token)){
                field();
                field_lp1();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void field_lp1() {
        for (int i = 0; i < Prediccion.get("field_lp'").size() ; i++) {
            pred =Prediccion.get("field_lp'").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_separator");
                field();
                field_lp1();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void field() {
        for (int i = 0; i < Prediccion.get("field").size() ; i++) {
            pred =Prediccion.get("field").get(i);
            if(pred.contains(token)){
                var_def_lp();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void var_def_lp() {
        for (int i = 0; i < Prediccion.get("var_def_lp").size() ; i++) {
            pred =Prediccion.get("var_def_lp").get(i);
            if(pred.contains(token)){
                var_def();
                var_def_lp1();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void var_def_lp1() {
        for (int i = 0; i < Prediccion.get("var_def_lp'").size() ; i++) {
            pred =Prediccion.get("var_def_lp'").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_comma");
                var_def();
                var_def_lp1();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void var_def() {
        for (int i = 0; i < Prediccion.get("var_def").size() ; i++) {
            pred =Prediccion.get("var_def").get(i);
            if(pred.contains(token)){
                id_subs_lp();
                var_att();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void var_att() {
        for (int i = 0; i < Prediccion.get("var_att").size() ; i++) {
            pred =Prediccion.get("var_att").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_colon");
                basic_type();
                var_att1();
            }else if(pred.contains(token) && i==1){
                Emparejar("tk_assign");
                expr();
            }else if(pred.contains(token) && i==2){
                Emparejar("tk_separator");
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void var_att1() {
        for (int i = 0; i < Prediccion.get("var_att'").size() ; i++) {
            pred =Prediccion.get("var_att'").get(i);
            if(pred.contains(token) && i==1){
                Emparejar("tk_assign");
                expr();
            }else if(pred.contains(token) && i==2){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void cap_for() {
        for (int i = 0; i < Prediccion.get("cap_for").size() ; i++) {
            pred =Prediccion.get("cap_for").get(i);
            if(pred.contains(token) && i==0){
                qualified_id();
            }else if(pred.contains(token) && i==1){
                op_prototype();
            }else if(pred.contains(token) && i==2){
                Emparejar("tk_sem");
            }else if(pred.contains(token) && i==3){
                Emparejar("tk_vm");
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void stmt() {
        for (int i = 0; i < Prediccion.get("stmt").size() ; i++) {
            pred =Prediccion.get("stmt").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_skip");
            }else if(pred.contains(token) && i==1){
                Emparejar("tk_stop");
                exit_code_opt();
            }else if(pred.contains(token) && i==2){
                Emparejar("tk_exit");
            }else if(pred.contains(token) && i==3){
                Emparejar("tk_next");
            }else if(pred.contains(token) && i==4){
                Emparejar("tk_return");
            }else if(pred.contains(token) && i==5){
                Emparejar("tk_reply");
            }else if(pred.contains(token) && i==6){
                Emparejar("tk_forward");
                expr();
                paren_list();
            }else if(pred.contains(token) && i==7){
                Emparejar("tk_send");
                expr();
                paren_list();
            }else if(pred.contains(token) && i==8){
                Emparejar("tk_call");
                expr();
                paren_list();
            }else if(pred.contains(token) && i==9){
                Emparejar("tk_destroy");
                expr();
            }else if(pred.contains(token) && i==10){
                Emparejar("tk_begin");
                block();
                Emparejar("tk_end");
            }else if(pred.contains(token) && i==11){
                Emparejar("tk_if");
                guarded_cmd_lp();
                else_cmd_opt();
                Emparejar("tk_fi");
            }else if(pred.contains(token) && i==12){
                Emparejar("tk_do");
                guarded_cmd_lp();
                else_cmd_opt();
                Emparejar("tk_od");
            }else if(pred.contains(token) && i==13){
                Emparejar("tk_fa");
                quantifier_lp();
                Emparejar("tk_arrow");
                block();
                Emparejar("tk_af");
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void guarded_cmd_lp() {
        for (int i = 0; i < Prediccion.get("guarded_cmd_lp").size() ; i++) {
            pred =Prediccion.get("guarded_cmd_lp").get(i);
            if(pred.contains(token)){
                expr();
                Emparejar("tk_arrow");
                guarded_cmd_lp1();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void guarded_cmd_lp1() {
        for (int i = 0; i < Prediccion.get("guarded_cmd_lp'").size() ; i++) {
            pred =Prediccion.get("guarded_cmd_lp'").get(i);
            if(pred.contains(token) && i==0){
                guarded_cmd_lp();
                guarded_cmd_lp1();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void else_cmd_opt() {
        for (int i = 0; i < Prediccion.get("else_cmd_opt").size() ; i++) {
            pred =Prediccion.get("else_cmd_opt").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_square");
                Emparejar("tk_else");
                Emparejar("tk_arrow");
                block();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void quantifier_lp() {
        for (int i = 0; i < Prediccion.get("quantifier_lp").size() ; i++) {
            pred =Prediccion.get("quantifier_lp").get(i);
            if(pred.contains(token)){
                expr();
                quantifier();
                quantifier_lp1();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void quantifier_lp1() {
        for (int i = 0; i < Prediccion.get("quantifier_lp'").size() ; i++) {
            pred =Prediccion.get("quantifier_lp'").get(i);
            if(pred.contains(token) && i==0){
                quantifier_lp();
                quantifier_lp1();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void quantifier() {
        for (int i = 0; i < Prediccion.get("quantifier").size() ; i++) {
            pred =Prediccion.get("quantifier").get(i);
            if(pred.contains(token)){
                Emparejar("tk_id");
                Emparejar("tk_assign");
                expr();
                direction();
                expr();
                step_opt();
                such_that_opt();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void direction() {
        for (int i = 0; i < Prediccion.get("direction").size() ; i++) {
            pred =Prediccion.get("direction").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_to");
            }else if(pred.contains(token) && i==1){
                Emparejar("tk_downto");
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void step_opt() {
        for (int i = 0; i < Prediccion.get("step_opt").size() ; i++) {
            pred =Prediccion.get("step_opt").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_by");
                expr();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void such_that_opt() {
        for (int i = 0; i < Prediccion.get("such_that_opt").size() ; i++) {
            pred =Prediccion.get("such_that_opt").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_suchthat");
                expr();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void in_cmd_lp() {
        for (int i = 0; i < Prediccion.get("in_cmd_lp").size() ; i++) {
            pred =Prediccion.get("in_cmd_lp").get(i);
            if(pred.contains(token)){
                in_cmd();
                in_cmd_lp1();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void in_cmd_lp1() {
        for (int i = 0; i < Prediccion.get("in_cmd_lp'").size() ; i++) {
            pred =Prediccion.get("in_cmd_lp'").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_square");
                in_cmd();
                in_cmd_lp1();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void in_cmd() {
        for (int i = 0; i < Prediccion.get("in_cmd").size() ; i++) {
            pred =Prediccion.get("in_cmd").get(i);
            if(pred.contains(token)){
                quantifiers_opt();
                in_spec();
                sync_expr_opt();
                sched_expr_opt();
                Emparejar("tk_arrow");
                block();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void quantifiers_opt() {
        for (int i = 0; i < Prediccion.get("quantifiers_opt").size() ; i++) {
            pred =Prediccion.get("quantifiers_opt").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_lparen");
                quantifier_lp();
                Emparejar("tk_rparen");
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void in_spec() {
        for (int i = 0; i < Prediccion.get("in_spec").size() ; i++) {
            pred =Prediccion.get("in_spec").get(i);
            if(pred.contains(token)){
                quantifiers_opt();
                in_op();
                param_names();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void in_op() {
        for (int i = 0; i < Prediccion.get("in_op").size() ; i++) {
            pred =Prediccion.get("in_op").get(i);
            if(pred.contains(token)){
                qualified_id();
                subscripts_opt();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void qualified_id() {
        for (int i = 0; i < Prediccion.get("qualified_id").size() ; i++) {
            pred =Prediccion.get("qualified_id").get(i);
            if(pred.contains(token)){
                Emparejar("tk_id");
                qualified_id1();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void qualified_id1() {
        for (int i = 0; i < Prediccion.get("qualified_id'").size() ; i++) {
            pred =Prediccion.get("qualified_id'").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_period");
                Emparejar("tk_id");
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void param_names() {
        for (int i = 0; i < Prediccion.get("param_names").size() ; i++) {
            pred =Prediccion.get("param_names").get(i);
            if(pred.contains(token)){
                Emparejar("tk_lparen");
                id_lp();
                Emparejar("tk_rparen");
                return_name_opt();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void return_name_opt() {
        for (int i = 0; i < Prediccion.get("return_name_opt").size() ; i++) {
            pred =Prediccion.get("return_name_opt").get(i);
            if(pred.contains(token)){
                Emparejar("tk_returns");
                Emparejar("tk_id");
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void id_lp() {
        for (int i = 0; i < Prediccion.get("id_lp").size() ; i++) {
            pred =Prediccion.get("id_lp").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_id");
                id_lp1();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void id_lp1() {
        for (int i = 0; i < Prediccion.get("id_lp'").size() ; i++) {
            pred =Prediccion.get("id_lp'").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_comma");
                Emparejar("tk_id");
                id_lp1();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void sync_expr_opt() {
        for (int i = 0; i < Prediccion.get("sync_expr_opt").size() ; i++) {
            pred =Prediccion.get("sync_expr_opt").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_and");
                expr();
            }else if(pred.contains(token) && i==1){
                Emparejar("tk_suchthat");
                expr();
            }else if(pred.contains(token) && i==2){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void sched_expr_opt() {
        for (int i = 0; i < Prediccion.get("sched_expr_opt").size() ; i++) {
            pred =Prediccion.get("sched_expr_opt").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_by");
                expr();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void concurrent_cmd_lp() {
        for (int i = 0; i < Prediccion.get("concurrent_cmd_lp").size() ; i++) {
            pred =Prediccion.get("concurrent_cmd_lp").get(i);
            if(pred.contains(token)){
                concurrent_cmd();
                concurrent_cmd_lp1();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void concurrent_cmd_lp1() {
        for (int i = 0; i < Prediccion.get("concurrent_cmd_lp'").size() ; i++) {
            pred =Prediccion.get("concurrent_cmd_lp'").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_parallel");
                concurrent_cmd();
                concurrent_cmd_lp1();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void concurrent_cmd() {
        for (int i = 0; i < Prediccion.get("concurrent_cmd").size() ; i++) {
            pred =Prediccion.get("concurrent_cmd").get(i);
            if(pred.contains(token)){
                quantifiers_opt();
                separator_opt();
                concurrent_invocation();
                post_processing_opt();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void separator_opt() {
        for (int i = 0; i < Prediccion.get("separator_opt").size() ; i++) {
            pred =Prediccion.get("separator_opt").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_separator");
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void concurrent_invocation() {
        for (int i = 0; i < Prediccion.get("concurrent_invocation").size() ; i++) {
            pred =Prediccion.get("concurrent_invocation").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_call");
                expr();
                paren_list();
            }else if(pred.contains(token) && i==1){
                Emparejar("tk_send");
                expr();
                paren_list();
            }else if(pred.contains(token) && i==2){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void post_processing_opt() {
        for (int i = 0; i < Prediccion.get("post_processing_opt").size() ; i++) {
            pred =Prediccion.get("post_processing_opt").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_arrow");
                block();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void expr() {
        for (int i = 0; i < Prediccion.get("expr").size() ; i++) {
            pred =Prediccion.get("expr").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_id");
                expr2();
            }else if(pred.contains(token) && i==1){
                Emparejar("tk_num");
                expr2();
            }else if(pred.contains(token) && i==2){
                Emparejar("tk_false");
                expr2();
            }else if(pred.contains(token) && i==3){
                Emparejar("tk_true");
                expr2();
            }else if(pred.contains(token) && i==4){
                Emparejar("tk_caracter");
                expr2();
            }else if(pred.contains(token) && i==5){
                Emparejar("tk_cadena");
                expr2();
            }else if(pred.contains(token) && i==6){
                Emparejar("tk_noop");
                expr2();
            }else if(pred.contains(token) && i==7){
                Emparejar("tk_null");
                expr2();
            }else if(pred.contains(token) && i==8){
                Emparejar("tk_stderr");
                expr2();
            }else if(pred.contains(token) && i==9){
                Emparejar("tk_stdin");
                expr2();
            }else if(pred.contains(token) && i==10){
                Emparejar("tk_stdout");
                expr2();
            }else if(pred.contains(token) && i==11){
                Emparejar("tk_lparen");
                constr_item_lp();
                Emparejar("tk_rparen");
                expr2();
            }else if(pred.contains(token) && i==12){
                Emparejar("tk_not");
                expr2();
            }else if(pred.contains(token) && i==13){
                Emparejar("tk_plus");
                expr2();
            }else if(pred.contains(token) && i==14){
                Emparejar("tk_minus");
                expr2();
            }else if(pred.contains(token) && i==15){
                Emparejar("tk_addr");
                expr2();
            }else if(pred.contains(token) && i==16){
                Emparejar("tk_qmark");
                expr2();
            }else if(pred.contains(token) && i==17){
                Emparejar("tk_incr");
                expr2();
            }else if(pred.contains(token) && i==18){
                Emparejar("tk_decr");
                expr2();
            }else if(pred.contains(token) && i==19){
                basic_type();
                paren_expr();
                expr2();
            }else if(pred.contains(token) && i==20){
                Emparejar("tk_string");
                paren_expr();
                expr2();
            }else if(pred.contains(token) && i==21){
                Emparejar("tk_low");
                Emparejar("tk_lparen");
                type();
                Emparejar("tk_rparen");
                expr2();
            }else if(pred.contains(token) && i==22){
                Emparejar("tk_high");
                Emparejar("tk_lparen");
                type();
                Emparejar("tk_rparen");
                expr2();
            }else if(pred.contains(token) && i==23){
                Emparejar("tk_new");
                Emparejar("tk_lparen");
                subscripts_opt();
                new_item();
                Emparejar("tk_rparen");
                expr2();
            }else if(pred.contains(token) && i==24){
                Emparejar("tk_create");
                create_call();
                location_opt();
                expr2();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void expr1() {
        for (int i = 0; i < Prediccion.get("expr'").size() ; i++) {
            pred =Prediccion.get("expr'").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_expon");
                expr();
            }else if(pred.contains(token) && i==1){
                Emparejar("tk_aster");
                expr();
            }else if(pred.contains(token) && i==2){
                Emparejar("tk_div");
                expr();
            }else if(pred.contains(token) && i==3){
                Emparejar("tk_mod");
                expr();
            }else if(pred.contains(token) && i==4){
                Emparejar("tk_remdr");
                expr();
            }else if(pred.contains(token) && i==5){
                Emparejar("tk_plus");
                expr();
            }else if(pred.contains(token) && i==6){
                Emparejar("tk_minus");
                expr();
            }else if(pred.contains(token) && i==7){
                Emparejar("tk_concat");
                expr();
            }else if(pred.contains(token) && i==8){
                Emparejar("tk_eq");
                expr();
            }else if(pred.contains(token) && i==9){
                Emparejar("tk_ne");
                expr();
            }else if(pred.contains(token) && i==10){
                Emparejar("tk_ge");
                expr();
            }else if(pred.contains(token) && i==11){
                Emparejar("tk_le");
                expr();
            }else if(pred.contains(token) && i==12){
                Emparejar("tk_gt");
                expr();
            }else if(pred.contains(token) && i==13){
                Emparejar("tk_lt");
                expr();
            }else if(pred.contains(token) && i==14){
                Emparejar("tk_and");
                expr();
            }else if(pred.contains(token) && i==15){
                Emparejar("tk_or");
                expr();
            }else if(pred.contains(token) && i==16){
                Emparejar("tk_xor");
                expr();
            }else if(pred.contains(token) && i==17){
                Emparejar("tk_rshift");
                expr();
            }else if(pred.contains(token) && i==18){
                Emparejar("tk_lshift");
                expr();
            }else if(pred.contains(token) && i==19){
                Emparejar("tk_swap");
                expr();
            }else if(pred.contains(token) && i==20){
                Emparejar("tk_aug_plus");
                expr();
            }else if(pred.contains(token) && i==21){
                Emparejar("tk_aug_minus");
                expr();
            }else if(pred.contains(token) && i==22){
                Emparejar("tk_aug_aster");
                expr();
            }else if(pred.contains(token) && i==23){
                Emparejar("tk_aug_div");
                expr();
            }else if(pred.contains(token) && i==24){
                Emparejar("tk_aug_remdr");
                expr();
            }else if(pred.contains(token) && i==25){
                Emparejar("tk_aug_expon");
                expr();
            }else if(pred.contains(token) && i==26){
                Emparejar("tk_aug_or");
                expr();
            }else if(pred.contains(token) && i==27){
                Emparejar("tk_aug_and");
                expr();
            }else if(pred.contains(token) && i==28){
                Emparejar("tk_aug_concat");
                expr();
            }else if(pred.contains(token) && i==29){
                Emparejar("tk_aug_rshift");
                expr();
            }else if(pred.contains(token) && i==30){
                Emparejar("tk_aug_lshift");
                expr();
            }else if(pred.contains(token) && i==31){
                Emparejar("tk_incr");
            }else if(pred.contains(token) && i==32){
                Emparejar("tk_decr");
            }else if(pred.contains(token) && i==33){
                Emparejar("tk_hat");
            }else if(pred.contains(token) && i==34){
                Emparejar("tk_period");
                Emparejar("tk_id");
            }else if(pred.contains(token) && i==35){
                Emparejar("tk_lbracket");
                bound_lp();
                Emparejar("tk_rbracket");
            }else if(pred.contains(token) && i==36){
                paren_list();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void expr2() {
        for (int i = 0; i < Prediccion.get("expr''").size() ; i++) {
            pred =Prediccion.get("expr''").get(i);
            if(pred.contains(token) && i==0){
                expr1();
                expr2();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void constr_item_lp() {
        for (int i = 0; i < Prediccion.get("constr_item_lp").size() ; i++) {
            pred =Prediccion.get("constr_item_lp").get(i);
            if(pred.contains(token)){
                constr_item();
                constr_item_lp1();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void constr_item_lp1() {
        for (int i = 0; i < Prediccion.get("constr_item_lp'").size() ; i++) {
            pred =Prediccion.get("constr_item_lp'").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_comma");
                constr_item();
                constr_item_lp1();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void constr_item() {
        for (int i = 0; i < Prediccion.get("constr_item").size() ; i++) {
            pred =Prediccion.get("constr_item").get(i);
            if(pred.contains(token) && i==0){
                expr();
            }else if(pred.contains(token) && i==1){
                Emparejar("tk_lbracket");
                expr();
                Emparejar("tk_rbracket");
                expr();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void subscripts_opt() {
        for (int i = 0; i < Prediccion.get("subscripts_opt").size() ; i++) {
            pred =Prediccion.get("subscripts_opt").get(i);
            if(pred.contains(token) && i==0){
                bracketed_list();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void bracketed_list() {
        for (int i = 0; i < Prediccion.get("bracketed_list").size() ; i++) {
            pred =Prediccion.get("bracketed_list").get(i);
            if(pred.contains(token)){
                Emparejar("tk_lbracket");
                bound_lp();
                Emparejar("tk_rbracket");
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void bound_lp() {
        for (int i = 0; i < Prediccion.get("bound_lp").size() ; i++) {
            pred =Prediccion.get("bound_lp").get(i);
            if(pred.contains(token)){
                bounds();
                bound_lp1();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void bound_lp1() {
        for (int i = 0; i < Prediccion.get("bound_lp'").size() ; i++) {
            pred =Prediccion.get("bound_lp'").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_comma");
                bounds();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void bounds() {
        for (int i = 0; i < Prediccion.get("bounds").size() ; i++) {
            pred =Prediccion.get("bounds").get(i);
            if(pred.contains(token)){
                bound();
                bounds1();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void bounds1() {
        for (int i = 0; i < Prediccion.get("bounds'").size() ; i++) {
            pred =Prediccion.get("bounds'").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_colon");
                bound();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void bound() {
        for (int i = 0; i < Prediccion.get("bound").size() ; i++) {
            pred =Prediccion.get("bound").get(i);
            if(pred.contains(token) && i==0){
                expr();
            }else if(pred.contains(token) && i==1){
                Emparejar("tk_aster");
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void paren_expr() {
        for (int i = 0; i < Prediccion.get("paren_expr").size() ; i++) {
            pred =Prediccion.get("paren_expr").get(i);
            if(pred.contains(token)){
                Emparejar("tk_lparen");
                expr();
                Emparejar("tk_rparen");
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void new_item() {
        for (int i = 0; i < Prediccion.get("new_item").size() ; i++) {
            pred =Prediccion.get("new_item").get(i);
            if(pred.contains(token) && i==0){
                unsub_type();
            }else if(pred.contains(token) && i==1){
                Emparejar("tk_sem");
                sem_proto();
            }else if(pred.contains(token) && i==2){
                Emparejar("tk_op");
                op_prototype();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void create_call() {
        for (int i = 0; i < Prediccion.get("create_call").size() ; i++) {
            pred =Prediccion.get("create_call").get(i);
            if(pred.contains(token)){
                rsrc_name();
                paren_list();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void rsrc_name() {
        for (int i = 0; i < Prediccion.get("rsrc_name").size() ; i++) {
            pred =Prediccion.get("rsrc_name").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_id");
            }else if(pred.contains(token) && i==1){
                Emparejar("tk_vm");
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void paren_list() {
        for (int i = 0; i < Prediccion.get("paren_list").size() ; i++) {
            pred =Prediccion.get("paren_list").get(i);
            if(pred.contains(token)){
                Emparejar("tk_lparen");
                paren_item_ls();
                Emparejar("tk_rparen");
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void paren_item_ls() {
        for (int i = 0; i < Prediccion.get("paren_item_ls").size() ; i++) {
            pred =Prediccion.get("paren_item_ls").get(i);
            if(pred.contains(token) && i==0){
                expr_lp();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void expr_lp() {
        for (int i = 0; i < Prediccion.get("expr_lp").size() ; i++) {
            pred =Prediccion.get("expr_lp").get(i);
            if(pred.contains(token)){
                expr();
                expr_lp1();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void expr_lp1() {
        for (int i = 0; i < Prediccion.get("expr_lp'").size() ; i++) {
            pred =Prediccion.get("expr_lp'").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_comma");
                expr_lp1();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void location_opt() {
        for (int i = 0; i < Prediccion.get("location_opt").size() ; i++) {
            pred =Prediccion.get("location_opt").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_on");
                expr();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void decl() {
        for (int i = 0; i < Prediccion.get("decl").size() ; i++) {
            pred =Prediccion.get("decl").get(i);
            if(pred.contains(token) && i==0){
                type_decl();
            }else if(pred.contains(token) && i==1){
                obj_decl();
            }else if(pred.contains(token) && i==2){
                optype_decl();
            }else if(pred.contains(token) && i==3){
                op_decl();
            }else if(pred.contains(token) && i==4){
                sem_decl();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void type_decl() {
        for (int i = 0; i < Prediccion.get("type_decl").size() ; i++) {
            pred =Prediccion.get("type_decl").get(i);
            if(pred.contains(token)){
                Emparejar("tk_type");
                Emparejar("tk_id");
                Emparejar("tk_eq");
                type();
                type_restriction();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void type_restriction() {
        for (int i = 0; i < Prediccion.get("type_restriction").size() ; i++) {
            pred =Prediccion.get("type_restriction").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_lbrace");
                Emparejar("tk_id");
                Emparejar("tk_rbrace");
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void obj_decl() {
        for (int i = 0; i < Prediccion.get("obj_decl").size() ; i++) {
            pred =Prediccion.get("obj_decl").get(i);
            if(pred.contains(token)){
                var_or_const();
                var_def_lp();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void var_or_const() {
        for (int i = 0; i < Prediccion.get("var_or_const").size() ; i++) {
            pred =Prediccion.get("var_or_const").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_var");
            }else if(pred.contains(token) && i==1){
                Emparejar("tk_const");
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void optype_decl() {
        for (int i = 0; i < Prediccion.get("optype_decl").size() ; i++) {
            pred =Prediccion.get("optype_decl").get(i);
            if(pred.contains(token)){
                Emparejar("tk_optype");
                Emparejar("tk_id");
                eq_opt();
                op_prototype();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void eq_opt() {
        for (int i = 0; i < Prediccion.get("eq_opt").size() ; i++) {
            pred =Prediccion.get("eq_opt").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_eq");
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void op_decl() {
        for (int i = 0; i < Prediccion.get("op_decl").size() ; i++) {
            pred =Prediccion.get("op_decl").get(i);
            if(pred.contains(token)){
                op_or_ext();
                oper_def_lp();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void op_or_ext() {
        for (int i = 0; i < Prediccion.get("op_or_ext").size() ; i++) {
            pred =Prediccion.get("op_or_ext").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_op");
            }else if(pred.contains(token) && i==1){
                Emparejar("tk_external");
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void oper_def_lp() {
        for (int i = 0; i < Prediccion.get("oper_def_lp").size() ; i++) {
            pred =Prediccion.get("oper_def_lp").get(i);
            if(pred.contains(token)){
                oper_def();
                oper_def_lp1();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void oper_def_lp1() {
        for (int i = 0; i < Prediccion.get("oper_def_lp'").size() ; i++) {
            pred =Prediccion.get("oper_def_lp'").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_comma");
                oper_def();
                oper_def_lp1();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void oper_def() {
        for (int i = 0; i < Prediccion.get("oper_def").size() ; i++) {
            pred =Prediccion.get("oper_def").get(i);
            if(pred.contains(token)){
                id_subs_lp();
                oper_def1();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void oper_def1() {
        for (int i = 0; i < Prediccion.get("oper_def'").size() ; i++) {
            pred =Prediccion.get("oper_def'").get(i);
            if(pred.contains(token) && i==0){
                op_prototype();
            }else if(pred.contains(token) && i==1){
                Emparejar("tk_opt");
                qualified_id();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void colon_opt() {
        for (int i = 0; i < Prediccion.get("colon_opt").size() ; i++) {
            pred =Prediccion.get("colon_opt").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_colon");
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void sem_decl() {
        for (int i = 0; i < Prediccion.get("sem_decl").size() ; i++) {
            pred =Prediccion.get("sem_decl").get(i);
            if(pred.contains(token)){
                Emparejar("tk_sem");
                sem_def_lp();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void sem_def_lp() {
        for (int i = 0; i < Prediccion.get("sem_def_lp").size() ; i++) {
            pred =Prediccion.get("sem_def_lp").get(i);
            if(pred.contains(token)){
                sem_def();
                sem_def_lp1();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void sem_def_lp1() {
        for (int i = 0; i < Prediccion.get("sem_def_lp'").size() ; i++) {
            pred =Prediccion.get("sem_def_lp'").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_comma");
                sem_def();
                sem_def_lp1();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void sem_def() {
        for (int i = 0; i < Prediccion.get("sem_def").size() ; i++) {
            pred =Prediccion.get("sem_def").get(i);
            if(pred.contains(token)){
                id_subs();
                sem_init();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void sem_init() {
        for (int i = 0; i < Prediccion.get("sem_init").size() ; i++) {
            pred =Prediccion.get("sem_init").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_assign");
                expr();
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void end_id() {
        for (int i = 0; i < Prediccion.get("end_id").size() ; i++) {
            pred =Prediccion.get("end_id").get(i);
            if(pred.contains(token)){
                Emparejar("tk_end");
                id_opt();
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    private void id_opt() {
        for (int i = 0; i < Prediccion.get("id_opt").size() ; i++) {
            pred =Prediccion.get("id_opt").get(i);
            if(pred.contains(token) && i==0){
                Emparejar("tk_id");
            }else if(pred.contains(token) && i==1){
                break;
            }else{
                System.out.println("error sintáctico");
            }
        }
    }
    
    public static void main(String [] args) throws IOException{

        // Crea un objeto de la clase para acceder a las funciones
        Sintax s = new Sintax();

        // Cargar la Gramatica en el HashMap
        s.fillG();

        // Muestra la gramatica
        s.showH(Gramatica);
        s.ClaSets();
        
        System.out.println("\n--------------------------\nno terminales absolutos:");
        for(String a: keys)
            System.out.println(a);

        /*ArrayList<String> elem ;
        elem = new ArrayList<String>();
        elem = CalFirst("A''");
        First.put("A''",elem);
        elem = new ArrayList<String>();
        elem = CalFirst("A");
        First.put("A",elem);
        //ArrayList<String> elem ;
        elem = new ArrayList<String>();
        elem = CalNext("A");
        if (elem.size()==0)elem.add("$");
        Next.put("A",elem);
        */
    }
}