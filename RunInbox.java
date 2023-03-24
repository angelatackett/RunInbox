import java.util.Scanner;

public class RunInbox {
	
		private CoveredInbox inbox; //instance of the inbox
		
		// Constructor
		public RunInbox(){
			inbox = new CoveredInbox();
		}
		
		// method to display menu
		public void displayMenu() {
			
			System.out.println("    MENU\n");
			System.out.println("1: Open inbox");
			System.out.println("2: Close inbox");
			System.out.println("3. Add letter to inbox");
			System.out.println("4: Remove letter from inbox");
			System.out.println("5: Check number of letters in inbox");
			System.out.println("\n9: Exit program");
			System.out.println();
		}
		
		
		
		//method to prompt and receive user input
		public void userInput(int c) {
			
			switch(c) {
			
			case 1:		inbox.OpenCover();
						break;
			case 2:		inbox.CloseCover();
						break;
			case 3: 	inbox.AddLetter();
						break;
			case 4:  	inbox.RemoveLetter();
						break;
			case 5:		System.out.println("\nLetters in inbox = "
						+ inbox.getNumLetters());
                        System.out.println();
						break;
			case 9:		if (inbox.isOpen())
							System.out.println("\nInbox must be closed to exit.");
						else
							System.out.println("\nThank you. Goodbye!");
						break;
			default:    System.out.println("Invalid choice.");
			}
		}

		
		// MAIN PROGRAM
		public static void main(String[] args) {
			
			RunInbox run = new RunInbox(); // new instance
			
			Scanner input = new Scanner(System.in);
			int selection = 0;
			
			do {
				
				run.displayMenu();
				
				System.out.print("Enter your selection: ");
				selection = input.nextInt();
				
				run.userInput(selection);
				
				
			} while (selection != 9 || (selection == 9 && run.inbox.isOpen() == true));
			
			input.close();
			
		}
}
