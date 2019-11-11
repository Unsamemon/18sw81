public class LinChar{    
public static int linearSearch(char[] arr, char key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
        char[] a1= {'R','O','A','R'};    
        char key = 'A';    
        System.out.println(key+" is found at index: "+linearSearch(a1, key));    
    }    
}    