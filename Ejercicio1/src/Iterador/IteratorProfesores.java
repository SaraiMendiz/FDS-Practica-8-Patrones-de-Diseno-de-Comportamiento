
package Iterador;

import java.util.ArrayList;

public class IteratorProfesores implements Iterador{
    ArrayList<String> array;
    int contador;
    
    public IteratorProfesores(ArrayList<String> array){
        this.array=array;
        this.contador=0;
    }

    @Override
    public Object next() {
        if(!this.hasNext()){
            this.contador=0;
        }
        this.contador++;
        return(this.array.get(contador-1));
        
    }

    @Override
    public boolean hasNext() {
        if(contador>=this.array.size()){
            return(false);
        }else{
            return(true);
        }
    }

    @Override
    public int getSize() {
        return(this.array.size());
    }

    @Override
    public void remove(int pos) {
        this.array.remove(pos);
        this.contador--;
    }
}
