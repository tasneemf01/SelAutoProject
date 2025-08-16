package AccessModifierExamples.PublicConstructors.Pack2;

import AccessModifierExamples.PublicConstructors.Pack1.Student;

public class PreKgStudent extends Student {
	public PreKgStudent() {

		super();// We cannot call Student Constructors as it is Protected and works fine
	}

}
