package ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {

    	//if
    	
        int numeroif = 12;
        
        if (numeroif < 0) {
        	System.out.println("El numero es negativo");
        }
        else if(numeroif > 0) {
        	System.out.println("El numero es positivo");
        }
        else {
        	System.out.println("El numero es 0");
        }
        
        //while
        
        int numeroWhile = 0;
        
        while(numeroWhile < 3) {
        	numeroWhile++;
        	System.out.println(numeroWhile);
        }
        
        //doWhile
        
        int numeroDoWhile = 4;
        
        do {
        	System.out.println(numeroDoWhile);
        } while(numeroDoWhile <3);
        
        //for
        
        for(int numeroFor = 0; numeroFor <= 3 ; numeroFor++) {
        	System.out.println(numeroFor);
        }
        
        //switch
        
        String estacion = "verano";
        
        switch (estacion) {
		case "invierno":
			System.out.println("Estamos en invierno");
			break;
		case "otoño":
			System.out.println("Estamos en otoño");
			break;
		case "primavera":
			System.out.println("Estamos en primavera");
			break;
		case "verano":
			System.out.println("Estamos en verano");
			break;
		default:
			System.out.println("No es una estacion");
			break;
		}
    }
    
}

