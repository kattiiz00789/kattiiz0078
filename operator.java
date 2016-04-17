import java.util.Scanner;
class operator {
	public static void main(String[] args) {
		Scanner def = new Scanner(System.in);
	    System.out.print("input number a: ");
	    int a = def.nextInt();
	    System.out.print("input number b: ");
	    int b = def.nextInt();
        System.out.print("a + b =");
		System.out.println(a+b);
		System.out.print("a - b =");
		System.out.println(a-b);
		System.out.print("a * b =");
		System.out.println(a*b);
		System.out.print("a / b =");
		System.out.println(a/b);
		;
	}
}