package Controllers;


import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import java.io.File;
import java.io.IOException;
import java.net.URL;

public class SceneNavigator {
    private final Stage applicationStage;

    public SceneNavigator(Stage applicationStage) throws IOException {
        this.applicationStage = applicationStage;
        URL url = new File("src/Scenes/LoginMenu.fxml").toURI().toURL();
        FXMLLoader loader = new FXMLLoader(url);
        Scene scene = new Scene(loader.load());
        this.applicationStage.setTitle("Login Menu");
        this.applicationStage.setScene(scene);
    }

    public void setScene(Scene scene, String title){
        applicationStage.setTitle(title);
        applicationStage.setScene(scene);
    }

    public void showGUI() {
        applicationStage.show();
    }
}