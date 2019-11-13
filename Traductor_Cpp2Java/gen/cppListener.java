// Generated from C:/Users/Felipe Pieschacon/Desktop/Traductor_Cpp2Java/grammar\cpp.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cppParser}.
 */
public interface cppListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cppParser#translationunit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationunit(cppParser.TranslationunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#translationunit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationunit(cppParser.TranslationunitContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#components}.
	 * @param ctx the parse tree
	 */
	void enterComponents(cppParser.ComponentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#components}.
	 * @param ctx the parse tree
	 */
	void exitComponents(cppParser.ComponentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(cppParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(cppParser.GlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#resource_specification}.
	 * @param ctx the parse tree
	 */
	void enterResource_specification(cppParser.Resource_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#resource_specification}.
	 * @param ctx the parse tree
	 */
	void exitResource_specification(cppParser.Resource_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#resource_body}.
	 * @param ctx the parse tree
	 */
	void enterResource_body(cppParser.Resource_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#resource_body}.
	 * @param ctx the parse tree
	 */
	void exitResource_body(cppParser.Resource_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#spec_body}.
	 * @param ctx the parse tree
	 */
	void enterSpec_body(cppParser.Spec_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#spec_body}.
	 * @param ctx the parse tree
	 */
	void exitSpec_body(cppParser.Spec_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#proc}.
	 * @param ctx the parse tree
	 */
	void enterProc(cppParser.ProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#proc}.
	 * @param ctx the parse tree
	 */
	void exitProc(cppParser.ProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(cppParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(cppParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#block_items}.
	 * @param ctx the parse tree
	 */
	void enterBlock_items(cppParser.Block_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#block_items}.
	 * @param ctx the parse tree
	 */
	void exitBlock_items(cppParser.Block_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#block_item}.
	 * @param ctx the parse tree
	 */
	void enterBlock_item(cppParser.Block_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#block_item}.
	 * @param ctx the parse tree
	 */
	void exitBlock_item(cppParser.Block_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(cppParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(cppParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(cppParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(cppParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(cppParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(cppParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#op_type}.
	 * @param ctx the parse tree
	 */
	void enterOp_type(cppParser.Op_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#op_type}.
	 * @param ctx the parse tree
	 */
	void exitOp_type(cppParser.Op_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(cppParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(cppParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(cppParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(cppParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(cppParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(cppParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#explicit_call}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_call(cppParser.Explicit_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#explicit_call}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_call(cppParser.Explicit_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#invocation}.
	 * @param ctx the parse tree
	 */
	void enterInvocation(cppParser.InvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#invocation}.
	 * @param ctx the parse tree
	 */
	void exitInvocation(cppParser.InvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#sequential}.
	 * @param ctx the parse tree
	 */
	void enterSequential(cppParser.SequentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#sequential}.
	 * @param ctx the parse tree
	 */
	void exitSequential(cppParser.SequentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#op_invocation}.
	 * @param ctx the parse tree
	 */
	void enterOp_invocation(cppParser.Op_invocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#op_invocation}.
	 * @param ctx the parse tree
	 */
	void exitOp_invocation(cppParser.Op_invocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#op_service}.
	 * @param ctx the parse tree
	 */
	void enterOp_service(cppParser.Op_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#op_service}.
	 * @param ctx the parse tree
	 */
	void exitOp_service(cppParser.Op_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#in_cmd}.
	 * @param ctx the parse tree
	 */
	void enterIn_cmd(cppParser.In_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#in_cmd}.
	 * @param ctx the parse tree
	 */
	void exitIn_cmd(cppParser.In_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#resource_control}.
	 * @param ctx the parse tree
	 */
	void enterResource_control(cppParser.Resource_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#resource_control}.
	 * @param ctx the parse tree
	 */
	void exitResource_control(cppParser.Resource_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(cppParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(cppParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#basic_type}.
	 * @param ctx the parse tree
	 */
	void enterBasic_type(cppParser.Basic_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#basic_type}.
	 * @param ctx the parse tree
	 */
	void exitBasic_type(cppParser.Basic_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#enum_def}.
	 * @param ctx the parse tree
	 */
	void enterEnum_def(cppParser.Enum_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#enum_def}.
	 * @param ctx the parse tree
	 */
	void exitEnum_def(cppParser.Enum_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#pointer_def}.
	 * @param ctx the parse tree
	 */
	void enterPointer_def(cppParser.Pointer_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#pointer_def}.
	 * @param ctx the parse tree
	 */
	void exitPointer_def(cppParser.Pointer_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#record_def}.
	 * @param ctx the parse tree
	 */
	void enterRecord_def(cppParser.Record_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#record_def}.
	 * @param ctx the parse tree
	 */
	void exitRecord_def(cppParser.Record_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#union_def}.
	 * @param ctx the parse tree
	 */
	void enterUnion_def(cppParser.Union_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#union_def}.
	 * @param ctx the parse tree
	 */
	void exitUnion_def(cppParser.Union_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#capability_def}.
	 * @param ctx the parse tree
	 */
	void enterCapability_def(cppParser.Capability_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#capability_def}.
	 * @param ctx the parse tree
	 */
	void exitCapability_def(cppParser.Capability_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#cap_for}.
	 * @param ctx the parse tree
	 */
	void enterCap_for(cppParser.Cap_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#cap_for}.
	 * @param ctx the parse tree
	 */
	void exitCap_for(cppParser.Cap_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#prototype}.
	 * @param ctx the parse tree
	 */
	void enterPrototype(cppParser.PrototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#prototype}.
	 * @param ctx the parse tree
	 */
	void exitPrototype(cppParser.PrototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#op_prototype}.
	 * @param ctx the parse tree
	 */
	void enterOp_prototype(cppParser.Op_prototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#op_prototype}.
	 * @param ctx the parse tree
	 */
	void exitOp_prototype(cppParser.Op_prototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#op_res}.
	 * @param ctx the parse tree
	 */
	void enterOp_res(cppParser.Op_resContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#op_res}.
	 * @param ctx the parse tree
	 */
	void exitOp_res(cppParser.Op_resContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(cppParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(cppParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#result_id}.
	 * @param ctx the parse tree
	 */
	void enterResult_id(cppParser.Result_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#result_id}.
	 * @param ctx the parse tree
	 */
	void exitResult_id(cppParser.Result_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#type_res}.
	 * @param ctx the parse tree
	 */
	void enterType_res(cppParser.Type_resContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#type_res}.
	 * @param ctx the parse tree
	 */
	void exitType_res(cppParser.Type_resContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#subscripts}.
	 * @param ctx the parse tree
	 */
	void enterSubscripts(cppParser.SubscriptsContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#subscripts}.
	 * @param ctx the parse tree
	 */
	void exitSubscripts(cppParser.SubscriptsContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#id_subs_lp}.
	 * @param ctx the parse tree
	 */
	void enterId_subs_lp(cppParser.Id_subs_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#id_subs_lp}.
	 * @param ctx the parse tree
	 */
	void exitId_subs_lp(cppParser.Id_subs_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#id_subs}.
	 * @param ctx the parse tree
	 */
	void enterId_subs(cppParser.Id_subsContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#id_subs}.
	 * @param ctx the parse tree
	 */
	void exitId_subs(cppParser.Id_subsContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(cppParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(cppParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#parameters2}.
	 * @param ctx the parse tree
	 */
	void enterParameters2(cppParser.Parameters2Context ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#parameters2}.
	 * @param ctx the parse tree
	 */
	void exitParameters2(cppParser.Parameters2Context ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(cppParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(cppParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#op_log}.
	 * @param ctx the parse tree
	 */
	void enterOp_log(cppParser.Op_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#op_log}.
	 * @param ctx the parse tree
	 */
	void exitOp_log(cppParser.Op_logContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr1(cppParser.Expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr1(cppParser.Expr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(cppParser.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(cppParser.Expr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterExpr3(cppParser.Expr3Context ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitExpr3(cppParser.Expr3Context ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(cppParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(cppParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#quantifier1}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier1(cppParser.Quantifier1Context ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#quantifier1}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier1(cppParser.Quantifier1Context ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#quantifier2}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier2(cppParser.Quantifier2Context ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#quantifier2}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier2(cppParser.Quantifier2Context ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(cppParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(cppParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#step_opt}.
	 * @param ctx the parse tree
	 */
	void enterStep_opt(cppParser.Step_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#step_opt}.
	 * @param ctx the parse tree
	 */
	void exitStep_opt(cppParser.Step_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#such_that_opt}.
	 * @param ctx the parse tree
	 */
	void enterSuch_that_opt(cppParser.Such_that_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#such_that_opt}.
	 * @param ctx the parse tree
	 */
	void exitSuch_that_opt(cppParser.Such_that_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#actuals}.
	 * @param ctx the parse tree
	 */
	void enterActuals(cppParser.ActualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#actuals}.
	 * @param ctx the parse tree
	 */
	void exitActuals(cppParser.ActualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#qualified_id}.
	 * @param ctx the parse tree
	 */
	void enterQualified_id(cppParser.Qualified_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#qualified_id}.
	 * @param ctx the parse tree
	 */
	void exitQualified_id(cppParser.Qualified_idContext ctx);
}