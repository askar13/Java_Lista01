package Questoes;

public class Metodo {

	// ATIVIDADE 01
	double calcularS_Bruto(double v_hora, double horasTrabalhadas) {
		System.out.println("Valor do salario bruto: R$ " + (v_hora * horasTrabalhadas));
	
		return (v_hora * horasTrabalhadas);
	}
	
	void calcularS_Liquido(double taxa, double salarioBruto) {
		double imposto = (salarioBruto * taxa);
		System.out.println("Valor do salario liquido: R$ " + (salarioBruto - imposto));
	}
	
	//ATIVIDADE 02
	double calculaPrecoQW(double salarioMinimo) {
		return (salarioMinimo * 0.01);
	}
	
	void calculaFatura(double gastoQW, double precoQW) {
		System.out.println("O valor da fatura será de " + (gastoQW * precoQW));
	}
	
	//ATIVIDADE 03
	void classificaLados(double lados[]) {
		if(lados[0] == lados[1] && lados[1] == lados[2] && lados[2] == lados[0]) {
			System.out.println("É um triangulo equilatero.");
		}
		else if(lados[0] != lados[1] && lados[1] != lados[2] && lados[2] != lados[0]) {
			System.out.println("É um triangulo escaleno.");
		}
		else {
			System.out.println("É um triangulo isoceles.");
		}
	}
	
	void classificaAngulos(double angulos[]) {
		if (angulos[0] + angulos[1] + angulos[2] != 180) {
			System.out.println("Isso não é um triangulo.");
		}
		else if(angulos[0] == 90 || angulos[1] == 90 || angulos[2] == 90) {
			System.out.println("É um triangulo retangulo.");
		}
		else if(angulos[0] < 90 || angulos[1] < 90 || angulos[2] < 90) {
			System.out.println("É um triangulo obtusangulo.");
		}
		else {
			System.out.println("É um triangulo acutangulo.");
		}
	}
	
	//ATIVIDADE 04
	
}
