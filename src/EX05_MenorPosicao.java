import java.util.Scanner;

public class EX05_MenorPosicao {

	public static void main(String[] args) {
		
		int N = 0;
		int pos = 0, menor = 0;		
		
		Scanner poze = new Scanner(System.in);
		
		do {
			N = poze.nextInt();
		}while ((N <= 1) || (N >= 1000));
		
		int [] X = new int [N];
		
		
		for (int i = 0; i < X.length; i++)
		{
			X[i] = poze.nextInt();
		
		}
		
		for (int i = 0; i < X.length; i++)
			{
				if (menor == 0)
				{
					menor = X[i];		
				}
				if (menor > X[i])
				{
					menor = X[i];
					pos = i;
				}
				
			}
		
		System.out.println("Menor valor: " + menor + "\n" + "Posicao: " + pos);
		

	}

}
