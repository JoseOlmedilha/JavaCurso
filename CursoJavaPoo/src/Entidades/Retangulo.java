package Entidades;

public class Retangulo {
	
	public double largura;
	public double altura;
	
	public double area() {
		return altura*largura;
	}
	
	public double perimetro() {
		return altura*2 + largura*2;
	}
	public double diagonal() {
		return Math.sqrt(largura*largura + altura*altura);
	}
	public String toString() {
		return "area "+ area() + ", perimetro: " + perimetro()+ " Diagonal: "+ diagonal();
				
	}
}
