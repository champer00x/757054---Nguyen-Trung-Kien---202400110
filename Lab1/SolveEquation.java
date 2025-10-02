package Lab1;

import java.util.Scanner;

public class SolveEquation {
	static void OneDegOneVariables(double a, double b) {
		if (a==0&&b==0) {
			System.out.println("infinite solution");
			
		}
		else if(a==0&&b!=0) {
			System.out.println("no solution");
		}
		else {
			System.out.println(-b/a);
		}
		return;
	
	}
	static void OneDegTwoVariables(double a_11,double a_12,double a, double b_11, double b_12,double b) {
		double Det1 = a_11*b_12 - a_12*b_11;
		double Det2 = a*b_12 - b* a_12;
		double Det3 = b*a_11-a*b_11;
		if (Det1 != 0) {
			double x1 = Det2 / Det1;
            double x2 = Det3/Det1;
            System.out.println("Hệ có nghiệm duy nhất:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
          
		}
		else {
			if (Det2==0 && Det3==0) {
				System.out.println("Hệ có vo so nghiệm");
			}
			else {
				System.out.println("He vo nghiem");
			}
		}
	}
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double a_11 = scanner.nextDouble();
        double a_12 = scanner.nextDouble();
        double b = scanner.nextDouble();
        double b_11 = scanner.nextDouble();
        double b_12 = scanner.nextDouble();
        OneDegOneVariables(a,b);
        OneDegTwoVariables(a_11,a_12,a,b_11,b_12,b);
        
        scanner.close();
	}
        
        

}
