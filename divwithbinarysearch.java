import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int d=sc.nextInt();
        int di=sc.nextInt();
        int s=1;
        if(d<0&&di>0||d>0&&di<0)
        s=-1;
        int l=0;
        int h=d;
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(mid*di<=d){
                ans=mid;
                l=mid+1;
            }else
            h=mid-1;
            
        }
        System.out.println(d/di);
    }
}
