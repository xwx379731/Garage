package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/dest")
public class DESTNSelector {

    @RequestMapping(value = "/axis",method = RequestMethod.GET)
    public String toIndex()
    {
        /**
         *
         */
        return "axis";
    }
}
