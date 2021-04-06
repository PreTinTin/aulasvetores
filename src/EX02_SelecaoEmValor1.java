import java.util.Scanner;

public class EX02_SelecaoEmValor1 {

	public static void main(String[] args) {
		
		float [] A = new float [8];
		
		Scanner poze = new Scanner(System.in);
		
		for(int i = 0; i < A.length; i++)
		{
			A[i] = poze.nextFloat();
		}
		
		for (int i = 0; i < A.length; i++)
		{
			if (A[i] <= 10)
			{
				System.out.println("A[" + i + "] = " + A[i] + "\n");
			}
			
		}

	}

}
