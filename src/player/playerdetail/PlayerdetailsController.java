
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player.playerdetail;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Vector;
import javafx.collections.FXCollections;
import static javafx.collections.FXCollections.observableList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import player.playerdetail.product;
import player.Main;
import backend.*;
import java.io.IOException;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * FXML Controller class
 *
 * @author Nihal Anand
 */
public class PlayerdetailsController implements Initializable {
       private Main main;  

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            Vector<Player> p=showAll.showall();
                 final ObservableList<Player> observableList=FXCollections.observableArrayList(p);
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
        tableview.setItems(observableList);
 // new product("Sanjeet","chattisgarh","batsman","righthand","leg","india",5,450,62,43,43,4,7),
//    new product("kumr","Patna","bowler","lefthand","leg","Nepal",3,150,162,3,43,4,7),
//    new product("Turner","NSW","AllRounder","Righthand","Off","Australia",3,150,162,3,3.7,1,5),
//     new product("Alex Carey","NSW","AllRounder","Righthand","Off","Australia",3,150,162,3,3.7,1,5)
        } catch (IOException ex) {
            Logger.getLogger(PlayerdetailsController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PlayerdetailsController.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }    
    
       @FXML
  public void buttonRemove(ActionEvent actionEvent) throws ClassNotFoundException, IOException{
      ObservableList<Player> allplayer,SingleProduct;
      allplayer=tableview.getItems();
      SingleProduct=tableview.getSelectionModel().getSelectedItems();
      //SingleProduct.forEach(allplayer::remove);
//      ListIterator<Player> iterator=SingleProduct.listIterator();
//       while(iterator.hasNext()){
//           System.out.println((iterator.next().getId()))
//       }
        //System.out.println(SingleProduct.get(0).getId());
        removePlayer.removeplayer(SingleProduct.get(0).getId());
        
      
  
        main.showplayerdetailScene();
    }
  
          
   
    
}
