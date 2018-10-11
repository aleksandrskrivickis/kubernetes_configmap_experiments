package bootapp;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.util.*;

@RestController
class Controller {
    @Value("${customnest.customvar:not available}")
    private String message;
    @RequestMapping("/env_var")
    String getMessage() {
        return this.message;
    }

    @Value("${customnest.customvar1:not available}")
    private String message1;
    @RequestMapping("/env_var1")
    String getMessage1() {
        return this.message;
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