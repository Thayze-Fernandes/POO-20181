import java.util.Scanner;
class Lista0107 {
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		int nota;
		String conceito = "";
		
		System.out.println("Informe a nota do aluno: ");
		nota = ler.nextInt();
		
		if(nota >= 0 && nota < 50){
			conceito = "Insuficiente";
			System.out.println("O conceito do aluno e: " + conceito);
		}
		else if(nota >= 50 && nota < 65){
			conceito = "Regular";
			System.out.println("O conceito do aluno e: " + conceito);
		}
		else if(nota >= 65 && nota < 85){
			conceito = "Bom";
			System.out.println("O conceito do aluno e: " + conceito);
		}
		else if(nota >= 85 && nota <= 100){
			conceito = "Otimo";
			System.out.println("O conceito do aluno e: " + conceito);
		}
		else{
			System.out.println("Nota nao existente: ");
		}
		
	}
}