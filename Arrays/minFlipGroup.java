/*package whatever //do not write package name here */

import java.io.*;
class GFG {
    static void minFlipGroup(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1])
            {
                if(arr[i]!=arr[0])
                System.out.print("from "+i+" to");
                else
                System.out.println(" "+(i-1));
            }
        }
        if(arr[n-1]!=arr[0])
         System.out.println(" "+(n-1));
    }
	public static void main (String[] args) {
	int arr[] = {0,0,1,1,0,0,1,1,0,1};
     minFlipGroup(arr);
	}
}