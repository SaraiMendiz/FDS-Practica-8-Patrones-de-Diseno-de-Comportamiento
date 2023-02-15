
package Iterador;

public class Login {
    Alumnos alum;
    Profesores prof;
    Administradores admin;
    
    public Login(int tamAlum){
        alum = new Alumnos(tamAlum);
        prof = new Profesores();
        admin = new Administradores();
    }

    public void add(String nombre,int tipo){
        //1=alumno
        //2=profesor
        //3=admin
        
        if(tipo==1){
            alum.add(nombre);
        }else if(tipo==2){
            prof.add(nombre);
        }else{
            admin.addLast(nombre);
        }
    }
    
    public void imprime(int n) throws Exception{
        Iterador it;
        IteratorAdministrador itad;
        if(n>0){
            System.out.println("ALUMNOS: ");
            it=alum.crearIterador();
            for(int ii=0;ii<n;ii++){
                System.out.println("Iteracion " + ii);
                for(int jj=0;jj<it.getSize()+2;jj++){
                    System.out.println("\t" + jj + " - " + it.next());
                }
            }
            System.out.println("PROFESORES: ");
            it=prof.crearIterador();
            for(int ii=0;ii<n;ii++){
                System.out.println("Iteracion " + ii);
                for(int jj=0;jj<it.getSize()+2;jj++){
                    System.out.println("\t" + jj + " - " + it.next());
                }
            }
            System.out.println("ADMINISTRADORES: ");
            itad=(IteratorAdministrador) admin.crearIterador();
            for(int ii=0;ii<n;ii++){
                System.out.println("Iteracion " + ii);
                for(int jj=0;jj<itad.getSize()+2;jj++){
                    System.out.println("\t" + jj + " - " + itad.next());
                }
            }
        }else{
            int opt=-1;
            while(opt!=0){
                System.out.println("ALUMNOS: ");
                it=alum.crearIterador();
                for(int jj=0;jj<it.getSize();jj++){
                    System.out.println("\t" + jj + " - " + it.next());
                }
                
                System.out.println("PROFESORES: ");
                it=prof.crearIterador();
                for(int jj=0;jj<it.getSize();jj++){
                    System.out.println("\t" + jj + " - " + it.next());
                }
            
                System.out.println("ADMINISTRADORES: ");
                itad=(IteratorAdministrador) admin.crearIterador();
                for(int jj=0;jj<itad.getSize();jj++){
                    System.out.println("\t" + jj + " - " + itad.next());
                }
            }
        }
    }
}
