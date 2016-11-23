package lee.zac.controller;

import lee.zac.UserAlreadyExistException;
import lee.zac.model.User;
import lee.zac.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    UserRepo userRepo;

    @RequestMapping(value = "/findByUserName/{username}", method= RequestMethod.GET)
    public User findByUserName(@PathVariable String username) {
        User user =  userRepo.findByUsername(username);
        return user;
    }

    @RequestMapping(value = "/update", method= RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String updateUser(@RequestBody User user) {
        User update = userRepo.findByUsername(user.getUsername());
        update.setTeamname(user.getTeamname());
        update.setLeague(user.getLeague());
        update.setPrediction(user.getPrediction());
        userRepo.save(update);
        return "{\"message\":\"Favorite League & Team Updated!\"}";
    }

    @RequestMapping(value = "/create" , method=RequestMethod.POST , consumes=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String createUser(@RequestBody User request) {
        try {
            if(userRepo.findByUsername(request.getUsername()) != null) {
                throw new UserAlreadyExistException();
            }
            userRepo.saveAndFlush(new User(request.getUsername(), request.getPhoneNum(), request.getEmail(), request.getPassword()));
        } catch (UserAlreadyExistException e) {

            return "{\"message\":\"User already exists!\"}";
        }
        return "{\"message\":\"Success!\"}";
    }
}
