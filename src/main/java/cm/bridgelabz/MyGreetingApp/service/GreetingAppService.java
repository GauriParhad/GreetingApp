package cm.bridgelabz.MyGreetingApp.service;

import cm.bridgelabz.MyGreetingApp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GreetingAppService {
    @Autowired
    private GreetingRepository greetingRepository;

    public String getHelloMessage() {
        return "Hello World";
    }
}
