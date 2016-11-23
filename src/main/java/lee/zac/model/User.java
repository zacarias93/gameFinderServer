package lee.zac.model;

import javax.persistence.*;

/*** Created by zaclee on 10/29/16. ***/

@Entity
@Table(name="arsenalUsers")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String username;
    private String phoneNum;
    private String email;
    private String password;
    private String league;
    private String teamname;
    private String prediction;

    public User(){}

    public User(String name, String phoneNum, String email, String password) {
        this.username =name;
        this.phoneNum=phoneNum;
        this.email = email;
        this.password = password;
    }


    public String getUsername() {
        return username;
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

    public String getTeamname() {
        return teamname;
    }

    public String getLeague() {
        return league;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public void setLeague(String league) {
        this.league = league;
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

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPrediction(String prediction) { this.prediction = prediction; }

    public String getPrediction() { return prediction; }

}
