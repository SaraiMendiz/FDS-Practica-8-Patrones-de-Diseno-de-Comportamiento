
package Iterador;

public class Main {

    public static void main(String[] args) throws Exception{
        Login lg = new Login(5);
        
        lg.add("Jorge",1);
        lg.add("Jose",1);
        lg.add("Eric",1);
        lg.add("Sarai",1);
        lg.add("Rebeca",1);
        
        lg.add("Jorge",2);
        lg.add("Jose",2);
        lg.add("Eric",2);
        lg.add("Sarai",2);
        lg.add("Rebeca",2);
        
        lg.add("Jorge",3);
        lg.add("Jose",3);
        lg.add("Eric",3);
        lg.add("Sarai",3);
        lg.add("Rebeca",3);
        
        lg.imprime(2);
        //lg.imprime(-1);
    }
}    

