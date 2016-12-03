package AST;

public class AST_VCALL_EXP extends AST_VCALL
{
	public AST_EXP exp;
	public String name;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_VCALL_EXP(AST_EXP exp,String name)
	{
		this.name = name;
		this.exp = exp;
	}
}