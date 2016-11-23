package lee.zac.repository;

import lee.zac.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

/*** Created by zaclee on 11/10/16. ***/

public interface GameRepo extends JpaRepository <Game, Long> {


}
