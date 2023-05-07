package prueba;
import java.lang.Math;
import java.util.Scanner;
public class Prueba {
	
	//Variables universales
	Double coe, exp, x;
	Double r;
	Double r1, r2, r3, r4;
	
	//El metodo primero nos permite sacar una derivada a una funcion de un termino
	public void primero(){
		//Se crea el objeto para instanciar el metodo de derivar
		Prueba derivar=new Prueba();
		/**Se instancia el metodo derivar de acuerdo a los terminos que tenga la derivada
		 * que buscamos resolver
		 * */
		r1=derivar.derive();
		
		//Se imprimer el resultado final
		System.out.println(r1);
	}
	
	//La segunda nos permite derivar una funcion de 2 terminos
	public void segundo(){

		//Se crea el objeto para instanciar el metodo de derivar
		Prueba derivar=new Prueba();
		/**Se instancia el metodo derivar de acuerdo a los terminos que tenga la derivada
		 * que buscamos resolver
		 * */
		r1=derivar.derive();
		r2=derivar.derive();
		/**En este caso como fueron dos terminos se suman los resultados obtenidos
		 * para finalemente imprimir en consola la derivada final y este proceso se
		 * repite en cada metodo dependiendo los terminos que se hayan derivado
		 * */
		System.out.println(r1+r2);
	}
	
	//La tercera nos permite derivar una funcion de 3 terminos
	public void tercero(){

		//Se crea el objeto para instanciar el metodo de derivar
		Prueba derivar=new Prueba();
		r1=derivar.derive();
		r2=derivar.derive();
		r3=derivar.derive();
		
		System.out.println(r1+r2+r3);
	}

	//La cuarta nos permite derivar una funcion de 4 terminos
	public void cuarto(){

		//Se crea el objeto para instanciar el metodo de derivar
		Prueba derivar=new Prueba();
		r1=derivar.derive();
		r2=derivar.derive();
		r3=derivar.derive();
		r4=derivar.derive();
		
		System.out.println(r1+r2+r3+r4);
	}
	
	public void instrucciones() {
		/**Para evitar redundancia se crea un metodo que tenga las instrucciones
		 * de como ingresar los datos para derivar de manera correcta y cada que 
		 * se quiera mostrar estas instrucciones se instancia este metodo desde 
		 * cualquier clase
		 * 
		 * */
		System.out.println("Instrucciones: " + "\nEscriba la operacion de la manera y orden en el que se indica");
		System.out.println("Coeficiente, espacio, valor de X, espacio, exponente");
		System.out.println("Dx/dy");
		
	}

	//Algoritmo para derivar
	public Double derive() {
		//Clase escaner para leer texto de la consola
		Scanner sc=new Scanner(System.in);
		//Leer el coeficiente 
		coe=sc.nextDouble();
		//Leer el valor de "X"
		x=sc.nextDouble();
		//Leer el exponente
		exp=sc.nextDouble();
		
		//Definirle nuevo valor al coeficiente: Coeficiente = coeficiente * exponente
		coe=exp*coe;
		//Definirle nuevo valor al exponente:Restarle 1 al exponente
		exp=exp-1;
		
		//Funcion que eleva cualquier numero al exponente que se le explique 
		Double r = Math.pow(x, exp);
		//Asignar el resultado final: El resultado que nos dio antes se multiplica por el coeficiente 
		r=r*coe;

		//Retornamos el resultado final del metodo
		return r;
	}

}