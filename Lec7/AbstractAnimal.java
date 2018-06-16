/*Create an Abstract Class Animals with color, breed and name as variables, along
  with eat() abstract method and also a speak() method which is not abstract.*/
package Assignment7;

public abstract class AbstractAnimal {
	String color;
	String breed;
	String name;
	abstract void eat();
	void speak()
	{
		System.out.println("Each animal has its own voice");
	}
}
