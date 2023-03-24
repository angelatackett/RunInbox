public class CoveredInbox {
	
	private boolean open;
	private int numLetters;
	
	
	// get methods provide interface and do validation as needed
	public boolean isOpen() {
			return open;
	}
		
	public int getNumLetters() {
		if (!open)
			System.out.println("\nInbox is closed - cannot check number of letters.");
		return numLetters;
	}
	
	// no set methods because funCtional methods set values
	
	// method to open cover on the inbox
	public void OpenCover() {
		if (open)
			System.out.println("\nInbox is already open.");
		else
			open = true;
	}
	
	public void CloseCover() {
		if (!open)
				System.out.println("\nInbox is already closed.");
		else
			open = false;		
	}
	
	public void AddLetter() {
		if (!open)
			System.out.println("\nCannot add letter - inbox is closed.");
		else
			numLetters++;
	}
	
	public void RemoveLetter() {
		if (!open)
			System.out.println("\nCannot remove letter - inbox is closed.");
		else if (numLetters == 0)
			System.out.println("\nCannot remove letter from empty inbox.");
		else
			numLetters--;
	}

}