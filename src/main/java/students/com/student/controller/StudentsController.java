package students.com.student.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import students.com.student.model.RegistrationResponsePOJO;
import students.com.student.model.Students;
import students.com.student.service.StudentsService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/student")
@RequiredArgsConstructor
public class StudentsController {
    private final StudentsService studentsService;

    @PostMapping(path = "/registerStudents")
    public ResponseEntity<RegistrationResponsePOJO> registerStudent(@RequestBody Students student) {
        RegistrationResponsePOJO registrationResponsePOJO = studentsService.registerStudent(student);
        return ResponseEntity.ok().body(registrationResponsePOJO);

    }


    @GetMapping(path = "/getStudentById/{studentId}")
    public ResponseEntity<RegistrationResponsePOJO> getStudent(@PathVariable int studentId) {
        RegistrationResponsePOJO registrationResponsePOJO = studentsService.getStudentDetailsById(studentId);
        return ResponseEntity.ok().body(registrationResponsePOJO);

    }

    @DeleteMapping(path = "/deleteStudentById/{studentsId}")
    public ResponseEntity<RegistrationResponsePOJO> deleteStudent(@PathVariable int studentsId) {
        RegistrationResponsePOJO registrationResponsePOJO = studentsService.deleteStudentDetailById(studentsId);
        return ResponseEntity.ok().body(registrationResponsePOJO);

    }

    @PutMapping(path = "/update")
    public ResponseEntity<RegistrationResponsePOJO> updateStudentDetails(@RequestBody Students students) {
        RegistrationResponsePOJO registrationResponsePOJO =  studentsService.updatedStudentsDetails(students);
        return ResponseEntity.ok().body(registrationResponsePOJO);

    }

    @PutMapping(path = "/getAllStudents")
    public ResponseEntity<List<Students>> getAllStudents() {
        return ResponseEntity.ok().body(studentsService.getAllStudents());

    }
}
