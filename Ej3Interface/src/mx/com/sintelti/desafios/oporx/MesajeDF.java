package mx.com.sintelti.desafios.oporx;

public class MesajeDF implements Solucion{

	public String convertir(String entrada)
	{		
		String 	resultado = "";
		int 	contador = 0;
				
		while (entrada.indexOf("o") > -1){
			contador += 1;
			resultado = resultado + entrada.substring(0,entrada.indexOf("o"));
			for (int i=0 ; i < contador; i++){
				resultado = resultado + "x";
			}
			entrada = entrada.substring(entrada.indexOf("o")+1,entrada.length());
		}
				
		return resultado;
	}
}
