package numeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {
	
	public static String mainApp() {
		String salida = "";
		try{
			BufferedReader leerEntrada = new BufferedReader(new InputStreamReader(System.in));
		
			salida = leerEntrada.readLine();
		} catch( IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
		return salida; // Devuelve el dato tecleado
	}

	
	
	public static void main(String[] args) {
		String opc = "";
		String numero = "";
			
		System.out.println("Transformar de : \n");
		System.out.println("a) Arábigo a Romano \n");
		System.out.println("b) Romano a Árabigo \n");
		
		opc = MainApp.mainApp();
				
		switch (opc) {
		case "a":
			System.out.println("Ingresar valor Entero:\n");
			numero = MainApp.mainApp();
			new Romanos(numero);
			break;
		case "b":
			System.out.println("Ingresar el Número Romano :\n");
			numero = MainApp.mainApp();
			new Arabigos(numero);
			break;
		default:
			break;
		}		
	}

}
