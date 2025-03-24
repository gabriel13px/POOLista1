package ListaAv1;

import java.util.Scanner;

public class POO1 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int QuantNumeros = 3;
        int[] Numeros = new int[QuantNumeros];

        for (int i = 0; i < QuantNumeros; i++) {
            System.out.print("Digite um número: ");
            Numeros[i] = Teclado.nextInt();
        }

        int[] Extremos = MaiorMenor(Numeros);
        System.out.printf("O Maior número é %d e o Menor é %d", Extremos[1], Extremos[0]);
    }

    public static int[] MaiorMenor(int[] numeros) {
        int maior = numeros[0];
        int menor = numeros[0];
        for (int i = 1;i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return new int[]{menor , maior};
    }
}
