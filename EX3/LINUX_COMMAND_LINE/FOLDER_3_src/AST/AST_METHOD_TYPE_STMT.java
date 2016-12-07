package AST;

public class AST_METHOD_TYPE_STMT extends AST_METHOD_TYPE_SIMPLE
{
	public AST_STMT_LIST stmtList;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_METHOD_TYPE_STMT(AST_TYPE type,String id, AST_STMT_LIST stmtList)
	{
		super(type,id);
		this.stmtList = stmtList;
	}
}