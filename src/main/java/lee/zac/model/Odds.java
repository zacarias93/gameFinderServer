package lee.zac.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*** Created by zaclee on 11/10/16. ***/

@JsonIgnoreProperties(ignoreUnknown = true)
public class Odds {

    String homeWin;
    String draw;
    String awayWin;

    public Odds(){}

    public String getHomeWin() {
        return homeWin;
    }

    public void setHomeWin(String homeWin) {
        this.homeWin = homeWin;
    }

    public String getDraw() {
        return draw;
    }

    public void setDraw(String draw) {
        this.draw = draw;
    }

    public String getAwayWin() {
        return awayWin;
    }

    public void setAwayWin(String awayWin) {
        this.awayWin = awayWin;
    }
}
