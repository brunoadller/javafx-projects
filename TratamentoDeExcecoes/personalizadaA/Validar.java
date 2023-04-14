package TratamentoDeExcecoes.personalizadaA;

import TratamentoDeExcecoes.Aluno;
public class Validar {
    private Validar(){}

    public static void aluno(Aluno aluno){

        if(aluno == null){
            throw new IllegalArgumentException("O aluno está nulo");
        }
        if(aluno.nome == null || aluno.nome.trim().isEmpty()){
            throw new StringVaziaException("nome");
        }
        
    }
}
