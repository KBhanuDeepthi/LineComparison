
import java.util.Scanner;
public class LineComparisonUsingOOPC {
	public static Double line1;
	public static Double line2;
	
	public static void CalOfLength() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter x1 value:");
		double x1=scanner.nextDouble();
		System.out.println("Enter x2 value:");
		double x2=scanner.nextDouble();
		System.out.println("Enter x3 value:");
		double x3=scanner.nextDouble();
		System.out.println("Enter x4 value:");
		double x4=scanner.nextDouble();
		System.out.println("Enter y1 value:");
		double y1=scanner.nextDouble();
		System.out.println("Enter y2 value:");
		double y2=scanner.nextDouble();
		System.out.println("Enter y3 value:");
		double y3=scanner.nextDouble();
		System.out.println("Enter y4 value:");
		double y4=scanner.nextDouble();
		
		line1=Math.sqrt(((x2-x1) * (x2-x1)) +((y2-y1) * (y2-y1)));
		System.out.println("Length of line 1 :"+line1);
		
		line2=Math.sqrt(((x4-x3) * (x4-x3)) +((y4-y3) * (y4-y3)));
		System.out.println("Length of line 2 :"+line2);
	}
	public static void CheckEquality() {
		System.out.println(line1.equals(line2));
	}
	public static void Comparison() {
		int i=line1.compareTo(line2);
		if(i == 0)
			System.out.println("line 1 and line 2 are equal");
		else if(i > 0)
			System.out.println("line 1 is greater");
		else 
			System.out.println("line 2 is greater");
	}

	public static void main(String[] args) {
		CalOfLength();
		CheckEquality();
		Comparison();
	

	}
}


