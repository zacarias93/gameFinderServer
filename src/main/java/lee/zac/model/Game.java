package lee.zac.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/*** Created by zaclee on 11/10/16. ***/

@Entity
@Table(name="games")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    String date;
    String status;
    String homeTeamName;
    String awayTeamName;
//    Result result;
//    Odds odds;

    public Game() {}

    public Game(String date, String status, String homeTeamName, String awayTeamName) {
        this.date = date;
        this.status = status;
        this.homeTeamName = homeTeamName;
        this.awayTeamName = awayTeamName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

//    public Result getResult() {
//        return result;
//    }
//
//    public void setResult(Result result) {
//        this.result = result;
//    }
//
//    public Odds getOdds() {
//        return odds;
//    }
//
//    public void setOdds(Odds odds) {
//        this.odds = odds;
//    }

    public String toString() {
        return "Date: " + date + " HomeTeam: " + homeTeamName + " AwayTeam: " + awayTeamName + " Status: " + status;
    }

}
