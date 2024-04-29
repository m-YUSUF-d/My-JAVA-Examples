package Examples;

public class Students_Class {

	private String name;
	private int age;

	public static int count;

	public Students_Class() {
		count++;
	}

	public Students_Class(String name, int age) {
		setName(name);
		setAge(age);
		count++;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void getValues(Students_Class student) {
		System.out.println("Name : " + student.name + ", Age : " + student.age);
		System.out.println("Total object created from this class : " + count + "\n");

	}
}
