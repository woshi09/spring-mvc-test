package com.spring.test.controller;

import com.spring.test.model.Person;
import com.spring.test.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Created by xinyuangui on 15/8/22.
 */
@Controller
@RequestMapping("/service/hello")
public class HelloController {
    @Autowired
    HelloService helloService;


    @RequestMapping(value = "submit", method = RequestMethod.POST)
    public Object submit(@RequestParam("name") String name, Model model) {
        Person person = new Person();
        person.setName(name);
        person.setAge("18");
        person.setSex("男");
        model.addAttribute("person", person);
        return "person/result";
    }
}
