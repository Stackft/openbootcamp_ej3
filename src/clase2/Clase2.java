package clase2;

public class Clase2 {
    public static void main(String[] args) throws Exception {

        Coche miCoche = new Coche();
        miCoche.AumentarPuertas();

        System.out.println(miCoche.cantidadPuertas);
    }
    
}

class Coche {
    
    public int cantidadPuertas;
    
    public void AumentarPuertas(){
        this.cantidadPuertas++;
    }
}