package repeticoes;

import java.util.Scanner;

public class Ex4_lista3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade, idGenero, pessoaDev, totalRespostas = 0, backend = 0, mulheresFront = 0, homensMob = 0;
		int naoBinarFull = 0;
		String continua = "S";
		float somaIdades = 0;
		float mediaIdades = 0;

		while (continua.equalsIgnoreCase("S")) {

			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();

			System.out.println("1 - Mulher Cis");
			System.out.println("2 - Homem Cis");
			System.out.println("3 - Não Binário");
			System.out.println("4 - Mulher Trans");
			System.out.println("5 - Homem Trans");
			System.out.println("6 - Outros\n");
			System.out.println("Digite a sua identidade de gênero");
			idGenero = leia.nextInt();

			System.out.println("1 - Backend");
			System.out.println("2 - Frontend");
			System.out.println("3 - Mobile");
			System.out.println("4 - Fullstack");
			System.out.println("Digite que tipo de pessoa desenvolvedora você é: ");
			pessoaDev = leia.nextInt();

			// Total de pessoas desenvolvedoras Backend
			if (pessoaDev == 1) {
				backend++;
			}

			// Total de mulheres Cis e Trans desenvolvedoras Frontend
			if (pessoaDev == 2 && idGenero == 1 || idGenero == 4) {
				mulheresFront++;
			}

			// Total de homens Cis e Trans desenvolvedores Mobile maiores de 40 anos
			if (pessoaDev == 3 && (idGenero == 2 || idGenero == 5) && idade > 40) {
				homensMob++;
			}

			// Total de não binários desenvolvedores Fullstack menores de 30 anos
			if (pessoaDev == 4 && idGenero == 3 && idade < 30) {
				naoBinarFull++;
			}

			// Soma de todas as idades
			somaIdades += idade;
			// Total de pessoas que respoderam à pesquisa
			totalRespostas++;

			System.out.println("Deseja continuar (S/N)?");
			leia.skip("\\R"); // ignora o \n ou o enter do buffer
			continua = leia.nextLine().toUpperCase();
		}
		// Média da idade das pessoas que responderam à pesquisa
		mediaIdades = (somaIdades / totalRespostas);

		System.out.printf("Total de pessoas desenvolvedoras Backend: %d%n%n", backend);
		System.out.printf("Total de mulheres Cis e Trans desenvolvedoras Frontend: %d%n%n", mulheresFront);
		System.out.printf("Total de homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: %d%n%n", homensMob);
		System.out.printf("Total de não binários desenvolvedores Fullstack menores de 30 anos: %d%n%n", naoBinarFull);
		System.out.printf("Total de pessoas que responderam à pesquisa: %d%n%n", totalRespostas);
		System.out.printf("Média das idades das pessoas que responderam à pesquisa: %.2f anos", mediaIdades);

		leia.close();
	}

}
