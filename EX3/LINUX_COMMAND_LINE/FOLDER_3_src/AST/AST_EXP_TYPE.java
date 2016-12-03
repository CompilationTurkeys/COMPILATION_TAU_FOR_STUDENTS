package AST;

public class AST_EXP_TYPE extends AST_EXP
{
	public AST_TYPE type;
	public AST_EXP exp;

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_EXP_TYPE(AST_TYPE type, AST_EXP exp)
	{
		this.type = type;
		this.exp = exp;
	}
}