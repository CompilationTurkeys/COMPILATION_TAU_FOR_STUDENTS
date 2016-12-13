package AST;

public class AST_VCALL_SIMPLE_EXPLIST extends AST_VCALL
{
	public AST_EXP_LIST expList;
	public String name;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_VCALL_SIMPLE_EXPLIST(String name,AST_EXP_LIST expList)
	{
		this.name = name;
		this.expList = expList;
	}
}