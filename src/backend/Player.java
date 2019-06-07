package backend;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import javafx.beans.property.SimpleIntegerProperty;

public class Player implements Serializable {
    static AtomicInteger count=new AtomicInteger(1);
    int id;
    String name;
    int age;
    String birth_place;
    String role;
    String batting;
    String bowling;
    String team;
    String height;
    int match;
    int runs;
    int wickets;
    Double sr;
    Double econ;
    Double batavg;
    Double bowlavg;

    public Player(String name, int age, String birth_place, String role, String batting, String bowling, String team, String height, int match, int runs, int wickets, Double sr, Double econ, Double batavg, Double bowlavg) {
        this.id = count.incrementAndGet();
        this.name = name.toUpperCase();
        this.age = age;
        this.birth_place = birth_place;
        this.role = role;
        this.batting = batting;
        this.bowling = bowling;
        this.team = team;
        this.height = height;
        this.match = match;
        this.runs = runs;
        this.wickets = wickets;
        this.sr = sr;
        this.econ = econ;
        this.batavg = batavg;
        this.bowlavg = bowlavg;
    }

    public static AtomicInteger getCount() {
        return count;
    }

    public static void setCount(AtomicInteger count) {
        Player.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirth_place() {
        return birth_place;
    }

    public void setBirth_place(String birth_place) {
        this.birth_place = birth_place;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getBatting() {
        return batting;
    }

    public void setBatting(String batting) {
        this.batting = batting;
    }

    public String getBowling() {
        return bowling;
    }

    public void setBowling(String bowling) {
        this.bowling = bowling;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getMatch() {
        return match;
    }

    public void setMatch(int match) {
        this.match = match;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public Double getSr() {
        return sr;
    }

    public void setSr(Double sr) {
        this.sr = sr;
    }

    public Double getEcon() {
        return econ;
    }

    public void setEcon(Double econ) {
        this.econ = econ;
    }

    public Double getBatavg() {
        return batavg;
    }

    public void setBatavg(Double batavg) {
        this.batavg = batavg;
    }

    public Double getBowlavg() {
        return bowlavg;
    }

    public void setBowlavg(Double bowlavg) {
        this.bowlavg = bowlavg;
    }

//    @Override
//    public String toString() {
//        return "Player{" + "id=" + id + ", name=" + name + ", age=" + age + ", birth_place=" + birth_place + ", role=" + role + ", batting=" + batting + ", bowling=" + bowling + ", team=" + team + ", height=" + height + ", match=" + match + ", runs=" + runs + ", wickets=" + wickets + ", sr=" + sr + ", econ=" + econ + ", batavg=" + batavg + ", bowlavg=" + bowlavg + '}';
//    }

   
}
