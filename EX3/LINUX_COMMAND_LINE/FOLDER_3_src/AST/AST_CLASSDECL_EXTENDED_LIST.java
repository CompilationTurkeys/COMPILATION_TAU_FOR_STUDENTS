
package AST;

public class AST_CLASSDECL_EXTENDED_LIST extends AST_CLASSDECL
{
	public AST_FIELD_METHOD_LIST list;
	public String name;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_CLASSDECL_EXTENDED_LIST(String name,String otherName,AST_FIELD_METHOD_LIST list)
	{
		this.name = name
		super(name,otherName);
		this.list = list;
	}
}