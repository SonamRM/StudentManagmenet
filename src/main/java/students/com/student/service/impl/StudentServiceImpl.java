package students.com.student.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import students.com.student.model.RegistrationResponsePOJO;
import students.com.student.model.Students;
import students.com.student.repository.StudentRepository;
import students.com.student.service.StudentsService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentsService {

    private final StudentRepository studentRepository;

    @Override
    public RegistrationResponsePOJO registerStudent(Students students) {
        //getting student by student id
        Students student = studentRepository.findByStudentId(students.getStudentId());
        if (student == null) { //check if student is already exist
            Students studentResponse = studentRepository.save(students);
            if (studentResponse != null) {
                return new RegistrationResponsePOJO(true, students, "Registration Successful.");
            }
        }
        //giving response if student already exist
        return new RegistrationResponsePOJO(false, null, "Student already exist by this id: " + students.getStudentId());
    }

    @Override
    public RegistrationResponsePOJO getStudentDetailsById(long id) {
        Students student = studentRepository.findByStudentId(id); //checking student is there in database or not
        if (student != null) {
            return new RegistrationResponsePOJO(true, student, null);
        }
        return new RegistrationResponsePOJO(false, null, "Student not existing with ID: "+id);

    }

    @Override
    public List<Students> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public RegistrationResponsePOJO deleteStudentDetailById(long id) {
        //getting student by student id
        Students student = studentRepository.findByStudentId(id);
        if (student != null) { //check if student is exist or not
            boolean isDelete = studentRepository.deleteByStudentId(id);
            if (isDelete == true) {
                return new RegistrationResponsePOJO(true, null, "Student details deleted successfully.");
            }
        }
        //giving response if student already exist
        return new RegistrationResponsePOJO(false, null, "Student not existing with ID: "+id);
    }

    @Override
    public RegistrationResponsePOJO updatedStudentsDetails(Students students) {
        //getting student by student id
        Students student = studentRepository.findByStudentId(students.getStudentId());
        if (student != null) { //check if student is exist or not
            Students studentResponse = studentRepository.save(students);
            if (studentResponse != null) {
                return new RegistrationResponsePOJO(true, null, "Student details successfully updated.");
            }
        }
        //giving response if student already exist
        return new RegistrationResponsePOJO(false, null, "Student not existing with ID: "+students.getStudentId());
    }
}
