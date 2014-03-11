public class QC{

	public static void main(String args[]) throws Exception {
         	/* init the automatically generated scanner from calc.lex */
        	Scanner myScanner = new Scanner(System.in);
    	    /* init the automatically generated parser from calc.cup */
	        Parser myParser = new Parser(myScanner);
 	         /* parse the input program from stdin */
 	         myParser.parse();

	}
}