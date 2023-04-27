package students.com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import students.com.student.model.Students;

@Repository
public interface StudentRepository extends JpaRepository<Students, Students> {
}
