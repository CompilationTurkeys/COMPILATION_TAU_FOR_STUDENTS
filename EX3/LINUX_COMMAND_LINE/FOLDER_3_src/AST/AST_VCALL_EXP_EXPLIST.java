package AST;

public class AST_VCALL_EXP_EXPLIST extends AST_VCALL
{
	public AST_EXP_LIST expList;
	public AST_VAR 		var;
	public String 		name;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_VCALL_EXP_EXPLIST(AST_VAR var,String name,AST_EXP_LIST expList)
	{
		this.expList = expList;
		this.var = var;
		this.name = name;
	}
}