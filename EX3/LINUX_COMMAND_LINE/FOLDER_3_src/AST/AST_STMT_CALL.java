package AST;

public class AST_STMT_CALL extends AST_STMT
{
	public AST_CALL call;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_STMT_CALL(AST_CALL call)
	{
		this.call = call;
	}
}