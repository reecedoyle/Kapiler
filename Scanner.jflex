
import java_cup.runtime.*;

%%

%cup
%unicode
%class Scanner
%line
%column
%{
  StringBuffer string = new StringBuffer();

  private Symbol symbol(int tokenID) {
    return new Symbol(tokenID, yyline, yycolumn);
  }
  private Symbol symbol(int tokenID, Object value) {
    return new Symbol(tokenID, yyline, yycolumn, value);
  }
%}
%eofval{
    return new java_cup.runtime.Symbol(sym.EOF);
%eofval}

/* MACROS */
LineTerminator 		= \r|\n|\r\n
WhiteSpace 		= {LineTerminator} | [ \t\f]
Comment 		= {EndOfLineComment} | {MultiLineComment}
EndOfLineComment	= "//".*
MultiLineComment	= "/*"(.|[\r\n])*?"*/"

Identifier			= [:jletter:][:jletterdigit:]*
IntegerLiteral 		= 0 | [1-9][0-9]*
FloatLiteral 		= [0-9]+ \. [0-9]*
StringCharacter 	= [^\r\n\"\\]
SingleCharacter		= [^\r\n\'\\]

%state STRING_STATE CHAR_STATE

%%

<YYINITIAL> {

	/* KEYWORDS */
	/* Assignments and Expressions */
	"tdef"			{ return symbol(sym.TDEF);}
	"def"			{ return symbol(sym.DEF);}
	"void"			{ return symbol(sym.VOID);}
	"in"			{ return symbol(sym.IN);}
	"if"			{ return symbol(sym.IF);}
	"else"			{ return symbol(sym.ELSE);}
	"foreach"		{ return symbol(sym.FOREACH);}
	"while"			{ return symbol(sym.WHILE);}
	"do"			{ return symbol(sym.DO);}
	"return"		{ return symbol(sym.RETURN);}
	"read"			{ return symbol(sym.READ);}
	"print"			{ return symbol(sym.PRINT);}
	"main"			{ return symbol(sym.MAIN);}
	/* Types */
	"char"			{ return symbol(sym.CHAR);}
	"bool"			{ return symbol(sym.BOOLEAN);}
	"int"			{ return symbol(sym.INT);}
	"float"			{ return symbol(sym.FLOAT);}
	"string"		{ return symbol(sym.STRING);}
	"list"			{ return symbol(sym.LIST);}
	"dict"			{ return symbol(sym.DICT);}

	/* SEPARATORS */
	"("				{ return symbol(sym.LPAREN);}
	")"				{ return symbol(sym.RPAREN);}
	"{"				{ return symbol(sym.LBRACE);}
	"}"				{ return symbol(sym.RBRACE);}
	"["				{ return symbol(sym.LBRACK);}
	"]"				{ return symbol(sym.RBRACK);}
	"[|"			{ return symbol(sym.LDICT);}
	"|]"			{ return symbol(sym.RDICT);}
	";"				{ return symbol(sym.SEMI);}
	","				{ return symbol(sym.COMMA);}
	"."				{ return symbol(sym.DOT);}

	/* OPERATORS */
	"="				{ return symbol(sym.EQ);}
	"!"				{ return symbol(sym.NOT);}
	"&&"			{ return symbol(sym.AND);}
	"+"				{ return symbol(sym.PLUS);}
	"-"				{ return symbol(sym.MINUS);}
	"*"				{ return symbol(sym.MULT);}
	"/"				{ return symbol(sym.DIV);}
	"^"				{ return symbol(sym.POW);}
	"::"			{ return symbol(sym.CONCAT);}
	"<"				{ return symbol(sym.LT);}
	"<="			{ return symbol(sym.LTEQ);}
	"=="			{ return symbol(sym.EQEQ);}
	"!="			{ return symbol(sym.NOTEQ);}
	":"				{ return symbol(sym.COLON);}
	"len"			{ return symbol(sym.LEN);}

	/* LITERALS */
	/* Boolean Literals */
	"true"				{ return symbol(sym.BOOLEAN_LITERAL, true);}
	"false"				{ return symbol(sym.BOOLEAN_LITERAL, false);}

	/* Numeric Literals */
	{IntegerLiteral}	{ return symbol(sym.INTEGER_LITERAL, new Integer(yytext()));}
	{FloatLiteral}		{ return symbol(sym.FLOAT_LITERAL, new Float(yytext()));}

	/* Character Literal */
	\'					{ yybegin(CHAR_STATE);}

	/* String Literal */
	\"					{ yybegin(STRING_STATE); string.setLength(0);}

	/* OTHERS */
	/* Comments */
	{Comment}			{ /* ignore */ }

	/* White Space */
	{WhiteSpace}		{ /* ignore */ }

	/* Comments */
	{Identifier}		{ return symbol(sym.ID, yytext());}
}

<STRING_STATE> {

	\"					{ yybegin(YYINITIAL); return symbol(sym.STRING_LITERAL, string.toString());}
	{StringCharacter}+	{ string.append(yytext());}

	/* Escape Characters */
	"\\t"				{ string.append('\t');}
	"\\b"				{ string.append('\b');}
	"\\n"				{ string.append('\n');}
	"\\r"				{ string.append('\r');}
	"\\f"				{ string.append('\f');}
	"\\'"				{ string.append('\'');}
	"\\\""				{ string.append('\"');}
	"\\\\"				{ string.append('\\');}
	
	/* Error Catch */
	\\.					{ System.err.println("Error in line "+yyline+": Illegal escape character \""+yytext()+"\"");}
	
}

<CHAR_STATE> {

	{SingleCharacter}\'	{ yybegin(YYINITIAL); return symbol(sym.CHARACTER_LITERAL, yytext().charAt(0));}

	/* Escape Characters */
	"\\t"\'				{ yybegin(YYINITIAL); return symbol(sym.CHARACTER_LITERAL, '\t');}
	"\\b"\'				{ yybegin(YYINITIAL); return symbol(sym.CHARACTER_LITERAL, '\b');}
	"\\n"\'				{ yybegin(YYINITIAL); return symbol(sym.CHARACTER_LITERAL, '\n');}
	"\\r"\'				{ yybegin(YYINITIAL); return symbol(sym.CHARACTER_LITERAL, '\r');}
	"\\f"\'				{ yybegin(YYINITIAL); return symbol(sym.CHARACTER_LITERAL, '\f');}
	"\\'"\'				{ yybegin(YYINITIAL); return symbol(sym.CHARACTER_LITERAL, '\'');}
	"\\\""\'			{ yybegin(YYINITIAL); return symbol(sym.CHARACTER_LITERAL, '\"');}
	"\\\\"\'			{ yybegin(YYINITIAL); return symbol(sym.CHARACTER_LITERAL, '\\');}
	
	/* Error Catch */
	\\.					{ System.err.println("Error in line "+yyline+": Illegal escape character \""+yytext()+"\"");}
	
}

.	{ System.err.println("Error in line "+yyline+": Illegal character: "+yytext());}
