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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import player.Main;

/**
 * FXML Controller class
 *
 * @author Nihal Anand
 */
public class SearchController implements Initializable {
    private Main main;
    static String player1;
    @FXML
    private TextField playername;
    @FXML
      void searchpressed() throws IOException, ClassNotFoundException{
         this.player1=playername.getText();
         Player p=searchName.searchname(this.player1);
         if(p==null){
             System.out.println("YAHA error display karna hai");
             Alert errorAlert = new Alert(AlertType.ERROR);
            errorAlert.setHeaderText("Player not found");
            errorAlert.setContentText("The details of the player is not yet added");
            errorAlert.showAndWait();
         }
         else{
         TestingnewplayersearchController.setting(player1);
         main.afterplayersearch();
         }
      }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
