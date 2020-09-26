import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n= sc.nextInt();
        int tong=0;
        int i=1;
        while (i<n){
            tong=tong+n%10;
            n=n/10;
        }
//        for (int i = 0; i < n; i++) {
//            tong=tong+n%10;
//            n=n/10;
//        }
        System.out.println(tong);
    }
}
