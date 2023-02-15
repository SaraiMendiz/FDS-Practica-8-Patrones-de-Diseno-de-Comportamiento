
package Iterador;

public class IteratorAlumnos implements Iterador{
    private String[] array;
    private int contador;
    
    public IteratorAlumnos(String[] array){
        this.array=array;
        this.contador=0;
    }

    @Override
    public Object next() {
        if(!this.hasNext()){
            this.contador=0;
        }
        this.contador++;
        return(this.array[contador-1]);
    }

    @Override
    public boolean hasNext() {
        if(contador>=this.getSize()){
            return(false);
        }else{
            return(true);
        }
    }

    @Override
    public int getSize() {
        return(this.array.length);
    }

    @Override
    public void remove(int pos) {
        for(int ii=pos;ii<(this.getSize()-1);ii++){
            array[ii]=array[ii+1];
        }
        this.array[(this.getSize()-1)]=null;
    } 
}
