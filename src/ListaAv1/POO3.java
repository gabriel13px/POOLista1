package ListaAv1;

import java.util.Scanner;

public class POO3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        if (VerificadorPrimo(numero)) {
            System.out.println("O valor é primo");
        } else {
            System.out.println("O valor não é primo");
        }
    }

    public static boolean VerificadorPrimo(int Numero) {
        int divisores = 0;
        for (int contagem = 1; contagem <= Numero; contagem++) {
            if (Numero % contagem == 0) {
                divisores++;
            }
        }
        if(divisores <= 2 && Numero > 0){
            return true;
        }else{
            return false;
        }
    }
}
