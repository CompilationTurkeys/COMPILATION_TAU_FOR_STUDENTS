package AST;

public class AST_CLASSDECL_LIST extends AST_Node
{
	/****************/
	/* DATA MEMBERS */
	/****************/
	public AST_CLASSDECL head;
	public AST_CLASSDECL_LIST tail;

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_CLASSDECL_LIST(AST_CLASSDECL head,AST_CLASSDECL_LIST tail)
	{
		this.head = head;
		this.tail = tail;
	}
}