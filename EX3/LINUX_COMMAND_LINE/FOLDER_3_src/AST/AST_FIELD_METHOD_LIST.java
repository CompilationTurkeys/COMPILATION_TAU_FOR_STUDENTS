package AST;

public class AST_FIELD_METHOD_LIST extends AST_Node
{
	/****************/
	/* DATA MEMBERS */
	/****************/
	public AST_FIELD_OR_METHOD head;
	public AST_FIELD_METHOD_LIST tail;

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_FIELD_METHOD_LIST(AST_FIELD_OR_METHOD head,AST_FIELD_METHOD_LIST tail)
	{
		this.head = head;
		this.tail = tail;
	}
}