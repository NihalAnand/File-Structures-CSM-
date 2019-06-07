package backend;

import java.io.Serializable;

public class pointsTable implements Serializable{
    String team;
    int matches_played;
    int matches_won;
    int matches_lost;
    int matches_drawn;
    int points;
    Double net_runrate;

    public pointsTable(String team) {
        this.team = team;
        this.matches_played = 0;
        this.matches_won = 0;
        this.matches_lost = 0;
        this.matches_drawn = 0;
        this.points = 0;
        this.net_runrate = 0.0;
    }
    
//    @Override
//    public String toString() {
//        return "pointsTable{" + "team=" + team + ", matches_played=" + matches_played + ", matches_won=" + matches_won + ", matches_lost=" + matches_lost + ", matches_drawn=" + matches_drawn + ", points=" + points + ", net_runrate=" + net_runrate + '}';
//    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getMatches_played() {
        return matches_played;
    }

    public void setMatches_played(int matches_played) {
        this.matches_played = matches_played;
    }

    public int getMatches_won() {
        return matches_won;
    }

    public void setMatches_won(int matches_won) {
        this.matches_won = matches_won;
    }

    public int getMatches_lost() {
        return matches_lost;
    }

    public void setMatches_lost(int matches_lost) {
        this.matches_lost = matches_lost;
    }

    public int getMatches_drawn() {
        return matches_drawn;
    }

    public void setMatches_drawn(int matches_drawn) {
        this.matches_drawn = matches_drawn;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Double getNet_runrate() {
        return net_runrate;
    }

    public void setNet_runrate(Double net_runrate) {
        this.net_runrate = net_runrate;
    }
    
    
    
}
