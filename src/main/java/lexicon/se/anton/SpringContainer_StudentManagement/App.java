package lexicon.se.anton.SpringContainer_StudentManagement;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        UserInputService userInput = context.getBean(UserInputService.class);
        
        System.out.println(userInput.getString());
        
        context.close();
    }
}
