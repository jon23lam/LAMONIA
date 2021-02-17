
import Controllers.SceneNavigator;
import Gateways.SceneViewInitializer;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Game {

    private SceneViewInitializer sceneViewInitializer;


    public Game(Stage applicationStage) throws IOException {
        sceneViewInitializer = getSceneInitializer(applicationStage);
    }

    public void run() {
        SceneNavigator sceneNavigator = sceneViewInitializer.getSceneNavigator();
        sceneNavigator.showGUI();
    }

    private SceneViewInitializer getSceneInitializer(Stage primaryStage) throws IOException {
        sceneViewInitializer = new SceneViewInitializer(primaryStage);
        return sceneViewInitializer;

    }



}
