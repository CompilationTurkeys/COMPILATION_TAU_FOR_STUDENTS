package AST;

public class AST_METHOD_VOID_FORMALS_STMT extends AST_METHOD_VOID_FORMALS
{
	public AST_STMT_LIST stmtList;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_METHOD_VOID_FORMALS_STMT(String id, AST_FORMALS formals, AST_STMT_LIST stmtList)
	{
		super(id,formals);
		this.stmtList = stmtList;
	}
}