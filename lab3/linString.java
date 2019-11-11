public class LinString{    
public static int linearSearch(String[] arr, String x){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == x){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
        String[] arr1= {"ROAM","OOP","ASH","HUSH"};    
        String x = "ASH";    
        System.out.println(x+" is found at index: "+linearSearch(arr1, x));    
    }    
}    