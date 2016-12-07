package AST;

public class AST_CLASSDECL_EXTENDED extends AST_CLASSDECL_SIMPLE
{
	public String name;
	
	public String otherName;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_CLASSDECL_EXTENDED(String name,String otherName)
	{
		super(name);
		this.otherName = otherName;
	}
}