package cm.bridgelabz.MyGreetingApp.service;

import cm.bridgelabz.MyGreetingApp.dto.UserDto;
import cm.bridgelabz.MyGreetingApp.model.User;
import cm.bridgelabz.MyGreetingApp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GreetingAppService {
    @Autowired
    private GreetingRepository greetingRepository;

    public String getHelloMessage() {
        return "Hello World";
    }

    public String getCustomMessage(UserDto userDto) {
        User user = new User();
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.map(userDto, user);
        greetingRepository.save(user);
        return ("Hello " + user.getFirstName() + " " + user.getLastName());
    }

    private class ModelMapper {
        public void map(UserDto userDto, User user) {
        }
    }
}
