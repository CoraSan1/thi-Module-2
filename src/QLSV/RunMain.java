package QLSV;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Manage manage = new Manage();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN----");
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1. Xem danh sách sinh viên");
            System.out.println("2. Thêm mới ");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Sắp xếp");
            System.out.println("6. Đọc từ File");
            System.out.println("7. Ghi vào File");
            System.out.println("8. Thoát");

            int choice = 0;
            while (choice < 1 || choice > 8) {
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    if (choice < 1 || choice > 8) {
                        System.out.println("chọn 1-8");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nhập số thôi");
                }

            }


            switch (choice) {
                case 1:
                    manage.show();
                    break;
                case 2:
                    manage.add();
                    break;
                case 3:
                    manage.show();
                    manage.update();
                    break;
                case 4:
                    manage.show();
                    manage.remove();
                    break;
                case 5:
                    manage.sapXep();
                    manage.show();
                    break;
                case 6:
                    manage.docFile();
                    break;
                case 7:
                    manage.vietFile();
                    break;
                case 8:
                    return;

            }
        }
    }
}
