// Generated from C:/Users/Felipe Pieschacon/Desktop/Traductor_Cpp2Java/grammar\cpp.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link cppParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface cppVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link cppParser#translationunit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationunit(cppParser.TranslationunitContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#components}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponents(cppParser.ComponentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal(cppParser.GlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#resource_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_specification(cppParser.Resource_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#resource_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_body(cppParser.Resource_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#spec_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec_body(cppParser.Spec_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#proc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc(cppParser.ProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(cppParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#block_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_items(cppParser.Block_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#block_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_item(cppParser.Block_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(cppParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(cppParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(cppParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#op_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_type(cppParser.Op_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(cppParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(cppParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(cppParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#explicit_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_call(cppParser.Explicit_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocation(cppParser.InvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#sequential}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequential(cppParser.SequentialContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#op_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_invocation(cppParser.Op_invocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#op_service}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_service(cppParser.Op_serviceContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#in_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_cmd(cppParser.In_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#resource_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_control(cppParser.Resource_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(cppParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#basic_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_type(cppParser.Basic_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#enum_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_def(cppParser.Enum_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#pointer_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer_def(cppParser.Pointer_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#record_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_def(cppParser.Record_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#union_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_def(cppParser.Union_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#capability_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapability_def(cppParser.Capability_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#cap_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCap_for(cppParser.Cap_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#prototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrototype(cppParser.PrototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#op_prototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_prototype(cppParser.Op_prototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#op_res}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_res(cppParser.Op_resContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(cppParser.Id_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#result_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_id(cppParser.Result_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#type_res}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_res(cppParser.Type_resContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#subscripts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscripts(cppParser.SubscriptsContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#id_subs_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_subs_lp(cppParser.Id_subs_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#id_subs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_subs(cppParser.Id_subsContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(cppParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#parameters2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters2(cppParser.Parameters2Context ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(cppParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#op_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_log(cppParser.Op_logContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1(cppParser.Expr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2(cppParser.Expr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr3(cppParser.Expr3Context ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(cppParser.QuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#quantifier1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier1(cppParser.Quantifier1Context ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#quantifier2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier2(cppParser.Quantifier2Context ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(cppParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#step_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep_opt(cppParser.Step_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#such_that_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuch_that_opt(cppParser.Such_that_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#actuals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActuals(cppParser.ActualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#qualified_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_id(cppParser.Qualified_idContext ctx);
}