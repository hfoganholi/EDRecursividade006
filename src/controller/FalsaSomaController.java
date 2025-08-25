/*
 * Exercício de recursividade, soma de números de forma indireta, usando recursividade.
 * versão 1.0
 * data 17/08/2025
 * programador Henrique Foganholi de Oliveira
 */

package controller;

public class FalsaSomaController {

	public FalsaSomaController() {
		super();
	}
	public int somaRecursividade(int A, int B) {
		// Condição de parada
		// A soma será realizada na função recursiva, quando B == 0
		// E retornar A.
		if (B == 0) {
			return A;
		}
		// Relação dos passos, a recursividade, na verdade, transforma o que
		// seria uma soma em incremento da variável A, através da subtração
		// consecutiva de B.
		else {
			return somaRecursividade(A, B - 1) + 1;
		}
	}
}
