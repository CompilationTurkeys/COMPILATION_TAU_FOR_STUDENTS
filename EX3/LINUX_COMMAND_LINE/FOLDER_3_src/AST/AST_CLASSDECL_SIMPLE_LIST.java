package AST;

public class AST_CLASSDECL_SIMPLE_LIST extends AST_CLASSDECL
{
	public AST_FIELD_METHOD_LIST list;
	public String name;
	public String otherName;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_CLASSDECL_SIMPLE_LIST(String name, AST_FIELD_METHOD_LIST list)
	{
		this.name= name;
		this.otherName = otherName;
		this.list= list;
	}
}