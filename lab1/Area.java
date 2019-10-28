import java.util.*;
class Area{
	Scanner sc=new Scanner(System.in);
	double l ,b,area;
	Area(){
		System.out.println("length: ");
		l=sc.nextInt();
		System.out.println("breadth:");
		b=sc.nextInt();
	}
	double returnArea(){
		area=l*b;
		return area;
	}
	public static void main(String[] args) {
		Area e=new Area();
		System.out.println("area= "+e.returnArea());
	}
}