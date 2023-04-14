import javafx.application.Application;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {
    
    public static void main(String[] args) throws Exception{
       launch(args);
    }
    public void start(Stage stage) throws Exception{
        HBox h = new HBox();
        Slider s = new Slider();
        s.setPrefSize(500, 200);
        s.setMin(25);
        s.setMax(250);
        s.setValue(125);
        s.setShowTickLabels(true);
        s.setShowTickMarks(true);
        Label lb = new Label("Value: "+s.getValue());
        //fara com que o value mudara em tempo real
        s.valueProperty().addListener(new ChangeListener<Number>(){
            public void changed(ObservableValue<? extends Number> observable, Number ol, Number n){
                lb.setText("Value = "+(int)s.getValue());
            }
        });

        h.getChildren().addAll(s, lb);
        //dentro da cena tera o hbox que contem o slider e o label
        Scene sc = new Scene(h, 600, 400);
        stage.setScene(sc);
        stage.setTitle("Slider JavaFX");
        stage.show();

    }
   
}
