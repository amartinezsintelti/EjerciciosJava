package numeros;

public class Arabigos {

	public Arabigos(String numero) {
		
		Integer arabigo = 0;
		
		String salida = "";
	
		for ( int cont = 0; cont < numero.length(); cont++ ){
			 salida = numero.charAt( cont ) + " ";
			 
			 switch (Character.toString(numero.charAt( cont ))) {
			case "I":
				arabigo = arabigo + 1;
				break;
			case "V":
				if (cont != 0 && Character.toString(numero.charAt( cont-1 )).equals("I")){
					arabigo = arabigo + 3;
				}
				else 
					arabigo = arabigo + 5;
				break;
			case "X": 
				if (cont != 0 && Character.toString(numero.charAt(cont-1)).equals("I")){
					arabigo = arabigo + 8;
				}
				else
					arabigo = arabigo + 10;
				break;
			case "L":
				if (cont != 0 && Character.toString(numero.charAt(cont-1)).equals("X")){
					arabigo = arabigo + 30;
				}
				else
					arabigo = arabigo + 50;				
				break;
			case "C":
				if (cont != 0 && Character.toString(numero.charAt(cont-1)).equals("X")){
					arabigo = arabigo + 80;
				}
				else
					arabigo = arabigo + 100;				
				break;
			case "D":
				if (cont != 0 && Character.toString(numero.charAt(cont-1)).equals("C")){
					arabigo = arabigo + 400;
				}
				else
					arabigo = arabigo + 500;				
				break;
			case "M":
				if (cont != 0 && Character.toString(numero.charAt(cont-1)).equals("C")){
					arabigo = arabigo + 800;
				}
				else
					arabigo = arabigo + 1000;				
				break;
			default:
				break;
			}	 
		}
		
		System.out.println("Arábigo: " + arabigo);
	}
}
