package QLSV;

import java.io.Serializable;

public class thongTinSV implements Serializable {
    private int maSV;
    private String name;
    private int age;
    private String gender;
    private String address;
    private double diemTB;

    public thongTinSV() {
    }

    public thongTinSV(int maSV, String name, int age, String gender, String address, double diemTB) {
        this.maSV = maSV;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.diemTB = diemTB;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "thongTinSV{" +
                "maSV=" + maSV +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", diemTB=" + diemTB +
                '}';
    }
}
