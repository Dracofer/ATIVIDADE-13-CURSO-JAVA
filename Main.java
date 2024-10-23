import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double altura;
		double comprimento;
		
		altura = sc.nextDouble();
		comprimento = sc.nextDouble();
		
		if(altura + comprimento == 0){
		    System.out.println("Origem");
	        }else if(altura >=0.1 && comprimento >=0.1 || altura <= 1 && comprimento <= 1
		|| altura >=-0.1 && comprimento >=-0.1 || altura <= -1 && comprimento <= -1){
		    System.out.println("Q1");
		    }else if(altura >=1.1 && comprimento >=1.1 || altura <= 2 && comprimento <= 2
		|| altura >=-1.1 && comprimento >=-1.1 || altura <= -2 && comprimento <= -2){
		        System.out.println("Q2");
		    }else if(altura >=2.1 && comprimento >=2.1 || altura <= 3 && comprimento <= 3
		|| altura >=-2.1 && comprimento >=-2.1 || altura <= -3 && comprimento <= -3){
		        System.out.println("Q3");
		    }else if(altura >=3.1 && comprimento >=3.1 || altura <= 3 && comprimento <= 3
		|| altura >=-3.1 && comprimento >=-3.1 || altura <= -3 && comprimento <= -3){
		        System.out.println("Q4");
		    }else{
		        System.out.println("ERRO");
		    sc.close();
		    }
		    }
		}
