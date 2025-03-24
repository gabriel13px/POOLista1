package ListaAv1;

import java.util.Scanner;

public class POO10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int QuantImpares = 0, QuantPares = 0,QuantNumeros = 20;
        int[] NumerosTotais = new int[QuantNumeros];
        for(int Numeros = 0; Numeros < QuantNumeros; Numeros++){
            System.out.println("Digite um numero: ");
            NumerosTotais[Numeros] = teclado.nextInt();
            if(NumerosTotais[Numeros]%2 == 0){
                QuantPares++;
            }else{
                QuantImpares++;
            }
        }
        int[] NumerosImpares = new int[QuantImpares];
        int[] NumerosPares = new int[QuantPares];
        int IndicePares = 0, IndiceImpares = 0;

        for(int Numeros = 0; Numeros < QuantNumeros; Numeros++){
            if(NumerosTotais[Numeros]%2 == 0){
                NumerosPares[IndicePares] = NumerosTotais[Numeros];
                IndicePares++;
            }else{
                NumerosImpares[IndiceImpares] = NumerosTotais[Numeros];
                IndiceImpares++;
            }
        }
        System.out.print("Vetor Numeros Totais:");
        ImprimirVetor(NumerosTotais);
        System.out.print("\n Vetor Numeros Impares:");
        ImprimirVetor(NumerosImpares);
        System.out.print("\n Vetor Numeros Pares:");
        ImprimirVetor(NumerosPares);

    }

    public static void ImprimirVetor(int[] VetorNumeros){
        for(int Numeros = 0; Numeros < VetorNumeros.length; Numeros++){
            System.out.print(VetorNumeros[Numeros]+" ");
        }
        System.out.println();
    }
}
