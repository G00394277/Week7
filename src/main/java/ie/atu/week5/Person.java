package ie.atu.week5;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;

    @Email(message = "Invalid email address")
    private String email;

    @NotBlank(message = "Title cannot be blank")
    @Size(min = 2, max = 3, message = "Title must be between 2 and 3 characters")
    private String title;

    @NotBlank(message = "Employee ID cannot be blank")
    @Size(min = 5, max = 5, message = "Employee ID must be 5 characters")
    private String employeeId;

    @Min(value = 16, message = "Age must be at least 16")
    private int age;

    @NotBlank(message = "Position cannot be blank")
    @Size(min = 2, max = 50, message = "Position must be between 2 and 50 characters")
    private String position;

    @NotBlank(message = "Department cannot be blank")
    @Size(min = 2, max = 50, message = "Department must be between 2 and 50 characters")
    private String department;
}
