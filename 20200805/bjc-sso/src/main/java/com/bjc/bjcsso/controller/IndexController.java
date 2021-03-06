package com.bjc.bjcsso.controller;

import com.bjc.bjcsso.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

//    @GetMapping("home")
//    public String index() {
//        return "index";
//    }

    @GetMapping("index")
    public String index(Model model) {
        User user = new User();
        user.setUsername("jack");
        user.setPassword("112233");
        user.setHobbies(Arrays.asList(new String[]{"singing", "dancing", "football"}));
        Map<String, String> maps = new HashMap<>();
        maps.put("1", "o");
        maps.put("2", "g");
        maps.put("3", "a");
        maps.put("4", "j");
        user.setSecrets(maps);
        model.addAttribute("user", user);
        return "index";
    }

    @GetMapping("main")
    public String main(Model model) {
        return "main";
    }
}