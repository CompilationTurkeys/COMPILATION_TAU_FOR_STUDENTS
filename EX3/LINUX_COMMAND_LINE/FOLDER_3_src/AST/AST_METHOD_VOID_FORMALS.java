package AST;

public class AST_METHOD_VOID_FORMALS extends AST_METHOD_VOID_SIMPLE
{
	public AST_FORMALS formals;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_METHOD_VOID_FORMALS(String id, AST_FORMALS formals)
	{
		super(id);
		this.formals = formals;
	}
}