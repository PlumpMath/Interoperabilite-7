package submodule_2;

import java.util.Scanner;

public class Cmdbase {
	public static void main(String[] args) {
	    // create a scanner so we can read the command-line input
	    Scanner scanner = new Scanner(System.in);

	    //  prompt for the user's name
	    System.out.print("Sélectionnez votre action : \na) create\t b) read\nc) update\t d) delete\n>_ ");
	    // get their input as a String
	    String action = scanner.next();
	    
	    while (!action.equals("a") && !action.equals("b") && !action.equals("c") && !action.equals("d")) {
	    	System.out.print(">_ ");
			action = scanner.next();
		}
	    //  prompt for the user's name
	    System.out.print("Sélectionnez votre table : \na) Student\t b) Teacher\t c) Promotion\n>_ ");
	    // get their input as a String
	    String table = scanner.next();
	    
	    while (!table.equals("a") && !table.equals("b") && !table.equals("c")) {
	    	System.out.print(">_ ");
	    	table = scanner.next();
		}

	    System.out.println(String.format("%s %s", action, table));

	}
}