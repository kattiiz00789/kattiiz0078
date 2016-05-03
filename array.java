import java.util.Scanner;
class  array{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int d;
		int y = 1000;
		System.out.print("Input leght : ");
		y = sc.nextInt();
		int[] a = new int[y];
		for(int i=1;i<=a.length;i++){			
			System.out.print("Input number : "+i+" = ");
	        d = sc.nextInt();
	        if(d%2 == 0){	
	        	a[i] = d;   
	        	System.out.println("ANS. = "+a[i]);

	      	}				
		}                
	     	 	
		
		
	}
}