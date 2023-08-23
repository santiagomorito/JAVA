package ejerciciosbasicos;
import java.util.Scanner;

public class ejer3 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int numero;

	        while (true) {
	            System.out.print("Ingresa un número: ");
	            numero = scanner.nextInt();

	            boolean Primo = true;
	            if (numero <= 1) {
	                Primo = false;
	            } else {
	                for (int i = 2; i <= numero / 2; i++) {
	                    if (numero % i == 0) {
	                        Primo = false;
	                        break;
	                    }
	                }
	            }

	            if (numero > 100 && Primo) {
	                System.out.println("Numero válido, Mayor a 100 y es primo");
	                break;
	            } else {
	                System.out.println("Numero no válido");
	            }
	        }

	        scanner.close();
	    
	}


}
