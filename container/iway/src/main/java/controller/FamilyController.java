package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.User;

@Controller
@RequestMapping("/family")
public class FamilyController
{
    @RequestMapping("/join")
    public String home(User user)
    {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            System.out.println(objectMapper.writeValueAsString(user));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return "family";
    }


}
