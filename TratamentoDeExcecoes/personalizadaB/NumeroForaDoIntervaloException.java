package TratamentoDeExcecoes.personalizadaB;

public class NumeroForaDoIntervaloException extends Exception {
    
    private String nomeDoAtributo;

    public NumeroForaDoIntervaloException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }
    public String getMessage(){
        return String.format("O atributo %s está fora do Intervalo", nomeDoAtributo);
    }
}
