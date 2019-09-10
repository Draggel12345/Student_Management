package lexicon.se.anton.SpringContainer_StudentManagement;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class ScannerInputService implements UserInputService {


	@Bean
	public Scanner userInput() {
		return new Scanner(System.in);
	}
	
	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getInt() {
		// TODO Auto-generated method stub
		return 0;
	}

}
