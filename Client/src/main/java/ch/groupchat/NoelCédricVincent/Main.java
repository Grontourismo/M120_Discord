package ch.groupchat.NoelCédricVincent;

import ch.groupchat.NoelCédricVincent.Backend.Validator;
import ch.groupchat.NoelCédricVincent.Frontend.UIManager;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        new Data();
        UIManager.primaryStage = primaryStage;
        UIManager.secondaryStage = new Stage();
        UIManager.login();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
