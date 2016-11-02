package lee.zac;

import lee.zac.model.User;
import lee.zac.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArsenalAppApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ArsenalAppApplication.class, args);
	}

	@Autowired
	UserRepo userRepo;

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User("Zacarias", "302-981-7411", "Zeelee93@gmail.com", "soccer");
		User user2 = new User("z", "302-456-2351", "example@email.com", "");
		userRepo.save(user1);
		userRepo.save(user2);
	}

}
