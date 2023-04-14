package TratamentoDeExcecoes.personalizadaB;

import TratamentoDeExcecoes.Aluno;

public class TesteValidacoes {
    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno("", -7.0);
            Validar.aluno(aluno);

            
        } catch (StringVaziaException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        } catch(NumeroForaDoIntervaloException  
                | IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
