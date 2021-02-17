package Gateways;

import Controllers.SceneNavigator;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneViewInitializer {

    private final SceneNavigator sceneNavigator;

    public SceneViewInitializer(Stage applicationStage) throws IOException {
        this.sceneNavigator = new SceneNavigator(applicationStage);
    }

    public SceneNavigator getSceneNavigator() {
        return sceneNavigator;
    }
}
