import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int n1 = sc.nextInt();
          int n2 = sc.nextInt();
        int[] a = new int[n1];
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

      
      
        int[] b = new int[n2];
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

       
        int[] c = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while (i < n1) {
            c[k++] = a[i++];
        }

        while (j < n2) {
            c[k++] = b[j++];
        }

        int total = n1 + n2;
   if (total % 2 == 1) {
    System.out.printf("%.1f", (double) c[total / 2]);
} else {
    double median =  (c[total / 2 - 1] +  c[total / 2]) / 2.0;
    System.out.printf("%.1f", median);
}
    }

}
