package controller;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.User;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("/family")
public class FamilyController
{

    @RequestMapping("/join")
    @ResponseBody
    public String home(@RequestBody Map<String,Object> data, HttpServletRequest request)
    {
        System.out.println(data);
        ObjectMapper objectMapper = new ObjectMapper();
        try
        {
            data.put("address",request.getRemoteAddr());
            return objectMapper.writeValueAsString(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("/login")
    public String login()
    {
        return "login";
    }


}
