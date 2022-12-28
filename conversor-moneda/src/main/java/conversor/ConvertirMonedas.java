package conversor;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	public void ConvertirPesoDolar(double valorRecibido) {
		double monedaDolar = valorRecibido / 365;
		monedaDolar = (double) Math.round(monedaDolar*100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $" + monedaDolar +" Dolares");
	}
	public void ConvertirPesoEuro(double valorRecibido) {
		double monedaEuro = valorRecibido / 355;
		monedaEuro  = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $" + monedaEuro  +" Euros");
	}
	public void ConvertirPesoLibrasEsterlinas(double valorRecibido) {
		double monedaEuro = valorRecibido / 0.0047;
		monedaEuro  = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $" + monedaEuro  +" Euros");
	}
	public void ConvertirPesoYen(double valorRecibido) {
		double monedaEuro = valorRecibido / 0.76;
		monedaEuro  = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $" + monedaEuro  +" Euros");
	}
	public void ConvertirPesoWon(double valorRecibido) {
		double monedaEuro = valorRecibido / 7.22;
		monedaEuro  = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $" + monedaEuro  +" Euros");
	}
}

