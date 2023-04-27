package students.com.student.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import students.com.student.model.RegistrationResponsePOJO;
import students.com.student.model.Students;
import students.com.student.repository.StudentRepository;
import students.com.student.service.StudentsService;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentsService {

    private final StudentRepository studentRepository;

    @Override
    public RegistrationResponsePOJO registerStudent(Students students) {
        Students studentResponse = studentRepository.save(students);
        if(studentResponse != null){
            return new RegistrationResponsePOJO(students );
        }
        return new RegistrationResponsePOJO(students);
    }
}
