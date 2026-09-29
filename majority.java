import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       
        int candidate = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                candidate = arr[i];
            }

            if (arr[i] == candidate)
                count++;
            else
                count--;
        }

        
        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate)
                count++;
        }

        if (count > n / 2)
            System.out.println(candidate);
        else
            System.out.println(-1);
    }
}
