package ListaAv1;

import java.util.Scanner;

public class POO13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int QuantPessoas = 5;
        int[] Idades = new int[QuantPessoas];
        float[] Alturas = new float[QuantPessoas];

        for (int pessoa = 0; pessoa < QuantPessoas; pessoa++) {
            System.out.printf("\nDigite a idade da pessoa %d: ", pessoa + 1);
            Idades[pessoa] = teclado.nextInt();
            System.out.printf("\nDigite a altura da pessoa %d: ", pessoa + 1);
            Alturas[pessoa] = teclado.nextFloat();
        }
        ImprimirInverso(Idades, Alturas);
    }
    public static void ImprimirInverso(int[] idades, float[] alturas) {
        for (int pessoa = idades.length - 1; pessoa >= 0; pessoa--) {
            System.out.printf("\nA idade da pessoa %d é: %d anos", pessoa + 1, idades[pessoa]);
            System.out.printf("\nA altura da pessoa %d é: %.2f metros", pessoa + 1, alturas[pessoa]);
        }
    }
}