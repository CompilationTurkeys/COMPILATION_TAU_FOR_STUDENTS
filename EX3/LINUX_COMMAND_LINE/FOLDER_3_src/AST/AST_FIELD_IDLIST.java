package AST;

public class AST_FIELD_IDLIST extends AST_FIELD_SIMPLE
{
	public AST_IDLIST lst;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_FIELD_IDLIST(String name,AST_IDLIST lst)
	{
		super(name);
		this.lst = lst;
	}
}