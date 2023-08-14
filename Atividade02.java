package Questoes;

import java.util.Scanner;

public class Atividade02 {
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		Metodo calculos = new Metodo();
		double salarioMinimo, gastoQW, precoQW;
		
		System.out.print("Informe o valor do salario minimo: ");
		salarioMinimo = teclado.nextDouble();
		
		System.out.print("Informe o valor quilowatts gastos: ");
		gastoQW = teclado.nextDouble();
		
		precoQW = calculos.calculaPrecoQW(salarioMinimo);
		
		calculos.calculaFatura(gastoQW, precoQW);
	}
	
	
	
	 
}
