import java.util.Scanner;
class Lista0103 {
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		float nota1, nota2, nota3;
		
		System.out.println("Informe a primeira nota: ");
		nota1 = ler.nextFloat();
		System.out.println("Informe a segunda nota: ");
		nota2 = ler.nextFloat();
		System.out.println("Informe a terceira nota: ");
		nota3 = ler.nextFloat();
		
		float media;
		media = (nota1 * 2 + nota2 * 3 + nota3 * 5) /3;
		
		System.out.printf("A media do aluno e: %.2f", media);
	}
}