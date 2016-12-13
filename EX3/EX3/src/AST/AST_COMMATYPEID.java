package AST;

public class AST_COMMATYPEID extends AST_Node
{
	public String name;
	public AST_TYPE type;
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_COMMATYPEID(AST_TYPE type, String name)
	{

		this.name = name;
		this.type = type;
	}
}