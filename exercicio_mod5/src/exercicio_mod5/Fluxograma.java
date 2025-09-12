package exercicio_mod5;

import java.util.Scanner;

public class Fluxograma {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salario, abono;
		
		System.out.printf("Digite o salario: \n");
		salario = leia.nextFloat();
		
		System.out.printf("Digite o abono: \n");
		abono = leia.nextFloat();
		
		System.out.printf("O novo salário é: %.2f \n", salario + abono);

		leia.close();
	}

}
