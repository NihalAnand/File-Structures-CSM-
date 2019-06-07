/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player.view;

import backend.Schedule;
import backend.addSchedule;
import backend.pointsTable;
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

/**
 * FXML Controller class
 *
 * @author Nihal Anand
 */
public class ScheduleController implements Initializable {
     @FXML
    public TableView<Schedule> scheduleview ;
    @FXML
    private TableColumn<Schedule, String> date;
    @FXML
    private TableColumn<Schedule, String> team1;
    @FXML
    private TableColumn<Schedule, String> vs;
    @FXML
    private TableColumn<Schedule, String> team2;
    @FXML
    private TableColumn<Schedule, String> venue;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
//            addSchedule.addschedule(new Schedule("India","Australia","23/05/2019","Lords"));
//            addSchedule.addschedule(new Schedule("England","Pakistan","24/05/2019","Cardiff"));
            Vector<Schedule> p=addSchedule.showall();
            final ObservableList<Schedule> observableList=FXCollections.observableArrayList(p);
            date.setCellValueFactory(new PropertyValueFactory<>("Date"));
            team1.setCellValueFactory(new PropertyValueFactory<>("Team_a"));
            vs.setCellValueFactory(new PropertyValueFactory<>("Vs"));
            team2.setCellValueFactory(new PropertyValueFactory<>("Team_b"));
            venue.setCellValueFactory(new PropertyValueFactory<>("Venue"));
            scheduleview.setItems(observableList);
        } catch (IOException ex) {
            Logger.getLogger(ScheduleController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ScheduleController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    
    
}
