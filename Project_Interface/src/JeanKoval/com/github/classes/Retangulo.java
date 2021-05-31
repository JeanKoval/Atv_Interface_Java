package JeanKoval.com.github.classes;

import JeanKoval.com.github.interfaces.FiguraGeometrica;

public class Retangulo implements FiguraGeometrica {
	public Float base;
	public Float altura;
	public Float area;
	public Float perimetro;
		
	public Retangulo(Float base, Float altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public void calArea() {
		this.area = (this.base*this.altura);
		
		System.out.println("A Área do Retangulo com");
		System.out.println("Base: "+ this.base +" Altura: "+ this.altura);
		System.out.println("É igual a "+ this.area);
	}
	
	@Override
	public void calPerimetro() {
		this.perimetro = (this.base+this.altura);
		this.perimetro = this.perimetro*2;
		
		System.out.println("A Perimetro do Retangulo com");
		System.out.println("Base: "+ this.base +" Altura: "+ this.altura);
		System.out.println("É igual a "+ this.perimetro);
		
	}
}
