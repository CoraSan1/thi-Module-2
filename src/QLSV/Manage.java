package QLSV;

import QLSV.SapXep.GiamDan;
import QLSV.SapXep.TangDan;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Manage {

    File file = new File("F:\\Java\\TestModule2\\src\\QLSV\\sinhvien.csv");

    IO io = new IO();

    thongTinSV thongTinSV = new thongTinSV();
    ArrayList<thongTinSV> thongTinSVs = io.read(file);
    Scanner sc = new Scanner(System.in);


    public thongTinSV createSV() {
        System.out.println("Nhập mã sinh viên ");
        int maSV;
        while (true) {
            try {
                maSV = Integer.parseInt(sc.nextLine());
                if (checkMaSV(maSV)) {
                    break;
                } else {
                    System.out.println("Mã sinh viên đã tồn tại");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập số thôi");
            }
        }

        System.out.println("Nhập tên SV");
        String name = sc.nextLine();

        System.out.println("Nhập tuổi SV");
        int age;
        while (true) {
            try {
                age = Integer.parseInt(sc.nextLine());
                break;

            } catch (NumberFormatException e) {
                System.out.println("Nhập số thôi");
            }
        }

        System.out.println("Nhập giới tính");
        String gender = sc.nextLine();

        System.out.println("Nhập địa chỉ");
        String address = sc.nextLine();

        System.out.println("Nhập điểm trung bình");
        double diemTB;
        while (true) {
            try {
                diemTB = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập số");
            }
        }

        thongTinSV thongTinSV = new thongTinSV(maSV, name, age, gender, address, diemTB);
        return thongTinSV;

    }


    public boolean checkMaSV(int id) {

        for (int i = 0; i < thongTinSVs.size(); i++) {
            if (thongTinSVs.get(i).getMaSV() == id) {
                return false;
            }
        }
        return true;
    }


    public void show() {
        for (int i = 0; i < thongTinSVs.size(); i++) {
            System.out.println(thongTinSVs.get(i));
        }
    }

    public void add() {
        thongTinSVs.add(createSV());
        System.out.println("Thêm SV thành công");

        io.write(file, thongTinSVs);
    }

    public void update() {
        int choice = 0;
        while (choice == 0) {
            System.out.println("Nhập mã SV muốn cập nhật");
            int maSV;
            while (true) {
                try {
                    maSV = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Nhập số thôi");
                }
            }
            for (int i = 0; i < thongTinSVs.size(); i++) {
                if (maSV == thongTinSVs.get(i).getMaSV()) {
                    thongTinSVs.set(i, createSV());
                    ++choice;
                }
            }

            io.write(file, thongTinSVs);
        }


    }

    public void remove() {
        int choice = 0;
        while (choice == 0) {
            System.out.println("Nhập Mã Sinh Viên Muốn Xóa");
            int maSV;
            while (true) {
                try {
                    maSV = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Nhập số thôi");
                }
            }
            if (maSV == 0) {
                break;
            }
            for (int i = 0; i < thongTinSVs.size(); i++) {
                if (thongTinSVs.get(i).getMaSV() == maSV) {
                    System.out.println("Bạn có muốn xóa sinh viên này không ?(Nhấn y để xóa)");
                    String check = sc.nextLine();
                    if (check.equals("y") || check.equals("Y")) {
                        thongTinSVs.remove(thongTinSVs.get(i));
                    }
                    ++choice;
                }
            }
            if (choice == 0) {
                System.out.println("Không tìm được sinh viên với mã sinh viên trên !");
            }
        }
        io.write(file, thongTinSVs);
    }

    public void sapXep() {
        System.out.println("Bạn muốn sắp xếp theo hướng nào ?");
        System.out.println("1. Sắp xếp điểm trung bình giảm dần");
        System.out.println("2. Sắp xếp điểm trung bình tăng dần");
        System.out.println("3. Hủy bỏ sắp xếp");
        int choice;
        while (true) {
            try {
                do {
                    choice = Integer.parseInt(sc.nextLine());
                    if (choice < 1 || choice > 3) {
                        System.out.println("Chọn 1 hoặc 2");
                    }
                } while (choice < 1 || choice > 3);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui Lòng Nhập Số");
            }
        }


        switch (choice) {
            case 1 -> thongTinSVs.sort(new GiamDan());
            case 2 -> thongTinSVs.sort(new TangDan());

        }
    }

    public void docFile(){
        thongTinSVs = IO.read(file);
        System.out.println("Đọc File Thành Công");
    }

    public void vietFile(){
        IO.write(file,thongTinSVs);
        System.out.println("Viết File Thành Công");
    }

}
