package students.com.student.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students_details")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id" )
    private int studentId;

    @Column(name ="student_name")
    private String studentName;

    @Column(name = "roll_no")
    private int rollNo;

    @Column(name = "branch")
    private String branch;

    @Column(name = "phone_no")
    private int phoneNo;

    @Column(name = "address")
    private String address;

}
