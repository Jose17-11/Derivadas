package prueba;
import integrales.Integrales;
import java.lang.Math;
import java.util.Scanner;
public class Menu {

	//Clase escaner para leer texto desde la consola
	static Scanner leer=new Scanner(System.in);
	//Metodo principal donde se instancian todos los metodos y procesos requeridos
	public static void main(String[] args) {
		//Variable que tomara un valor de los incisos mostrados como menu
		byte x;
		
		//Ciclo do while para ciclar las opciones hasta que se elija la opcion salir
		do {
			//Texto que se imprime en la consola y nos muestra el menu
			System.out.println("Elige que tipo de derivada haras: ");
			System.out.println("Las constantes no se agregan porque siempre son 0");
			System.out.println("1. 2x³");
			System.out.println("2. 5x²+3x⁴");
			System.out.println("3. 10x²-5x²+3x⁴");
			System.out.println("4. 20x⁵+16x³+3x⁴-10x²");
			System.out.println("5. Integral definida: [a,b]| 2x⁴ ");
			//Variable x que toma el valor que ingrese el usuario
			x=leer.nextByte();
			
			/**Objeto creado para instansiar los metodos que se requieran en base a la
			 * derivada que se requiera hacer
			 * */
			Derivadas deri=new Derivadas();
			Integrales integral=new Integrales();
			//sentencia switch donde se instancia cada caso del menu mostrado en consola
			switch (x) {
			
			case 1: {
				deri.instrucciones();
				deri.primero();
				break;
			}
			case 2:{
				deri.instrucciones();
				deri.segundo();
				break;
			}
			case 3:{
				deri.instrucciones();
				deri.tercero();
				break;
			}
			case 4:{
				deri.instrucciones();
				deri.cuarto();
				break;
			}
			case 5:{
				integral.integral();
			}
			case 6:{
				System.out.println("Adios vuelva pronto ;)");
				break;
			}
			/**Default nos hace que si el usuario ingreso un numero que no este en el 
			 * menu nos muestre un aviso que avise que seleccione uno que si se encuentre 
			 * en el menu
			 * */
			default:{
				System.out.println("Escribe un valor entre los elegidos");
				break;
			}
			}
			
		}while(x!=6);
	}
}
