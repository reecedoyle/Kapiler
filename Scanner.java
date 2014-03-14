/* The following code was generated by JFlex 1.4.3 on 14/03/14 16:06 */

import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 14/03/14 16:06 from the specification file
 * <tt>Scanner.jflex</tt>
 */
class Scanner implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int CHAR_STATE = 4;
  public static final int STRING_STATE = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\7\1\3\1\2\1\0\1\3\1\1\16\7\4\0\1\3\1\54"+
    "\1\13\1\0\1\6\1\0\1\55\1\14\1\42\1\43\1\5\1\56"+
    "\1\52\1\57\1\12\1\4\1\10\11\11\1\61\1\51\1\62\1\53"+
    "\3\0\32\6\1\46\1\15\1\47\1\60\1\6\1\0\1\31\1\40"+
    "\1\32\1\17\1\20\1\21\1\41\1\33\1\24\2\6\1\26\1\37"+
    "\1\25\1\23\1\36\1\6\1\30\1\27\1\16\1\35\1\22\1\34"+
    "\3\6\1\44\1\50\1\45\1\0\41\7\2\0\4\6\4\0\1\6"+
    "\2\0\1\7\7\0\1\6\4\0\1\6\5\0\27\6\1\0\37\6"+
    "\1\0\u01ca\6\4\0\14\6\16\0\5\6\7\0\1\6\1\0\1\6"+
    "\21\0\160\7\5\6\1\0\2\6\2\0\4\6\10\0\1\6\1\0"+
    "\3\6\1\0\1\6\1\0\24\6\1\0\123\6\1\0\213\6\1\0"+
    "\5\7\2\0\236\6\11\0\46\6\2\0\1\6\7\0\47\6\11\0"+
    "\55\7\1\0\1\7\1\0\2\7\1\0\2\7\1\0\1\7\10\0"+
    "\33\6\5\0\3\6\15\0\4\7\7\0\1\6\4\0\13\7\5\0"+
    "\53\6\37\7\4\0\2\6\1\7\143\6\1\0\1\6\10\7\1\0"+
    "\6\7\2\6\2\7\1\0\4\7\2\6\12\7\3\6\2\0\1\6"+
    "\17\0\1\7\1\6\1\7\36\6\33\7\2\0\131\6\13\7\1\6"+
    "\16\0\12\7\41\6\11\7\2\6\4\0\1\6\5\0\26\6\4\7"+
    "\1\6\11\7\1\6\3\7\1\6\5\7\22\0\31\6\3\7\244\0"+
    "\4\7\66\6\3\7\1\6\22\7\1\6\7\7\12\6\2\7\2\0"+
    "\12\7\1\0\7\6\1\0\7\6\1\0\3\7\1\0\10\6\2\0"+
    "\2\6\2\0\26\6\1\0\7\6\1\0\1\6\3\0\4\6\2\0"+
    "\1\7\1\6\7\7\2\0\2\7\2\0\3\7\1\6\10\0\1\7"+
    "\4\0\2\6\1\0\3\6\2\7\2\0\12\7\4\6\7\0\1\6"+
    "\5\0\3\7\1\0\6\6\4\0\2\6\2\0\26\6\1\0\7\6"+
    "\1\0\2\6\1\0\2\6\1\0\2\6\2\0\1\7\1\0\5\7"+
    "\4\0\2\7\2\0\3\7\3\0\1\7\7\0\4\6\1\0\1\6"+
    "\7\0\14\7\3\6\1\7\13\0\3\7\1\0\11\6\1\0\3\6"+
    "\1\0\26\6\1\0\7\6\1\0\2\6\1\0\5\6\2\0\1\7"+
    "\1\6\10\7\1\0\3\7\1\0\3\7\2\0\1\6\17\0\2\6"+
    "\2\7\2\0\12\7\1\0\1\6\17\0\3\7\1\0\10\6\2\0"+
    "\2\6\2\0\26\6\1\0\7\6\1\0\2\6\1\0\5\6\2\0"+
    "\1\7\1\6\7\7\2\0\2\7\2\0\3\7\10\0\2\7\4\0"+
    "\2\6\1\0\3\6\2\7\2\0\12\7\1\0\1\6\20\0\1\7"+
    "\1\6\1\0\6\6\3\0\3\6\1\0\4\6\3\0\2\6\1\0"+
    "\1\6\1\0\2\6\3\0\2\6\3\0\3\6\3\0\14\6\4\0"+
    "\5\7\3\0\3\7\1\0\4\7\2\0\1\6\6\0\1\7\16\0"+
    "\12\7\11\0\1\6\7\0\3\7\1\0\10\6\1\0\3\6\1\0"+
    "\27\6\1\0\12\6\1\0\5\6\3\0\1\6\7\7\1\0\3\7"+
    "\1\0\4\7\7\0\2\7\1\0\2\6\6\0\2\6\2\7\2\0"+
    "\12\7\22\0\2\7\1\0\10\6\1\0\3\6\1\0\27\6\1\0"+
    "\12\6\1\0\5\6\2\0\1\7\1\6\7\7\1\0\3\7\1\0"+
    "\4\7\7\0\2\7\7\0\1\6\1\0\2\6\2\7\2\0\12\7"+
    "\1\0\2\6\17\0\2\7\1\0\10\6\1\0\3\6\1\0\51\6"+
    "\2\0\1\6\7\7\1\0\3\7\1\0\4\7\1\6\10\0\1\7"+
    "\10\0\2\6\2\7\2\0\12\7\12\0\6\6\2\0\2\7\1\0"+
    "\22\6\3\0\30\6\1\0\11\6\1\0\1\6\2\0\7\6\3\0"+
    "\1\7\4\0\6\7\1\0\1\7\1\0\10\7\22\0\2\7\15\0"+
    "\60\6\1\7\2\6\7\7\4\0\10\6\10\7\1\0\12\7\47\0"+
    "\2\6\1\0\1\6\2\0\2\6\1\0\1\6\2\0\1\6\6\0"+
    "\4\6\1\0\7\6\1\0\3\6\1\0\1\6\1\0\1\6\2\0"+
    "\2\6\1\0\4\6\1\7\2\6\6\7\1\0\2\7\1\6\2\0"+
    "\5\6\1\0\1\6\1\0\6\7\2\0\12\7\2\0\2\6\42\0"+
    "\1\6\27\0\2\7\6\0\12\7\13\0\1\7\1\0\1\7\1\0"+
    "\1\7\4\0\2\7\10\6\1\0\44\6\4\0\24\7\1\0\2\7"+
    "\5\6\13\7\1\0\44\7\11\0\1\7\71\0\53\6\24\7\1\6"+
    "\12\7\6\0\6\6\4\7\4\6\3\7\1\6\3\7\2\6\7\7"+
    "\3\6\4\7\15\6\14\7\1\6\17\7\2\0\46\6\12\0\53\6"+
    "\1\0\1\6\3\0\u0149\6\1\0\4\6\2\0\7\6\1\0\1\6"+
    "\1\0\4\6\2\0\51\6\1\0\4\6\2\0\41\6\1\0\4\6"+
    "\2\0\7\6\1\0\1\6\1\0\4\6\2\0\17\6\1\0\71\6"+
    "\1\0\4\6\2\0\103\6\2\0\3\7\40\0\20\6\20\0\125\6"+
    "\14\0\u026c\6\2\0\21\6\1\0\32\6\5\0\113\6\3\0\3\6"+
    "\17\0\15\6\1\0\4\6\3\7\13\0\22\6\3\7\13\0\22\6"+
    "\2\7\14\0\15\6\1\0\3\6\1\0\2\7\14\0\64\6\40\7"+
    "\3\0\1\6\3\0\2\6\1\7\2\0\12\7\41\0\3\7\2\0"+
    "\12\7\6\0\130\6\10\0\51\6\1\7\1\6\5\0\106\6\12\0"+
    "\35\6\3\0\14\7\4\0\14\7\12\0\12\7\36\6\2\0\5\6"+
    "\13\0\54\6\4\0\21\7\7\6\2\7\6\0\12\7\46\0\27\6"+
    "\5\7\4\0\65\6\12\7\1\0\35\7\2\0\13\7\6\0\12\7"+
    "\15\0\1\6\130\0\5\7\57\6\21\7\7\6\4\0\12\7\21\0"+
    "\11\7\14\0\3\7\36\6\12\7\3\0\2\6\12\7\6\0\46\6"+
    "\16\7\14\0\44\6\24\7\10\0\12\7\3\0\3\6\12\7\44\6"+
    "\122\0\3\7\1\0\25\7\4\6\1\7\4\6\1\7\15\0\300\6"+
    "\47\7\25\0\4\7\u0116\6\2\0\6\6\2\0\46\6\2\0\6\6"+
    "\2\0\10\6\1\0\1\6\1\0\1\6\1\0\1\6\1\0\37\6"+
    "\2\0\65\6\1\0\7\6\1\0\1\6\3\0\3\6\1\0\7\6"+
    "\3\0\4\6\2\0\6\6\4\0\15\6\5\0\3\6\1\0\7\6"+
    "\16\0\5\7\32\0\5\7\20\0\2\6\23\0\1\6\13\0\5\7"+
    "\5\0\6\7\1\0\1\6\15\0\1\6\20\0\15\6\3\0\32\6"+
    "\26\0\15\7\4\0\1\7\3\0\14\7\21\0\1\6\4\0\1\6"+
    "\2\0\12\6\1\0\1\6\3\0\5\6\6\0\1\6\1\0\1\6"+
    "\1\0\1\6\1\0\4\6\1\0\13\6\2\0\4\6\5\0\5\6"+
    "\4\0\1\6\21\0\51\6\u0a77\0\57\6\1\0\57\6\1\0\205\6"+
    "\6\0\4\6\3\7\16\0\46\6\12\0\66\6\11\0\1\6\17\0"+
    "\1\7\27\6\11\0\7\6\1\0\7\6\1\0\7\6\1\0\7\6"+
    "\1\0\7\6\1\0\7\6\1\0\7\6\1\0\7\6\1\0\40\7"+
    "\57\0\1\6\u01d5\0\3\6\31\0\11\6\6\7\1\0\5\6\2\0"+
    "\5\6\4\0\126\6\2\0\2\7\2\0\3\6\1\0\132\6\1\0"+
    "\4\6\5\0\51\6\3\0\136\6\21\0\33\6\65\0\20\6\u0200\0"+
    "\u19b6\6\112\0\u51cc\6\64\0\u048d\6\103\0\56\6\2\0\u010d\6\3\0"+
    "\20\6\12\7\2\6\24\0\57\6\1\7\14\0\2\7\1\0\31\6"+
    "\10\0\120\6\2\7\45\0\11\6\2\0\147\6\2\0\4\6\1\0"+
    "\2\6\16\0\12\6\120\0\10\6\1\7\3\6\1\7\4\6\1\7"+
    "\27\6\5\7\20\0\1\6\7\0\64\6\14\0\2\7\62\6\21\7"+
    "\13\0\12\7\6\0\22\7\6\6\3\0\1\6\4\0\12\7\34\6"+
    "\10\7\2\0\27\6\15\7\14\0\35\6\3\0\4\7\57\6\16\7"+
    "\16\0\1\6\12\7\46\0\51\6\16\7\11\0\3\6\1\7\10\6"+
    "\2\7\2\0\12\7\6\0\27\6\3\0\1\6\1\7\4\0\60\6"+
    "\1\7\1\6\3\7\2\6\2\7\5\6\2\7\1\6\1\7\1\6"+
    "\30\0\3\6\43\0\6\6\2\0\6\6\2\0\6\6\11\0\7\6"+
    "\1\0\7\6\221\0\43\6\10\7\1\0\2\7\2\0\12\7\6\0"+
    "\u2ba4\6\14\0\27\6\4\0\61\6\u2104\0\u012e\6\2\0\76\6\2\0"+
    "\152\6\46\0\7\6\14\0\5\6\5\0\1\6\1\7\12\6\1\0"+
    "\15\6\1\0\5\6\1\0\1\6\1\0\2\6\1\0\2\6\1\0"+
    "\154\6\41\0\u016b\6\22\0\100\6\2\0\66\6\50\0\15\6\3\0"+
    "\20\7\20\0\7\7\14\0\2\6\30\0\3\6\31\0\1\6\6\0"+
    "\5\6\1\0\207\6\2\0\1\7\4\0\1\6\13\0\12\7\7\0"+
    "\32\6\4\0\1\6\1\0\32\6\13\0\131\6\3\0\6\6\2\0"+
    "\6\6\2\0\6\6\2\0\3\6\3\0\2\6\3\0\2\6\22\0"+
    "\3\7\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\2\2\1\3\1\4\1\5\2\6\1\7"+
    "\1\10\1\11\16\5\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\1\1\20\1\21\1\22\1\23\1\1\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\3\1\1\2"+
    "\2\0\1\33\3\5\1\34\6\5\1\35\1\36\11\5"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
    "\1\57\10\46\1\0\2\5\1\60\6\5\1\61\1\62"+
    "\11\5\1\63\1\64\1\65\1\66\1\67\1\70\1\71"+
    "\1\72\1\2\1\73\1\74\1\75\1\76\3\5\1\77"+
    "\1\100\2\5\1\101\1\102\2\5\1\103\1\104\1\5"+
    "\1\105\1\106\2\5\1\107\1\110\1\5\1\111\1\112"+
    "\1\113";

  private static int [] zzUnpackAction() {
    int [] result = new int[158];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\63\0\146\0\231\0\314\0\231\0\377\0\231"+
    "\0\u0132\0\u0165\0\u0198\0\231\0\231\0\231\0\u01cb\0\u01fe"+
    "\0\u0231\0\u0264\0\u0297\0\u02ca\0\u02fd\0\u0330\0\u0363\0\u0396"+
    "\0\u03c9\0\u03fc\0\u042f\0\u0462\0\231\0\231\0\231\0\231"+
    "\0\u0495\0\231\0\u04c8\0\231\0\231\0\u04fb\0\u052e\0\u0561"+
    "\0\231\0\231\0\231\0\u0594\0\u05c7\0\u05fa\0\231\0\u062d"+
    "\0\u0660\0\u0693\0\u06c6\0\u06f9\0\u0165\0\u072c\0\u075f\0\u0792"+
    "\0\u07c5\0\u0132\0\u07f8\0\u082b\0\u085e\0\u0891\0\u08c4\0\u08f7"+
    "\0\u0132\0\u092a\0\u095d\0\u0990\0\u09c3\0\u09f6\0\u0a29\0\u0a5c"+
    "\0\u0a8f\0\u0ac2\0\u0af5\0\231\0\231\0\231\0\231\0\231"+
    "\0\231\0\231\0\231\0\231\0\231\0\231\0\231\0\231"+
    "\0\231\0\231\0\231\0\231\0\u0b28\0\u0b5b\0\u0b8e\0\u0bc1"+
    "\0\u0bf4\0\u0c27\0\u0c5a\0\u0c8d\0\u0cc0\0\u0cf3\0\u0d26\0\u0132"+
    "\0\u0d59\0\u0d8c\0\u0dbf\0\u0df2\0\u0e25\0\u0e58\0\u0132\0\u0132"+
    "\0\u0e8b\0\u0ebe\0\u0ef1\0\u0f24\0\u0f57\0\u0f8a\0\u0fbd\0\u0ff0"+
    "\0\u1023\0\231\0\231\0\231\0\231\0\231\0\231\0\231"+
    "\0\231\0\u06f9\0\u0132\0\u0132\0\u0132\0\u0132\0\u1056\0\u1089"+
    "\0\u10bc\0\u0132\0\u0132\0\u10ef\0\u1122\0\u0132\0\u0132\0\u1155"+
    "\0\u1188\0\u0132\0\u0132\0\u11bb\0\u0132\0\u0132\0\u11ee\0\u1221"+
    "\0\u0132\0\u0132\0\u1254\0\u0132\0\u0132\0\u0132";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[158];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\2\6\1\7\1\10\1\11\1\4\1\12"+
    "\1\13\1\14\1\15\1\16\1\4\1\17\1\20\1\21"+
    "\1\22\1\23\1\11\1\24\1\11\1\25\1\26\1\27"+
    "\1\11\1\30\1\11\1\31\1\11\1\32\1\33\1\34"+
    "\1\11\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\1\4\1\0\10\56\1\57\1\56"+
    "\1\60\45\56\1\61\1\4\1\0\11\61\1\4\1\62"+
    "\45\61\65\0\1\6\64\0\1\63\1\64\63\0\4\11"+
    "\4\0\24\11\31\0\2\65\1\66\60\0\2\13\1\66"+
    "\56\0\4\11\4\0\1\11\1\67\10\11\1\70\11\11"+
    "\27\0\4\11\4\0\2\11\1\71\2\11\1\72\1\73"+
    "\15\11\27\0\4\11\4\0\10\11\1\74\13\11\27\0"+
    "\4\11\4\0\5\11\1\75\2\11\1\76\2\11\1\77"+
    "\10\11\27\0\4\11\4\0\5\11\1\100\16\11\27\0"+
    "\4\11\4\0\3\11\1\101\3\11\1\102\14\11\27\0"+
    "\4\11\4\0\2\11\1\103\3\11\1\104\15\11\27\0"+
    "\4\11\4\0\1\105\23\11\27\0\4\11\4\0\2\11"+
    "\1\106\21\11\27\0\4\11\4\0\15\11\1\107\6\11"+
    "\27\0\4\11\4\0\15\11\1\110\6\11\27\0\4\11"+
    "\4\0\12\11\1\111\11\11\27\0\4\11\4\0\13\11"+
    "\1\112\10\11\27\0\4\11\4\0\5\11\1\113\16\11"+
    "\71\0\1\114\61\0\1\115\66\0\1\116\62\0\1\117"+
    "\64\0\1\120\66\0\1\121\54\0\1\122\7\0\1\56"+
    "\2\0\10\56\1\0\1\56\1\0\45\56\2\123\1\0"+
    "\10\123\1\124\1\125\1\126\1\127\2\123\1\130\3\123"+
    "\1\131\2\123\1\132\7\123\1\133\22\123\14\0\1\134"+
    "\46\0\2\123\1\0\10\123\1\135\1\136\1\137\1\140"+
    "\2\123\1\141\3\123\1\142\2\123\1\143\7\123\1\144"+
    "\22\123\2\63\1\0\60\63\5\64\1\145\55\64\10\0"+
    "\2\66\57\0\4\11\4\0\2\11\1\146\21\11\27\0"+
    "\4\11\4\0\17\11\1\147\4\11\27\0\4\11\4\0"+
    "\3\11\1\150\20\11\27\0\4\11\4\0\14\11\1\151"+
    "\7\11\27\0\4\11\4\0\11\11\1\152\12\11\27\0"+
    "\4\11\4\0\12\11\1\153\11\11\27\0\4\11\4\0"+
    "\5\11\1\154\16\11\27\0\4\11\4\0\10\11\1\155"+
    "\13\11\27\0\4\11\4\0\6\11\1\156\15\11\27\0"+
    "\4\11\4\0\1\157\23\11\27\0\4\11\4\0\7\11"+
    "\1\160\14\11\27\0\4\11\4\0\11\11\1\161\12\11"+
    "\27\0\4\11\4\0\12\11\1\162\11\11\27\0\4\11"+
    "\4\0\1\163\12\11\1\164\10\11\27\0\4\11\4\0"+
    "\13\11\1\165\10\11\27\0\4\11\4\0\6\11\1\166"+
    "\15\11\27\0\4\11\4\0\6\11\1\167\15\11\27\0"+
    "\4\11\4\0\6\11\1\170\15\11\27\0\4\11\4\0"+
    "\5\11\1\171\16\11\35\0\1\172\62\0\1\173\62\0"+
    "\1\174\62\0\1\175\62\0\1\176\62\0\1\177\62\0"+
    "\1\200\62\0\1\201\46\0\4\64\1\202\1\145\55\64"+
    "\6\0\4\11\4\0\3\11\1\203\20\11\27\0\4\11"+
    "\4\0\2\11\1\204\21\11\27\0\4\11\4\0\1\205"+
    "\23\11\27\0\4\11\4\0\2\11\1\206\21\11\27\0"+
    "\4\11\4\0\2\11\1\207\21\11\27\0\4\11\4\0"+
    "\13\11\1\210\10\11\27\0\4\11\4\0\11\11\1\211"+
    "\12\11\27\0\4\11\4\0\1\11\1\212\22\11\27\0"+
    "\4\11\4\0\1\213\23\11\27\0\4\11\4\0\6\11"+
    "\1\214\15\11\27\0\4\11\4\0\17\11\1\215\4\11"+
    "\27\0\4\11\4\0\1\11\1\216\22\11\27\0\4\11"+
    "\4\0\12\11\1\217\11\11\27\0\4\11\4\0\10\11"+
    "\1\220\13\11\27\0\4\11\4\0\7\11\1\221\14\11"+
    "\27\0\4\11\4\0\7\11\1\222\14\11\27\0\4\11"+
    "\4\0\10\11\1\223\13\11\27\0\4\11\4\0\13\11"+
    "\1\224\10\11\27\0\4\11\4\0\1\225\23\11\27\0"+
    "\4\11\4\0\2\11\1\226\21\11\27\0\4\11\4\0"+
    "\7\11\1\227\14\11\27\0\4\11\4\0\12\11\1\230"+
    "\11\11\27\0\4\11\4\0\2\11\1\231\21\11\27\0"+
    "\4\11\4\0\1\232\23\11\27\0\4\11\4\0\14\11"+
    "\1\233\7\11\27\0\4\11\4\0\23\11\1\234\27\0"+
    "\4\11\4\0\7\11\1\235\14\11\27\0\4\11\4\0"+
    "\15\11\1\236\6\11\21\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4743];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\1\1\1\11\1\1\1\11\3\1\3\11"+
    "\16\1\4\11\1\1\1\11\1\1\2\11\3\1\3\11"+
    "\3\1\1\11\4\1\2\0\26\1\21\11\10\1\1\0"+
    "\24\1\10\11\35\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[158];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  StringBuffer string = new StringBuffer();

  private Symbol symbol(int tokenID) {
    return new Symbol(tokenID, yyline, yycolumn);
  }
  private Symbol symbol(int tokenID, Object value) {
    return new Symbol(tokenID, yyline, yycolumn, value);
  }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Scanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Scanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2204) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 3: 
          { return symbol(sym.DIV);
          }
        case 76: break;
        case 51: 
          { yybegin(YYINITIAL); return symbol(sym.CHARACTER_LITERAL, '\"');
          }
        case 77: break;
        case 37: 
          { return symbol(sym.LTEQ);
          }
        case 78: break;
        case 63: 
          { return symbol(sym.VOID);
          }
        case 79: break;
        case 30: 
          { return symbol(sym.IN);
          }
        case 80: break;
        case 4: 
          { return symbol(sym.MULT);
          }
        case 81: break;
        case 10: 
          { return symbol(sym.LPAREN);
          }
        case 82: break;
        case 9: 
          { yybegin(CHAR_STATE);
          }
        case 83: break;
        case 57: 
          { yybegin(YYINITIAL); return symbol(sym.CHARACTER_LITERAL, '\r');
          }
        case 84: break;
        case 65: 
          { return symbol(sym.READ);
          }
        case 85: break;
        case 52: 
          { yybegin(YYINITIAL); return symbol(sym.CHARACTER_LITERAL, '\'');
          }
        case 86: break;
        case 54: 
          { yybegin(YYINITIAL); return symbol(sym.CHARACTER_LITERAL, '\t');
          }
        case 87: break;
        case 69: 
          { return symbol(sym.FLOAT);
          }
        case 88: break;
        case 21: 
          { return symbol(sym.MINUS);
          }
        case 89: break;
        case 62: 
          { return symbol(sym.ELSE);
          }
        case 90: break;
        case 44: 
          { string.append('\n');
          }
        case 91: break;
        case 39: 
          { string.append('\"');
          }
        case 92: break;
        case 7: 
          { return symbol(sym.DOT);
          }
        case 93: break;
        case 23: 
          { return symbol(sym.COLON);
          }
        case 94: break;
        case 49: 
          { return symbol(sym.INT);
          }
        case 95: break;
        case 35: 
          { return symbol(sym.AND);
          }
        case 96: break;
        case 45: 
          { string.append('\r');
          }
        case 97: break;
        case 8: 
          { yybegin(STRING_STATE);
          }
        case 98: break;
        case 29: 
          { return symbol(sym.IF);
          }
        case 99: break;
        case 15: 
          { return symbol(sym.RBRACK);
          }
        case 100: break;
        case 40: 
          { string.append('\'');
          }
        case 101: break;
        case 19: 
          { return symbol(sym.NOT);
          }
        case 102: break;
        case 42: 
          { string.append('\t');
          }
        case 103: break;
        case 26: 
          { yybegin(YYINITIAL); return symbol(sym.STRING_LITERAL, string.toString());
          }
        case 104: break;
        case 34: 
          { return symbol(sym.NOTEQ);
          }
        case 105: break;
        case 64: 
          { return symbol(sym.LIST);
          }
        case 106: break;
        case 71: 
          { return symbol(sym.WHILE);
          }
        case 107: break;
        case 48: 
          { return symbol(sym.DEF);
          }
        case 108: break;
        case 16: 
          { return symbol(sym.SEMI);
          }
        case 109: break;
        case 17: 
          { return symbol(sym.COMMA);
          }
        case 110: break;
        case 60: 
          { return symbol(sym.BOOLEAN_LITERAL, true);
          }
        case 111: break;
        case 68: 
          { return symbol(sym.BOOLEAN);
          }
        case 112: break;
        case 33: 
          { return symbol(sym.EQEQ);
          }
        case 113: break;
        case 25: 
          { string.append(yytext());
          }
        case 114: break;
        case 73: 
          { return symbol(sym.STRING);
          }
        case 115: break;
        case 13: 
          { return symbol(sym.RBRACE);
          }
        case 116: break;
        case 20: 
          { return symbol(sym.PLUS);
          }
        case 117: break;
        case 53: 
          { yybegin(YYINITIAL); return symbol(sym.CHARACTER_LITERAL, '\\');
          }
        case 118: break;
        case 14: 
          { return symbol(sym.LBRACK);
          }
        case 119: break;
        case 6: 
          { return symbol(sym.INTEGER_LITERAL, new Integer(yytext()));
          }
        case 120: break;
        case 47: 
          { yybegin(YYINITIAL); return symbol(sym.CHARACTER_LITERAL, yytext().charAt(0));
          }
        case 121: break;
        case 50: 
          { return symbol(sym.LEN);
          }
        case 122: break;
        case 59: 
          { return symbol(sym.TDEF);
          }
        case 123: break;
        case 74: 
          { return symbol(sym.RETURN);
          }
        case 124: break;
        case 72: 
          { return symbol(sym.PRINT);
          }
        case 125: break;
        case 58: 
          { yybegin(YYINITIAL); return symbol(sym.CHARACTER_LITERAL, '\b');
          }
        case 126: break;
        case 36: 
          { return symbol(sym.CONCAT);
          }
        case 127: break;
        case 70: 
          { return symbol(sym.BOOLEAN_LITERAL, false);
          }
        case 128: break;
        case 61: 
          { return symbol(sym.DICT);
          }
        case 129: break;
        case 75: 
          { return symbol(sym.FOREACH);
          }
        case 130: break;
        case 5: 
          { return symbol(sym.ID, yytext());
          }
        case 131: break;
        case 41: 
          { string.append('\\');
          }
        case 132: break;
        case 12: 
          { return symbol(sym.LBRACE);
          }
        case 133: break;
        case 66: 
          { return symbol(sym.CHAR);
          }
        case 134: break;
        case 55: 
          { yybegin(YYINITIAL); return symbol(sym.CHARACTER_LITERAL, '\f');
          }
        case 135: break;
        case 1: 
          { System.err.println("Error in line "+yyline+1+": Illegal character \""+yytext()+"\"");
          }
        case 136: break;
        case 2: 
          { /* ignore */
          }
        case 137: break;
        case 18: 
          { return symbol(sym.EQ);
          }
        case 138: break;
        case 22: 
          { return symbol(sym.POW);
          }
        case 139: break;
        case 46: 
          { string.append('\b');
          }
        case 140: break;
        case 11: 
          { return symbol(sym.RPAREN);
          }
        case 141: break;
        case 28: 
          { return symbol(sym.DO);
          }
        case 142: break;
        case 32: 
          { return symbol(sym.RDICT);
          }
        case 143: break;
        case 31: 
          { return symbol(sym.LDICT);
          }
        case 144: break;
        case 24: 
          { return symbol(sym.LT);
          }
        case 145: break;
        case 67: 
          { return symbol(sym.MAIN);
          }
        case 146: break;
        case 27: 
          { return symbol(sym.FLOAT_LITERAL, new Float(yytext()));
          }
        case 147: break;
        case 38: 
          { System.err.println("Error in line "+yyline+": Illegal escape character \""+yytext()+"\"");
          }
        case 148: break;
        case 43: 
          { string.append('\f');
          }
        case 149: break;
        case 56: 
          { yybegin(YYINITIAL); return symbol(sym.CHARACTER_LITERAL, '\n');
          }
        case 150: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              {     return new java_cup.runtime.Symbol(sym.EOF);
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}