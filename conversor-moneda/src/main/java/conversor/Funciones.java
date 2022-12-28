package conversor;

import javax.swing.JOptionPane;

public class Funciones {
	
	ConvertirMonedas monedas = new ConvertirMonedas();

	public void ConvertirMoneda(double valorRecibido) {
		String opciones = (JOptionPane.showInputDialog(
                null,
                "Seleccione una la moneda que desea convertir",
                "Monedas",
                JOptionPane.PLAIN_MESSAGE,
                null, new Object[] {"De pesos a dolar", 
                		            "De pesos a Euro",
                		            "De pesos a Libras Esterlinas",
                		            "De pesos a Yen",
                		            "De pesos a Won corea del sur"},
               "Seleccion")).toString();
		
		switch (opciones) {
		case "De pesos a dolar": {
			monedas.ConvertirPesoDolar(valorRecibido);		
		}
		case "De pesos a Euro": {
		     monedas.ConvertirPesoEuro(valorRecibido);  	
		}
		case "De pesos a Libras Esterlinas": {
		     monedas.ConvertirPesoLibrasEsterlinas(valorRecibido);	
		}
		case "De pesos a Yen": {
		     monedas.ConvertirPesoYen(valorRecibido);   	
		}
		case "De pesos a Won corea del sur": {
		     monedas.ConvertirPesoWon(valorRecibido); 	
		}
		}
		
	}
	
	
	
	/*
	     Convertir de Dólar a la moneda de tu país
       - Convertir de Euros a la moneda de tu país
       - Convertir de Libras Esterlinas a la moneda de tu país
       - Convertir de Yen Japonés a la moneda de tu país
       - Convertir de Won sul-coreano a la moneda de tu país
	 */
}
