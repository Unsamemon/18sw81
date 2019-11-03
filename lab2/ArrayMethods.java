import java.util.Arrays;
public class ArrayMethods{
	public static void main(String[]arg){
	double arr1[]={10.4, 11.6, 4.5, 6.8, 5.9};
	double arr2[]={8.4, 11.6, 3.4, 6.6, 5.2,};

	Arrays.sort(arr1);
	System.out.print(Arrays.toString(arr1));
	System.out.println();
	System.out.println(Arrays.binarySearch(arr1,4.5));
	double copy[]=new double[5];
	copy=Arrays.copyOf(arr1,4);
	System.out.print(Arrays.toString(copy));
	System.out.println();
	double copyOr[]=new double[5];
    copyOr=Arrays.copyOfRange(arr1,3,5);
	System.out.print(Arrays.toString(copyOr));
	System.out.println();
	System.out.println(Arrays.equals(arr1,arr2));
	
	}
}