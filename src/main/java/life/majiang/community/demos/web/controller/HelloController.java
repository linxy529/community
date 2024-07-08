package life.majiang.community.demos.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //允许controller类接收前端请求
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name="name") String name, Model model )
    {
        model.addAttribute("name",name);
        return "hello";
    }

}
