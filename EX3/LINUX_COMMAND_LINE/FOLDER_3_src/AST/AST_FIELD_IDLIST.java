package AST;

public class AST_FIELD_IDLIST extends AST_FIELD
{
	public AST_IDLIST lst;
	public AST_TYPE type;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_FIELD_IDLIST(AST_TYPE type,AST_IDLIST lst)
	{
		this.lst = lst;
		this.type = type;
	}
}