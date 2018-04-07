import java.util.Scanner;
class Lista01-02{
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		int anoNascimento;
		System.out.println("Digite o ano de nascimento:");
		anoNascimento = ler.nextInt();
		Scaner ler = new Scanner (System.in);
		int anoAtual;
		System.out.println("Digite o ano atual:");
		anoAtual = ler.nextInt();
		
		int idade;
		idade = anoAtual - anoNascimento;
		
		System.out.println("A idade dessa pessoa é " + idade);
	}

}