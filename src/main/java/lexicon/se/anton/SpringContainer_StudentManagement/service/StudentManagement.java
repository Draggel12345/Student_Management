package lexicon.se.anton.SpringContainer_StudentManagement.service;

import java.util.List;
import java.util.Optional;

import lexicon.se.anton.SpringContainer_StudentManagement.models.Student;

public interface StudentManagement {

	Student creat();
	Student save(Student student);
	Optional<Student> find(int id);
	Boolean remove(int id);
	List<Student> findAll();
	Student edit(Student student);
}
