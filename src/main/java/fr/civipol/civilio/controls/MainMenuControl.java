package fr.civipol.civilio.controls;

import jakarta.inject.Inject;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.ResourceBundle;

public class MainMenuControl extends VBox implements AppControl {
    @Inject
    public MainMenuControl() {
        try {
            final var loader = new FXMLLoader();
            loader.setResources(ResourceBundle.getBundle("messages"));
            loader.setLocation(MainMenuControl.class.getResource("/controls/menu.fxml"));
            loader.setController(this);
            loader.setRoot(this);
            loader.load();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
