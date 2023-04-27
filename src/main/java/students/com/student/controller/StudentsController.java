package students.com.student.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import students.com.student.model.RegistrationResponsePOJO;
import students.com.student.model.Students;
import students.com.student.service.StudentsService;

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


    @GetMapping(path = "/{studentId}")
    public ResponseEntity<Students> getStudent(@PathVariable int studentId) {
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @DeleteMapping(path = "/{studentsId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int studentsId) {

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(path = "/update")
    public ResponseEntity<Students> updateStudentDetails(@RequestBody Students students) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
