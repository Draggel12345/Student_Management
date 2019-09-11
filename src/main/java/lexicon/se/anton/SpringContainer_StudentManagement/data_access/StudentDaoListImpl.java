package lexicon.se.anton.SpringContainer_StudentManagement.data_access;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import lexicon.se.anton.SpringContainer_StudentManagement.models.Student;

@Component
public class StudentDaoListImpl implements StudentDao {

	private List<Student> students = new ArrayList<>();

	@Override
	public Student save(Student student) {
		if(!students.contains(student)) {
			students.add(student);
		}
		
		return student;
	}

	@Override
	public Optional<Student> find(int id) {
		Optional<Student> empty = Optional.empty();
		for (Student student : students) {
			if (student.getId() == id) {
				return Optional.of(student);
			}
		}
		return empty;
	}

	@Override
	public List<Student> findAll() {
		return students;
	}

	@Override
	public Boolean delete(int id) {
		Optional<Student> optional = find(id);
		if (optional.isPresent()) {
			return students.remove(optional.get());
		} else {
			throw new IllegalArgumentException("Student with id: " + id + " could not be found.");
		}
	}

}
