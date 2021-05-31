package JeanKoval.com.github.classes;

import JeanKoval.com.github.interfaces.FiguraGeometrica;

public class Quadrado implements FiguraGeometrica {
	private Float lados;
	private Float area;
	private Float perimetro;
	
	public Quadrado(Float lados) {
		this.lados = lados;
	}

	@Override
	public void calArea() {
		this.area = (this.lados*this.lados);
		
		System.out.println("A Área do Quadrado com todos os lados com " + this.lados+" cm");
		System.out.println("É igual a "+ this.area);
	}
	
	@Override
	public void calPerimetro() {
		this.perimetro = this.lados * 4;
		
		System.out.println("A Perimetro do Quadrado com todos os lados " + this.lados);
		System.out.println("É igual a "+ this.perimetro);
	}
}
