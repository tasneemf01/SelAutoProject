package AccessModifierExamples.PublicConstructors.Pack1;

public class Student {

	private Student() {

		System.out.println("default contstructors");
	}
	
	public static void main(String[] args) {

		Student stu = new Student();
		System.out.println(" Student:" + stu);

	}

}
