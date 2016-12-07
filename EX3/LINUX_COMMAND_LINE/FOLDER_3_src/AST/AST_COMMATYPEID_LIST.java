package AST;

public class AST_COMMATYPEID_LIST extends AST_Node
{
	public AST_COMMATYPEID head;
	public AST_COMMATYPEID_LIST tail;
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_COMMATYPEID_LIST(AST_COMMATYPEID cmi, AST_COMMATYPEID_LIST l)
	{
		this.head = cmi;
		this.tail = l;
	}
}