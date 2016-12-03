package AST;

public class AST_VCALL_EXP_EXPLIST extends AST_VCALL_EXP
{
	public AST_EXP_LIST expList;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_VCALL_EXP_EXPLIST(AST_EXP exp,String name,AST_EXP_LIST expList)
	{
		super(exp,name);
		this.expList = expList;
	}
}