package lexicon.se.anton.SpringContainer_StudentManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lexicon.se.anton.SpringContainer_StudentManagement.data_access.StudentDao;
import lexicon.se.anton.SpringContainer_StudentManagement.models.Student;
import lexicon.se.anton.SpringContainer_StudentManagement.util.UserInputService;

@Component
public class StudentManagementConsoleImpl implements StudentManagement {

	private UserInputService scannerService;
	private StudentDao studentDao;
	
	@Autowired
	public StudentManagementConsoleImpl(UserInputService scannerService, StudentDao studentDao) {
		this.scannerService = scannerService;
		this.studentDao = studentDao;
	}
	
	@Override
	public Student creat() {
		
		System.out.print("Enter student name: ");
		String name = scannerService.getString();
		System.out.print("Enter student id: ");
		int id = scannerService.getInt();
		
	    return studentDao.save(new Student(id, name));
	}

	@Override
	public Student save(Student student) {
		return studentDao.save(student);
	}

	@Override
	public Optional<Student> find(int id) {
		return studentDao.find(id);	
	}

	@Override
	public Optional<Student> remove(int id) {
		return studentDao.delete(id);
	}

	@Override
	public List<Student> findAll() {
		return studentDao.findAll();
	}

	@Override
	public Student edit(Student student) {
		return student;
	}

}
