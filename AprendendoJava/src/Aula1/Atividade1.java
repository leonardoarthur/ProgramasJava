package Aula1;
import java.util.Scanner;
public class Atividade1 {
	public static void main(String[] args) {
	double nota1 = 0, nota2 = 0, media = 0;
	
	//Entrada de dados
		System.out.println("Digite a primeira e a segunda nota do aluno:");
	Scanner s = new Scanner(System.in);
	nota1 = s.nextDouble();
	nota2 = s.nextDouble();
	
	//Calculo de média
	media = (nota1 + nota2)/2;
	
	System.out.println("A média do aluno é " + media);
	}		
}
