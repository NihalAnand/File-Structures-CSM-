/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player.view;

import backend.pointsTable;
import backend.Player;
import backend.showAll;
import backend.updateTable;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import player.playerdetail.PlayerdetailsController;

/**
 * FXML Controller class
 *
 * @author Nihal Anand
 */
public class PointstableController implements Initializable {
    
     @FXML
    public TableView<pointsTable> viewtable ;

    @FXML
    private TableColumn<pointsTable, String> teams;
    @FXML
    private TableColumn<pointsTable, Integer> matches;
    @FXML
    private TableColumn<pointsTable, Integer> won;
    @FXML
    private TableColumn<pointsTable, Integer> lost;
    @FXML
    private TableColumn<pointsTable, Integer> draw;
    @FXML
    private TableColumn<pointsTable, Integer> points;
    @FXML
    private TableColumn<pointsTable, Double> nrr;

    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
//            updateTable.addtable(new pointsTable("India"));
//        updateTable.addtable(new pointsTable("Australia"));
//        updateTable.addtable(new pointsTable("England"));
//        updateTable.addtable(new pointsTable("West Indies"));
//        updateTable.addtable(new pointsTable("Pakistan"));
//        updateTable.addtable(new pointsTable("New Zealand"));
            Vector<pointsTable> p=updateTable.showall();
                 final ObservableList<pointsTable> observableList=FXCollections.observableArrayList(p);
        teams.setCellValueFactory(new PropertyValueFactory<>("Team"));
        matches.setCellValueFactory(new PropertyValueFactory<>("Matches_played"));
        won.setCellValueFactory(new PropertyValueFactory<>("Matches_won"));
        lost.setCellValueFactory(new PropertyValueFactory<>("Matches_lost"));
        draw.setCellValueFactory(new PropertyValueFactory<>("Matches_drawn"));
        points.setCellValueFactory(new PropertyValueFactory<>("Points"));
        nrr.setCellValueFactory(new PropertyValueFactory<>("Net_runrate"));
        viewtable.setItems(observableList);
        
//  new product("Sanjeet","chattisgarh","batsman","righthand","leg","india",5,450,62,43,43,4,7),
//    new product("kumr","Patna","bowler","lefthand","leg","Nepal",3,150,162,3,43,4,7),
//    new product("Turner","NSW","AllRounder","Righthand","Off","Australia",3,150,162,3,3.7,1,5),
//     new product("Alex Carey","NSW","AllRounder","Righthand","Off","Australia",3,150,162,3,3.7,1,5)
        } catch (IOException ex) {
            Logger.getLogger(PointstableController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PointstableController.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }    
      
    
}
