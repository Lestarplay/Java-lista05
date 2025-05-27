package lista05;

import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

       
        String parOuImpar = (numero % 2 == 0) ? "par" : "ímpar";

      
        String sinal;
        if (numero > 0) {
            sinal = "positivo";
        } else if (numero < 0) {
            sinal = "negativo";
        } else {
            sinal = "zero";
        }

        
        System.out.println("O número " + numero + " é " + parOuImpar + " e " + sinal + ".");

        scanner.close();
    }
}