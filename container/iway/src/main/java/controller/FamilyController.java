package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/family")
public class FamilyController
{
    @RequestMapping("/home")
    public String home()
    {
        return "home";
    }


}
