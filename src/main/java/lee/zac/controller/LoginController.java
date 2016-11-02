package lee.zac.controller;

import lee.zac.UserAlreadyExistException;
import lee.zac.model.User;
import lee.zac.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/*** Created by zaclee on 10/29/16. ***/
@RestController
@CrossOrigin
//        (origins = "http://localhost:8100")
public class LoginController {

    @Autowired
    UserRepo userRepo;

    @RequestMapping(value = "/findByUserName/{userName}", method= RequestMethod.GET)
    public User findByUserName(@PathVariable String userName) {
        User temp =  userRepo.findByUserName(userName);
        return temp;
    }

    @RequestMapping(value = "/update", method= RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String updateFavTeam(@RequestBody User user) {
        User update = userRepo.findByUserName(user.getUserName());
        update.setTeam(user.getTeam());
        update.setLeague(user.getLeague());
        update.setLeagueURL(user.getLeagueURL());
        userRepo.save(update);
        return "{\"message\":\"Favorite Team Updated!\"}";
    }

    @RequestMapping(value = "/create" , method=RequestMethod.POST , consumes=MediaType.APPLICATION_JSON_VALUE)
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
