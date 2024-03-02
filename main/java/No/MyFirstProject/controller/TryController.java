package No.MyFirstProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TryController {
    @RequestMapping("/try")
    public String trys() {
        return "try.html";
    }
}
