package AST;

public class AST_STMT_TYPE_EXP extends AST_STMT
{
	public AST_EXP exp;
	public AST_TYPE type;
	public String name;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_STMT_TYPE_EXP(AST_TYPE type,String name, AST_EXP exp)
	{
		this.type = type;
		this.name = name;
		this.exp = exp;
	}
}