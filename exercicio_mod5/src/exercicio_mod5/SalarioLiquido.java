package exercicio_mod5;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos;
		
		System.out.printf("Digite o salario bruto: \n");
		salarioBruto = leia.nextFloat();
		
		System.out.printf("Digite o adicional noturno: \n");
		adicionalNoturno = leia.nextFloat();
		
		System.out.printf("Digite a quantidade de horas extras: \n");
		horasExtras = leia.nextFloat();
		
		System.out.printf("Digite os descontos do colaborador: \n");
		descontos = leia.nextFloat();

		System.out.printf("O salário líquido é: %.2f\n", (salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos));
		
		leia.close();
	}

}
