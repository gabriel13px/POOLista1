package ListaAv1;

import java.util.Scanner;

public class POO8 {
    public static void main(String[] args) {
        //essa questão eu segui a logica da unifor para as Avs, então não ta conforme o enunciado
        Scanner Teclado = new Scanner(System.in);
        int QuantAlunos = 3, QuantNotas =4; // a quant notas considera nota media
        float[][] PlanilhaNotas = new float[QuantAlunos][QuantNotas];
        float SomaNotas;
        for(int Nota = 0; Nota < QuantNotas-2; Nota++){
            for(int aluno = 0; aluno < QuantAlunos; aluno++){
                System.out.print("\nDigite a nota da AV"+(Nota+1)+" do aluno "+(aluno+1)+":");
                PlanilhaNotas[aluno][Nota] = Teclado.nextFloat();

            }

        }
        for(int Aluno = 0; Aluno < QuantAlunos; Aluno++){
            SomaNotas = 0;
            for(int notas = 0; notas < QuantNotas-2; notas++){
                SomaNotas = SomaNotas + PlanilhaNotas[Aluno][notas];
            }
            PlanilhaNotas[Aluno][QuantNotas-1] = SomaNotas/(QuantNotas-2);
            if(PlanilhaNotas[Aluno][QuantNotas-1] >= 6){
                System.out.printf("\ndigite a nota da AV%d do aluno  %d:", QuantNotas-1, Aluno +1);
                PlanilhaNotas[Aluno][QuantNotas-2] = Teclado.nextFloat();
                PlanilhaNotas[Aluno][QuantNotas-1] = (PlanilhaNotas[Aluno][QuantNotas-2] + PlanilhaNotas[Aluno][QuantNotas-1])/2;
                ImprimirPlanilha(Aluno,PlanilhaNotas);
            }else{
                PlanilhaNotas[Aluno][QuantNotas-2] = 0;
                ImprimirPlanilha(Aluno,PlanilhaNotas);
            }
        }
        
    }
    public  static void ImprimirPlanilha(int Aluno, float[][] Planilha){
        System.out.printf("Aluno %d:\n", Aluno +1);
        for(int notas = 0; notas < Planilha[Aluno].length-1; notas++){
            System.out.printf("Nota AV%d:%.1f ",notas+1,Planilha[Aluno][notas]);
        }
        System.out.printf("Media: %.1f",Planilha[Aluno][(Planilha[Aluno].length-1)]);
        if(Planilha[Aluno][Planilha[Aluno].length-1] >=6){
            System.out.println(" Aprovado");
        }else{
            System.out.println(" Reprovado");
        }
    }
}
