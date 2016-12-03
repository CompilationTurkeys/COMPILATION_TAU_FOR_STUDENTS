package AST;

public class AST_STMT_TYPE_EXP extends AST_STMT_TYPE
{
	public AST_EXP exp;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_STMT_TYPE_EXP(AST_TYPE type,String name, AST_EXP exp)
	{
		super(type,name);
		this.exp = exp;
	}
}