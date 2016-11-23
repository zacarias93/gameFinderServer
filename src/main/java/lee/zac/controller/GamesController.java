package lee.zac.controller;

import lee.zac.model.Game;
import lee.zac.repository.GameRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/*** Created by zaclee on 11/10/16. ***/

@RestController
@CrossOrigin
public class GamesController {

    @Autowired
    GameRepo gameRepo;

    @RequestMapping(value = "/getGames", method = RequestMethod.PUT, consumes= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String createGames(@RequestBody List<Game> games) {

//        gameRepo.saveAndFlush(temp);

//        System.out.println("Num of games: " + games.size());
//        System.out.println(games);

        for(int i = 0; i<games.size(); i++) {
            Game currentGame = games.get(i);
//            System.out.println(currentGame);
            Game temp = new Game(currentGame.getDate(), currentGame.getStatus(), currentGame.getHomeTeamName(), currentGame.getAwayTeamName());
            gameRepo.saveAndFlush(temp);
        }
        return "success";
    }
}
