/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player.view;

import backend.updateTable;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import player.Main;

/**
 * FXML Controller class
 *
 * @author Nihal Anand
 */public class EditpointstableController extends Application {
    private Main main; 
    
    @FXML
    private TextField team1Field=new TextField();
    
    @FXML
    private TextField team2Field=new TextField();
    
    @FXML
    private TextField resultField=new TextField();

    @FXML
    private TextField nrrField=new TextField();

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 
    

    /**
     * Initializes the controller class.
     */
     @FXML
     private void gopointstable() throws IOException, ClassNotFoundException {
        String team1=team1Field.getText();
        String team2=team2Field.getText();
        String result=resultField.getText();
        Double nrr=Double.parseDouble(nrrField.getText());
        
        updateTable.updatetable(team1, team2, result, nrr);
        
        main.showpointstableScene();
    }    
    
}
