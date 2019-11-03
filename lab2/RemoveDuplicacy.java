import java.util.Arrays;
class RemoveDuplicacy
{

	int[] temp= new int[n];
    
    int j=0;
    for(int i=0; i<a.length-1; i++){
    if(a[i]!=a[i+1]){
    	temp[j++] =a[i];
    	
     
    }

    }
    
    for(int i=0; i<j; i++){
    	a[i]= temp[i];
    
    }
    return j;
	}
	public static void main(String[]args){
		int[] a={20,20,30,40,50,50,50};
		int length=a.length;
		length =RemoveDuplicateElements(a,length);
		for(int i=0; i<length; i++)
	System.out.print(a[i]+" "); 
} 
}