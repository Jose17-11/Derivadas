package integrales;
import java.util.Scanner;
public class Algoritmo {
	public void integral() {
		//Metodo Scanner para leer texto de la consola
		Scanner sc=new Scanner(System.in);
		//Variables que se usan en este metodo
		Double a, b;
		Double coe, exp;
		Double r, r1, r2;
		//Se pide al usuario el punto a que evaluara a la integral
		System.out.println("Ingrese el punto a: ");
		a=sc.nextDouble();

		//Se pide al usuario el punto b que evaluara a la integral
		System.out.println("Ingrese el punto b: ");
		b=sc.nextDouble();
		//Como es una funcion se pide que ingrese el coeficiente de la funcion y su exponente
		System.out.println("Ingrese el coeficiente y el exponente de la funcion separados por un espacio: ");
		//Leer el coeficiente 
		coe=sc.nextDouble();
		//Leer el exponente
		exp=sc.nextDouble();
			
		
		//***********************************************************************************************************
		//Como sabemos el primer paso de una integral es sumarle 1 al exponente
		exp=exp+1;
		
		/**Funcion que eleva cualquier numero al exponente que se le explique 
		 * Y lo primero que haremos es elevar al nuevo exponente el valor de X
		 * */
		//Evaluada en el punto a
		r1 = Math.pow(b, exp);
		//Evaluada en el punto b
		r2 = Math.pow(a, exp);		
		
		/**Una ves evaluada la funcion lo que procede es multiplicar el punto evaluado con el coeficiente
		 * y dividirlo con el valor nuevo del exponente
		 * */
		/**Finalmente se hace la operacion de restar la integral definida evaluada en el punto b
		 * menos la integral evaluada en el punto a
		 * */
		r=(coe*r1)/exp-(coe*r2)/exp;
		
		//Para finalmente mostrar en pantall el resultado obtenido
		System.out.println("La respuesta es: " + r + "\n");
	}
}
