/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player.view;

import backend.Player;
import backend.searchName;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Rishabh Khemka
 */
public class TestingnewplayersearchController implements Initializable {

    @FXML
    private TextField nameField;
    @FXML
    private TextField BirthPlaceField;
    @FXML
    private TextField HeightField;
    @FXML
    private TextField RoleField;
    @FXML
    private TextField BattingField;
    @FXML
    private TextField BowlingField;
    @FXML
    private TextField TeamField;
    @FXML
    private TextField MatchesField;
    @FXML
    private TextField RunsField;
    @FXML
    private TextField StrikerateField;
    @FXML
    private TextField batavgField;
    @FXML
    private TextField WicketsField;
    @FXML
    private TextField EconField;
    @FXML
    private TextField bowlavgField;

    /**
     * Initializes the controller class.
     */
    static String team;
    public static void setting(String team1)
    {
        TestingnewplayersearchController.team=team1;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Player p=searchName.searchname(TestingnewplayersearchController.team);
            nameField.setText(p.getName());
            BirthPlaceField.setText(p.getBirth_place());
            HeightField.setText(p.getHeight());
            RoleField.setText(p.getRole());
            BattingField.setText(p.getBatting());
            BowlingField.setText(p.getBowling());
            TeamField.setText(p.getTeam());
            MatchesField.setText(""+p.getMatch());
            RunsField.setText(""+p.getRuns());        
            StrikerateField.setText(""+p.getSr());        
            batavgField.setText(""+p.getBatavg());        
            WicketsField.setText(""+p.getWickets());
            EconField.setText(""+p.getEcon());        
            bowlavgField.setText(""+p.getBowlavg());             
        } catch (IOException ex) {
            Logger.getLogger(TestingnewplayersearchController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestingnewplayersearchController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
}
