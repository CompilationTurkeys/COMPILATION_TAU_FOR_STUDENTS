package AST;

public class AST_STMT_IF extends AST_STMT
{
	public AST_EXP cond;
	public AST_STMT stmt;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_STMT_IF(AST_EXP cond,AST_STMT stmt)
	{
		this.cond = cond;
		this.stmt = stmt;
	}
}