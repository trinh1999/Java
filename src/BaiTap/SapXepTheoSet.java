package BaiTap;

import BaiTap.SinhVien;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SapXepTheoSet {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\DELL\\IdeaProjects\\Demo\\src\\sv.txt"));
        String line = bufferedReader.readLine();
        Set<SinhVien> set = new TreeSet<SinhVien>();
        while ((line) != null) {
            String tmp[] = line.split(",");
            int id = Integer.parseInt(tmp[0]);
            String name = tmp[1];
            String diachi = tmp[2];
            float GPA = Float.parseFloat(tmp[3]);
            SinhVien sinhVien = new SinhVien(id, name, diachi, GPA);
            set.add(sinhVien);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        List<SinhVien> list = new ArrayList<>();
        list.addAll(set);
//        Collections.sort(list);
//        list.forEach(sinhVien -> {
//            if (sinhVien.getGPA() > 2.4)
//                System.out.println(sinhVien);
//        });
//        List<BaiTap.SinhVien> list1 = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getGPA() > 2.4)
//                list1.add(list.get(i));
//        }
//        System.out.println(list1);

//        List<BaiTap.SinhVien> list1= new ArrayList<>();
//        list1.add(sinhVien);

        Stream<SinhVien> sinhVienStream = list.stream().filter(sinhVien -> sinhVien.getGPA() > 2.4);
        sinhVienStream.collect(Collectors.toList()).forEach(sinhVien -> System.out.println(sinhVien));
//        list.stream().sorted((o1, o2) -> o1.getId() - o2.getId()).forEach(sinhVien -> {
//            System.out.println(sinhVien);
//        });
//         Stream<BaiTap.SinhVien> a = Arrays.asList(3, 6, 6, 7, 9, 0, 8, 6)
//                .stream() // tạo ra Stream từ List<Integer>
//                .limit(4)
//                .map(i -> 6 + i) // biến đổi từng phần tử thành String// 9 12 12 13
////                .map(String::toUpperCase) // biến đổi từng phần tử thành Upper case
//                .anyMatch(integer -> integer % 2 == 0 ? true : false);
//                 .flatMap(new Function<Integer, Stream<?>>() {
//                     @Override
//                     public Stream<?> apply(Integer integer) {
//                         Stream<BaiTap.SinhVien> a
//                        return new BaiTap.SinhVien(integer,"ABC","HN",1.4f);
//                     }
//                 });
////                 .reduce((integer, integer2) -> integer + integer2);
//        System.out.println(a.get());

//                .forEach(s -> System.out.println(s)); // in ra xem thử
    }
}
