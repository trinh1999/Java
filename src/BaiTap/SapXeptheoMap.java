package BaiTap;

import BaiTap.SinhVien;

import java.io.*;
import java.util.*;

public class SapXeptheoMap {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader= new BufferedReader(new FileReader("C:\\Users\\DELL\\IdeaProjects\\Demo\\src\\sv.txt"));
        String line= bufferedReader.readLine();
        Map<Integer,SinhVien> map = new TreeMap<>();
        while ((line)!=null){
            String tmp[]= line.split(",");
            int id= Integer.parseInt(tmp[0]);
            String name= tmp[1];
            String diachi= tmp[2];
            float GPA= Float.parseFloat(tmp[3]);
            SinhVien sinhVien= new SinhVien(id,name,diachi,GPA);
            map.put(id,sinhVien);
            line= bufferedReader.readLine();
        }
        List<Map.Entry<Integer,SinhVien>> listMap= new ArrayList<>();
        listMap.addAll(map.entrySet());
        Collections.sort(listMap, new Comparator<Map.Entry<Integer, SinhVien>>() {
            @Override
            public int compare(Map.Entry<Integer, SinhVien> o1, Map.Entry<Integer, SinhVien> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        System.out.println("sap xep theo value: ");
        System.out.println(listMap);


        System.out.println("sx theo id: ");
        System.out.println(map);


        bufferedReader.close();

    }
}
