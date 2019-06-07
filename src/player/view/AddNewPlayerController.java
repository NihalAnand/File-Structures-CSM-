package player.view;

import backend.*;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.Calendar;
import player.Main;
import player.playerdetail.PlayerdetailsController;
import player.playerdetail.product;


public class AddNewPlayerController extends Application {
    private Main main;
    //About the Palyer
    @FXML
    private TextField nameField=new TextField();
    
    
     @FXML
    private DatePicker DOBField;
     
    
      @FXML
    private TextField AgeField=new TextField();
     
     
    
        @FXML
    private TextField BirthPlaceField=new TextField();
       
      @FXML
    private TextField HeightField=new TextField();
      
      
      @FXML
      private void showAge(){
          Calendar now= Calendar.getInstance();
          int year=now.get(Calendar.YEAR);
          int birthYear=(DOBField.getValue().getYear());
          int age = year - birthYear;
          AgeField.setText(Integer.toString(age));
      }
      
      //Professional Info
      @FXML
      private TextField RoleField=new TextField();
        
      
        @FXML
      private TextField BattingField=new TextField();
        
        
          @FXML
      private TextField BowlingField=new TextField();
        
          
          @FXML
      private TextField TeamField=new TextField();
         
          
      
      // Stats Tab
       @FXML
       private TextField MatchesField=new TextField();
       
       
       
        @FXML
       private TextField RunsField=new TextField();
       
        
        
         @FXML
       private TextField StrikerateField=new TextField();
       
       
         
          @FXML
       private TextField batavgField=new TextField();
          
         
          
           @FXML
       private TextField WicketsField=new TextField();
          
           
           
            @FXML
       private TextField EconField=new TextField();
            
            
            
            @FXML
       private TextField bowlavgField=new TextField();
           
        
       
       @FXML
     private void gookHome() throws IOException, ClassNotFoundException{
         String name = nameField.getText();
         String agetext=AgeField.getText();
         String birth_place=BirthPlaceField.getText();
         String height=HeightField.getText();
         String bowlavgtext=bowlavgField.getText();
         String econtext=EconField.getText();
         String wicketstext=WicketsField.getText();
         String batavgtext=batavgField.getText();
         String srtext=StrikerateField.getText();
         String runstext=RunsField.getText();
         String matchtext=MatchesField.getText();
         String batting=BattingField.getText();
         String team=TeamField.getText();
         String bowling=BowlingField.getText();
         String role=RoleField.getText();
        
        
        int age=Integer.parseInt(agetext);
        int match=Integer.parseInt(matchtext);
        int runs=Integer.parseInt(runstext);
        Double sr=Double.parseDouble(srtext);
        Double batavg=Double.parseDouble(batavgtext);
        int wickets=Integer.parseInt(wicketstext);
        Double econ=Double.parseDouble(econtext);
        Double bowlavg=Double.parseDouble(bowlavgtext);
        
        
            addPlayer.addplayer(new Player(name,age,birth_place,role,batting,bowling,team,height,match,runs,wickets,sr,econ,batavg,bowlavg));
//           btree.traverse();
//             product roduct=new product(nameField.getText(),BirthPlaceField.getText(),RoleField.getText(),BattingField.getText(),BowlingField.getText(),TeamField.getText(),Integer.parseInt(MatchesField.getText()),Integer.parseInt(RunsField.getText()), (int) Double.parseDouble(StrikerateField.getText()),Double.parseDouble(batavgField.getText()),Integer.parseInt(WicketsField.getText()),Double.parseDouble(EconField.getText()),Double.parseDouble(bowlavgField.getText()));
//             tableview.getItems().add(roduct);
             main.afterokbtn();
    }
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
