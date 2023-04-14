import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application{


    @Override
    public void start(Stage stage) throws Exception {
        Parent raiz = null;

        raiz = new TesteStackPane();
  
        Scene principal = new Scene(raiz, 800, 600);
  
        stage.setScene(principal);
        stage.setTitle("Gerenciadores de layout");
        stage.show();
    }
    
    public static void main(String[] args) throws Exception {
        launch(args);
    }

       
}
