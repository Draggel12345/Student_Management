package lexicon.se.anton.SpringContainer_StudentManagement.data_access;

import java.util.List;
import java.util.Optional;

import lexicon.se.anton.SpringContainer_StudentManagement.models.Student;

public interface StudentDao {

	Student save(Student student);
	Optional<Student> find(int id);
	List<Student> findAll();
	Boolean delete(int id);
}
