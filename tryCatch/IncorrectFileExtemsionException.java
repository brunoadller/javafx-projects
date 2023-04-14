public class IncorrectFileExtemsionException extends RuntimeException {
    private int codigoErro;
    public IncorrectFileExtemsionException(String errorMessage){
        super(errorMessage);
    }
}
