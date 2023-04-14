package arrayList;

import java.util.ArrayList;
import java.util.Calendar;

public class Main{
    public static void main(String[] args) throws ExceptionDataError {
        

        ArrayList<Pessoa> pessoas = new ArrayList();

        pessoas.add(new Pessoa("Juca Bala", 'M', new Data(2, -12, 1997)));
        pessoas.add(new Pessoa("Maria dos Santos", 'F', new Data(3, 10, 1959)));

        
       for(Pessoa item: pessoas){
            item.imprimir();
       }

       
    }
}