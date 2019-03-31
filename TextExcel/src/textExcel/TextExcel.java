// @author Winnie Liang


package textExcel;

import java.util.Scanner;

// Update this file with your own code.

public class TextExcel {

	public static void main(String[] args) {
	    
		Scanner userInput = new Scanner(System.in);
		
		Spreadsheet mySpreadsheet = new Spreadsheet();

		System.out.println("Enter a command: ");
		String command = userInput.nextLine();
		
		while (!command.equalsIgnoreCase("quit")) {
			
			System.out.println(mySpreadsheet.processCommand(command));
			System.out.println("Enter a command: ");
			command = userInput.nextLine();
			
		}
		
		userInput.close();
		
	} //Client code: accepts command
	
}
