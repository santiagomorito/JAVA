package ejerciciosbasicos;

import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		System.out.println("Ingrese 2 numeros");
        Scanner scanner = new Scanner(System.in);
        int numero;
        numero = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        int numero2;
        numero2 = scanner2.nextInt();
        int resta =  numero - numero2;
        int Suma =  numero + numero2; 
        int Multiplicacion =  numero + numero2; 
        int Division = numero / numero2;
        
        
       
        
        int n;
        Scanner leer = new Scanner (System.in);
        System.out.println("1 Suma ");
        System.out.println("2 Resta ");
        System.out.println("3 Multiplicacion ");
        System.out.println("4 Division " );
        
        System.out.println("Elije una opcion " );
        n = leer.nextInt(); 
        

        
        switch(n) {
        
        case 1:
        System.out.println("1 Suma "+ Suma);
        break;
        
		case 2:
        System.out.println("2 Resta " + resta);
        break;
        
		case 3:
		System.out.println("3 Multiplicacion "+ Multiplicacion);
		break;
    
		case 4:
	        System.out.println("4 Division " + Division);
	        break;
	    default:
	    	System.out.println("No has elejido una opcion una opcion");
	        break;
        }
        scanner.close();
    

}
}