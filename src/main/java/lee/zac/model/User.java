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
    private String favoriteTeam;

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

    public String getFavoriteTeam() {
        return favoriteTeam;
    }

    public void setFavoriteTeam(String favoriteTeam) {
        this.favoriteTeam = favoriteTeam;
    }
}
