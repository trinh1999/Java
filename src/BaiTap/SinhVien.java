package BaiTap;

public class SinhVien implements  Comparable<SinhVien>{
    private int id;
    private String name;
    private String diaChi;
    private float GPA;

    public SinhVien(int id, String name, String diaChi, float GPA) {
        this.id = id;
        this.name = name;
        this.diaChi = diaChi;
        this.GPA = GPA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "BaiTap.SinhVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", GPA=" + GPA +
                '}';
    }


    @Override
    public int compareTo(SinhVien o) {
        if(this.getGPA() > o.getGPA()) return 1;
        else if(this.getGPA() < o.getGPA()) return -1;
        else return 0;
    }
}
