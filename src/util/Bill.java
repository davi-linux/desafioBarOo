
package util;


//declarcao estatica de valores;

public class Bill {
   

public final double ticket = 10.00;
public final double beer = 5.00;
public final double softDrink = 3.00;
public final double barbecue = 7.00;
public final double courvert = 4.00;

public double ticket (char sexo){
   return  (sexo == 'F' || sexo == 'f') ?  ticket - 2.00 : ticket;
   
   
}


public double feeding (int qtdBeer, int qtdSoftDrink, int qtdBarbecue){
   
    double consumo =  (qtdBeer * beer) + (qtdSoftDrink * softDrink) + (qtdBarbecue * barbecue);
    
 
    
    return consumo;    
}

   public String cover(int qtdBeer, int qtdSoftDrink, int qtdBarbecue) {
        double consumo = feeding(qtdBeer, qtdSoftDrink, qtdBarbecue);
        return (consumo > 30) ? "Isento de Couvert" : "Couvert = R$ 4.00";
    }

public double total ( char sexo, int qtdBeer, int qtdSoftDrink, int qtdBarbecue){

    double tick = ticket(sexo);
    double consumo = feeding(qtdBeer, qtdSoftDrink, qtdBarbecue);
    
    double valorFinal = (consumo > 30) ? (consumo + tick) : (consumo + tick + courvert);

    return valorFinal;
    


}










    
  
    
    
    
    
}
