package lee.zac;

import javafx.application.Application;
import lee.zac.model.User;
import lee.zac.repository.UserRepo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArsenalAppApplication implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(ArsenalAppApplication.class, args);
	}

	@Autowired
	UserRepo userRepo;

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User("Zacarias", "302-981-7411", "Zeelee93@gmail.com", "soccer");
		User user2 = new User("z", "302-456-2351", "example@email.com", "");
		user2.setLeague("English Premier League");
		user2.setTeamname("Arsenal FC");
		userRepo.save(user1);
		userRepo.save(user2);
	}

//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		return builder.build();
//	}
//
//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		return args -> {
//			Game game = restTemplate.getForObject("http://api.football-data.org/v1/competitions/426/fixtures", Game.class);
//			log.info(game.toString());
//			System.out.println("Hello! " + game.toString());
//		};
//	}

}
