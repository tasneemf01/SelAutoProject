package AccessModifierExamples.PublicConstructors.Pack2;

import AccessModifierExamples.PublicConstructors.Pack1.Student;

public class StudentPack2Test {

	public static void main(String[] args) {

		Student stu = new Student(); //Student Constructors is Default and will not work in this case
		System.out.println(" Student:" + stu);
	}

}
