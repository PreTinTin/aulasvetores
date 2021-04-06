import java.util.Scanner;

public class EX01_PreenchimentoDeVetor1 {

	public static void main(String[] args) {
		
		int [] N = new int [10];
		
		Scanner poze = new Scanner(System.in);
		
		do {
		N[0] = poze.nextInt();
		}while(N[0] > 50);
		
		System.out.println("N[" + 0 + "] = " + N[0]);
		
		for (int i = 1; i < N.length; i++) 
			{
				N[i] = N[i-1] * 2;
				System.out.println("N[" + i + "] = " + N[i]);
			}
		
	}

}
