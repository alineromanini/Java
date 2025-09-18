package lacosCondicionais;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		int qtd, item;
		
		System.out.println("Digite o código do produto de 1 a 6: \n");
		item = leia.nextInt();
		
		System.out.println("Digite a quantidade comprada: \n");
		qtd = leia.nextInt();
		
		
		switch (item) {
        case 1:
            System.out.println("Produto: Cachorro Quente");
            System.out.printf("Valor total: R$ %.2f%n", 10.00 * qtd);
            break;

        case 2:
            System.out.println("Produto: X-Salada");
            System.out.printf("Valor total: R$ %.2f%n", 15.00 * qtd);
            break;

        case 3:
            System.out.println("Produto: X-Bacon");
            System.out.printf("Valor total: R$ %.2f%n", 18.00 * qtd);
            break;

        case 4:
            System.out.println("Produto: Bauru");
            System.out.printf("Valor total: R$ %.2f%n", 12.00 * qtd);
            break;

        case 5:
            System.out.println("Produto: Refrigerante");
            System.out.printf("Valor total: R$ %.2f%n", 8.00 * qtd);
            break;

        case 6:
            System.out.println("Produto: Suco de Laranja");
            System.out.printf("Valor total: R$ %.2f%n", 13.00 * qtd);
            break;

        default:
            System.out.println("Código inválido! Digite um número entre 1 e 6.");
    }

		leia.close();
}
}

