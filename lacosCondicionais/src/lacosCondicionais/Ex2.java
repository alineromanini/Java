package lacosCondicionais;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero: ");
		num = leia.nextInt();
		
		if (num % 2 == 0  && num > 0) {
			System.out.println("O número " + num + " é par e positivo!\n");
		} else if (num % 2 == 0  && num < 0){
			System.out.println("O número " + num + " é par e negativo!\n");
		} else if (num % 2 != 0  && num < 0){
			System.out.println("O número " + num + " é ímpar e negativo!\n");
		} else if (num % 2 != 0  && num > 0){
			System.out.println("O número " + num + " é ímpar e positivo!\n");
		} else {
			System.out.println("O número digitado é zero");
		}
		
		leia.close();
	}

}
