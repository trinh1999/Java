import java.util.*;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap n: ");
        int n= sc.nextInt();
        int tich=1;
        Map<Integer,Integer> map= new TreeMap<>();
        for (int i = 1; i < n; i++) {
            tich= i*i;
            map.put(i,tich);
        }
        System.out.println(map);

    }
}
