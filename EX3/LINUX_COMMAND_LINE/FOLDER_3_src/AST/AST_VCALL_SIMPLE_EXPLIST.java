package AST;

public class AST_VCALL_SIMPLE_EXPLIST extends AST_VCALL_SIMPLE
{
	public AST_EXP_LIST expList;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_VCALL_SIMPLE_EXPLIST(String name,AST_EXP_LIST expList)
	{
		super(name);
		this.expList = expList;
	}
}