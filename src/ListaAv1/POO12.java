package ListaAv1;

import java.util.Scanner;

public class POO12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int QuantNumeros = 5;
        int[] Numeros = new int[QuantNumeros];

        for (int i = 0; i < QuantNumeros; i++) {
            System.out.print("\nDigite um número: ");
            Numeros[i] = teclado.nextInt();
        }
        calcularEExibirResultados(Numeros);
    }
    // eu podia ter deixado mais generico colocando pra ele retornar um vetor, mas o codigo não pedia
    public static void calcularEExibirResultados(int[] Numeros) {
        int soma = 0, multiplicacao = 1;
        for (int num : Numeros) {
            soma += num;
            multiplicacao *= num;
        }
        System.out.printf("A soma dos números é: %d\n", soma);
        System.out.printf("A multiplicação dos números é: %d\n", multiplicacao);
    }
}
