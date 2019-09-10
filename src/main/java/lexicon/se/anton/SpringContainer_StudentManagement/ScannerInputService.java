package lexicon.se.anton.SpringContainer_StudentManagement;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class ScannerInputService implements UserInputService {

	private Scanner scanner;
	
	public ScannerInputService(Scanner scanner) {
		this.scanner = scanner;
	}
	
	@Override
	public String getString() {
		return scanner.nextLine();
	}

	@Override
	public int getInt() {
		return scanner.nextInt();
	}

}
