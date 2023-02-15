
package Strategy;

public class Ordenador {
     Ordenar orden;
    
    public void setOrden(Ordenar ordena){
        this.orden=ordena;
    
    }
    
    public int[] result(int array[]){
        return orden.ordenar(array);
    }
    
    public void printArray(int array[]){
        int n = array.length;
        for (int i=0; i<n; ++i){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
