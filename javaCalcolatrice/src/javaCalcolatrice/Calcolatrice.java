package javaCalcolatrice;
import java.util.*; //Libreria standard java;;

/**
 *
 * @author Giovanni
 */
public class Calcolatrice {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //utilizzato al posto di scanf;;
        int a,b;
        System.out.println("Inserisci due numeri :"); //Println stampa string + carattere a capo, print stampa solo linea, bisogna usare \n come C
        a = input.nextInt(); //In caso di stringa utilizza nextLine;;
        b = input.nextInt(); //In caso di stringa utilizza nextLine;;
        
        System.out.println("La somma di "+ a +" e "+ b +" è : "+ Calcola.add(a,b)); //ecc ecc;;
        
        
    }
    
}
