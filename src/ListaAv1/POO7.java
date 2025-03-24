package ListaAv1;

import java.util.Scanner;

public class POO7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int Tamanho,Menor,Maior,Soma,Idade;
        float Media;
        Maior = -1;
        Menor = 0;
        Soma = 0;
        Tamanho = -1;
        do{
            if(Maior == -1){
                System.out.print("\nDigite a idade: ");
                Idade = teclado.nextInt();
                Maior = Idade;
                Menor = Idade;
            }else{
                System.out.print("\nDigite a idade: ");
                Idade = teclado.nextInt();
            }
            Soma = Soma + Idade;
            if (Maior < Idade) {
                Maior = Idade;
            }
            if (Menor > Idade && Idade != 0) {
                Menor = Idade;
            }
            Tamanho++;
        }while(Idade!=0);
        Media = Soma/Tamanho;
        System.out.printf("São %d Pessoas\n",Tamanho);
        System.out.printf("A Soma das idades é: %d \n",Soma);
        System.out.printf("A Media das idades é: %.1f \n",Media);
        System.out.printf("A Menor idade é: %d\n",Menor);
        System.out.printf("A Maior idade é: %d\n",Maior);

    }
}
