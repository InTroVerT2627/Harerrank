import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] b = new int[m];

        for(int i = 0; i < m; i++)
            b[i] = sc.nextInt();

        int[] c = new int[n + m];

        int i = 0, j = 0, k = 0;

        while(i < n && j < m){
            if(a[i] <= b[j]){
                c[k] = a[i];
                i++;
            }else{
                c[k] = b[j];
                j++;
            }
            k++;
        }

        while(i < n){
            c[k] = a[i];
            i++;
            k++;
        }

        while(j < m){
            c[k] = b[j];
            j++;
            k++;
        }

        for(int h = 0; h < k; h++){
            System.out.print(c[h] + " ");
        }
    }
}
