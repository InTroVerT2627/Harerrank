import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(sum<=0){
              sum=0;  
            }
            max=Math.max(max,sum);
        }
         max=Math.max(max,sum);
         System.out.println(max);
    }
}
