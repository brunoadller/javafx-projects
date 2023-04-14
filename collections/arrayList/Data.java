package arrayList;

import java.util.Calendar;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public Data(){

    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int calculaIdade(){
        Calendar c = Calendar.getInstance();
        int anoAtual = c.get(Calendar.YEAR);
        return anoAtual - getAno();
    }
    public String nomeMes(boolean abreviado) throws ExceptionDataError{

        if(this.mes == 1 && abreviado == true){
            return "Jan";
        }else if(this.mes == 2 && abreviado == true){
            return "Fev";
        }else if(this.mes == 3 && abreviado == true){
            return "Mar";
        }else if(this.mes == 4 && abreviado == true){
            return "Abr";
        }else if(this.mes == 5 && abreviado == true){
            return "Mai";
        }else if(this.mes == 6 && abreviado == true){
            return "Jun";
        }else if(this.mes == 7 && abreviado == true){
            return "Jul";
        }else if(this.mes == 8 && abreviado == true){
            return "Ago";
        }else if(this.mes == 9 && abreviado == true){
            return "set";
        }else if(this.mes == 10 && abreviado == true){
            return "Out";
        }else if(this.mes == 11 && abreviado == true){
            return "Nov";
        }else if(this.mes == 12 && abreviado == true){
            return "Dez";
        }else{

            throw new ExceptionDataError("Informe um valor de data válido");
        }


        
    }
    

   
}
