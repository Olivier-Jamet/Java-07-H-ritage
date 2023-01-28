package autoboat;

public class Hangar {

	public static void main(String[] args) {
		
		Car renault = new Car("Clio", 0);
		Boat cargo = new Boat("Titanic", 0);
		
		renault.doStuff();
		cargo.doStuff();

	}

}
