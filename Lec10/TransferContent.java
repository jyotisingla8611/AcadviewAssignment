/*Use the text file abc.txt and write its contents in another file xyz.txt. Print the contents of xyz.txt for 
verification.*/
package Lec10;
import java.io.*;
public class TransferContent {
	public static void main(String[] args) throws IOException {
        File f = new File("source.txt");
        File f1 = new File("destination.txt");
        FileWriter fw = new FileWriter(f1);
        FileReader fr = new FileReader(f);
        try{
            int ch = fr.read();
            while(ch != -1){
            	fw.write(ch);
                ch = fr.read();
            }
        }
        finally{
            fr.close();
            fw.close();
            System.out.println("Complete");  
        }
        System.out.println("For Verification");
        FileReader fr1 = new FileReader("destination.txt");
        try{
            int ch = fr1.read();
            while(ch != -1){
                System.out.print((char)ch);
                ch = fr1.read();
            }
        }
        finally{
            fr1.close();}
}
}