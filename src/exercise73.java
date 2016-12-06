/**
 * Created by Praktika on 6.12.2016.
 */
public class exercise73 {
    public static void main(String[] args) {
        power(10.5, 3);
    }
    public static void power(double x, int n) {
        double ans = 1;
        int i = 1;
        while (i <= n) {
            ans = ans * x;
            i++;
        }
        System.out.println(ans);
    }
}

