
package State;

    public class sinCombustible implements InterfazVehiculo{
    
    Vehiculo coche;
    
    public sinCombustible(Vehiculo coche){
        this.coche=coche;
    }

    @Override
    public void frenar() {
        System.out.println("ERROR: El coche está SIN COMBUSTIBLE");
    }

    @Override
    public void acelerar() {
        System.out.println("ERROR: El coche está SIN COMBUSTIBLE");
    }

    @Override
    public void contacto() {
        System.out.println("ERROR: El coche está SIN COMBUSTIBLE");
    }

    @Override
    public void repostar(int cantidad) {
        System.out.println("Repostando " + cantidad + " Litros.");
        coche.setCombustible(coche.getCombustible()+cantidad);
        coche.setEstado(coche.getApagado());
    }
    
    @Override
    public String titulo(){
        return("Sin combustible");
    }
}
