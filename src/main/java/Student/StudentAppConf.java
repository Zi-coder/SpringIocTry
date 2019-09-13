package Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"Register"})
public class StudentAppConf {

    public static void main(String[] args) {
        System.out.println("Starting application");
        SpringApplication.run(StudentAppConf.class, args);

    }
}
//to test the application run after launching http://localhost:8080/registration/1?age=12