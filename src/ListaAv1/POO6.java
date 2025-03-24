package ListaAv1;
import java.util.Scanner;
public class POO6 {
    public static void main(String[] args) {

        int Escala;
        double Temperatura;
        Scanner Teclado = new Scanner(System.in);
        System.out.printf("Informe a Temperatura Atual: ");
        Temperatura = Teclado.nextDouble();

        System.out.printf("Informe a Escala Atual!\n1 - F\n2 - C\n3 - K\nEscala:");
        Escala = Teclado.nextInt();
        switch(Escala) {
            case 1:
                System.out.println("Informe a Escala Desejada!\n1 - C\n2 - K\nEscala: ");
                Escala = Teclado.nextInt();
                switch(Escala) {
                    case 1:
                        Temperatura = (Temperatura -32)/1.8;
                        break;
                    case 2:
                        Temperatura = (Temperatura -32)/1.8;
                        Temperatura = Temperatura +273.15;
                        break;
                }
                break;
            case 2:
                System.out.println("Informe a Escala Desejada!\n1 - F\n2 - K\nEscala: ");
                Escala = Teclado.nextInt();
                switch(Escala) {
                    case 1:
                        Temperatura = Temperatura*(1.8)+32;
                        break;
                    case 2:
                        Temperatura = Temperatura +273.15;
                        break;
                }
                break;
            case 3:
                System.out.println("Informe a Escala Desejada!\n1 - C\n2 - F\nEscala: ");
                Escala = Teclado.nextInt();
                switch(Escala) {
                    case 1:
                        Temperatura = Temperatura-273.15;
                        break;
                    case 2:
                        Temperatura = Temperatura-273.15;
                        Temperatura = Temperatura*(1.8)+32;
                        break;
                }
                break;
        }
        System.out.printf("Temperatura Desejada é: %.2f ", Temperatura);
    }
}
