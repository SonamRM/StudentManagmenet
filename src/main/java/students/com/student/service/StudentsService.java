package students.com.student.service;

import org.springframework.stereotype.Service;
import students.com.student.model.RegistrationResponsePOJO;
import students.com.student.model.Students;
public interface  StudentsService {
    RegistrationResponsePOJO registerStudent(Students students);
}
