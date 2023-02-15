
package Iterador;

public class Alumnos implements Agregador{
    private String[] alumnos;
    private int tam,contador;
    
    public Alumnos(int tam){
        this.alumnos=new String[tam];
        this.contador=0;
        this.tam=tam;
    }
    
    public void add(String nombre){
        if(contador<tam){
            this.alumnos[contador]=nombre;
            contador++;
        }else{
            System.out.println("El array ya está lleno");
        }
    }
    
    @Override
    public Iterador crearIterador() {
        return(new IteratorAlumnos(this.alumnos));
    }
}
