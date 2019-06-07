package backend;

import player.view.*;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Player1 implements Serializable {
    static AtomicInteger count=new AtomicInteger(1);
    int id;
    SimpleStringProperty name;
  SimpleIntegerProperty age;
   SimpleStringProperty birth_place;
   SimpleStringProperty role;
    SimpleStringProperty batting;
   SimpleStringProperty bowling;
    SimpleStringProperty team;
    SimpleStringProperty height;
  SimpleIntegerProperty match;
   SimpleIntegerProperty runs;
   SimpleIntegerProperty wickets;
    SimpleDoubleProperty sr;
    SimpleDoubleProperty econ;
    SimpleDoubleProperty batavg;
    SimpleDoubleProperty bowlavg;

    public Player1(Player p) {
        this.id = count.incrementAndGet();
        this.name = new SimpleStringProperty(p.name);
        this.age = new SimpleIntegerProperty(p.age);
        this.birth_place = new SimpleStringProperty(p.birth_place);
        this.role = new SimpleStringProperty(p.role);
        this.batting = new SimpleStringProperty(p.batting);
        this.bowling = new SimpleStringProperty(p.bowling);
        this.team = new SimpleStringProperty(p.team);
        this.height =new SimpleStringProperty(p.height);
        this.match = new SimpleIntegerProperty(p.match);
        this.runs = new SimpleIntegerProperty(p.runs);
        this.wickets = new SimpleIntegerProperty(p.wickets);
        this.sr = new SimpleDoubleProperty(p.sr);
        this.econ = new SimpleDoubleProperty(p.econ);
        this.batavg = new SimpleDoubleProperty(p.batavg);
        this.bowlavg = new SimpleDoubleProperty(p.bowlavg);
    }

    public static AtomicInteger getCount() {
        return count;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name = new SimpleStringProperty(name);
    }
  public int getAge() {
        return age.get();
    }
    public void setAge(int age) {
        this.age = new SimpleIntegerProperty(age);
   }

    public String getBirth_place() {
        return birth_place.get();
    }

    public void setBirth_place(String birth_place) {
        this.birth_place = new SimpleStringProperty(birth_place);
    }

    public String getRole() {
        return role.get();
    }

    public void setRole(String role) {
        this.role = new SimpleStringProperty(role);
    }

    public String getBatting() {
        return batting.get();
    }

    public void setBatting(String batting) {
        this.batting = new SimpleStringProperty(batting);
    }

    public String getBowling() {
        return bowling.get();
    }

    public void setBowling(String bowling) {
        this.bowling = new SimpleStringProperty(bowling);
    }

    public String getTeam() {
        return team.get();
    }

    public void setTeam(String team) {
        this.team = new SimpleStringProperty(team);
    }

    public String getHeight() {
        return height.get();
    }

    public void setHeight(String height) {
        this.height = new SimpleStringProperty(height);
   }

    public int getMatch() {
        return match.get();
    }

    public void setMatch(int match) {
        this.match = new SimpleIntegerProperty(match);
    }
    
    public int getRuns() {
        return runs.get();
    }

    public void setRuns(int runs) {
        this.runs = new SimpleIntegerProperty(runs);
    }

    public int getWickets() {
        return wickets.get();
    }

    public void setWickets(int wickets) {
        this.wickets = new SimpleIntegerProperty(wickets);
    }

    public Double getSr() {
        return sr.get();
    }

    public void setSr(Double sr) {
        this.sr = new SimpleDoubleProperty(sr);
    }

    public Double getEcon() {
        return econ.get();
    }

    public void setEcon(Double econ) {
        this.econ = new SimpleDoubleProperty(econ);
    }

    public Double getBatavg() {
        return batavg.get();
    }

    public void setBatavg(Double batavg) {
        this.batavg = new SimpleDoubleProperty(batavg);
    }

    public Double getBowlavg() {
        return bowlavg.get();
    }

    public void setBowlavg(Double bowlavg) {
        this.bowlavg = new SimpleDoubleProperty(bowlavg);
    }

    

    
}
