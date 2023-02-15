
package State;

public class Apagado implements InterfazVehiculo{
    Vehiculo coche;
    
    public Apagado(Vehiculo coche){
        this.coche=coche;
    }

    @Override
    public void frenar() {
        System.out.println("ERROR: El coche está APAGADO.");
    }

    @Override
    public void acelerar() {
        System.out.println("ERROR: El coche está APAGADO.");
    }

    @Override
    public void contacto() {
        System.out.println("Coche ENCENDIDO");
        coche.setEstado(coche.getParado());
    }

    @Override
    public void repostar(int cantidad) {
        System.out.println("ERROR: El coche TIENE COMBUSTIBLE.");
    }
    
    @Override
    public String titulo(){
        return("Apagado");
    }
}
