package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.User;

@Controller
public class ReturnJsonController {

    @RequestMapping("/getUser")
    public
    @ResponseBody
    User getUser() {
        User user = new User();
        user.setId(1);
        user.setName("admin");
        user.setPassword("admin");
        return user;
    }
}
