import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class Listener extends cppBaseListener {
    public static boolean onError = false;

    ArrayList<String> programa = new ArrayList<String>();
    ArrayList<String> clases = new ArrayList<String>();

    @Override
    public void enterTranslationunit(cppParser.TranslationunitContext ctx) {
        int a = ctx.start.getStartIndex();
        int b = ctx.stop.getStopIndex();
        Interval interval = new Interval(a,b);
        //programa.add(Traductor.input.getText(interval) + System.lineSeparator());
    }

    @Override
    public void exitTranslationunit(cppParser.TranslationunitContext ctx) {
        Traductor.traduccion = cppParser.tran;
        super.exitTranslationunit(ctx);
    }

    @Override
    public void enterComponents(cppParser.ComponentsContext ctx) {
        super.enterComponents(ctx);
    }

    @Override
    public void exitComponents(cppParser.ComponentsContext ctx) {
        super.exitComponents(ctx);
    }

    @Override
    public void enterGlobal(cppParser.GlobalContext ctx) {
        super.enterGlobal(ctx);
    }

    @Override
    public void exitGlobal(cppParser.GlobalContext ctx) {
        super.exitGlobal(ctx);
    }

    @Override
    public void enterResource_specification(cppParser.Resource_specificationContext ctx) {
        super.enterResource_specification(ctx);
    }

    @Override
    public void exitResource_specification(cppParser.Resource_specificationContext ctx) {
        super.exitResource_specification(ctx);
    }

    @Override
    public void enterResource_body(cppParser.Resource_bodyContext ctx) {
        super.enterResource_body(ctx);
    }

    @Override
    public void exitResource_body(cppParser.Resource_bodyContext ctx) {
        super.exitResource_body(ctx);
    }

    @Override
    public void enterSpec_body(cppParser.Spec_bodyContext ctx) {
        super.enterSpec_body(ctx);
    }

    @Override
    public void exitSpec_body(cppParser.Spec_bodyContext ctx) {
        super.exitSpec_body(ctx);
    }

    @Override
    public void enterProc(cppParser.ProcContext ctx) {
        super.enterProc(ctx);
    }

    @Override
    public void exitProc(cppParser.ProcContext ctx) {
        super.exitProc(ctx);
    }

    @Override
    public void enterBlock(cppParser.BlockContext ctx) {
        super.enterBlock(ctx);
    }

    @Override
    public void exitBlock(cppParser.BlockContext ctx) {
        super.exitBlock(ctx);
    }

    @Override
    public void enterBlock_items(cppParser.Block_itemsContext ctx) {
        super.enterBlock_items(ctx);
    }

    @Override
    public void exitBlock_items(cppParser.Block_itemsContext ctx) {
        super.exitBlock_items(ctx);
    }

    @Override
    public void enterBlock_item(cppParser.Block_itemContext ctx) {
        super.enterBlock_item(ctx);
    }

    @Override
    public void exitBlock_item(cppParser.Block_itemContext ctx) {
        super.exitBlock_item(ctx);
    }

    @Override
    public void enterDeclarations(cppParser.DeclarationsContext ctx) {
        super.enterDeclarations(ctx);
    }

    @Override
    public void exitDeclarations(cppParser.DeclarationsContext ctx) {
        super.exitDeclarations(ctx);
    }

    @Override
    public void enterConstant(cppParser.ConstantContext ctx) {
        super.enterConstant(ctx);
    }

    @Override
    public void exitConstant(cppParser.ConstantContext ctx) {
        super.exitConstant(ctx);
    }

    @Override
    public void enterType(cppParser.TypeContext ctx) {
        super.enterType(ctx);
    }

    @Override
    public void exitType(cppParser.TypeContext ctx) {
        super.exitType(ctx);
    }

    @Override
    public void enterOp_type(cppParser.Op_typeContext ctx) {
        super.enterOp_type(ctx);
    }

    @Override
    public void exitOp_type(cppParser.Op_typeContext ctx) {
        super.exitOp_type(ctx);
    }

    @Override
    public void enterVariable(cppParser.VariableContext ctx) {
        super.enterVariable(ctx);
    }

    @Override
    public void exitVariable(cppParser.VariableContext ctx) {
        super.exitVariable(ctx);
    }

    @Override
    public void enterOperation(cppParser.OperationContext ctx) {
        super.enterOperation(ctx);
    }

    @Override
    public void exitOperation(cppParser.OperationContext ctx) {
        super.exitOperation(ctx);
    }

    @Override
    public void enterStatements(cppParser.StatementsContext ctx) {
        super.enterStatements(ctx);
    }

    @Override
    public void exitStatements(cppParser.StatementsContext ctx) {
        super.exitStatements(ctx);
    }

    @Override
    public void enterExplicit_call(cppParser.Explicit_callContext ctx) {
        super.enterExplicit_call(ctx);
    }

    @Override
    public void exitExplicit_call(cppParser.Explicit_callContext ctx) {
        super.exitExplicit_call(ctx);
    }

    @Override
    public void enterInvocation(cppParser.InvocationContext ctx) {
        super.enterInvocation(ctx);
    }

    @Override
    public void exitInvocation(cppParser.InvocationContext ctx) {
        super.exitInvocation(ctx);
    }

    @Override
    public void enterSequential(cppParser.SequentialContext ctx) {
        super.enterSequential(ctx);
    }

    @Override
    public void exitSequential(cppParser.SequentialContext ctx) {
        super.exitSequential(ctx);
    }

    @Override
    public void enterOp_invocation(cppParser.Op_invocationContext ctx) {
        super.enterOp_invocation(ctx);
    }

    @Override
    public void exitOp_invocation(cppParser.Op_invocationContext ctx) {
        super.exitOp_invocation(ctx);
    }

    @Override
    public void enterOp_service(cppParser.Op_serviceContext ctx) {
        super.enterOp_service(ctx);
    }

    @Override
    public void exitOp_service(cppParser.Op_serviceContext ctx) {
        super.exitOp_service(ctx);
    }

    @Override
    public void enterIn_cmd(cppParser.In_cmdContext ctx) {
        super.enterIn_cmd(ctx);
    }

    @Override
    public void exitIn_cmd(cppParser.In_cmdContext ctx) {
        super.exitIn_cmd(ctx);
    }

    @Override
    public void enterResource_control(cppParser.Resource_controlContext ctx) {
        super.enterResource_control(ctx);
    }

    @Override
    public void exitResource_control(cppParser.Resource_controlContext ctx) {
        super.exitResource_control(ctx);
    }

    @Override
    public void enterT(cppParser.TContext ctx) {
        super.enterT(ctx);
    }

    @Override
    public void exitT(cppParser.TContext ctx) {
        super.exitT(ctx);
    }

    @Override
    public void enterBasic_type(cppParser.Basic_typeContext ctx) {
        super.enterBasic_type(ctx);
    }

    @Override
    public void exitBasic_type(cppParser.Basic_typeContext ctx) {
        super.exitBasic_type(ctx);
    }

    @Override
    public void enterEnum_def(cppParser.Enum_defContext ctx) {
        super.enterEnum_def(ctx);
    }

    @Override
    public void exitEnum_def(cppParser.Enum_defContext ctx) {
        super.exitEnum_def(ctx);
    }

    @Override
    public void enterPointer_def(cppParser.Pointer_defContext ctx) {
        super.enterPointer_def(ctx);
    }

    @Override
    public void exitPointer_def(cppParser.Pointer_defContext ctx) {
        super.exitPointer_def(ctx);
    }

    @Override
    public void enterRecord_def(cppParser.Record_defContext ctx) {
        super.enterRecord_def(ctx);
    }

    @Override
    public void exitRecord_def(cppParser.Record_defContext ctx) {
        super.exitRecord_def(ctx);
    }

    @Override
    public void enterUnion_def(cppParser.Union_defContext ctx) {
        super.enterUnion_def(ctx);
    }

    @Override
    public void exitUnion_def(cppParser.Union_defContext ctx) {
        super.exitUnion_def(ctx);
    }

    @Override
    public void enterCapability_def(cppParser.Capability_defContext ctx) {
        super.enterCapability_def(ctx);
    }

    @Override
    public void exitCapability_def(cppParser.Capability_defContext ctx) {
        super.exitCapability_def(ctx);
    }

    @Override
    public void enterCap_for(cppParser.Cap_forContext ctx) {
        super.enterCap_for(ctx);
    }

    @Override
    public void exitCap_for(cppParser.Cap_forContext ctx) {
        super.exitCap_for(ctx);
    }

    @Override
    public void enterPrototype(cppParser.PrototypeContext ctx) {
        super.enterPrototype(ctx);
    }

    @Override
    public void exitPrototype(cppParser.PrototypeContext ctx) {
        super.exitPrototype(ctx);
    }

    @Override
    public void enterOp_prototype(cppParser.Op_prototypeContext ctx) {
        super.enterOp_prototype(ctx);
    }

    @Override
    public void exitOp_prototype(cppParser.Op_prototypeContext ctx) {
        super.exitOp_prototype(ctx);
    }

    @Override
    public void enterOp_res(cppParser.Op_resContext ctx) {
        super.enterOp_res(ctx);
    }

    @Override
    public void exitOp_res(cppParser.Op_resContext ctx) {
        super.exitOp_res(ctx);
    }

    @Override
    public void enterId_list(cppParser.Id_listContext ctx) {
        super.enterId_list(ctx);
    }

    @Override
    public void exitId_list(cppParser.Id_listContext ctx) {
        super.exitId_list(ctx);
    }

    @Override
    public void enterResult_id(cppParser.Result_idContext ctx) {
        super.enterResult_id(ctx);
    }

    @Override
    public void exitResult_id(cppParser.Result_idContext ctx) {
        super.exitResult_id(ctx);
    }

    @Override
    public void enterType_res(cppParser.Type_resContext ctx) {
        super.enterType_res(ctx);
    }

    @Override
    public void exitType_res(cppParser.Type_resContext ctx) {
        super.exitType_res(ctx);
    }

    @Override
    public void enterSubscripts(cppParser.SubscriptsContext ctx) {
        super.enterSubscripts(ctx);
    }

    @Override
    public void exitSubscripts(cppParser.SubscriptsContext ctx) {
        super.exitSubscripts(ctx);
    }

    @Override
    public void enterId_subs_lp(cppParser.Id_subs_lpContext ctx) {
        super.enterId_subs_lp(ctx);
    }

    @Override
    public void exitId_subs_lp(cppParser.Id_subs_lpContext ctx) {
        super.exitId_subs_lp(ctx);
    }

    @Override
    public void enterId_subs(cppParser.Id_subsContext ctx) {
        super.enterId_subs(ctx);
    }

    @Override
    public void exitId_subs(cppParser.Id_subsContext ctx) {
        super.exitId_subs(ctx);
    }

    @Override
    public void enterParameters(cppParser.ParametersContext ctx) {
        super.enterParameters(ctx);
    }

    @Override
    public void exitParameters(cppParser.ParametersContext ctx) {
        super.exitParameters(ctx);
    }

    @Override
    public void enterParameters2(cppParser.Parameters2Context ctx) {
        super.enterParameters2(ctx);
    }

    @Override
    public void exitParameters2(cppParser.Parameters2Context ctx) {
        super.exitParameters2(ctx);
    }

    @Override
    public void enterExpression(cppParser.ExpressionContext ctx) {
        super.enterExpression(ctx);
    }

    @Override
    public void exitExpression(cppParser.ExpressionContext ctx) {
        super.exitExpression(ctx);
    }

    @Override
    public void enterOp_log(cppParser.Op_logContext ctx) {
        super.enterOp_log(ctx);
    }

    @Override
    public void exitOp_log(cppParser.Op_logContext ctx) {
        super.exitOp_log(ctx);
    }

    @Override
    public void enterExpr1(cppParser.Expr1Context ctx) {
        super.enterExpr1(ctx);
    }

    @Override
    public void exitExpr1(cppParser.Expr1Context ctx) {
        super.exitExpr1(ctx);
    }

    @Override
    public void enterExpr2(cppParser.Expr2Context ctx) {
        super.enterExpr2(ctx);
    }

    @Override
    public void exitExpr2(cppParser.Expr2Context ctx) {
        super.exitExpr2(ctx);
    }

    @Override
    public void enterExpr3(cppParser.Expr3Context ctx) {
        super.enterExpr3(ctx);
    }

    @Override
    public void exitExpr3(cppParser.Expr3Context ctx) {
        super.exitExpr3(ctx);
    }

    @Override
    public void enterQuantifier(cppParser.QuantifierContext ctx) {
        super.enterQuantifier(ctx);
    }

    @Override
    public void exitQuantifier(cppParser.QuantifierContext ctx) {
        super.exitQuantifier(ctx);
    }

    @Override
    public void enterQuantifier1(cppParser.Quantifier1Context ctx) {
        super.enterQuantifier1(ctx);
    }

    @Override
    public void exitQuantifier1(cppParser.Quantifier1Context ctx) {
        super.exitQuantifier1(ctx);
    }

    @Override
    public void enterQuantifier2(cppParser.Quantifier2Context ctx) {
        super.enterQuantifier2(ctx);
    }

    @Override
    public void exitQuantifier2(cppParser.Quantifier2Context ctx) {
        super.exitQuantifier2(ctx);
    }

    @Override
    public void enterDirection(cppParser.DirectionContext ctx) {
        super.enterDirection(ctx);
    }

    @Override
    public void exitDirection(cppParser.DirectionContext ctx) {
        super.exitDirection(ctx);
    }

    @Override
    public void enterStep_opt(cppParser.Step_optContext ctx) {
        super.enterStep_opt(ctx);
    }

    @Override
    public void exitStep_opt(cppParser.Step_optContext ctx) {
        super.exitStep_opt(ctx);
    }

    @Override
    public void enterSuch_that_opt(cppParser.Such_that_optContext ctx) {
        super.enterSuch_that_opt(ctx);
    }

    @Override
    public void exitSuch_that_opt(cppParser.Such_that_optContext ctx) {
        super.exitSuch_that_opt(ctx);
    }

    @Override
    public void enterActuals(cppParser.ActualsContext ctx) {
        super.enterActuals(ctx);
    }

    @Override
    public void exitActuals(cppParser.ActualsContext ctx) {
        super.exitActuals(ctx);
    }

    @Override
    public void enterQualified_id(cppParser.Qualified_idContext ctx) {
        super.enterQualified_id(ctx);
    }

    @Override
    public void exitQualified_id(cppParser.Qualified_idContext ctx) {
        super.exitQualified_id(ctx);
    }

}
