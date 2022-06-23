// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/AnalizadorLexico.flex

/* Sección de declaraciones de JFlex */

// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class AnalizadorLexico {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u0100\1\u1100\1\u1200\1\u1300\1\u0100\1\u1400\1\u1500"+
    "\1\u1600\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u0100\1\u1c00"+
    "\1\u1d00\1\u1e00\2\u1f00\1\u2000\7\u1f00\1\u2100\1\u2200\1\u2300"+
    "\1\u1f00\1\u2400\1\u2500\2\u1f00\31\u0100\1\u2600\121\u0100\1\u2700"+
    "\4\u0100\1\u2800\1\u0100\1\u2900\1\u2a00\1\u2b00\1\u2c00\1\u2d00"+
    "\1\u2e00\53\u0100\1\u2f00\10\u3000\31\u1f00\1\u0100\1\u3100\1\u3200"+
    "\1\u0100\1\u3300\1\u3400\1\u3500\1\u3600\1\u3700\1\u3800\1\u3900"+
    "\1\u3a00\1\u3b00\1\u0100\1\u3c00\1\u3d00\1\u3e00\1\u3f00\1\u4000"+
    "\1\u4100\1\u4200\1\u1f00\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700"+
    "\1\u4800\1\u4900\1\u4a00\1\u4b00\1\u4c00\1\u4d00\1\u4e00\1\u1f00"+
    "\1\u4f00\1\u5000\1\u5100\1\u1f00\3\u0100\1\u5200\1\u5300\1\u5400"+
    "\12\u1f00\4\u0100\1\u5500\17\u1f00\2\u0100\1\u5600\41\u1f00\2\u0100"+
    "\1\u5700\1\u5800\2\u1f00\1\u5900\1\u5a00\27\u0100\1\u5b00\2\u0100"+
    "\1\u5c00\45\u1f00\1\u0100\1\u5d00\1\u5e00\11\u1f00\1\u5f00\24\u1f00"+
    "\1\u6000\1\u6100\1\u1f00\1\u6200\1\u6300\1\u6400\1\u6500\2\u1f00"+
    "\1\u6600\5\u1f00\1\u6700\1\u6800\1\u6900\5\u1f00\1\u6a00\1\u6b00"+
    "\4\u1f00\1\u6c00\2\u1f00\1\u6d00\16\u1f00\246\u0100\1\u6e00\20\u0100"+
    "\1\u6f00\1\u7000\25\u0100\1\u7100\34\u0100\1\u7200\14\u1f00\2\u0100"+
    "\1\u7300\u0b06\u1f00\1\u2700\u02fe\u1f00";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\12\0\1\1\2\2\1\3\22\0\1\4\1\5\1\6"+
    "\3\0\1\7\1\0\1\10\1\11\1\12\1\13\1\14"+
    "\1\13\1\15\1\16\12\17\1\20\1\21\1\22\1\23"+
    "\1\22\1\24\1\25\16\26\1\27\3\26\1\30\7\26"+
    "\1\31\1\0\1\32\1\0\1\33\1\0\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\2\26"+
    "\1\45\1\46\1\47\1\50\1\51\1\26\1\52\1\53"+
    "\1\54\1\55\1\56\1\57\3\26\1\60\1\0\1\60"+
    "\7\0\1\2\44\0\1\61\12\0\1\61\4\0\1\61"+
    "\5\0\27\61\1\0\37\61\1\0\u01ca\61\4\0\14\61"+
    "\16\0\5\61\7\0\1\61\1\0\1\61\21\0\165\61"+
    "\1\0\2\61\2\0\4\61\1\0\1\61\6\0\1\61"+
    "\1\0\3\61\1\0\1\61\1\0\24\61\1\0\123\61"+
    "\1\0\213\61\1\0\255\61\1\0\46\61\2\0\1\61"+
    "\6\0\51\61\10\0\55\61\1\0\1\61\1\0\2\61"+
    "\1\0\2\61\1\0\1\61\10\0\33\61\4\0\4\61"+
    "\35\0\13\61\5\0\112\61\4\0\146\61\1\0\10\61"+
    "\2\0\12\61\1\0\23\61\2\0\1\61\20\0\73\61"+
    "\2\0\145\61\16\0\66\61\4\0\1\61\2\0\1\61"+
    "\2\0\56\61\22\0\34\61\4\0\13\61\65\0\25\61"+
    "\1\0\10\61\25\0\17\61\1\0\201\61\2\0\12\61"+
    "\1\0\23\61\1\0\10\61\2\0\2\61\2\0\26\61"+
    "\1\0\7\61\1\0\1\61\3\0\4\61\2\0\11\61"+
    "\2\0\2\61\2\0\4\61\10\0\1\61\4\0\2\61"+
    "\1\0\5\61\2\0\14\61\12\0\1\61\1\0\1\61"+
    "\2\0\3\61\1\0\6\61\4\0\2\61\2\0\26\61"+
    "\1\0\7\61\1\0\2\61\1\0\2\61\1\0\2\61"+
    "\2\0\1\61\1\0\5\61\4\0\2\61\2\0\3\61"+
    "\3\0\1\61\7\0\4\61\1\0\1\61\7\0\20\61"+
    "\13\0\3\61\1\0\11\61\1\0\3\61\1\0\26\61"+
    "\1\0\7\61\1\0\2\61\1\0\5\61\2\0\12\61"+
    "\1\0\3\61\1\0\3\61\2\0\1\61\17\0\4\61"+
    "\2\0\12\61\11\0\7\61\1\0\3\61\1\0\10\61"+
    "\2\0\2\61\2\0\26\61\1\0\7\61\1\0\2\61"+
    "\1\0\5\61\2\0\11\61\2\0\2\61\2\0\3\61"+
    "\10\0\2\61\4\0\2\61\1\0\5\61\2\0\12\61"+
    "\1\0\1\61\20\0\2\61\1\0\6\61\3\0\3\61"+
    "\1\0\4\61\3\0\2\61\1\0\1\61\1\0\2\61"+
    "\3\0\2\61\3\0\3\61\3\0\14\61\4\0\5\61"+
    "\3\0\3\61\1\0\4\61\2\0\1\61\6\0\1\61"+
    "\16\0\12\61\20\0\15\61\1\0\3\61\1\0\27\61"+
    "\1\0\20\61\3\0\10\61\1\0\3\61\1\0\4\61"+
    "\7\0\2\61\1\0\3\61\5\0\4\61\2\0\12\61"+
    "\20\0\4\61\1\0\10\61\1\0\3\61\1\0\27\61"+
    "\1\0\12\61\1\0\5\61\2\0\11\61\1\0\3\61"+
    "\1\0\4\61\7\0\2\61\7\0\1\61\1\0\4\61"+
    "\2\0\12\61\1\0\2\61\15\0\4\61\1\0\10\61"+
    "\1\0\3\61\1\0\63\61\1\0\3\61\1\0\5\61"+
    "\5\0\4\61\7\0\5\61\2\0\12\61\12\0\6\61"+
    "\2\0\2\61\1\0\22\61\3\0\30\61\1\0\11\61"+
    "\1\0\1\61\2\0\7\61\3\0\1\61\4\0\6\61"+
    "\1\0\1\61\1\0\10\61\6\0\12\61\2\0\2\61"+
    "\15\0\72\61\5\0\17\61\1\0\12\61\47\0\2\61"+
    "\1\0\1\61\1\0\5\61\1\0\30\61\1\0\1\61"+
    "\1\0\27\61\2\0\5\61\1\0\1\61\1\0\6\61"+
    "\2\0\12\61\2\0\4\61\40\0\1\61\27\0\2\61"+
    "\6\0\12\61\13\0\1\61\1\0\1\61\1\0\1\61"+
    "\4\0\12\61\1\0\44\61\4\0\24\61\1\0\22\61"+
    "\1\0\44\61\11\0\1\61\71\0\112\61\6\0\116\61"+
    "\2\0\46\61\1\0\1\61\5\0\1\61\2\0\53\61"+
    "\1\0\115\61\1\0\4\61\2\0\7\61\1\0\1\61"+
    "\1\0\4\61\2\0\51\61\1\0\4\61\2\0\41\61"+
    "\1\0\4\61\2\0\7\61\1\0\1\61\1\0\4\61"+
    "\2\0\17\61\1\0\71\61\1\0\4\61\2\0\103\61"+
    "\2\0\3\61\40\0\20\61\20\0\126\61\2\0\6\61"+
    "\3\0\u016c\61\2\0\21\61\1\0\32\61\5\0\113\61"+
    "\3\0\13\61\7\0\15\61\1\0\7\61\13\0\25\61"+
    "\13\0\24\61\14\0\15\61\1\0\3\61\1\0\2\61"+
    "\14\0\124\61\3\0\1\61\4\0\2\61\2\0\12\61"+
    "\41\0\3\61\2\0\12\61\6\0\131\61\7\0\53\61"+
    "\5\0\106\61\12\0\37\61\1\0\14\61\4\0\14\61"+
    "\12\0\50\61\2\0\5\61\13\0\54\61\4\0\32\61"+
    "\6\0\12\61\46\0\34\61\4\0\77\61\1\0\35\61"+
    "\2\0\13\61\6\0\12\61\15\0\1\61\10\0\17\61"+
    "\101\0\114\61\4\0\12\61\21\0\11\61\14\0\164\61"+
    "\14\0\70\61\10\0\12\61\3\0\61\61\2\0\11\61"+
    "\7\0\53\61\2\0\3\61\20\0\3\61\1\0\47\61"+
    "\5\0\372\61\1\0\33\61\2\0\6\61\2\0\46\61"+
    "\2\0\6\61\2\0\10\61\1\0\1\61\1\0\1\61"+
    "\1\0\1\61\1\0\37\61\2\0\65\61\1\0\7\61"+
    "\1\0\1\61\3\0\3\61\1\0\7\61\3\0\4\61"+
    "\2\0\6\61\4\0\15\61\5\0\3\61\1\0\7\61"+
    "\53\0\2\2\25\0\2\61\23\0\1\61\34\0\1\61"+
    "\15\0\1\61\20\0\15\61\63\0\41\61\21\0\1\61"+
    "\4\0\1\61\2\0\12\61\1\0\1\61\3\0\5\61"+
    "\6\0\1\61\1\0\1\61\1\0\1\61\1\0\4\61"+
    "\1\0\13\61\2\0\4\61\5\0\5\61\4\0\1\61"+
    "\21\0\51\61\u022d\0\64\61\26\0\57\61\1\0\57\61"+
    "\1\0\205\61\6\0\11\61\14\0\46\61\1\0\1\61"+
    "\5\0\1\61\2\0\70\61\7\0\1\61\17\0\30\61"+
    "\11\0\7\61\1\0\7\61\1\0\7\61\1\0\7\61"+
    "\1\0\7\61\1\0\7\61\1\0\7\61\1\0\7\61"+
    "\1\0\40\61\57\0\1\61\325\0\3\61\31\0\17\61"+
    "\1\0\5\61\2\0\5\61\4\0\126\61\2\0\2\61"+
    "\2\0\3\61\1\0\132\61\1\0\4\61\5\0\53\61"+
    "\1\0\136\61\21\0\33\61\65\0\306\61\112\0\360\61"+
    "\20\0\215\61\103\0\56\61\2\0\15\61\3\0\34\61"+
    "\24\0\63\61\1\0\12\61\1\0\163\61\45\0\11\61"+
    "\2\0\147\61\2\0\65\61\2\0\5\61\60\0\61\61"+
    "\30\0\64\61\14\0\106\61\12\0\12\61\6\0\30\61"+
    "\3\0\1\61\1\0\61\61\2\0\44\61\14\0\35\61"+
    "\3\0\101\61\16\0\13\61\6\0\37\61\1\0\67\61"+
    "\11\0\16\61\2\0\12\61\6\0\27\61\3\0\111\61"+
    "\30\0\3\61\2\0\20\61\2\0\5\61\12\0\6\61"+
    "\2\0\6\61\2\0\6\61\11\0\7\61\1\0\7\61"+
    "\1\0\53\61\1\0\14\61\10\0\173\61\1\0\2\61"+
    "\2\0\12\61\6\0\244\61\14\0\27\61\4\0\61\61"+
    "\4\0\u0100\2\156\61\2\0\152\61\46\0\7\61\14\0"+
    "\5\61\5\0\14\61\1\0\15\61\1\0\5\61\1\0"+
    "\1\61\1\0\2\61\1\0\2\61\1\0\154\61\41\0"+
    "\153\61\22\0\100\61\2\0\66\61\50\0\14\61\4\0"+
    "\20\61\20\0\20\61\3\0\2\61\30\0\3\61\40\0"+
    "\5\61\1\0\207\61\23\0\12\61\7\0\32\61\4\0"+
    "\1\61\1\0\32\61\13\0\131\61\3\0\6\61\2\0"+
    "\6\61\2\0\6\61\2\0\3\61\43\0\14\61\1\0"+
    "\32\61\1\0\23\61\1\0\2\61\1\0\17\61\2\0"+
    "\16\61\42\0\173\61\105\0\65\61\210\0\1\61\202\0"+
    "\35\61\3\0\61\61\17\0\1\61\37\0\40\61\15\0"+
    "\36\61\5\0\53\61\5\0\36\61\2\0\44\61\4\0"+
    "\10\61\1\0\5\61\52\0\236\61\2\0\12\61\6\0"+
    "\44\61\4\0\44\61\4\0\50\61\10\0\64\61\234\0"+
    "\67\61\11\0\26\61\12\0\10\61\230\0\6\61\2\0"+
    "\1\61\1\0\54\61\1\0\2\61\3\0\1\61\2\0"+
    "\27\61\12\0\27\61\11\0\37\61\101\0\23\61\1\0"+
    "\2\61\12\0\26\61\12\0\32\61\106\0\70\61\6\0"+
    "\2\61\100\0\4\61\1\0\2\61\5\0\10\61\1\0"+
    "\3\61\1\0\35\61\2\0\3\61\4\0\1\61\40\0"+
    "\35\61\3\0\35\61\43\0\10\61\1\0\36\61\31\0"+
    "\66\61\12\0\26\61\12\0\23\61\15\0\22\61\156\0"+
    "\111\61\67\0\63\61\15\0\63\61\15\0\50\61\10\0"+
    "\12\61\306\0\35\61\12\0\1\61\10\0\41\61\217\0"+
    "\27\61\11\0\107\61\37\0\12\61\17\0\74\61\25\0"+
    "\31\61\7\0\12\61\6\0\65\61\1\0\12\61\4\0"+
    "\3\61\11\0\44\61\2\0\1\61\11\0\105\61\4\0"+
    "\4\61\3\0\13\61\1\0\1\61\43\0\22\61\1\0"+
    "\45\61\6\0\1\61\101\0\7\61\1\0\1\61\1\0"+
    "\4\61\1\0\17\61\1\0\12\61\7\0\73\61\5\0"+
    "\12\61\6\0\4\61\1\0\10\61\2\0\2\61\2\0"+
    "\26\61\1\0\7\61\1\0\2\61\1\0\5\61\1\0"+
    "\12\61\2\0\2\61\2\0\3\61\2\0\1\61\6\0"+
    "\1\61\5\0\7\61\2\0\7\61\3\0\5\61\213\0"+
    "\113\61\5\0\12\61\4\0\2\61\40\0\106\61\1\0"+
    "\1\61\10\0\12\61\246\0\66\61\2\0\11\61\27\0"+
    "\6\61\42\0\101\61\3\0\1\61\13\0\12\61\46\0"+
    "\71\61\7\0\12\61\66\0\33\61\2\0\17\61\4\0"+
    "\12\61\306\0\73\61\145\0\112\61\25\0\1\61\240\0"+
    "\10\61\2\0\56\61\2\0\10\61\1\0\2\61\33\0"+
    "\77\61\10\0\1\61\10\0\112\61\3\0\1\61\42\0"+
    "\71\61\7\0\11\61\1\0\55\61\1\0\11\61\17\0"+
    "\12\61\30\0\36\61\2\0\26\61\1\0\16\61\111\0"+
    "\7\61\1\0\2\61\1\0\54\61\3\0\1\61\1\0"+
    "\2\61\1\0\11\61\10\0\12\61\6\0\6\61\1\0"+
    "\2\61\1\0\45\61\1\0\2\61\1\0\6\61\7\0"+
    "\12\61\u0136\0\27\61\11\0\232\61\146\0\157\61\21\0"+
    "\304\61\274\0\57\61\321\0\107\61\271\0\71\61\7\0"+
    "\37\61\1\0\12\61\146\0\36\61\2\0\5\61\13\0"+
    "\67\61\11\0\4\61\14\0\12\61\11\0\25\61\5\0"+
    "\23\61\260\0\100\61\200\0\113\61\4\0\71\61\7\0"+
    "\21\61\100\0\2\61\1\0\1\61\34\0\370\61\10\0"+
    "\363\61\15\0\37\61\61\0\3\61\21\0\4\61\10\0"+
    "\u018c\61\4\0\153\61\5\0\15\61\3\0\11\61\7\0"+
    "\12\61\3\0\2\61\306\0\5\61\3\0\6\61\10\0"+
    "\10\61\2\0\7\61\36\0\4\61\224\0\3\61\273\0"+
    "\125\61\1\0\107\61\1\0\2\61\2\0\1\61\2\0"+
    "\2\61\2\0\4\61\1\0\14\61\1\0\1\61\1\0"+
    "\7\61\1\0\101\61\1\0\4\61\2\0\10\61\1\0"+
    "\7\61\1\0\34\61\1\0\4\61\1\0\5\61\1\0"+
    "\1\61\3\0\7\61\1\0\u0154\61\2\0\31\61\1\0"+
    "\31\61\1\0\37\61\1\0\31\61\1\0\37\61\1\0"+
    "\31\61\1\0\37\61\1\0\31\61\1\0\37\61\1\0"+
    "\31\61\1\0\10\61\2\0\151\61\4\0\62\61\10\0"+
    "\1\61\16\0\1\61\26\0\5\61\1\0\17\61\120\0"+
    "\7\61\1\0\21\61\2\0\7\61\1\0\2\61\1\0"+
    "\5\61\325\0\55\61\3\0\16\61\2\0\12\61\4\0"+
    "\1\61\u0171\0\72\61\6\0\305\61\13\0\7\61\51\0"+
    "\114\61\4\0\12\61\246\0\4\61\1\0\33\61\1\0"+
    "\2\61\1\0\1\61\2\0\1\61\1\0\12\61\1\0"+
    "\4\61\1\0\1\61\1\0\1\61\6\0\1\61\4\0"+
    "\1\61\1\0\1\61\1\0\1\61\1\0\3\61\1\0"+
    "\2\61\1\0\1\61\2\0\1\61\1\0\1\61\1\0"+
    "\1\61\1\0\1\61\1\0\1\61\1\0\2\61\1\0"+
    "\1\61\2\0\4\61\1\0\7\61\1\0\4\61\1\0"+
    "\4\61\1\0\1\61\1\0\12\61\1\0\21\61\5\0"+
    "\3\61\1\0\5\61\1\0\21\61\164\0\32\61\6\0"+
    "\32\61\6\0\32\61\166\0\327\61\51\0\65\61\13\0"+
    "\336\61\2\0\u0182\61\16\0\u0131\61\37\0\36\61\342\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[29696];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\1\2\1\3\1\4\1\0\2\5\2\6"+
    "\1\7\1\0\1\6\1\10\1\11\1\12\1\3\1\13"+
    "\1\0\2\14\1\15\1\16\10\14\1\17\1\20\1\0"+
    "\1\21\1\22\1\23\1\0\5\14\1\24\7\14\2\0"+
    "\4\14\1\25\1\14\1\26\1\27\4\14\2\0\1\14"+
    "\1\26\7\14\2\0\1\14\1\0\1\30\5\14\2\0"+
    "\2\31\1\32\1\14\1\33\1\24\1\0\1\34\1\0"+
    "\1\35";

  private static int [] zzUnpackAction() {
    int [] result = new int[99];
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
    "\0\0\0\62\0\144\0\62\0\62\0\62\0\226\0\310"+
    "\0\62\0\62\0\372\0\62\0\u012c\0\u015e\0\u0190\0\62"+
    "\0\62\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\62\0\62"+
    "\0\u02bc\0\u02ee\0\u0320\0\u0352\0\u0384\0\u03b6\0\u03e8\0\u041a"+
    "\0\62\0\62\0\u044c\0\62\0\u047e\0\62\0\u04b0\0\u04e2"+
    "\0\u0514\0\u0546\0\u0578\0\u05aa\0\u0258\0\u05dc\0\u060e\0\u0640"+
    "\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a\0\u076c\0\u079e\0\u07d0"+
    "\0\u0802\0\u0834\0\u0258\0\u0866\0\u0258\0\u0258\0\u0898\0\u08ca"+
    "\0\u08fc\0\u092e\0\u0960\0\u0992\0\u09c4\0\u09f6\0\u0a28\0\u0a5a"+
    "\0\u0a8c\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea"+
    "\0\u0c1c\0\u0258\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48"+
    "\0\u0d7a\0\u0258\0\62\0\u0258\0\u0dac\0\u0258\0\62\0\u0dde"+
    "\0\u0258\0\u0e10\0\62";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[99];
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
    "\1\0\1\2\1\0\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\0\1\24\2\25\1\26"+
    "\2\27\1\30\2\25\1\31\1\32\1\25\1\33\2\25"+
    "\1\34\2\25\1\35\1\25\1\36\1\25\1\37\3\25"+
    "\1\40\1\41\64\0\1\2\67\0\1\42\52\0\1\43"+
    "\3\0\56\43\13\0\1\13\60\0\1\44\4\0\1\45"+
    "\6\0\3\45\2\0\25\45\1\0\1\45\16\0\1\46"+
    "\62\0\1\17\65\0\1\5\60\0\2\5\65\0\1\47"+
    "\60\0\3\25\3\0\24\25\30\0\3\25\3\0\20\25"+
    "\1\50\3\25\30\0\3\25\3\0\7\25\1\51\1\25"+
    "\1\52\12\25\30\0\3\25\3\0\14\25\1\53\7\25"+
    "\30\0\3\25\3\0\14\25\1\54\7\25\30\0\3\25"+
    "\3\0\5\25\1\55\4\25\1\56\1\57\10\25\30\0"+
    "\3\25\3\0\4\25\1\60\17\25\30\0\3\25\3\0"+
    "\16\25\1\61\2\25\1\62\2\25\30\0\3\25\3\0"+
    "\23\25\1\63\30\0\3\25\3\0\7\25\1\64\14\25"+
    "\13\0\1\65\67\0\1\45\6\0\3\45\2\0\25\45"+
    "\1\0\1\45\56\0\1\66\31\0\3\25\3\0\16\25"+
    "\1\67\5\25\30\0\3\25\3\0\1\70\23\25\30\0"+
    "\3\25\3\0\1\71\23\25\30\0\3\25\3\0\21\25"+
    "\1\72\2\25\30\0\3\25\3\0\16\25\1\73\5\25"+
    "\30\0\3\25\3\0\15\25\1\74\6\25\30\0\3\25"+
    "\3\0\20\25\1\75\3\25\30\0\3\25\3\0\23\25"+
    "\1\76\30\0\3\25\3\0\10\25\1\77\13\25\30\0"+
    "\3\25\3\0\1\25\1\100\22\25\30\0\3\25\3\0"+
    "\10\25\1\101\13\25\30\0\3\25\3\0\10\25\1\102"+
    "\13\25\26\0\1\103\75\0\1\104\47\0\3\25\3\0"+
    "\10\25\1\105\13\25\30\0\3\25\3\0\16\25\1\106"+
    "\5\25\30\0\3\25\3\0\17\25\1\107\4\25\30\0"+
    "\3\25\3\0\1\25\1\110\22\25\30\0\3\25\3\0"+
    "\14\25\1\111\7\25\30\0\3\25\3\0\22\25\1\112"+
    "\1\25\30\0\3\25\3\0\11\25\1\113\12\25\30\0"+
    "\3\25\3\0\20\25\1\114\3\25\30\0\3\25\3\0"+
    "\11\25\1\115\12\25\2\0\1\116\3\0\56\116\52\0"+
    "\1\117\35\0\3\25\3\0\13\25\1\120\10\25\30\0"+
    "\3\25\1\121\2\0\24\25\30\0\3\25\3\0\17\25"+
    "\1\122\4\25\30\0\3\25\3\0\11\25\1\123\12\25"+
    "\30\0\3\25\3\0\16\25\1\124\5\25\30\0\3\25"+
    "\3\0\1\125\23\25\30\0\3\25\3\0\10\25\1\126"+
    "\13\25\30\0\3\25\3\0\2\25\1\127\21\25\30\0"+
    "\3\25\3\0\4\25\1\73\17\25\22\0\1\130\113\0"+
    "\1\131\35\0\3\25\3\0\6\25\1\132\15\25\34\0"+
    "\1\133\55\0\3\25\3\0\4\25\1\75\17\25\30\0"+
    "\3\25\3\0\20\25\1\134\3\25\30\0\3\25\3\0"+
    "\20\25\1\135\3\25\30\0\3\25\3\0\2\25\1\136"+
    "\21\25\30\0\3\25\3\0\7\25\1\55\14\25\2\0"+
    "\1\137\3\0\56\137\44\0\1\140\43\0\3\25\3\0"+
    "\4\25\1\141\17\25\41\0\1\142\62\0\1\143\21\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3650];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\3\11\1\0\1\1\2\11\1\1"+
    "\1\11\1\0\2\1\2\11\2\1\1\0\2\1\2\11"+
    "\10\1\2\11\1\0\1\11\1\1\1\11\1\0\15\1"+
    "\2\0\14\1\2\0\11\1\2\0\1\1\1\0\6\1"+
    "\2\0\1\1\1\11\3\1\1\11\1\0\1\1\1\0"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[99];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */

 /* Código personalizado */

 // Se agregó una propiedad para verificar si existen tokens pendientes
 private boolean _existenTokens = false;

 public boolean existenTokens(){
 return this._existenTokens;
 }



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalizadorLexico(java.io.Reader in) {
   /* Código que se ejecutará en el constructor de la clase */
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
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
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    

 /* Código a ejecutar al finalizar el análisis, en este caso cambiaremos el valor de una variable bandera */
 this._existenTokens = false;

    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public TokenPersonalizado yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { //IGNORAR
            }
            // fall through
          case 30: break;
          case 2:
            { // Ignorar cuando se ingrese un espacio
            }
            // fall through
          case 31: break;
          case 3:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "COMPARACION");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 32: break;
          case 4:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "Comillas");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 33: break;
          case 5:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "INICIO o FIN de parentesis");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 34: break;
          case 6:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "OPERADOR MATEMATICO");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 35: break;
          case 7:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "Coma");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 36: break;
          case 8:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "NUMERO");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 37: break;
          case 9:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "Dos Puntos");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 38: break;
          case 10:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "Punto y coma");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 39: break;
          case 11:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "ASIGNACION");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 40: break;
          case 12:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "PALABRA");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 41: break;
          case 13:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "INICIO o FIN de corchetes");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 42: break;
          case 14:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "Guion Bajo");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 43: break;
          case 15:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "INICIO o FIN de llaves");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 44: break;
          case 16:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "comparador");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 45: break;
          case 17:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "importa TODA LA LIBRERIA");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 46: break;
          case 18:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "se accede a la funcion de una clase");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 47: break;
          case 19:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "Comentario");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 48: break;
          case 20:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "CONDICIONAL");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 49: break;
          case 21:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "CICLO");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 50: break;
          case 22:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "DATO PRIMITIVO");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 51: break;
          case 23:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "Se crea una nueva instancia");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 52: break;
          case 24:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "Clase Nueva");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 53: break;
          case 25:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "ARREGLO DE STRING");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 54: break;
          case 26:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "Libreria importada");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 55: break;
          case 27:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "variable o funcion publica");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 56: break;
          case 28:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "Variable Privada");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 57: break;
          case 29:
            { TokenPersonalizado t = new TokenPersonalizado(yytext(), "Override");
 this._existenTokens = true;
 return t;
            }
            // fall through
          case 58: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
