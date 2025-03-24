package ListaAv1;

import java.util.Scanner;

public class POO15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int SaldoUsuario = 1000,LimiteMin =10, LimiteMax=2000;
        int QuantNotas100 = 1, QuantNotas50 = 1, QuantNotas10 = 0, QuantNotas5 = 0, QuantNotas2 = 10;
        int Continuar = 0, Saque;
        int Notas100 = 0, Notas50 = 0, Notas10 = 0, Notas5 = 0, Notas2 = 0;
        //reparei só depois que podia ter encurtado essas variaveis, mas faço isso depois
        System.out.printf("CAIXA ELETRONICO:\nSALDO:%d\nDESEJA REALIZAR UM SAQUE ?\nSIM:1\nNÂO:0\n", SaldoUsuario);
        Continuar = teclado.nextInt();
        while(Continuar == 1&&SaldoUsuario > 0){
            System.out.printf("SALDO:%d\nValor do saque:", SaldoUsuario);
            Saque = teclado.nextInt();
            if(Saque <= SaldoUsuario && VerificadorSaque(Saque,QuantNotas100,QuantNotas50,QuantNotas10,QuantNotas5,QuantNotas2) && Saque >= LimiteMin && Saque <=LimiteMax ){
                SaldoUsuario = SaldoUsuario - Saque;
                Notas100 = Saque/100;
                if(Notas100  > QuantNotas100){
                    Notas100 = QuantNotas100;
                    QuantNotas100 = -1*(QuantNotas100-Notas100);
                    Saque = Saque - (Notas100*100)+100*QuantNotas100;
                    QuantNotas100 = 0;
                }else{
                    QuantNotas100 = QuantNotas100  - Notas100;
                    Saque = Saque - (Notas100*100);
                }
                Notas50 = Saque/50;
                if(Notas50  > QuantNotas50){
                    Notas50 = QuantNotas50;
                    QuantNotas50 = -1*(QuantNotas50-Notas50);
                    Saque = Saque - (Notas50*50)+50*QuantNotas50;
                    QuantNotas50 = 0;
                }else{
                    QuantNotas50 = QuantNotas50  - Notas50;
                    Saque = Saque - (Notas50*50);
                }
                Notas10 = Saque/10;
                if(Notas10  > QuantNotas10){
                    Notas10 = QuantNotas10;
                    QuantNotas10 = -1*(QuantNotas10-Notas10);
                    Saque = Saque - (Notas10*10)+10*QuantNotas10;
                    QuantNotas10 = 0;
                }else{
                    QuantNotas10 = QuantNotas10  - Notas10;
                    Saque = Saque - (Notas10*10);
                }
                Notas5 = Saque/5;
                if(Notas5  > QuantNotas5){
                    Notas5 = QuantNotas5;
                    QuantNotas5 = -1*(QuantNotas5-Notas5);
                    Saque = Saque - (Notas5*5)+5*QuantNotas5;
                    QuantNotas5 = 0;
                }else{
                    QuantNotas5 = QuantNotas5  - Notas5;
                    Saque = Saque - (Notas5*5);
                }
                Notas2 = Saque/2;
                if(Notas2  > QuantNotas2){
                    Notas2 = QuantNotas2;
                    QuantNotas2 = -1*(QuantNotas2-Notas2);
                    Saque = Saque - (Notas2*2)+2*QuantNotas2;
                    QuantNotas2 = 0;
                }else{
                    QuantNotas2 = QuantNotas2  - Notas2;
                    Saque = Saque - (Notas2*2);
                }

                System.out.printf("Nota(s)100:%d\n", Notas100);
                System.out.printf("Nota(s)50:%d\n", Notas50);
                System.out.printf("Notas(s)10:%d\n", Notas10);
                System.out.printf("Nota(s)5:%d\n", Notas5);
                System.out.printf("Nota(s)2:%d\n", Notas2);
                Notas100 = 0;
                Notas50 = 0;
                Notas10 = 0;
                Notas5 = 0;
                Notas2 = 0;
                if(SaldoUsuario>0){
                    System.out.printf("Deseja fazer outro saque?\nSim - 1\nNão - 0\n");
                    Continuar = teclado.nextInt();
                }else{
                    Continuar = 0;
                }

            }else if(Saque > SaldoUsuario){
                System.out.printf("Valor Insuficiente Para Saque\n");

            }else{
                System.out.printf("Impossivel realizar Saque\n");
            }

        }
        System.out.printf("Obrigado tenha um otimo dia :)\n");
    }

    public static boolean VerificadorSaque(int Saque, int QuantNotas100,int QuantNotas50, int QuantNotas10, int QuantNotas5, int QuantNotas2){
        Saque = PassarPorNotas(Saque, QuantNotas100,100);
        Saque = PassarPorNotas(Saque, QuantNotas50,50);
        Saque = PassarPorNotas(Saque, QuantNotas10,10);
        Saque = PassarPorNotas(Saque, QuantNotas5,5);
        Saque = PassarPorNotas(Saque, QuantNotas2,2);
        if(Saque == 0){
            return true;
        }else{
            return false;
        }
    }
    public static int PassarPorNotas(int Saque, int QuantNotasDispo, int ValorNotas){
         int QuantNotas = Saque/ValorNotas;
        if(QuantNotas > QuantNotasDispo){
            return Saque - (QuantNotas *ValorNotas)+ValorNotas*(-1*(QuantNotasDispo - QuantNotas));
        }else{
            return Saque - (QuantNotas *ValorNotas);
        }
    }
}
