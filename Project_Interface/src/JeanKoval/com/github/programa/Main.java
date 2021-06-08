package JeanKoval.com.github.programa;

import java.util.ArrayList;
import java.util.Scanner;

import JeanKoval.com.github.classes.*;
import JeanKoval.com.github.interfaces.FiguraGeometrica;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Float altura, base;
		
		Integer op=1;
		
		while(op != 0) {
			do {
				
				System.out.println("\nPara calcular a Área e o Perimetro, escolha uma das Figuras:");
				System.out.println("1 - Triangulo");
				System.out.println("2 - Retangulo");
				System.out.println("3 - Quadrado");
				System.out.println("4 - Circulo");
				System.out.println("0 - Sair");
				
				System.out.print("Qual sua opção: ");
				op = scan.nextInt();
				
				if(op<0 || op>4) {
					
					System.out.println("\nOpção invalida, por favor tente novamente!");
				}
			}while(op<0 || op>4);
			
			switch(op) {
				case 1:
					ArrayList<Float> lados = new ArrayList<Float>();
					Float lado;
					
					System.out.println("\nVamos calcular um Triangulo, para isso");
					
					for(int i =0; i < 3; i++) {
						System.out.print("Digite o "+(i+1)+" lado: ");
						lado = scan.nextFloat();
						lados.add(lado);
					}
					
					System.out.print("Digite a altura: ");
					altura = scan.nextFloat();
					
					System.out.print("Digite a base: ");
					base = scan.nextFloat();
					
					FiguraGeometrica trian = new Triangulo(lados.get(0), lados.get(1), lados.get(2), base, altura);
					
					System.out.println();
					trian.calArea();
					
					System.out.println();
					trian.calPerimetro();
					
					System.out.println("____________________________________________________\n");
					
					break;
				case 2:
					System.out.println("\nVamos calcular um Retangulo, para isso");
					System.out.print("Digite a altura: ");
					altura = scan.nextFloat();
					
					System.out.print("Digite a base: ");
					base = scan.nextFloat();
					
					FiguraGeometrica retan = new Retangulo(base, altura);
					
					System.out.println();
					retan.calArea();
					
					System.out.println();
					retan.calPerimetro();
					
					System.out.println("____________________________________________________\n");
					
					break;
				case 3:
					System.out.println("\nVamos calcular um Quadrado, para isso");
					System.out.print("Digite a altura: ");
					altura = scan.nextFloat();
					
					System.out.print("Digite a base: ");
					base = scan.nextFloat();
					
					FiguraGeometrica quadrado = new Quadrado(base, altura);
					
					System.out.println();
					quadrado.calArea();
					
					System.out.println();
					quadrado.calPerimetro();
					
					System.out.println("____________________________________________________\n");
					
					break;
				case 4:
					System.out.println("\nVamos calcular um Circulo, para isso");
					System.out.print("Digite o valor do raio: ");
					Float raio = scan.nextFloat();
					
					FiguraGeometrica circulo = new Circulo(raio);
					
					System.out.println();
					circulo.calArea();
					
					System.out.println();
					circulo.calPerimetro();
					
					System.out.println("____________________________________________________\n");
					
					break;
			}
			
			if(op!=0) {
				System.out.println("Deseja calcular mais alguma figura? 1 para SIM e 0 para NÃO");
				System.out.print("Escolha: ");
				op = scan.nextInt();
			}
		};
		System.out.println("\nPrograma encerrado.");
		
		scan.close();

	}

}
