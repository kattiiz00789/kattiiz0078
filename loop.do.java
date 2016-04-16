import java.util.Scanner;
class loop.do {
	public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        java.text.DecimalFormat sc = new java.text.DecimalFormat("0.00");  
        System.out.println("Area of a Circle");
        int r;
        do{
        	System.out.print("input radius : ");
        	r = Sc.nextInt();
        	System.out.println("3.14 * "+(r*r)+" ="+sc.format(3.14*r*r));

        	
        }while(r!=0);

       

    }

}