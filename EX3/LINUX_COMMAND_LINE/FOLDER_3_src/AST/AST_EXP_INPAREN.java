package AST;

public class AST_EXP_INPAREN extends AST_EXP
{
	public AST_EXP exp;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_EXP_INPAREN(AST_EXP exp)
	{
		this.exp = exp;
	}
}