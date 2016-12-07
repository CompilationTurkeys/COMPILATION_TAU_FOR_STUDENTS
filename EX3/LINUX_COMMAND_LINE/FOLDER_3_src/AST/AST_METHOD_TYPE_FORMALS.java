package AST;

public class AST_METHOD_TYPE_FORMALS extends AST_METHOD_TYPE_SIMPLE
{
	public AST_FORMALS formals;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_METHOD_TYPE_FORMALS(AST_TYPE type,String id, AST_FORMALS formals)
	{
		super(type,id);
		this.formals = formals;
	}
}