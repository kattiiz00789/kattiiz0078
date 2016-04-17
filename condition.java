import java.util.Scanner;
class condition {
	public static void main(String[] args){
	    Scanner def = new Scanner(System.in);
	    int d,a;
	    do{	    
	    	System.out.print("How many students : ");
	        a = def.nextInt();
	        for(int i=1;i<=a;i++){
	    	    System.out.println("Student Number "+i);
	    	    System.out.print("Input Score Studen "+i+" :");
	    	    d = def.nextInt();
	    	    if(d >=80 && d<=100)
            	    System.out.println("***Grade A");
        	    else if(d >=70 && d<=79)
    	    	    System.out.println("***Grade B");
    		    else if(d >=60 && d<=69)
    			    System.out.println("***Grade C");
    		    else if(d >=50 && d<=59)
    			    System.out.println("***Grade D");
    		    else if(d >=0 && d<=49)
    			    System.out.println("***Grade F");
    		    else
    			    System.out.println("ERROR!!!");
    	     }
        }while(a>0);
    
    }
}
