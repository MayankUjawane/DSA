import java.io.*;
import java.util.*;

class GFG {
    
    public static void printGreater(int arr[],int n){
    
        for(int i=0;i<n;i++){
            int j;
            for(j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
            if(j==n)
                System.out.print(-1+" ");
        }
    }
	public static void main (String[] args) {
	
	    int[] arr=new int[]{5,15,10,8,6,12,9,18};
        
        printGreater(arr,arr.length);   
	  
	}
	
}