package javaoggetti;

public class Persone{
    //Parametri della classe; 
    String nome;
    String cognome; 
    int eta; 
    char sesso;
    
    //Costruttore persone;
         public Persone(String unNome, String unCognome, int unEta, char unSesso){
             nome = unNome; 
             cognome = unCognome; 
             eta = unEta; 
             sesso = unSesso;
         }  
         
         
    //Metodi
         
public void stampaPersona(){    
    
        System.out.println("Nome : " + nome +"\nCognome : "+cognome+"\nEtà : "+eta+"\nSesso : "+ sesso);
}

public int stampaLunghezzaNome(){
    int caratteri = nome.length();
    System.out.println("La lunghezza del nome "+ nome+ " è uguale a : "+caratteri);
    return 0 ; 
}
}