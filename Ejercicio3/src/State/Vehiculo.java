
package State;

public class Vehiculo {
    private InterfazVehiculo estado;
    
    private int combustible;
    private int velocidad;
    
    private InterfazVehiculo apagado;
    private InterfazVehiculo parado;
    private InterfazVehiculo enmarcha;
    private InterfazVehiculo singasofa;
    
    public Vehiculo(){
        this.apagado=new Apagado(this);
        this.parado=new Parado(this);
        this.enmarcha=new Marcha(this);
        this.singasofa=new sinCombustible(this);
        
        this.combustible=50;
        this.velocidad=0;
        
        this.estado=apagado;
    }
    
    public int getCombustible(){
        return(this.combustible);
    }
    public void setCombustible(int num){
        this.combustible=num;
    }
    
    public int getVelocidad(){
        return(this.velocidad);
    }
    public void setVelocidad(int num){
        this.velocidad=num;
    }
    
    public InterfazVehiculo getEstado(){
        return(this.estado);
    }
    public void setEstado(InterfazVehiculo state){
        this.estado=state;
    }
    
    public InterfazVehiculo getApagado(){
        return(this.apagado);
    }
    public InterfazVehiculo getParado(){
        return(this.parado);
    }
    
    public InterfazVehiculo getEnmarcha(){
        return(this.enmarcha);
    }
     public InterfazVehiculo getSingasofa(){
        return(this.singasofa);
    }
    
    public void contacto(){
        estado.contacto();
    }
    public void acelerar(){
        estado.acelerar();
    }
    public void frenar(){
        estado.frenar();
    }
    public void repostar(int cantidad){
        estado.repostar(cantidad);
    }  
    
    public void estado(){
        System.out.println("Estado actual del vehiculo:");
        System.out.println("   -Estado: " + this.estado.titulo());
        System.out.println("   -Combustible: " + this.combustible);
        System.out.println("   -Velocidad: " + this.velocidad + "\n");
    }
    
    public String getTituloEstado(){
        return(estado.titulo());
    }
}
