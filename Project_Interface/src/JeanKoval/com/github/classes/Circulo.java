package JeanKoval.com.github.classes;

import JeanKoval.com.github.interfaces.FiguraGeometrica;

public class Circulo implements FiguraGeometrica {
	private Float raio;
	private Float PI = 3.14f;
	private Float area;
	private Float perimetro;

	public Circulo(Float raio) {
		this.raio = raio;
	}

	@Override
	public void calArea() {
		this.area = this.PI*(this.raio*this.raio);
		
		System.out.println("A Área do Circulo com");
		System.out.println("Raio: "+ this.raio +" Diametro: "+ (this.raio*2));
		System.out.println("É igual a "+ this.area);
	}
	
	@Override
	public void calPerimetro() {
		this.perimetro = (2*this.PI)*this.raio;
		
		System.out.println("A Perimetro do Circulo com");
		System.out.println("Raio: "+ this.raio +" Diametro: "+ (this.raio*2));
		System.out.println("É igual a "+ this.perimetro);
	}
}
