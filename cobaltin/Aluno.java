import java.util.Date;

public class Aluno extends Usuario{
    protected String matricula;
    protected Date ingresso;
    protected Aluno aluno;
    
    public void imprimir(){
        System.out.println("Dados do Aluno: ");
        System.out.println("Nome: "+aluno.getNome());
        System.out.println("Matricula: "+aluno.getMatricula());
        System.out.println("Email: "+aluno.getEmail() );
    }
    public void CalculaCoeficiente(){

    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Date getIngresso() {
        return ingresso;
    }
    public void setIngresso(Date ingresso) {
        this.ingresso = ingresso;
    } 


    
}
