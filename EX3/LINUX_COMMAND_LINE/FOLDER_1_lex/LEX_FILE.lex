/***************************/
/* FILE NAME: LEX_FILE.lex */
/***************************/

/***************************/
/* AUTHOR: OREN ISH SHALOM */
/***************************/

/*************/
/* USER CODE */
/*************/
   
import java_cup.runtime.*;

/******************************/
/* DOLAR DOLAR - DON'T TOUCH! */
/******************************/
      
%%
   
/************************************/
/* OPTIONS AND DECLARATIONS SECTION */
/************************************/
   
/*****************************************************/ 
/* Lexer is the name of the class JFlex will create. */
/* The code will be written to the file Lexer.java.  */
/*****************************************************/ 
%class Lexer

/********************************************************************/
/* The current line number can be accessed with the variable yyline */
/* and the current column number with the variable yycolumn.        */
/********************************************************************/
%line
%column
    
/*******************************************************************************/
/* Note that this has to be the EXACT smae name of the class the CUP generates */
/*******************************************************************************/
%cupsym TokenNames

/******************************************************************/
/* CUP compatibility mode interfaces with a CUP generated parser. */
/******************************************************************/
%cup
   
/****************/
/* DECLARATIONS */
/****************/
/*****************************************************************************/   
/* Code between %{ and %}, both of which must be at the beginning of a line, */
/* will be copied letter to letter into the Lexer class code.                */
/* Here you declare member variables and functions that are used inside the  */
/* scanner actions.                                                          */  
/*****************************************************************************/   
%{
	/*********************************************************************************/
	/* Create a new java_cup.runtime.Symbol with information about the current token */
	/*********************************************************************************/
	private Symbol symbol(int type)               {return new Symbol(type, yyline, yycolumn);}
	private Symbol symbol(int type, Object value) {return new Symbol(type, yyline, yycolumn, value);}

	/*******************************************/
	/* Enable line number extraction from main */
	/*******************************************/
	public int getLine() { return yyline + 1; } 
%}

/***********************/
/* MACRO DECALARATIONS */
/***********************/
LINETERMINATOR	= \r|\n|\r\n
WHITESPACE		= {LINETERMINATOR} | [ \t\f]
INTEGER			= 0 | [1-9][0-9]*
IDENTIFIER		= [a-z][a-zA-Z_0-9]*
QUOTE			= \"([^\\\"]|\\.)*\"
CLASSID 		= [A-Z][a-z_0-9]*
COMMENTS		= "/*"((("*"[^/])?)|[^*])*"*/" | "//".*

   
/******************************/
/* DOLAR DOLAR - DON'T TOUCH! */
/******************************/

%%

/************************************************************/
/* LEXER matches regular expressions to actions (Java code) */
/************************************************************/
   
/**************************************************************/
/* YYINITIAL is the state at which the lexer begins scanning. */
/* So these regular expressions will only be matched if the   */
/* scanner is in the start state YYINITIAL.                   */
/**************************************************************/
   
<YYINITIAL> {

"+"					{ return symbol(sym.PLUS);}
"-"					{ return symbol(sym.MINUS);}
"*"					{ return symbol(sym.MULTIPLY);}
"/"					{ return symbol(sym.DIVIDE);}
"("					{ return symbol(sym.LP);}
")"					{ return symbol(sym.RP);}
"class"				{ return symbol(sym.CLASS);}
"{"					{ return symbol(sym.LCBR);}
"int"				{ return symbol(sym.INT);}
"["					{ return symbol(sym.LB);}
"]"					{ return symbol(sym.RB);}
";"					{ return symbol(sym.SEMI);}
"="							{ return symbol(sym.ASSIGN);}
"boolean"					{ return symbol(sym.BOOLEAN);}
"break"						{ return symbol(sym.BREAK);}
","							{ return symbol(sym.COMMA);}
"continue"					{ return symbol(sym.CONTINUE);}
"."							{ return symbol(sym.DOT);}
"=="					{ return symbol(sym.EQUAL);}
"extends"				{ return symbol(sym.EXTENDS);}
"else"					{ return symbol(sym.ELSE);}
"false"					{ return symbol(sym.FALSE);}
">"						{ return symbol(sym.GT);}
">="						{ return symbol(sym.GTE);}
"if"						{ return symbol(sym.IF);}
"integer"						{ return symbol(sym.INTEGER);}
"&&"						{ return symbol(sym.LAND);}
"length"						{ return symbol(sym.LENGTH);}
"new"						{ return symbol(sym.NEW);}
"!"						{ return symbol(sym.LNEG);}
"||"						{ return symbol(sym.LOR);}
"<"						{ return symbol(sym.LT);}
"<="						{ return symbol(sym.LTE);}
"%"						{ return symbol(sym.MOD);}
"!="						{ return symbol(sym.NEQUAL);}
"null"						{ return symbol(sym.NULL);}
"}"						{ return symbol(sym.RCBR);}
"return"						{ return symbol(sym.RETURN);}
"static"						{ return symbol(sym.STATIC);}
"string"						{ return symbol(sym.STRING);}
"this"						{ return symbol(sym.THIS);}
"true"						{ return symbol(sym.TRUE);}
"void"						{ return symbol(sym.VOID);}
"while"						{ return symbol(sym.WHILE);}
<<EOF>>     				{ return symbol(sym.EOF);}


{QUOTE}  			{ return symbol(sym.QUOTE);}
{CLASSID}  			{ return symbol(sym.CLASS_ID);}
{INTEGER}			{ return symbol(sym.INTEGER, new Integer(yytext()));}   
{WHITESPACE}		{ /* just skip what was found, do nothing */ }
{COMMENTS}			{ /* just skip what was found, do nothing */ }
{IDENTIFIER}		{  return symbol(sym.ID);}

}

[^]                 { System.out.print("FAIL");System.exit(-1);}

