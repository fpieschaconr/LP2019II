/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintax;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Sintax {


    /**
     * @param args the command line arguments
     */
    public static HashMap<String,ArrayList<ArrayList<String>>> Gramatica = new HashMap<String,ArrayList<ArrayList<String>>>();
    public static HashMap<String,ArrayList<ArrayList<String>>> Prediccion = new HashMap<String,ArrayList<ArrayList<String>>>();

    public static HashMap<String,ArrayList<String>> First = new HashMap<String,ArrayList<String>>();
    public static HashMap<String,ArrayList<String>> Next = new HashMap<String,ArrayList<String>>();
    public static ArrayList<String> keys = new ArrayList<String>();



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


    public static void main(String [] args){

        // Crea un objeto de la clase para acceder a las funciones
        Sintax s = new Sintax();

        // Cargar la Gramatica en el HashMap
        s.fillG();

        // Muestra la gramatica
        s.showH(Gramatica);
        s.ClaSets();

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