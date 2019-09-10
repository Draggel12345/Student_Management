package lexicon.se.anton.SpringContainer_StudentManagement;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lexicon.se.anton.SpringContainer_StudentManagement.config.ComponentScanConfig;
import lexicon.se.anton.SpringContainer_StudentManagement.service.StudentManagement;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        StudentManagement studentManagement = context.getBean(StudentManagement.class);
        
        System.out.println(studentManagement.creat());
        
        
        context.close();
    }
}
