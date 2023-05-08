//package prueba;
//import java.lang.Math;
//import java.util.Scanner;
//
//public class Constantes {
//
//	Scanner leer=new Scanner(System.in);
//
//	String coe, x, exp;
//	Double r1;
//	
//	public static void main(String[] args) {
//		Constantes obj=new Constantes();
//		obj.primero();
//	}
//	//El metodo primero nos permite sacar una derivada a una funcion de un termino
//		public void primero(){
//			//Se crea el objeto para instanciar el metodo de derivar
//			Constantes derivar=new Constantes();
//			/**Se instancia el metodo derivar de acuerdo a los terminos que tenga la derivada
//			 * que buscamos resolver
//			 * */
//			r1=derivar.derive();
//			
//			//Se imprimer el resultado final
//			System.out.println(r1);
//		}
//	
//	public Double derive() {
//		Constantes obj=new Constantes();
//		//Leer el coeficiente 
//		coe=leer.nextLine();
//		//Leer el valor de "X"
//		x=leer.nextLine();
//		//Leer el exponente
//		exp=leer.nextLine();
//		
//		coe=obj.cadena();
//		x=obj.cadena();
//		exp=obj.cadena();
//		
//		//Definirle nuevo valor al coeficiente: Coeficiente = coeficiente * exponente
//		coe2=exp2*coe2;
//		//Definirle nuevo valor al exponente:Restarle 1 al exponente
//		exp2=exp2-1;
//		
//		//Funcion que eleva cualquier numero al exponente que se le explique 
//		Double r = Math.pow(x2, exp2);
//		//Asignar el resultado final: El resultado que nos dio antes se multiplica por el coeficiente 
//		r=r*coe2;
//
//		//Retornamos el resultado final del metodo
//		return r;
//	}
//	
//	public Double cadena() {
//		Double num;
//		String cad;
//		System.out.println("Ingrese");
//		cad=leer.nextLine();
//		
//		if(cad.equalsIgnoreCase("PI")) {
//			num=3.14159265358979323846;
//			return num;
//		}else if(cad.equalsIgnoreCase("E")){
//			num=2.718281828459045;
//			return num;
//		}else{
//			num = Double.parseDouble(cad);
//			return num;
//		}
//	}
//	
//
//
//}
