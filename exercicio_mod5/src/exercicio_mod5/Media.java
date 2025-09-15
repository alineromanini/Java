package exercicio_mod5;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Variáveis para as notas 
		
		float nota1, nota2, nota3, nota4;
		
		//Recebe as quatro notas
		
		System.out.printf("Digite a primeira nota: \n");
		nota1 = leia.nextFloat();
		
		System.out.printf("Digite a segunda nota: \n");
		nota2 = leia.nextFloat();
		
		System.out.printf("Digite a terceira nota: \n");
		nota3 = leia.nextFloat();
		
		System.out.printf("Digite a primeira nota: \n");
		nota4 = leia.nextFloat();
		
		//Calcula a média final do aluno
		
		System.out.printf("A média final é: %.1f", (nota1 + nota2 + nota3 + nota4)/4);
		
		leia.close(); 
	}

}
