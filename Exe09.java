package lista05;

import java.util.Scanner;

public class Exe09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		System.out.println(numero);
		
		if (numero <= 10) {
			System.out.println("O número é positivo");
		}else if (numero >= -10) {
			System.out.println("O número é negativo");
		}
		sc.close();
	}

}
