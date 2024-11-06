
import java.util.Locale;
import java.util.Scanner;
import util.Bill;


/*
 *
 * @author Mr.Mendes
 */
public class Program {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bill bill = new Bill();
        char sexo ;
        
 
        int beer, barbecue, softDrink;
        
        do {
        
        System.out.print("Sexo: ");
        sexo = sc.next().charAt(0);
        
         switch (sexo){
        
            case'f':
            case'F':
            case'm':
            case'M':
                System.out.print("Quantidade de cervejas: ");
                beer = sc.nextInt();
                System.out.print("Quantidade de refrigerantes: ");
                softDrink = sc.nextInt();
                System.out.print("Quantidade de espetinhos: ");
                barbecue  = sc.nextInt();
                bill.ticket(sexo);
                bill.feeding(beer, softDrink, barbecue);
                System.out.println("");
                System.out.println("");
                System.out.println("RELATÓRIO");
                System.out.printf("CONSUMO: R$ %.2f%n", bill.feeding(beer, softDrink, barbecue));
                System.out.println(bill.cover(beer, softDrink, barbecue));
                System.out.printf("Ingresso: R$ %.2f%n", bill.ticket(sexo));
                System.out.println("");
                System.out.printf("Valor a pagar = R$ %.2f%n", bill.total(sexo, beer, softDrink, barbecue));

                break;

           
        
                default:

                System.out.println("Entrada inválida. Digite apenas 'F' ou 'M'.");

                break;

                }
         
                } while (sexo != 'F' && sexo != 'f' && sexo != 'M' && sexo != 'm');

        
        
        
      
        
        
        
        
        
        
        
       
        
             
        sc.close();
    }
    
    
    
    
    public void validacao(){
       
         
    }
    
}
