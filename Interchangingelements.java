import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        max=a[0];
        int mn=0;
        int mm=0;
        for(int i=0;i<n;i++){
            if(max<a[i]){
                max=a[i];
                mn=i;
            }
            if(min>a[i]){
                min=a[i];
                mm=i;
            }
        }
        int t=0;
        t=a[mn];
        a[mn]=a[mm];
        a[mm]=t;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
