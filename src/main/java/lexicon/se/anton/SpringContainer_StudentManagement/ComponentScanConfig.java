package lexicon.se.anton.SpringContainer_StudentManagement;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lexicon.se.anton.SpringContainer_StudentManagement")
public class ComponentScanConfig {

	@Bean 
	public Scanner scanner() {
		return new Scanner(System.in);
	}
	
	
}
