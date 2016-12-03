package AST;

public class AST_PROGRAM_CLASS_DECL_LIST extends AST_PROGRAM
{
	public AST_CLASSDECL_LIST lst;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_PROGRAM_CLASS_DECL_LIST(AST_CLASSDECL_LIST lst)
	{
		this.lst = lst;
	}
}