import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
public class QC{

	public static void main(String args[]) throws Exception {
			Scanner myScanner;
			if(args.length > 0) {
            	File file = new File(args[0]);
            	InputStream is = new FileInputStream(file);
            	myScanner = new Scanner(is);
            }
        	else{
        		myScanner = new Scanner(System.in);
        	}
	        Parser myParser = new Parser(myScanner);
 	        myParser.debug_parse();

	}
}