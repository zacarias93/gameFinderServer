package lee.zac.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*** Created by zaclee on 11/10/16. ***/

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {

    String goalsHomeTeam;
    String goalsAwayTeam;

    public Result() {}

    public String getGoalsHomeTeam() {
        return goalsHomeTeam;
    }

    public void setGoalsHomeTeam(String goalsHomeTeam) {
        this.goalsHomeTeam = goalsHomeTeam;
    }

    public String getGoalsAwayTeam() {
        return goalsAwayTeam;
    }

    public void setGoalsAwayTeam(String goalsAwayTeam) {
        this.goalsAwayTeam = goalsAwayTeam;
    }
}
