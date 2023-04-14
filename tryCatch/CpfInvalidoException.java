public class CpfInvalidoException extends Exception {
    private int codigoDeErro;
    private String cpf;
    public CpfInvalidoException(){
        super("O cpf digitado é invalido!");
        codigoDeErro = 35;
    }
    public void setCpf(String cpf) throws CpfInvalidoException{
        if(cpf.length() == 0){
            throw new CpfInvalidoException();

        }else{
            this.cpf = cpf;
        }
    }
}
