import java.util.*;
class Area1{
double length,width;    //instant variable
Area1(double length,double width){
	this.length=length;
	this.width=width;
	System.out.print("Area= " +returnArea());
}
public double returnArea(){
	return length*width;
}
}
class Task3{
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Insert the length of Rectangle");
	double l = sc.nextDouble();
	System.out.println("Insert the width of Rectangle");
	double w = sc.nextDouble();

	new Area1(l,w);
}
}