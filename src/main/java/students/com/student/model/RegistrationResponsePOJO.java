package students.com.student.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationResponsePOJO {
    public boolean responseStatus;
    public Students students;
    public String statusMessage;
}
