package helloworld;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); //leia é o objeto da classe Scanner pra ler o que o usuário digitar
		
		System.out.println("Digite o peso: ");
		int peso = leia.nextInt();
		
		System.out.println("Digite o valor: ");
		float valor = leia.nextFloat();
		
		System.out.println("Digite a opcao: ");
		char opcao = leia.next().charAt(0);
		
		System.out.println("O valor da variável opcao é: " + opcao);
		System.out.printf("O valor da variável valor é: %.2f \n", valor);
		System.out.println("O valor da variável peso é: " + peso);

		leia.close();
	}

}
