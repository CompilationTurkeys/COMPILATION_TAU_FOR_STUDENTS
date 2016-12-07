package AST;

public class AST_METHOD_TYPE_FORMALS_STMT extends AST_METHOD_TYPE_FORMALS
{
	public AST_STMT_LIST stmtList;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_METHOD_TYPE_FORMALS_STMT(AST_TYPE type,String id, AST_FORMALS formals, AST_STMT_LIST stmtList)
	{
		super(type,id,formals);
		this.stmtList = stmtList;
	}
}