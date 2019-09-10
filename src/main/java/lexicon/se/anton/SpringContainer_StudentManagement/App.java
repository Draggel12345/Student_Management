package lexicon.se.anton.SpringContainer_StudentManagement;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lexicon.se.anton.SpringContainer_StudentManagement.data_access.StudentDao;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);
        context.close();
    }
}
