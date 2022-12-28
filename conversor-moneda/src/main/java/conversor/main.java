package conversor;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funciones monedas = new Funciones();
		String opciones = (JOptionPane.showInputDialog(
		                    null,
		                    "Seleccione una opción de conversión",
		                    "Menu",
		                    JOptionPane.PLAIN_MESSAGE,
		                    null, new Object[] {"Conversor de monedas", "Conversor de temperaturas"},
		                   "Seleccion")).toString();
		
		switch (opciones) {
		case "Conversor de monedas": {
		     String input = JOptionPane.showInputDialog("Ingrese un valor a convertir");
		     double valorRecibido = Double.parseDouble(input);
		     monedas.ConvertirMoneda(valorRecibido);
		     int seleccion = JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversion?");
		     if (JOptionPane.OK_OPTION == seleccion) {
				System.out.println("Selecciona opción afirmativa");
			} else {
				JOptionPane.showConfirmDialog(null,"Preograma terminado"); 
			}
		     
		}
		case "Conversor de temperaturas": {
		     String input = JOptionPane.showInputDialog("Ingrese un valor a convertir");  
		     double valorRecibido = Double.parseDouble(input);
		   
		}
		}
		
	}

}
