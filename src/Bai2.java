import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap n: ");
        int n= sc.nextInt();
        int gt=1;
        for (int i = 1; i <=8; i++) {
            gt=gt*i;
        }
        System.out.println(gt);
    }
}
