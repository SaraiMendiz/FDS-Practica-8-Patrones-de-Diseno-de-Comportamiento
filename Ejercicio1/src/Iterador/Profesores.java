
package Iterador;

import java.util.ArrayList;

public class Profesores implements Agregador{
     private ArrayList<String> profes;
    
    public Profesores(){
        profes=new ArrayList<>();
    }
    
    public void add(String nombre){
        this.profes.add(nombre);
    }

    @Override
    public Iterador crearIterador() {
        return(new IteratorProfesores(this.profes));
    }
}
