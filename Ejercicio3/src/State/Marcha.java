
package State;

public class Marcha implements InterfazVehiculo{
    Vehiculo coche;
    
    public Marcha(Vehiculo coche){
        this.coche=coche;
    }

    @Override
    public void frenar() {
        if((coche.getVelocidad()-20)>0){
            System.out.println("Frenamos!!!");
            coche.setVelocidad(coche.getVelocidad()-20);
        }else{
            System.out.println("Paramos!!!");
            coche.setVelocidad(0);
            coche.setEstado(coche.getParado());
        }
    }

    @Override
    public void acelerar() {
        if(coche.getCombustible()>=20){
            System.out.println("Aceleramos!!!");
            coche.setVelocidad(coche.getVelocidad()+20);
            coche.setCombustible(coche.getCombustible()-20);
        }else if(coche.getCombustible()>0){
            System.out.println("ERROR: No tenemos combustible y seguimos a la misma velocidad");
        }else{
            System.out.println("ERROR: No tenemos combustible");
            coche.setEstado(coche.getSingasofa());
        }
    }

    @Override
    public void contacto() {
        System.out.println("ERROR: El coche está EN MARCHA");
    }

    @Override
    public void repostar(int cantidad) {
        System.out.println("ERROR: El coche está EN MARCHA");
    }
    
    @Override
    public String titulo(){
        return("En marcha");
    }
}
