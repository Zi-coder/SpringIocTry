package Register;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.Registration;

@RestController
@RequestMapping( value = "/registration",method = {RequestMethod.GET,RequestMethod.POST})


@Controller("/registration")
public class RegisterController {

    @GetMapping(path = "/{batch}", produces = "application/json")
    public String register(@RequestParam(name = "firstName",required = false) String firstName,
                           @RequestParam(name = "middleName", required = false) String middleName,
                           @RequestParam(name = "lastName", required = false) String lastName,
                           @RequestParam(name = "gender", required = false) String gender,
                           @RequestParam(name ="age",required = true) int age,
                           @PathVariable int batch) {
        return "Registered Bth";
    }

}

