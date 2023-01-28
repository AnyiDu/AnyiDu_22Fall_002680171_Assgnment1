import java.util.ArrayList;

class students {
	public static void main(String[] args){


		ArrayList<String> students = new ArrayList<>();

		students.add("Alex");
		students.add("Emily");
	    students.add("Tom");
		System.out.println("Student's name is " + students);



		boolean result = students.remove("Alex");
		System.out.println("whether delete Alex? " + result);
		System.out.println("After remove: " + students);


		students.clear();
		System.out.println("After clear"+ students);

	}
}