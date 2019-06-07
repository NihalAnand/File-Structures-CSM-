/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player.view;

import backend.Player;
import backend.searchName;
import backend.showSquad;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import player.Main;
import player.playerdetail.PlayerdetailsController;

/**
 * FXML Controller class
 *
 * @author Nihal Anand
 */
public class ShowSquadController implements Initializable {
    private Main main;
    static String team1;
    ObservableList<String> teamname1=FXCollections.observableArrayList("India","Australia","South Africa","New Zealand","Pakistan","Srilanka","West Indies","England");
    @FXML
    private ComboBox teamname;
    @FXML
    public TableView<Player> tableview;
    @FXML
    public TableColumn<Player,String> name;
    @FXML
    public TableColumn<Player, String> birth_place;
    @FXML
    public TableColumn<Player, String> role;
    @FXML
    public TableColumn<Player, String> batting;
    @FXML
    public TableColumn<Player, String> bowling;
    @FXML
    public TableColumn<Player, String> team;
    @FXML
    public TableColumn<Player,Integer> match;
    @FXML
    public TableColumn<Player, Integer> runs;
    @FXML
    public TableColumn<Player, Integer> wickets;
    @FXML
    public TableColumn<Player, Double> sr;
    @FXML
    public TableColumn<Player, Double> econ;
    @FXML
    public TableColumn<Player, Double> batavg;
    @FXML
    public TableColumn<Player, Double> bowlavg;

     @FXML
      void gosearchshow() throws IOException, ClassNotFoundException{
         
         this.team1=(String) teamname.getValue();
         main.aftershowsearch();
         
         
         
     }
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       try{
           teamname.setValue("India");
           teamname.setItems(teamname1);
           Vector<Player> p=showSquad.showsquad(team1);
         final ObservableList<Player> observableList=FXCollections.observableArrayList(p);
         System.out.println(observableList);
        name.setCellValueFactory(new PropertyValueFactory<>("Name"));
        birth_place.setCellValueFactory(new PropertyValueFactory<>("Birth_place"));
        role.setCellValueFactory(new PropertyValueFactory<>("Role"));
        batting.setCellValueFactory(new PropertyValueFactory<>("Batting"));
        bowling.setCellValueFactory(new PropertyValueFactory<>("Bowling"));
        team.setCellValueFactory(new PropertyValueFactory<>("Team"));
        match.setCellValueFactory(new PropertyValueFactory<>("Match"));
        runs.setCellValueFactory(new PropertyValueFactory<>("Runs"));
        wickets.setCellValueFactory(new PropertyValueFactory<>("Wickets"));
        sr.setCellValueFactory(new PropertyValueFactory<>("Sr"));
        econ.setCellValueFactory(new PropertyValueFactory<>("Econ"));
        batavg.setCellValueFactory(new PropertyValueFactory<>("Batavg"));
        bowlavg.setCellValueFactory(new PropertyValueFactory<>("Bowlavg"));
        tableview.setItems(observableList);    }
       catch (IOException ex) {
            Logger.getLogger(PlayerdetailsController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PlayerdetailsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

