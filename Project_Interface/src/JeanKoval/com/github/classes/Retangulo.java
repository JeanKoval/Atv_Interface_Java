package JeanKoval.com.github.classes;

import JeanKoval.com.github.interfaces.FiguraGeometrica;

public class Retangulo extends Quadrilatero implements FiguraGeometrica {
	
	public Retangulo(Float base, Float altura) {
		setBase(base);
		setAltura(altura);
	}

	@Override
	public void calArea() {
		setArea(getBase()*getAltura());
		
		System.out.println("A �rea do Retangulo com");
		System.out.println("Base: "+ getBase() +" Altura: "+ getAltura());
		System.out.println("� igual a "+ getArea());
	}
	
	@Override
	public void calPerimetro() {		
		setPerimetro( (getBase()+getAltura()) * 2);
		
		System.out.println("A Perimetro do Retangulo com");
		System.out.println("Base: "+ getBase() +" Altura: "+ getAltura());
		System.out.println("� igual a "+ getPerimetro());		
	}
	
	@Override
	public void setBase(Float base) {
		if ( getAltura() != null && getAltura().equals(base)) {
			throw new RuntimeException("Base n�o pode ser igual a Altura");
		}
		this.base = base;
	}
	
	@Override
	public void setAltura(Float altura) {
		if ( getBase() != null && getBase().equals(altura)) {
			throw new RuntimeException("Base n�o pode ser igual a Altura");
		}
		this.altura = altura;
	}

}
