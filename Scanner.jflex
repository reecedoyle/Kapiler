package Kapiler;

import java_cup.runtime.*;

%%

%cup
%class Scanner
%unicode
%cup
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
LineTerminator 		= \r\n?|\n // both to deal with variety of OSs
WhiteSpace 			= \s*
Comment 			= {EndOfLineComment} | {MultiLineComment}
EndOfLineComment	= "//".*
MultiLineComment	= "/*"(.|[\r\n])*?"*/"

Letter          	= [A-Za-z]
Digit           	= [0-9]
Indentifier			= [:jletter:][:jletterdigit:]*
IntegerLiteral 		= 0 | [1-9][0-9]*
FloatLiteral 		= [0-9]+ \. [0-9]*
StringCharacter 	= [^\r\n\"\\]
SingleCharacter		= [^\r\n\'\\]

%state STRING CHARLITERAL

%%

<YYINITIAL> {
	/* KEYWORDS */
	/* Types */
	"char"			{ return symbol(sym.CHAR);}
}











