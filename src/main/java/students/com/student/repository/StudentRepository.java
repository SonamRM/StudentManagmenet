package students.com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import students.com.student.model.Students;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Students, Students> {

    Students findByStudentId(long id);
    boolean deleteByStudentId(long id);

}
