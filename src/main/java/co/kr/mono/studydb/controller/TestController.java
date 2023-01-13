package co.kr.mono.studydb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/a")
    public String findTest(Model model) {
        model.addAttribute("name", "choe");
        return "result";
    }

}
