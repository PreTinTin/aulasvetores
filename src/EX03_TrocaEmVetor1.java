import java.util.Scanner;

public class EX03_TrocaEmVetor1 {

	public static void main(String[] args) {

		int [] N = new int [20];
		int T; 
		int pos = 1;
		
		Scanner poze = new Scanner(System.in);
		
		for(int i = 0; i < N.length; i++) 
		{
            N[i]= poze.nextInt();
        }
        
        for(int i = 0; i < (N.length/2); i++) 
        {          
                 T = N[i];
                 N[i] = N[N.length - pos];
                 N[N.length - pos] = T;
            
            pos++;
        }
        
        for(int i = 0; i < N.length; i++) 
        {
            System.out.println("N[" + i + "] = " + N[i]);
        }
        
    }

}
