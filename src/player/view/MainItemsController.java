/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player.view;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import player.Main;

/**
 *
 * @author Nihal Anand
 */
public class MainItemsController extends Application {
    private Main main;  
    
    public void goplayerdetail() throws IOException{
        main.showplayerdetailScene();
    }
    
    public void gopointstable() throws IOException{
        main.showpointstableScene();
    }
    
    public void goscheduletable() throws IOException{
        main.scheduletableScene();
    }
    public void goshowtable() throws IOException{
        main.showScene();
    }
      public void gosearch() throws IOException{
//         this.team1=teamname.getText();
         main.aftersearch();
      }
    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}