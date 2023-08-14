package Questoes;

import java.util.Scanner;

public class Atividade03 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Metodo calculos = new Metodo();
		double lados[] = new double [3];
		double angulos[] = new double [3];
		int i;
		
		for(i=0;i<3;i++) {
			System.out.print("Informe um lado do triangulo: ");
			lados[i] = teclado.nextDouble();
			
			System.out.print("Informe um angulo do triangulo: ");
			angulos[i] = teclado.nextDouble();
		}
		
		
		calculos.classificaLados(lados);
		calculos.classificaAngulos(angulos);
	}
}
