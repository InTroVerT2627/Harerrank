import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      long fat=fact(n);
      System.out.println(fat);
    }
    
    static long fact(int x) {
        if (x <= 1)
            return 1;

        return x * fact(x - 1);
    }
}
