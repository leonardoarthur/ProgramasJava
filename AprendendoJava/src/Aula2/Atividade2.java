package Aula2;
import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args){
        double cel = 0, resultado = 0;

                //entrada de dados
       System.out.println("Digite a temperatura em C�: ");
        Scanner s = new Scanner(System.in);
        cel = s.nextDouble();

                //calculo da temperatura
        resultado = (9*cel/5) + 32;
        System.out.println("O resultado em fahrenheit �: " + resultado);
    }
}