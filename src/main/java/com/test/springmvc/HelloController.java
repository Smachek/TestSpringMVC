package com.test.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    // Пользователь вводит в адресной строке браузера <адрес сервера>/ и будет попадать этот метод
    // В ответ мы возвращаем пользователю представление /WEB-INF/views/index.html.
    @GetMapping("/")
    public String index() {
        return "index";
    }

    // Пользователь вводит в адресной строке браузера <адрес сервера>/hello и будет попадать этот метод
    // В ответ мы возвращаем пользователю представление /WEB-INF/views/hello_world.html.
    @GetMapping("/hello")
    public String hello() {
        return "hello_world";
    }
}
