package life.majiang.community.demos.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
/*
* create by Xiangyu Lin
*
* */
@Controller //允许controller类接收前端请求
public class indexController {
    @GetMapping("/")
    public String index()
    {
        return "index";
    }

}
