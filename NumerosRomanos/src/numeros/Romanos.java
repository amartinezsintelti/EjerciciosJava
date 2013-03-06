package numeros;

public class Romanos {

	public Romanos(String numero) {
		
		int dato = Integer.parseInt(numero);
			
		int unidad,decena,centena,millar,residuo;
			
		millar = (dato/1000);
		residuo = dato%1000;
		
		centena = (residuo/100);
		residuo = (dato%100);
		
		decena = (residuo/10);
				
		unidad = (dato%10);
		
		String romano = "";
		
		switch (millar) {
		case 1:
			romano = romano+"M";
			break;
		case 2:
			romano = romano+"MM";
			break;
		case 3:
			romano = romano+"MMM";
			break;
		default:
			break;
		}
		
		switch (centena) {
		case 1:
			romano = romano+"C";
			break;
		case 2:
			romano = romano+"CC";
			break;
		case 3:
			romano = romano+"CCC";
			break;
		case 4:
			romano = romano+"CD";
			break;
		case 5:
			romano = romano+"D";
			break;
		case 6:
			romano = romano+"DC";
			break;
		case 7:
			romano = romano+"DCC";
			break;
		case 8:
			romano = romano+"DCCC";
			break;
		case 9:
			romano = romano+"CM";
			break;
		default:
			break;
		}		
			
		switch (decena) {
		case 1:
			romano = romano+"X";
			break;
		case 2:
			romano = romano+"XX";
			break;
		case 3:
			romano = romano+"XXX";
			break;
		case 4:
			romano = romano+"XL";
			break;
		case 5:
			romano = romano+"L";
			break;
		case 6:
			romano = romano+"LX";
			break;
		case 7:
			romano = romano+"LXX";
			break;
		case 8:
			romano = romano+"LXXX";
			break;
		case 9:
			romano = romano+"XC";
			break;
		default:
			break;
		}
		
		switch (unidad) {
		case 1:
			romano = romano+"I";
			break;
		case 2:
			romano = romano+"II";
			break;
		case 3:
			romano = romano+"III";
			break;
		case 4:
			romano = romano+"IV";
			break;
		case 5:
			romano = romano+"V";
			break;
		case 6:
			romano = romano+"VI";
			break;
		case 7:
			romano = romano+"VII";
			break;
		case 8:
			romano = romano+"VIII";
			break;
		case 9:
			romano = romano+"IX";
			break;
		default:
			break;
		}
		
		System.out.println("Romano: "+romano);
	
	}
}
