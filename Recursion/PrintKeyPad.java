package Recursion;
public class PrintKeyPad {
	public static String getString(char number) {
    	  if(number == '2') {
			return "abc";
		} if(number == '3') {
			return "def";
		}
		
		return "";
		
	}
	public static void keyPadPrint(String number,String output) {
		  if(number.length() == 0) {
			  System.out.println(output);
			  return;
		  }
		     String ans = getString(number.charAt(0));
		     
		     for(int i = 0; i < ans.length();i++) {
		    	 
		    	 keyPadPrint(number.substring(1),output + ans.charAt(i));
		    	
		     }
	}
		public static void main(String[] args) {
	        keyPadPrint("23", "");
		}


}
