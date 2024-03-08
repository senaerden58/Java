package Circle;
import java.util.Scanner;
public class Circle {
	public static void main(String[] args)
	{
		double r;
		double pi=3.14;
		double centreAngle;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		r=input.nextDouble();
		
		System.out.print("Enter the centre angle of the circle:");
		centreAngle=input.nextDouble();
		
        System.out.println("Radius of circle: " + r);
        System.out.println("Centre angle of circle: " + centreAngle);
        
        double field = (pi * r * r*centreAngle)/360;
        
        System.out.println("Area of the circle: " + field);
	}

}
