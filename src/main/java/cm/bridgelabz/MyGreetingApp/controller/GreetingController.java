package cm.bridgelabz.MyGreetingApp.controller;


import cm.bridgelabz.MyGreetingApp.service.GreetingAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return greetingService.getCustomMessage(userDto);
    }

}
