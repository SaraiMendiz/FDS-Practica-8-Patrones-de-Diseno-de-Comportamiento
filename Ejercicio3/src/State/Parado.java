
package State;

public class Parado implements InterfazVehiculo{
    Vehiculo coche;
    
    public Parado(Vehiculo coche){
        this.coche=coche;
    }

    @Override
    public void frenar() {
        System.out.println("ERROR: El coche está PARADO.");
    }

    @Override
    public void acelerar() {
        if(coche.getCombustible()>=20){
            System.out.println("Arrancamos!!!");
            coche.setEstado(coche.getEnmarcha());
            coche.setCombustible(coche.getCombustible()-20);
            coche.setVelocidad(coche.getVelocidad()+20);
        }else{
            System.out.println("ERROR: No tienes suficiente combustible para acelerar.");
            coche.setEstado(coche.getSingasofa());
        }
        
    }

    @Override
    public void contacto() {
        System.out.println("Coche APAGADO.");
        coche.setEstado(coche.getApagado());
    }

    @Override
    public void repostar(int cantidad) {
        System.out.println("ERROR: El coche TIENE COMBUSTIBLE.");
    }
    
    @Override
    public String titulo(){
        return("Parado");
    }
}
