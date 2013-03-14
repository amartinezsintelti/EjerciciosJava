package mx.com.sintelti.desafios.oporx;

import javax.swing.JOptionPane;


public class MainApp {


	public static void main(String[] args) {
		String 	mensaje ,
				solucion;
		
		MesajeDF	mensajeDF 	= 	new MesajeDF();
		MensajeQro	mensajeQro 	=	new MensajeQro(); 
		
		mensaje = JOptionPane.showInputDialog("Escriba su mensaje");
		
		solucion = mensajeDF.convertir(mensaje);
		
		JOptionPane.showMessageDialog(null, "Su mensaje es : " + solucion, "Mensaje utilizando Interfaz",JOptionPane.PLAIN_MESSAGE);
		
		System.out.println(mensajeQro.convertir("Hola"));
		
		System.exit(0);
		
	}

}
