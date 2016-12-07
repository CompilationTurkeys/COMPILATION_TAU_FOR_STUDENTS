package AST;

public class AST_VCALL_SIMPLE extends AST_VCALL
{
	public AST_CALL name;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_VCALL_SIMPLE(String name)
	{
		this.name = name;
	}
}