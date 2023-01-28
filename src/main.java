


public class main {
	public static void main(String[] args) {
		bag<Object> bag1 = new bag<>();
		bag1.add(1);
		bag1.add(50);
		bag1.add(15);
		bag1.add(175);
		bag1.add("Jack");
		bag1.add("Alex");
		bag1.add(2000);
		System.out.println("The initial bag size is:" + bag1.size());
		System.out.println("Grab element randomly " + bag1.grab());
		System.out.println("The bag belongs to " + bag1.toString());



		System.out.println("" + bag1.isEmpty());



		System.out.println("" + bag1.hashCode());

	}
}