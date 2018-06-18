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
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            fr.close();
            fw.close();
            System.out.println("Complete");  

        }

        
}
}