package Questoes;

import java.util.Scanner;

public class Atividade01 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Metodo calculos = new Metodo();
		
		double v_hora, horasTrabalhadas, imposto, salarioBruto, salarioLiquido = 0;
		final double TAXA_IMPOSTO = 0.3;
		
		System.out.print("Informe o valor recebido por hora trabalhada em reais: ");
		v_hora = teclado.nextDouble();
		
		System.out.print("Informe quantas horas você trabalha por mês: ");
		horasTrabalhadas = teclado.nextDouble();
		
		salarioBruto = calculos.calcularS_Bruto(v_hora, horasTrabalhadas);
		
		calculos.calcularS_Liquido(TAXA_IMPOSTO, salarioBruto);
	}
}
