package AST;

public class AST_FORMALS_COMMATYPEID_LIST extends AST_FORMALS
{
	public AST_FORMALS_COMMATYPEID_LIST list;
	public String name;
	public AST_TYPE type;
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_FORMALS_COMMATYPEID_LIST(String name, AST_TYPE type, AST_FORMALS_COMMATYPEID_LIST list)
	{
		this.name = name;
		this.type = type;
		this.list = list;
	}
}