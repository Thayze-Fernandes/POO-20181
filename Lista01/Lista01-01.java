import java.util.Scanner;
class Lista01-01{
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		float n;
		System.out.println("Informe a velocidade em m/s: ");
		n = ler.nextFloat();
		float velocidadeConvertida;
		velocidadeConvertida = n * 3.6;
		System.out.println("A velocidade em km/h e igual a "+ velocidadeConvertida);
	}
}