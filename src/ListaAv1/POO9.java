package ListaAv1;
import java.util.Scanner;
public class POO9 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int[] Lados= new int[3];
        int LadoMaior, LadoMenor, LadoInter;
        int operação;
       for(int Lado = 0; Lado<3;Lado++){
           System.out.println("Digite um Lado: ");
           Lados[Lado] = teclado.nextInt();
       }
       if(Lados[0] >= Lados[1] && Lados[0] >= Lados[2] ){
           LadoMaior = Lados[0];
           if(Lados[1] >= Lados[2]){
               LadoInter = Lados[1];
               LadoMenor = Lados[2];
           }else{
               LadoInter = Lados[2];
               LadoMenor = Lados[1];
           }

       }else if(Lados[1] >= Lados[0] && Lados[1] >=Lados[2]){
            LadoMaior = Lados[1];
            if(Lados[0] >= Lados[2]){
                LadoInter = Lados[0];
                LadoMenor = Lados[2];
            }else{
                LadoInter = Lados[2];
                LadoMenor = Lados[0];
            }

       }else{
            LadoMaior = Lados[2];
            if(Lados[0] >= Lados[1]){
                LadoInter = Lados[0];
                LadoMenor = Lados[1];
            }else{
                LadoInter = Lados[1];
                LadoMenor = Lados[0];
            }

        }
        System.out.print("\nSaber se forma um triangulo: 1\n Determinar tipo de triangulo: 2\nQual operação deseja realizar:");
        operação = teclado.nextInt();
        switch (operação){
            case 1:
                CalcularTriangulo(LadoMaior,LadoMenor,LadoInter);
                break;
            case 2:
                TipoTriangulo(LadoMaior,LadoMenor,LadoInter);
                break;
        }
    }
    public static void CalcularTriangulo(int LadoMaior, int LadoMenor, int LadoInter){
        if(LadoMaior< (LadoInter+LadoMenor) ){
            System.out.println("as variaveis formam um triangulo");
        }else{
            System.out.println("as variaveis não formam um triangulo");
        }
    }
    public static void TipoTriangulo(int LadoMaior, int LadoMenor, int LadoInter){
        if(LadoMenor==LadoInter && LadoInter==LadoMaior){
            System.out.println("o Triangulo é Equilatero");
        }else if(LadoMenor==LadoInter && LadoInter!=LadoMaior || LadoMaior==LadoInter && LadoInter!=LadoMenor||LadoMaior==LadoMenor && LadoMaior!=LadoInter ){
            System.out.println("O Triangulo é Isoceles");
        }else{
            System.out.println("O triangulo é Escaleno");
        }
    }
}
