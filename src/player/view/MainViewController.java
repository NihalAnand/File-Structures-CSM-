/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player.view;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import player.Main;

/**
 *
 * @author Nihal Anand
 */
public class MainViewController extends Application {
    private Main main; 
    
    @FXML
    
    private void goHome() throws IOException{
        main.showMainView();
        main.showMainItems();
        
        
//          main.homebutton();
    }
    @FXML
    private void addbtn() throws IOException{
        main.addnewplayerScene();    
    }
    @FXML
    private  void donebtn() throws IOException{
        main.afterdonebtn();
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
   
    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
