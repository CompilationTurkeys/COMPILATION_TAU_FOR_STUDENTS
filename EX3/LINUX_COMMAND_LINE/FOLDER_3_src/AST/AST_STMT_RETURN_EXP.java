package AST;

public class AST_STMT_RETURN_EXP extends AST_STMT_RETURN
{

	public AST_EXP exp;
	
	
	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_STMT_RETURN_EXP(AST_EXP exp){
		this.exp=exp;
	}
}