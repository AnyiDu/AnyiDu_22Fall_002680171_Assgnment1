import java.util.ArrayList;
import java.util.Random;

public class bag<T> {
	private ArrayList<T> bag;


	public bag() {
		bag = new ArrayList<T>();
	}

	// add an element to the bag
	public void add(T item) {
		bag.add(item);
	}

	// clear all contents of the bag
	public void clear() {
		bag.clear();
	}

	// check if the bag contains a specific element
	public boolean contains(T item) {
		return bag.contains(item);
	}

	// grab a random element from the bag
	public T grab() {
		if (isEmpty()) {
			return null;
		}
		Random rand = new Random();
		int randomIndex = rand.nextInt(bag.size());
		return bag.get(randomIndex);
	}

	// check if the bag is empty
	public boolean isEmpty() {
		return bag.isEmpty();
	}

	// remove one instance of an element from the bag
	public boolean remove(T item) {
		return bag.remove(item);
	}

	// get the number of elements in the bag
	public int size() {
		return bag.size();
	}

	// get an array of all elements in the bag
	public T[] toArray() {
		return (T[]) bag.toArray();
	}

	// get a string representation of all elements in the bag
	public String toString() {
		return bag.toString();
	}
}