import java.util.Arrays;  
class BinChar{  
    public static void main(String args[]){  
        char a[] = {'C','O','P','E'};  
        char x = 'P';  
        int result = Arrays.binarySearch(a,x);  
        if (result < 0)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  
    }  
}  