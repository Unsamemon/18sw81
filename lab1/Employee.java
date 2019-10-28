import java.util.*;
class Employee{
	double sl;
	int hr;
	Scanner sc =new Scanner(System.in);
	// getinfo method
void getInfo(){                         
	System.out.println("ENTER SALARY IN DOLLARS ");
	sl=sc.nextInt();
	System.out.println("ENTER NUMBERS OF WORK HOURS ");
	hr=sc.nextInt();

}	
//conditions
double addSal(){
	if(sl<500){
		sl+=10;
	}
	else

		sl=sl;
	return sl;
}
double addWork(){
	if(hr>6){
		sl+=5;
	}
	else
		sl=sl;
	System.out.println("final Salary= " +sl);
	return sl;
}
public static void main(String[] args) {    //main body
	Employee e=new Employee();
	// calling all methods
	e.getInfo();
	e.addSal();
	e.addWork();
}
}