package clase1;

public class Clase1 {
    public static void main(String[] args) throws Exception {

        int resultado =suma(10, 20);
                
        System.out.println(resultado);
        
        Coche miCoche = new Coche();
        miCoche.AumentarPuertas();

        System.out.println(miCoche.cantidadPuertas);
    }
    
    public static int suma(int numero1, int numero2){
        int resultado = numero1 + numero2;
    
        return resultado;
    }
}

class Coche {
    
    public int cantidadPuertas;
    
    public void AumentarPuertas(){
        this.cantidadPuertas++;
    }
}