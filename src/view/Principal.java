/*
 * Exercício de recursividade, soma de números de forma indireta, usando recursividade.
 * versão 1.0
 * data 17/08/2025
 * programador Henrique Foganholi de Oliveira
 */

package view;
import controller.FalsaSomaController;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		FalsaSomaController controle = new FalsaSomaController();
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite valor para A: ");
		int A = sc.nextInt();
		System.out.print("Digite valor para B: ");
		int B = sc.nextInt();
		int resultado = controle.somaRecursividade(A, B);
		System.out.println("A soma resulta em " + resultado + ".");
		sc.close();
	}
}
