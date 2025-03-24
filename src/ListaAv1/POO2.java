package ListaAv1;
import java.util.Scanner;
public class POO2 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int QuantNumeros = 10, Soma = 0,Maior,Menor;
        float Media;
        int[] Numeros = new int[QuantNumeros];

        for (int i = 0; i < QuantNumeros; i++) {
            System.out.print("Digite um número: ");
            Numeros[i] = Teclado.nextInt();
            Soma += Numeros[i];
        }

        int[] extremos = MaiorMenor(Numeros);
         Maior = extremos[1];
         Menor = extremos[0];
        Media = Soma / QuantNumeros;
        System.out.printf("O Maior é %d\nO Menor é %d\nA Soma é %d\nA Média é %.1f\n", Maior, Menor, Soma, Media);
    }

    public static int[] MaiorMenor(int[] numeros) {
        int maior = numeros[0];
        int menor = numeros[0];

        for (int nummero : numeros) {
            if (nummero > maior) {
                maior = nummero;
            }
            if (nummero < menor) {
                menor = nummero;
            }
        }
        return new int[]{menor, maior};
    }
}

