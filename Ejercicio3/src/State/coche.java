
package State;

import java.util.Scanner;

public class coche {
    public static void main(String[] args) {
        Vehiculo coche = new Vehiculo();
        Scanner sc = new Scanner(System.in);
        
        coche.estado();
        
        int opt=-1;
        
        while(opt!=0){
            System.out.println("0º- Salir");
            System.out.println("1º- Contacto");
            System.out.println("2º- Repostar");
            System.out.println("3º- Acelerar");
            System.out.println("4º- Frenar");
            System.out.println("5º- Estado de vehículo");
            opt=sc.nextInt();
            
            switch(opt){
                case 1:
                    coche.contacto();
                    break;
                case 2:
                    int cantidad=0;
                    if(coche.getTituloEstado().equals("Sin combustible")){
                        System.out.println("Introduzca cantidad a repostar: ");
                        cantidad = sc.nextInt();
                        coche.repostar(cantidad);
                    }else{
                        coche.repostar(cantidad);
                    }
                    break;
                case 3:
                    coche.acelerar();
                    break;
                case 4:
                    coche.frenar();
                    break;
                case 5:
                    coche.estado();
                    break;
            }
        }
    } 
}
