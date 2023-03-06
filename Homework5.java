import java.util.Scanner;
import java.util.Random;


public class Homework5{
	public static void main(String[] args){
		
		//printSumOfNumbers();
		//returnNumber();
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		greatOfNumber(array);

		//randomDonatii();
		//printPropositionOnLine();

	}

	public static void printSumOfNumbers(){
	
      int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	  int sum = 0;
	  for(int i : array){
    	sum += i;
      }
     // return sum;
  	}

	public static void returnNumber(){
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		int numberimpar=0;
		for(int i :array){
			if(i % 2 != 0){
				numberimpar++;
			}
		}
		//return numberimpar;
	}

	public static void greatOfNumber(int array[]) 
	{
		
		int result[]={};
		int b = 3;
		for(int i =array.length; i>=0;i++){
				if(array[i]>b){
					System.out.println(array[i]);
				}
		}
		
			
	}

	public static void randomDonatii(){

		
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int sum1=450;
		System.out.println("The random values: ");
    	for(int i=0; i<100; i++)
    	{
      		if(sum <= sum1){
      		int random = r.nextInt(100);
      		System.out.println( random);
      		sum= sum + i;
      		System.out.println("Nu s fost atinsa = " + sum);

      	}
    	}
    	System.out.print("Sum = " + sum);

  		
	}

	public static void printPropositionOnLine(){

		String s = "Ana are mere multe.Anca are pere.Andreea are cirese.Paul are caise";
		int i,j;

		for (i = 0; i <= s.length() - 1; i++){
			if (s.substring(i).startsWith(".") || i == 0){
				for (j = i ; j <= s.length(); j++){
					if (s.substring(j).startsWith(".") || j == s.length()) {
					 System.out.println(s.substring(i,j));

						i = j;
					}
				}
			}
		}
	}
}

