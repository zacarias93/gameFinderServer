package lee.zac.model;

import javax.persistence.*;

/*** Created by zaclee on 10/29/16. ***/

@Entity
@Table(name="arsenalUsers")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String userName;
    private String phoneNum;
    private String email;
    private String password;
    private String league;
    private String team;
    private String leagueURL;

    public User(){}

    public User(String name, String phoneNum, String email, String password) {
        this.userName =name;
        this.phoneNum=phoneNum;
        this.email = email;
        this.password = password;
    }


    public String getUserName() {
        return userName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getTeam() {
        return team;
    }

    public String getLeague() {
        return league;
    }

    public String getLeagueURL() {
        return leagueURL;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public void setLeagueURL(String leagueURL) {
        this.leagueURL = leagueURL;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
