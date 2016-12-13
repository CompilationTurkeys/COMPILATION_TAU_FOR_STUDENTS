package AST;

public class AST_CLASSDECL_EXTENDED extends AST_CLASSDECL
{
	public String name;
	public String otherName;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_CLASSDECL_EXTENDED(String name,String otherName)
	{
		this.name = name;
		this.otherName = otherName;
	}
}