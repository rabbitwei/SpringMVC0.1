package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import pojo.User;

@Controller         //添加到 IOC 容器,使用注解不需要继承 Controller 类了
public class UserController {

    //现在获取参数都是直接在业务方法中声明 参数的 对象就行了，不需要继承 AbstractCommandController 类了
    @RequestMapping("/addUser")
    public
    //@ResponseBody     :在访问修饰符和方法名之间， 表示返回json数据
    ModelAndView add(Model user) {
        ModelAndView mav = new ModelAndView("listUser");
        mav.addObject("user", user);
        return mav;
    }

    @RequestMapping("/listUser")
    public String listUser() {
        return "listUser";
    }
}
