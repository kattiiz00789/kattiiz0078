import java.util.Scanner;
class loop.do2 {
	public static void main(String[] args) {		
		Scanner Sc = new Scanner(System.in);
		//System.out.println("Area of a Triangle");		
		//int b,h;		
		//do{			
			//System.out.print("input base : ");
			//b = Sc.nextInt();
			//System.out.print("input hight : ");
			//h = Sc.nextInt();
			//System.out.println("0.5 * "+b+" * "+h+" ="+(0.5*b*h));
 			//}while(b!=0);

		//System.out.println("Area of a Square");		
		//int w,h;		
		//do{			
			//System.out.print("input width : ");
			//w = Sc.nextInt();
			//System.out.print("input hight : ");
			//h = Sc.nextInt();
			//System.out.println(w+" * "+h+" ="+(w*h));
 			//}while(w!=0);

		System.out.println("Area of a Circle");		
		int r;		
		do{			
			System.out.print("input radius : ");
			r = Sc.nextInt();
			System.out.println("3.14 * "+(r*r)+" ="+(3.14*r*r));
 			}while(r!=0);


	}
}