
package backend;

import player.view.*;
import java.io.Serializable;

public class Schedule implements Serializable{
    String team_a;
    String team_b;
    String date;
    String venue;
    String vs;

    public Schedule(String team_a, String team_b, String date, String venue) {
        this.team_a = team_a;
        this.team_b = team_b;
        this.date = date;
        this.venue = venue;
        this.vs="vs";
    }

    public String getTeam_a() {
        return team_a;
    }

    public void setTeam_a(String team_a) {
        this.team_a = team_a;
    }

    public String getTeam_b() {
        return team_b;
    }

    public void setTeam_b(String team_b) {
        this.team_b = team_b;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getVs() {
        return vs;
    }

    public void setVs(String vs) {
        this.vs = vs;
    }

    
    
}
