package AST;

public class AST_CALL_VCALL extends AST_CALL
{
	public AST_VCALL call;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_CALL_VCALL(AST_VCALL call)
	{
		this.call = call;
	}
}