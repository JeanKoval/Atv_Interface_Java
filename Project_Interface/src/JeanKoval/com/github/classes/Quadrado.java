package JeanKoval.com.github.classes;

import JeanKoval.com.github.interfaces.FiguraGeometrica;

public class Quadrado extends Quadrilatero implements FiguraGeometrica {
	
	public Quadrado(Float base, Float altura) {
		setBase(base);
		setAltura(altura);
	}

	@Override
	public void calArea() {
		this.area = (getBase()*getAltura());
		
		System.out.println("A Área do Quadrado com todos os lados com " + getBase() +" cm");
		System.out.println("É igual a "+ getArea());
	}
	
	@Override
	public void calPerimetro() {
		setPerimetro(getBase() * 4);
		
		System.out.println("A Perimetro do Quadrado com todos os lados " + getBase());
		System.out.println("É igual a "+ getPerimetro());
	}
	
	@Override
	public void setBase(Float base) {
		if ( getAltura() != null && !getAltura().equals(base)) {
			throw new RuntimeException("Base não pode ser igual a Altura");
		}
		this.base = base;
	}
	
	@Override
	public void setAltura(Float altura) {
		if ( getBase() != null && !getBase().equals(altura)) {
			throw new RuntimeException("Base não pode ser igual a Altura");
		}
		this.altura = altura;
	}
}
