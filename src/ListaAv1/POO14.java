package ListaAv1;

import java.util.Scanner;

public class POO14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int TamanhoVetor1 = 10, TamanhoVetor2 = 10,Indice1 = 0, Indice2 = 0;
        float[] VetorEntrada1 = new float[TamanhoVetor1];
        float[] VetorEntrada2 = new float[TamanhoVetor2];
        float[] VetorResultado = new float[TamanhoVetor2+TamanhoVetor1];
        PreencherVetor(VetorEntrada1,1,teclado);
        PreencherVetor(VetorEntrada2,2,teclado);

        for(int IndiceT = 0; IndiceT < TamanhoVetor1+TamanhoVetor2; IndiceT++){
            if(IndiceT % 2 == 0){
                VetorResultado[IndiceT] = VetorEntrada1[Indice1];
                Indice1++;
            }else{
                VetorResultado[IndiceT] = VetorEntrada2[Indice2];
                Indice2++;
            }
        }
        System.out.print("VetorResultado:");
        for(float valor : VetorResultado){
            System.out.printf("%.1f ", valor);
        }

    }

    public static void PreencherVetor(float[] Vetor,int NumeroVetor,Scanner teclado){
        for(int Tamanho = 0; Tamanho < Vetor.length; Tamanho++){
            System.out.printf("Digite o valor %d para o vetor %d: ",Tamanho+1, NumeroVetor);
            Vetor[Tamanho] = teclado.nextFloat();
        }
    }
}
