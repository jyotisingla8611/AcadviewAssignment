package Assignment7;

public class AbstractMain {
	public static void main(String ar[])
	{
		Derived d=new Derived();
		d.speak();
		d.eat();
		d.breed="Germen";
		d.color="Brown";
		d.name="Jackey";
		System.out.println("Breed of animal is "+d.breed);
		System.out.println("Color of animal is "+d.color);
		System.out.println("Name of animal is "+d.name);
	}

}

		