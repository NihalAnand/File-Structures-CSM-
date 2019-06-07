/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Nihal Anand
 */
public class Main extends Application {
    private static Stage primaryStage;
    private static BorderPane mainLayout;
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        this.primaryStage=primaryStage;
        this.primaryStage.setTitle("CWC APP");
        showMainView();
        showMainItems();
       
    }
    
    public static void showMainView() throws IOException{
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/MainView.fxml"));
        mainLayout=loader.load();
        Scene scene= new Scene(mainLayout,900,700);
        primaryStage.setScene(scene);
        primaryStage.show();
//        primaryStage.setMaximized(true);
                
    }
   public static void showMainItems() throws IOException{
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/MainItems.fxml"));
        BorderPane mainItems=loader.load();
        mainLayout.setCenter(mainItems);
//        Scene scene= new Scene(mainLayout,800,600);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//        primaryStage.setMaximized(true);
//        
       
        
        
    }
    
  public static void showplayerdetailScene() throws IOException{
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(Main.class.getResource("playerdetail/playerdetails.fxml"));
        BorderPane playerdetails= loader.load();
        mainLayout.setCenter(playerdetails);
    } 
//  public static void showAddStage() throws IOException{
//      FXMLLoader loader= new FXMLLoader();
//      loader.setLocation(Main.class.getResource("view/AddNewPlayer.fxml"));
//      BorderPane addNewPlayer= loader.load();
//      
//      Stage addDialogStage = new Stage();
//      addDialogStage.setTitle("Add New Player");
//      addDialogStage.initModality(Modality.WINDOW_MODAL);
//      addDialogStage.initOwner(primaryStage);
//      
//      Scene scene= new Scene(addNewPlayer);
//      addDialogStage.setScene(scene);
//      addDialogStage.showAndWait();
//      
//        
//  }
  
  public static void addnewplayerScene() throws IOException{
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/AddNewPlayer.fxml"));
        BorderPane addnewplayer= loader.load();
        mainLayout.setCenter(addnewplayer);
  }
    public static void afterokbutton() throws IOException{
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(Main.class.getResource("playerdetail/playerdetails.fxml"));
        BorderPane playerdetails= loader.load();
        mainLayout.setCenter(playerdetails);
        
       
    } 
    
        public static void afterdonebtn() throws IOException{
             FXMLLoader loader= new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/editpointstable.fxml"));
        AnchorPane editpointstable= loader.load();
        mainLayout.setCenter(editpointstable);
        }
          public static void afterokbtn() throws IOException{
             FXMLLoader loader= new FXMLLoader();
        loader.setLocation(Main.class.getResource("playerdetail/playerdetails.fxml"));
        BorderPane playerdetails= loader.load();
        mainLayout.setCenter(playerdetails);
        }
             
        public static void showpointstableScene() throws IOException {
                 
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/pointstable.fxml"));
        BorderPane pointstable= loader.load();
        mainLayout.setCenter(pointstable);
    }
        public static void scheduletableScene() throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/schedule.fxml"));
        BorderPane scheduletable= loader.load();
        mainLayout.setCenter(scheduletable);
        
    }
         public static void showScene() throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/ShowSquad.fxml"));
        AnchorPane show= loader.load();
        mainLayout.setCenter(show);
        
    }
         public static void aftershowsearch() throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/ShowSquad.fxml"));
        AnchorPane show1= loader.load();
        mainLayout.setCenter(show1);
       
        
    }
     public static void aftersearch() throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/Search.fxml"));
        AnchorPane aftersearch= loader.load();
        mainLayout.setCenter(aftersearch);
     }
     public static void afterplayersearch() throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/AfterSearch.fxml"));
        BorderPane aftersearch1= loader.load();
        mainLayout.setCenter(aftersearch1);
     }
//     public static void homebutton() throws IOException{
//          FXMLLoader loader= new FXMLLoader();
//        loader.setLocation(Main.class.getResource("view/MainItems.fxml"));
//        loader.setLocation(Main.class.getResource("view/MainView.fxml"));
//        BorderPane aftersearch1= loader.load();
//        mainLayout.setCenter(aftersearch1);
//     }
     
    public static void main(String[] args) {
        launch(args);
    }

    
    
}
