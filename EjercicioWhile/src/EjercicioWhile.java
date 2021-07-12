import java.util.Scanner;

public class EjercicioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* Escribir un programa que pida 2 numeros por consola de manera reiterada
		 * La ejecución del programa terminará cuando los numeros ingresados sean
		 * iguales.
		 * 
		 * Nota: utilizar un ciclo while

		 */
		
		Scanner numeros= new Scanner(System.in);
		int uno;
		int dos;
		
		do {
			System.out.println("ingresar primer numero");
			uno= numeros.nextInt();
			System.out.println("ingresar segundo numero");
			dos=numeros.nextInt();
			
			
		}
		while(uno != dos);
		System.out.println("YA SE TERMINO");
		numeros.close();
	}

	
}
