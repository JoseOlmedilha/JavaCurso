package Entidades;

public class ConverterDolar {

	public static double conversor(double qtnd, double v) {
		return qtnd * v; 
	}
	
	public static double valorPago(double valor) {
		return valor + valor * 0.06;
	}
}
