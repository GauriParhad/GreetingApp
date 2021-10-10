package cm.bridgelabz.MyGreetingApp.controller;


import cm.bridgelabz.MyGreetingApp.dto.UserDto;
import cm.bridgelabz.MyGreetingApp.model.User;
import cm.bridgelabz.MyGreetingApp.service.GreetingAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class GreetingController {


    @Autowired
    private GreetingAppService greetingAppService;

    @GetMapping({"", "/", "/hello"})
    public String getWelcomeMessage() {
        return greetingAppService.getHelloMessage();
    }

    @GetMapping("/customMessage")
    public String getCustomMessage(@RequestBody UserDto userDto) {
        return greetingAppService.getCustomMessage(userDto);
    }

    @GetMapping("/find_greeting")
    public User findGreetById(@RequestParam int id) {
        return greetingAppService.getGreetById(id);
    }

    @GetMapping("/get_all_greetings")
    public List<User> findAllGreeting() {
        return greetingAppService.getAllGreet();
    }

    @DeleteMapping("/delete_greet")
    public String deleteGreet(@RequestParam int id) {
        return greetingAppService.deleteGreet(id);
    }

}
