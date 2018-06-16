/*Study about Static blocks and push 1 example code on github. 
*/
package Assignment6;
class abc
{
	static int num;
	static
	{
		num=10;
		System.out.println("Static Block is Created");
	}
}
public class StaticBlock {

	public static void main(String[] args) {
	System.out.println("On accessing static variable we get value of num: "+abc.num);
	}

}
