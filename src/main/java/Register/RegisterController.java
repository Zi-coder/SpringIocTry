package Register;

import dao.Register;
import domain.AssignSection;
import domain.Name;
import domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.Registration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping( value = "/registration",method = {RequestMethod.GET,RequestMethod.POST})


@Controller("/registration")
public class RegisterController {

    private Register register;

    @GetMapping(path = "/{batch}", produces = "application/json")
    public String register(@RequestParam(name = "firstName",required = false) String firstName,
                           @RequestParam(name = "middleName", required = false) String middleName,
                           @RequestParam(name = "lastName", required = false) String lastName,
                           @RequestParam(name = "gender", required = false) String gender,
                           @RequestParam(name ="age",required = true) int age,
                           @PathVariable int batch) {
        return "Registered Bth";
    }
    @PostMapping(path = "/addStudent", produces = "application/json")
    public int register(@RequestBody Student student) {
       // LOGGER.info("Post registration service hit!!");
        return register.addStudent(student);
    }

    @GetMapping(path = "/list", produces = "application/json")
    public List getAllStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(new Name("Sandeep")));
        students.add(new Student(new Name("Raj")));
        students.add(new Student(new Name("Gaurav")));
        students.add(new Student(new Name("Dhiraj")));

        return students;
    }


    @PostMapping("section")
    public int assignSection(@RequestBody AssignSection assignSection) {
        //LOGGER.info("rollno: " + assignSection.getRollNo() + "\n section: "
              //  + assignSection.getSection() );
        return assignSection.getSection();
    }
}

