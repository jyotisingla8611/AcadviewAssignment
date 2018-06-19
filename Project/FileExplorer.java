/*Project-I Discussion
1.Create abc.txt with 2 paths.
2.Recursively traverse all the files and folders to enlist all files with names and paths.
3.Create an ArrayList of file paths.
4.Create a csv file of the file names and file paths.
*/
package Project;
import java.io.*;
import java.util.Scanner;
public class FileExplorer {
	public static void enlist1(String str2)
	{
		File f1=new File(str2);
		File[] listfiles = f1.listFiles();
		for(File f2:listfiles)
		{
			if(f2.isFile())
			{
				System.out.println("File Name is: " +f2.getName());
				System.out.println(f2.getAbsolutePath());
			}
		}
	    /*ArrayList<File> allFiles = new ArrayList<>();
	    allFiles.add*/
	}
	public static void csv(String str) {
		File f1=new File(str);
		File[] listfiles = f1.listFiles();
		for(File f2:listfiles)
		{
			if(f2.isFile())
			{
				System.out.println(f2.getName()+" , "+f2.getAbsolutePath());
			}
		}
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
        Scanner obj=new Scanner(System.in);
		File f=new File("C:\\Users\\Lenovo PN\\eclipse-workspace\\AcadviewAssignments\\src\\Project\\promini.txt");
        try {
			f.createNewFile();
		}finally{
            System.out.println("File has been created\n");  
        }
        String str,str1;
        System.out.println("Enter 2 paths");
        str=obj.nextLine();
        str1=obj.nextLine();
        PrintStream pout=new PrintStream(f);    
        pout.println(str);
        pout.println(str1);
        System.out.println("\nEnlisting all files and their paths\n");
        enlist1(str);
        enlist1(str1);
        System.out.println("\nPrinting all files and their paths in csv Format we get :\n");
        csv(str);
        csv(str1);
}
}