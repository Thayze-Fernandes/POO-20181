import java.util.Scanner;
class Lista01-01 {
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		float nota1, nota2, nota3, nota4;
		float media;
		
		System.out.println("Informe a primeira nota: ");
		nota1 = ler.nextFloat();
		System.out.println("Informe a segunda nota: ");
		nota2 = ler.nextFloat();
		System.out.println("Informe a terceira nota: ");
		nota3 = ler.nextFloat();
		System.out.println("Informe a quarta nota: ");
		nota4 = ler.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(media >= 70){
			System.out.println("Aprovado");
		}
		elif(media < 70 or media >= 50){
			System.out.println("Final");
		}
		else{
			System.out.println("Reprovado");
		}
	}
}