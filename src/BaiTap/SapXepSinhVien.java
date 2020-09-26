package BaiTap;

import BaiTap.SinhVien;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SapXepSinhVien {

    public static void main(String[] args) {
        try{
            BufferedReader bufferedReader= new BufferedReader(new FileReader("C:\\Users\\DELL\\IdeaProjects\\Demo\\src\\sv.txt"));
            String line= bufferedReader.readLine();
            List<SinhVien> a = new ArrayList<>();
            while ((line)!=null){
                String tmp[]= line.split(",");
                int id= Integer.parseInt(tmp[0]);
                String name= tmp[1];
                String diachi= tmp[2];
                float GPA= Float.parseFloat(tmp[3]);
                SinhVien sinhVien= new SinhVien(id,name,diachi,GPA);
                a.add(sinhVien);
                line= bufferedReader.readLine();
            }
            System.out.println("List sinh vien la:"+a);
            bufferedReader.close();
            Collections.sort(a);
            System.out.println(a);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
