package exercicio_mod5;

import java.util.Scanner;

public class DiferencaProduto {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4;
		
		System.out.printf("Digite o primeiro valor: \n");
		n1 = leia.nextFloat();
		
		System.out.printf("Digite o segundo valor: \n");
		n2 = leia.nextFloat();
		
		System.out.printf("Digite o terceiro valor: \n");
		n3 = leia.nextFloat();
		
		System.out.printf("Digite o quarto valor: \n");
		n4 = leia.nextFloat();
		
		System.out.printf("%.1f", ((n1 * n2) - (n3 * n4)));
		
		leia.close();
	}

}
