package Assignment7;

public  class Cat implements Animals {

	@Override
	public void speak() {
		System.out.println("The Cat has a sound as meow");
		
	}

	@Override
	public void eat() {
		System.out.println("The Cat eats mouse");
	}
	
}
