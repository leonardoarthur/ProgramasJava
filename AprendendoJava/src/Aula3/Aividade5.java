package Aula3;
import java.util.Scanner;
public class Aividade5 {
    public static void main(String[] args){
    	double carroNovo = 0, custof = 0, impostos = 0, pdistribuidor = 0;
    	System.out.println("Qual o valor do carro? ");
    	Scanner s = new Scanner(System.in);
    	custof = s.nextDouble();
    	
    	pdistribuidor = custof * 1.28;
    	carroNovo = pdistribuidor * 1.48;
    	
    	System.out.println("O pre�o do carro com rejuste � " + carroNovo);
    }
}
