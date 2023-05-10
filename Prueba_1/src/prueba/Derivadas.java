package prueba;
import java.lang.Math;
import java.util.Scanner;
public class Derivadas {

	//Clase escaner para leer texto de la consola
	Scanner sc=new Scanner(System.in);
	//Variables universales
	String coe, x, exp;
	Double coe2, x2, exp2;
	Double r;
	Double r1, r2, r3, r4;
	
	//El metodo primero nos permite sacar una derivada a una funcion de un termino
	public void primero(){
		//Se crea el objeto para instanciar el metodo de derivar
		Derivadas derivar=new Derivadas();
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
		Derivadas derivar=new Derivadas();
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
		Derivadas derivar=new Derivadas();
		r1=derivar.derive();
		r2=derivar.derive();
		r3=derivar.derive();
		
		System.out.println(r1+r2+r3);
	}

	//La cuarta nos permite derivar una funcion de 4 terminos
	public void cuarto(){

		//Se crea el objeto para instanciar el metodo de derivar
		Derivadas derivar=new Derivadas();
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
		
		//Leer el coeficiente 
		coe=sc.next();
		//Leer el valor de "X"
		x=sc.next();
		//Leer el exponente
		exp=sc.next();
		
		if(coe.equalsIgnoreCase("PI")) {
			coe2=3.14159265358979323846;
		}else if(coe.equalsIgnoreCase("E")){
			coe2=2.718281828459045;
		}else{
			coe2 = Double.parseDouble(coe);
		}
		
		if(x.equalsIgnoreCase("PI")) {
			x2=3.14159265358979323846;
		}else if(x.equalsIgnoreCase("E")){
			x2=2.718281828459045;
		}else{
			x2 = Double.parseDouble(x);
		}
		
		if(exp.equalsIgnoreCase("PI")) {
			exp2=3.14159265358979323846;
		}else if(exp.equalsIgnoreCase("E")){
			exp2=2.718281828459045;
		}else{
			exp2 = Double.parseDouble(exp);
		}
		
		//Definirle nuevo valor al coeficiente: Coeficiente = coeficiente * exponente
		coe2=exp2*coe2;
		//Definirle nuevo valor al exponente:Restarle 1 al exponente
		exp2=exp2-1;
		
		//Funcion que eleva cualquier numero al exponente que se le explique 
		Double r = Math.pow(x2, exp2);
		//Asignar el resultado final: El resultado que nos dio antes se multiplica por el coeficiente 
		r=r*coe2;

		//Retornamos el resultado final del metodo
		return r;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	