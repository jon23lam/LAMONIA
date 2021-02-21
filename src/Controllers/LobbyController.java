/**
 * Sample Skeleton for 'Lobby.fxml' Controller Class
 */

package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class LobbyController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="lobbyListView"
    private ListView<?> lobbyListView; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert lobbyListView != null : "fx:id=\"lobbyListView\" was not injected: check your FXML file 'Lobby.fxml'.";

    }
}
