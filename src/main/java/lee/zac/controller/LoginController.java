package lee.zac.controller;

import lee.zac.UserAlreadyExistException;
import lee.zac.model.User;
import lee.zac.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/*** Created by zaclee on 10/29/16. ***/
@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    UserRepo userRepo;

    @RequestMapping(value="/test", method= RequestMethod.GET)
    public String test() {
        return "Hello World!";
    }

    @RequestMapping(value = "/findByEmail/{userName}", method= RequestMethod.GET)
    public User findByEmail(@PathVariable String userName) {
        User temp =  userRepo.findByUserName(userName);
        return temp;
    }

    @RequestMapping(value = "/create" , method= RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String createUser(@RequestBody User request) {
        try {
            if(userRepo.findByUserName(request.getUserName()) != null) {
                throw new UserAlreadyExistException();
            }
            userRepo.saveAndFlush(new User(request.getUserName(), request.getPhoneNum(), request.getEmail(), request.getPassword()));
        } catch (UserAlreadyExistException e) {

            return "{\"message\":\"User already exists!\"}";
        }
        return "{\"message\":\"Success!\"}";
    }

}
