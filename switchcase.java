import java.util.Scanner;
class switchcase{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Area of Triangle");
		System.out.println("2.Area of Square");
		System.out.println("3.Area of Circle");
		System.out.println("0.exit");
		System.out.println("---------------------");
		System.out.print("Select choice : ");
		int	a = sc.nextInt();
		do{
		    switch(a){
            
			    case 1:
					System.out.print("Input varible base : ");
					int v = sc.nextInt();
					System.out.print("Input varible hight : ");
					int d = sc.nextInt();
					System.out.println("=" +(0.5*v*d));
					break;
				case 2:	
					System.out.print("Input varible weight : ");
					int f = sc.nextInt();
					System.out.print("Input varible hight : ");
					int g = sc.nextInt();			
					System.out.println("=" +(f*g));
			    	break;
				case 3:
					System.out.print("Input varible radious : ");
					int h = sc.nextInt();	
					System.out.println("=" +(3.14*h*h));
			    	break;
				case 0:
					System.exit(0);
                	break;
				default:
			    	System.out.print("Please select choice again.");
			    }
		}while(a>=0);	    	

			
      }
}



