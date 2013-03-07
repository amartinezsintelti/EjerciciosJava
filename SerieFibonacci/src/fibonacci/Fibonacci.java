package fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Ejercicio 3:");
		System.out.println("Crear un programa en Java que sume todos los números pares de la secuencia Fibonacci que no excedan de 4 millones.");
		int x,y,serie,suma;
		
		x=0;
		y=1;
		serie=0;
		suma=0;
		
		while (serie <= 4000000){
			serie = x + y;
			
			x=y;
			y=serie;	
				
			if (serie%2 == 0) {
				System.out.println(serie);
				suma+=serie;
			}				
		}		
		
		System.out.println("\nLa suma es de : "+suma);
		
	}
}
