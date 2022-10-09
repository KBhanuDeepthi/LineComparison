import java.util.Scanner;
class EqualityOfTwoLines {
	public static void main(String[] args) {
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
		
		Double line1Length=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("Length of the line 1 =" +line1Length);
		Double line2Length=Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3));
		System.out.println("Length of the line 2 =" +line2Length);
		
		if(line1Length.equals(line2Length)) {
			System.out.println("Both lines are equal");
		}
		else { 
			System.out.println("Both lines are not equal");
		}
		
		}

}


