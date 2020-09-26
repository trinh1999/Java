import java.util.ArrayList;
import java.util.List;

public class Bai1 {

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        for (int so = 10; so <=200 ; so++) {
            if (so%7==0 && so%5!=0){
                list.add(so);
            }
        }
        System.out.println(list);
        for (int i = 0; i < list.size()-1; i++) {
            System.out.print(list.get(i)+", ");
        }
        System.out.println(list.get(list.size()-1)+".");
    }
}
