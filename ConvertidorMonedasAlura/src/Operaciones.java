import javax.swing.JOptionPane;

public class Operaciones {
    
    //recibimos los valores con estas variables 
private double valor;
private int divisa1;
private int divisa2;

private double resultado;

    

public Operaciones(){  //metodo constructor 
    
}



    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDivisa1() {
        return divisa1;
    }

    public void setDivisa1(int divisa1) {
        this.divisa1 = divisa1;
    }

    public int getDivisa2() {
        return divisa2;
    }

    public void setDivisa2(int divisa2) {
        this.divisa2 = divisa2;
    }
   


    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }



    //metodos para realizar las operaciones 
    
           public double convertir(){
               
               if(divisa1==0 && divisa2==1){  //convertir de euros a dolares
            
                   resultado=valor*0.85;
           } else if(divisa1==1 && divisa2==0){
                   resultado=valor*1.07;

           
                  
              
           }else{
                   System.out.println("valor no existe ");
           }
               
            
               return resultado; 

}
}