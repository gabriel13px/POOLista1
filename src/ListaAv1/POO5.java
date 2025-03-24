package ListaAv1;

import java.util.Scanner;

public class POO5 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int Numero;
        System.out.print("Digite um numero: ");
        Numero = Teclado.nextInt();
        while(!Intervalo(12,20,Numero)){
            System.out.print("\nNumero invalido, digite novamente: ");
            Numero = Teclado.nextInt();
        }
        System.out.printf("\nO numero digitado é %d\n",Numero);
    }
    public static boolean Intervalo(int LimiteInferior, int LimiteSuperior, int valor) {
        return valor >= LimiteInferior && valor <= LimiteSuperior;
    }
}
