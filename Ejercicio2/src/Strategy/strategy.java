
package Strategy;

import java.util.Scanner;

public class strategy {
    public static void main(String[] args) {

        Burbuja o1 = new Burbuja();
        Directa o2 = new Directa();
        int[] array= {3,7,4,6,9,42,674,69,2565,26,3456,32,7};
        int[] array3;
        int[] array2;
        Ordenador a1 = new Ordenador();
        Scanner sc = new Scanner(System.in); 
        System.out.println("Seleccione tipo de ordenación por la que quiere empezar: ");
        System.out.println("0º- Burbuja");
        System.out.println("1º- Directa");
        int a = sc.nextInt();
        switch(a){
            case 0:
                System.out.println("Ordenación por Burbuja");
                System.out.println("Decimos en el set el tipo de Orden que queremos (Burbuja)");
                a1.setOrden(o1);
                System.out.println("Ejecutamos el algoritmo");
                array2 = a1.result(array);
                System.out.println("Resultado: ");
                a1.printArray(array2);
                System.out.println("Ordenación por Directa");
                System.out.println("Decimos en el set el tipo de Orden que queremos (Directa)");
                a1.setOrden(o2);
                System.out.println("Ejecutamos el algoritmo");
                array3 = a1.result(array);
                System.out.println("Resultado: ");
                a1.printArray(array3);
                break;
                
            case 1:
                System.out.println("Ordenación por Directa");
                System.out.println("Decimos en el set el tipo de Orden que queremos (Directa)");
                a1.setOrden(o2);
                System.out.println("Ejecutamos el algoritmo");
                array3 = a1.result(array);
                System.out.println("Resultado: ");
                a1.printArray(array3);
                System.out.println("Ordenación por Burbuja");
                System.out.println("Decimos en el set el tipo de Orden que queremos (Burbuja)");
                a1.setOrden(o1);
                System.out.println("Ejecutamos el algoritmo");
                array2 = a1.result(array);
                System.out.println("Resultado: ");
                a1.printArray(array2);
                break;
        }
    }
}
