import java.util.Scanner;

public class EX03_TrocaEmVetor1 {

	public static void main(String[] args) {

		int [] N = new int [20];
		
		Scanner poze = new Scanner(System.in);
		
		for (int i = N.length - 1; i >= 0; i--)
			{
				N[i] = poze.nextInt();
			}
		
		for (int i = 0; i < N.length; i++)
			{
				System.out.println("N[" + i + "] = " + N[i]);
			}

	}

}
