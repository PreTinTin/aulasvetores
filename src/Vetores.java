import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		int [] x = new int [4]; //0 1 2 3
		
		Scanner batata = new Scanner(System.in);
		
		for(int i = 0; i < x.length; i++) //.length retorna tamanho do vetor
		{
			x[i] = batata.nextInt();
		}
		
		for(int i = 0; i < x.length; i++)
		{
			System.out.println("x[" + i + "]= " + x[i]);
		}

	}

}
