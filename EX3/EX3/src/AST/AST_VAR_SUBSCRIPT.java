package AST;

public class AST_VAR_SUBSCRIPT extends AST_VAR
{
	public AST_EXP e1;
	public AST_EXP e2;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_VAR_SUBSCRIPT(AST_EXP e1,AST_EXP e2)
	{
		this.e1 = e1;
		this.e2 = e2;
	}
}