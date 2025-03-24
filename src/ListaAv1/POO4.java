package ListaAv1;
import java.util.Scanner;

public class POO4 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int limiteInferior, limiteSuperior, valorIntervalo;
        System.out.println("Digite Limite Inferior e o Superior:");
         limiteInferior = Teclado.nextInt();
         limiteSuperior = Teclado.nextInt();

        System.out.print("\nDigite numero intervalo:");
         valorIntervalo = Teclado.nextInt();
        if(estaNoIntervalo(limiteInferior, limiteSuperior, valorIntervalo)) {
            System.out.println("Valor está no intervalo.");
        }else{
            System.out.println("Valor não está no intervalo.");
        }
    }
    public static boolean estaNoIntervalo(int LimiteInferior, int LimiteSuperior, int valor) {
        return valor >= LimiteInferior && valor <= LimiteSuperior;
    }
}