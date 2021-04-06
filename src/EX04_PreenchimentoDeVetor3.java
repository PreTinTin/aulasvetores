import java.util.Scanner;

public class EX04_PreenchimentoDeVetor3 {

	public static void main(String[] args) {
		
		double [] N = new double [10];
		
		Scanner poze = new Scanner(System.in);
		
		N[0] = poze.nextDouble();
		
		System.out.println("N[" + 0 + "] = " + N[0]);
		
		for (int i = 1; i < N.length; i++) 
			{
				N[i] = N[i-1] / 2;
				System.out.println("N[" + i + "] = " + N[i]);
			}
		
	}

}