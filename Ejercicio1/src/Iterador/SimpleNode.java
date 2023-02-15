
package Iterador;

public class SimpleNode<String> {
    private String element;
    private SimpleNode next;
    
    public SimpleNode (String element, SimpleNode next){
        this.element = element;
        this.next = next;
    }
    
    public String getElement(){
        return element;
    }
    
    public void setElement (String element){
        this.element = element;
    }
    
    public SimpleNode getNext(){
     return next;   
    }
    
    public void setNext (SimpleNode next){
        this.next=next;
    }
}
