
import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class TesteStackPane extends StackPane{
    
    public TesteStackPane(){
        //criando as caixas
        Caixa c1 = new Caixa().comTexto("1");
        Caixa c2 = new Caixa().comTexto("2");
        Caixa c3 = new Caixa().comTexto("3");
        Caixa c4 = new Caixa().comTexto("4");
        Caixa c5 = new Caixa().comTexto("5");
        Caixa c6 = new Caixa().comTexto("6");

        //adicionando as caixas para serem filhas da stackPane
        getChildren().addAll(c1, c2, c3, c4, c5, c6);

        //capturando o click na tela da scene
        setOnMouseClicked(e -> {
            //se a sena na posicao x for maior que a metade da largura da sena
            //ele chama o filho de indice 0 e passa pra frente se não chama o
            // de indice 5 e volta
            if(e.getSceneX() > getScene().getWidth() / 2){
                getChildren().get(0).toFront();
            }else{
                getChildren().get(5).toBack();
            }

            //criando uma thread parA PASSAR AS cores
            //
            Thread t = new Thread(() -> {
                while(true){
                   try{
                    //DEFININDO TEMPO
                        Thread.sleep(3000);
                        //defini para poder alterar no proximo slide
                        //sem isso não funciona na thread
                        Platform.runLater(() -> {
                            getChildren().get(0).toFront();
                        });
                        
                   }catch(Exception error){
                   }
                }
            });

            t.setDaemon(true);
            t.start();
        });
    }
}
