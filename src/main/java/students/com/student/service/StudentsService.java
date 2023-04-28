package students.com.student.service;

import org.springframework.stereotype.Service;
import students.com.student.model.RegistrationResponsePOJO;
import students.com.student.model.Students;

import java.util.List;

public interface  StudentsService {
    RegistrationResponsePOJO registerStudent(Students students);
    RegistrationResponsePOJO getStudentDetailsById(long id);

    List<Students> getAllStudents();

    RegistrationResponsePOJO deleteStudentDetailById(long id);

    RegistrationResponsePOJO updatedStudentsDetails(Students students);
}
