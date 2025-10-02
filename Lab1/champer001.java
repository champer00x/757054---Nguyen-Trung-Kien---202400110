package Lab1;

import java.util.Scanner;

public class champer001 {
	static double sum(double a, double b) {
		return a+b;
	}
	static double difference(double a, double b)	{
		return a-b;
	}
    static double product(double a, double b) {
    	return a*b;
    }
    static double quotion(double a, double b) {
    	return a/b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hai số: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Tong la " + sum(a,b));
        System.out.println("Hieu la " + difference(a,b));
        System.out.println("Tich la " + product(a,b));
         System.out.println("Thuong la " + quotion(a,b));
        
        scanner.close();
    }

	}

