package TratamentoDeExcecoes;

public class Aluno {
    public String nome;
    public Double nota;
    
    public Aluno(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getNota() {
        return nota;
    }
    public void setNota(Double nota) {
        this.nota = nota;
    }
    

}
