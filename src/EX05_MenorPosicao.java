import java.util.Scanner;

public class EX05_MenorPosicao {

	public static void main(String[] args) {
		
        int N; 
        int menor = 0; 
        int pos = 0;     
        
        Scanner poze = new Scanner(System.in);
        
        N = poze.nextInt();
        
        int [] X = new int [N];
        
        for(int i = 0; i < X.length; i++) 
        {
            X[i] = poze.nextInt();
        }
        
        for(int i = 0; i < X.length; i++) 
        {
            if(i == 0) 
            {
            menor = X[i];
            }
            
            if(X[i] < menor) 
            {
                menor = X[i];
                pos = i;
            }
        }
        
        System.out.println("Menor valor: " + menor + "\n" + "Posicao: " + pos);
    }

}
