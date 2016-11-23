package lee.zac.repository;

import lee.zac.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import javax.persistence.Id;
import java.util.List;

/*** Created by zaclee on 10/29/16. ***/

public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(@Param("username") String username);


}
