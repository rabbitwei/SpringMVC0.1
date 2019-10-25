package controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest var1, HttpServletResponse var2) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index.jsp");
        mav.addObject("message", "hello spring mvc");
        return mav;
    }

}
