package AST;

public class AST_METHOD_VOID_STMT extends AST_METHOD_VOID_SIMPLE
{
	public AST_STMT_LIST stmtList;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_METHOD_VOID_FORMALS(String id, AST_STMT_LIST stmtList)
	{
		super(id);
		this.stmtList = stmtList;
	}
}