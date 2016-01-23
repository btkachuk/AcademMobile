import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;


public class MainApp extends Application {
    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage=primaryStage;
        this.primaryStage.setTitle("Easy Academic Mobility");
        initRootLayout();
        showLogin();
    }

    public void initRootLayout(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("RootLayout.fxml"));
            rootLayout = (BorderPane)loader.load();
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  public void showLogin() {

     try{ FXMLLoader loader = new FXMLLoader();
      loader.setLocation(MainApp.class.getResource("Login.fxml"));
      AnchorPane login = (AnchorPane) loader.load();

      rootLayout.setCenter(login);} catch (IOException e){
         System.out.println("io error");
     }
  }


    public static void main(String[] args) {
        launch(args);
    }
}
