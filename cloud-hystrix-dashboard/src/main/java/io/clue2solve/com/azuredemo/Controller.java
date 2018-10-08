package io.clue2solve.com.azuredemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayHello() {
        return "Say Hello World!";
    }
}

