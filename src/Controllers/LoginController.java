/**
 * Sample Skeleton for 'LoginMenu.fxml' Controller Class
 */
package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    SceneNavigator sceneNavigator;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="usernameField"
    private TextField usernameField; // Value injected by FXMLLoader

    @FXML // fx:id="gameIdField"
    private TextField gameIdField; // Value injected by FXMLLoader

    @FXML // fx:id="joinButton"
    private Button joinButton; // Value injected by FXMLLoader

    @FXML
    void joinButtonClicked(ActionEvent event) throws IOException {
        String username = usernameField.getText();
        String gameID = gameIdField.getText();

        Parent root = FXMLLoader.load(getClass().getResource("Scenes/LoginMenu.fxml"));
        sceneNavigator.setScene(new Scene(root, 600, 400), "Lobby");

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert usernameField != null : "fx:id=\"usernameField\" was not injected: check your FXML file 'LoginMenu.fxml'.";
        assert gameIdField != null : "fx:id=\"gameIdField\" was not injected: check your FXML file 'LoginMenu.fxml'.";
        assert joinButton != null : "fx:id=\"joinButton\" was not injected: check your FXML file 'LoginMenu.fxml'.";

    }
}

