import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        List<Integer> list= new ArrayList<>();
        int i= 2;
        while ( i>=2 && i <10) {
            if (n%i==0){
                n=n/i;
                list.add(i);
            }else {
                i++;
            }
        }
        System.out.println(list);
    }
}
