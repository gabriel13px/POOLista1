package ListaAv1;
import java.util.Scanner;
public class POO11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int QuantAlunos = 10, QuantNotas =4, IndiceAprovados = 0;
        float[] MediasNotas = new float[QuantAlunos]; // o aluno vai ser um indice maior que a posição dele
        float SomaNotas,nota;
        for(int Aluno = 0; Aluno < QuantAlunos; Aluno++){
            SomaNotas = 0;
            for(int Nota = 0; Nota < QuantNotas; Nota++){
                System.out.printf("digite nota %d do aluno %d: ",Nota+1, Aluno+1);
                nota = teclado.nextFloat();
                SomaNotas = SomaNotas+nota;
            }
            SomaNotas = SomaNotas/QuantNotas;
            MediasNotas[Aluno] = SomaNotas;
            if(MediasNotas[Aluno]>=7){
                IndiceAprovados++;
            }
        }
        for(int Aluno = 0; Aluno < QuantAlunos; Aluno++){
            System.out.printf("media  aluno %d: %.1f\n",Aluno+1, MediasNotas[Aluno]);
        }
        System.out.printf("%d Aluno(s) tiveram media maior que 7.0 ", IndiceAprovados);
    }
}
