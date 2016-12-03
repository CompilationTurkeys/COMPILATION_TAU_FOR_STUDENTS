package AST;

public class AST_CLASSDECL_SIMPLE_LIST extends AST_CLASSDECL_SIMPLE
{
	public AST_FIELD_METHOD_LIST list;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_CLASSDECL_SIMPLE_LIST(String name, AST_FIELD_METHOD_LIST list)
	{
		super(name);
		this.list= list;
	}
}