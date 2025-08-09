package javaconcepts;

public class SwitchCaseStatement {
	
	public static void main (String[] args) {
		String color= "Blue";
		
		switch (color) {
		case"Red":
		System.out.println("Stop! come to complete stop");
		break;
		case "Yellow":
		System.out.println("Caution! prepare to slow");
		break;
		case "Green":
		System.out.println(" GO! It is safe to Proceed");
		break;
		case"Blue":
		System.out.println("Calm and Cool shade");
		break;
		default:
		System.out.println("Unkown color selected");
		}
}
}