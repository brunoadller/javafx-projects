import java.beans.EventHandler;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application{
    public void start(Stage stage){
        BorderPane bp = new BorderPane();

        PieChart pc = new PieChart();
        pc.setTitle("Coronavirus statistics COVID-19");
        //o observable List cria uma lista que sera do tipo grafico de pizza
        //pq o PieChart cria esse tipo de grafico
        ObservableList <PieChart.Data> ol = FXCollections.observableArrayList(
            new PieChart.Data("USA", 336891),
            new PieChart.Data("spain", 131646),
            new PieChart.Data("Italy", 128948),
            new PieChart.Data("Germany", 100132),
            new PieChart.Data("France", 92839),
            new PieChart.Data("China", 81708),
            new PieChart.Data("Iran", 582226),
            new PieChart.Data("United Kingdom", 47806),
            new PieChart.Data("Turkey", 27069),
            new PieChart.Data("Switzerland", 21176)

        );
        
        pc.setData(ol);
        bp.setCenter(pc);

        //fade transition ira fazer uma abertura a partir do tempo determinado
        //esta esta fazendo por tres segundos a abertura lentamente
        FadeTransition f = new FadeTransition(Duration.seconds(8), pc);
        f.setFromValue(0);
        f.setToValue(1);
        f.play();

        
        
        Scene sc = new Scene(bp,800, 600);
        stage.setScene(sc);
        stage.setTitle("Coronavirus Statística");
        stage.show();
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
