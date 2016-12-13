package AST;

public class AST_EXP_LITERAL extends AST_EXP
{
	public AST_LITERAL l;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_EXP_LITERAL(AST_LITERAL l)
	{
		this.l = l;
	}
}