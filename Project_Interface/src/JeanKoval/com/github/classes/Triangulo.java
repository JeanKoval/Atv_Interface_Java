package JeanKoval.com.github.classes;

import JeanKoval.com.github.interfaces.FiguraGeometrica;

public class Triangulo implements FiguraGeometrica {
	private Float lado1;
	private Float lado2;
	private Float lado3;
	private Float base;
	private Float altura;
	private Float area;
	private Float perimetro;

	public Triangulo(Float lado1, Float lado2, Float lado3, Float base, Float altura) {
		this.lado1  = lado1;
		this.lado2  = lado2;
		this.lado3  = lado3;
		this.base   = base;
		this.altura = altura;
	}

	@Override
	public void calArea() {
		this.area = (this.altura*this.base)/2;
		
		System.out.println("A Área do Triangulo com");
		System.out.println("Base: "+ this.base +" Altura: "+ this.altura);
		System.out.println("É igual a "+ this.area);
	}
	
	@Override
	public void calPerimetro() {
		
		this.perimetro = (this.lado1+this.lado2+this.lado3);
		
		System.out.println("O Perimetro do Triangulo com os lados:");
		System.out.println(this.lado1+", "+ this.lado2+" e "+ this.lado3);
		System.out.println("É igual a "+ this.perimetro);
	}
	
}
