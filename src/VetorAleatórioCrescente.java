import java.util.Scanner;

public class VetorAleatórioCrescente {

	public static void main(String[] args) {
		
		int maior = 0, menor = 0;
		String showM = "", showm = "";
		int [] x = new int [10];
		
		Scanner batata = new Scanner(System.in);
			
		for (int i = 0; i < x.length; i++)
		{
			x[i] = batata.nextInt();
			
			
			
			
			if (maior < x[i])
			{
				maior = x[i];
				showM = maior + "[" + i + "]";
			}
			
			
			if (menor == 0)
			{
				menor = x[i];
				showm = menor + "[" + i + "]";
			}		
			else if (menor > x[i])
			{
				menor = x[i];
				showm = menor + "[" + i + "]";
			}
			
		}
		
		for(int i = 0; i < x.length; i++)
		{
			System.out.println("x[" + i + "]= " + x[i]);
		}
		
		
	}

}
