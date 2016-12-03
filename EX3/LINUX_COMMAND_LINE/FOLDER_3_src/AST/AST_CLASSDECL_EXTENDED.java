package AST;

public class AST_CLASSDECL_EXTENDED_LIST extends AST_CLASSDECL_EXTENDED
{
	public AST_FIELD_METHOD_LIST list;
 

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_CLASSDECL_EXTENDED_LIST(String name,String otherName,AST_FIELD_METHOD_LIST list)
	{
		super(name,otherName);
		this.list = list;
	}
}