package lista05;

import java.util.Scanner;

public class Exe08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a sua idade: ");
		double c = sc.nextDouble();
		
		System.out.printf("Categoria: ", c);
		
		if (c <=14) {
			System.out.println("Corresponde na categoria Criança");
		}else if (c <=17) {
			System.out.println("Corresponde na categoria Adolescente");
		}else if (c <=50) {
			System.out.println("Corresponde na categoria Adulto");
		}else if (c <=100) {
			System.out.println("Corresponde na categoria Idoso");
	 }
	sc.close();
	}
     
}
