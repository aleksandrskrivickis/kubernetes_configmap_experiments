package bootapp;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.util.*;

@RestController
class Controller {
    @Value("${test_variables:test_variables are not available}")
    private String message0;
    @RequestMapping("/test_variables")
    String getMessage0() {
        return this.message0;
    }

    @Value("${test_variables.title:Title not available}")
    private String message;
    @RequestMapping("/test_variables.title")
    String getMessage() {
        return this.message;
    }

    @Value("${test_variables.GlossDiv:GlossDiv not available}")
    private String message1;
    @RequestMapping("/test_variables.GlossDiv")
    String getMessage1() {
        return this.message1;
    }

    @RequestMapping("/")
    public String index() {
//        HashMap<String, String> map = new HashMap<>();
//        map.put("!content", "This is a demonstration of Spring Cloud Config features.");
//        map.put("Current features", "* Get variable(message) from GitHub based config. http://127.0.0.1:8080/message;\nUpdate Actuator endpoint(config) from GitHub. POST http://127.0.0.1:8080/actuator/refresh");
//        map.put("Config sources", "https://github.com/aleksandrskrivickis/spring_cloud_config_research_config.git; \nDBMS");
//        return map;
        return System.getenv("PATH");
    }

}