
package Iterador;

public interface List_1<String>{
    //añadir elemento al principio de la lista
    public void addFirst(String element);
    //añadir elemento al final de la lista
    public void addLast(String element);
    //añadir elemento a la lista en las posicion introducida
    public void add(String element, int index)throws Exception; 
    //borrar primer elementos de la lista
    public void removeFirst() throws Exception;
    //borrar ultimo elemento de la lista
    public void removeLast() throws Exception;
    //borrar elemento introducido
    public String remove(String element) throws Exception; 
    //borrar todos los elementos de la lista
    public void clean();
    //indicar si la lista está vacía
    public boolean isEmpty();
    //devolver indice de la posicion del elemento introducido
    public int getIndex (String element) throws Exception;
    //devolver elemento en la posicion del indice introducido
    public String get (int index) throws Exception; 
    //devolver elemento introducido
    public String find (String element) throws Exception;
    //indicar si el elemento esta incluido en la lista
    public boolean contains (String element) throws Exception;
    //devolver el tamaño de la lista
    public int getSize ();
}
