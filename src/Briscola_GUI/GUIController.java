/**
 * Sample Skeleton for 'GUI.fxml' Controller Class
 */

package Briscola_GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;



public class GUIController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML
    void handlePlay(ActionEvent event) {
    	
    }

    @FXML
    void handleQuit(ActionEvent event) {

    }

    @FXML
    void handleSettings(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {

    }
}
