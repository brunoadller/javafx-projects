package arrayList;

public class Pessoa {
    private String nome;
    private char sexo;
    private Data dtNasc;
    public Pessoa(String nome, char sexo, Data dtNasc) {
        this.nome = nome;
        this.sexo = sexo;
        this.dtNasc = dtNasc;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public Data getDtNasc() {
        return dtNasc;
    }
    public void setDtNasc(Data dtNasc) {
        this.dtNasc = dtNasc;
    }
    
    public void imprimir() throws ExceptionDataError {
        System.out.println("Nome...........:"+getNome());
        System.out.println("Sexo...........:"+getSexo());
        System.out.println("Data Nascimento:"+dtNasc.getDia()+"/"+
        dtNasc.nomeMes(true)
        +"/"+dtNasc.getAno()+"("+dtNasc.calculaIdade()+" anos)");
    }
    

    
}
