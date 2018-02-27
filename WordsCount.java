
package wordscount;
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author klyme
 */
public class WordsCount {

    public static void main(String[] args) throws Exception {
       File file = new File("teoriia.docx");
       Scanner scanner = new Scanner(file);
       
       int words = 0;
       while (scanner.hasNextLine()){
           String lines = scanner.nextLine();
           words+=lines.split(" ").length;
       }
       System.out.println("Your file contains "+words+" words.");
       
    }
    
}
