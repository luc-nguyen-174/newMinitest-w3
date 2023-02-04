package views;

import controller.QuanLyNV;
import model.NhanVien;
import model.NhanVienFulltime;
import model.NhanVienParttime;

import java.util.*;

public class Client {
    public static List<NhanVien> nhanVien = new ArrayList<>();
    public static QuanLyNV quanLyNV = new QuanLyNV(nhanVien);
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        NhanVien nv1 = new NhanVienFulltime(1, randomName() + "", 35, "03" + randomNumbers(8),
                randomString() + "@gmail.com",
                13000000, 1000000, 300000);
        NhanVien nv2 = new NhanVienFulltime(2, randomName() + "", 34, "03" + randomNumbers(8),
                randomString() + "@gmail.com",
                5000000, 1000000, 300000);
        NhanVien nv3 = new NhanVienFulltime(3, randomName() + "", 36, "03" + randomNumbers(8),
                randomString() + "@gmail.com",
                5000000, 1000000, 300000);
        NhanVien nv4 = new NhanVienFulltime(4, randomName() + "", 41, "03" + randomNumbers(8),
                randomString() + "@gmail.com",
                8000000, 1000000, 300000);
        NhanVien nv5 = new NhanVienFulltime(5, randomName() + "", 38, "03" + randomNumbers(8),
                randomString() + "@gmail.com",
                21000000, 1000000, 300000);
        NhanVien nv6 = new NhanVienParttime(6, randomName() + "", 25, "03" + randomNumbers(8),
                randomString() + "@gmail.com", 23);
        NhanVien nv7 = new NhanVienParttime(7, randomName() + "", 23, "03" + randomNumbers(8),
                randomString() + "@gmail.com", 32);
        NhanVien nv8 = new NhanVienParttime(8, randomName() + "", 22, "03" + randomNumbers(8),
                randomString() + "@gmail.com", 40);
        NhanVien nv9 = new NhanVienParttime(9, randomName() + "", 18, "03" + randomNumbers(8),
                randomString() + "@gmail.com", 31);
        NhanVien nv10 = new NhanVienParttime(10, randomName() + "", 19, "03" + randomNumbers(8),
                randomString() + "@gmail.com", 15);

        quanLyNV.addNhanVien(nv1);
        quanLyNV.addNhanVien(nv2);
        quanLyNV.addNhanVien(nv3);
        quanLyNV.addNhanVien(nv4);
        quanLyNV.addNhanVien(nv5);
        quanLyNV.addNhanVien(nv6);
        quanLyNV.addNhanVien(nv7);
        quanLyNV.addNhanVien(nv8);
        quanLyNV.addNhanVien(nv9);
        quanLyNV.addNhanVien(nv10);
        try {
            int selection;
            do {
                System.out.println("--------------------------Menu------------------------");
                System.out.print("""
                        1. Hiển thị danh sách nhân viên.
                        2. Tính lương trung bình của tất cả nhân viên.
                        3. Hiển thi danh sách nhân viên chính thức có lương thấp hơn trung bình.
                        4. Tính số lương phải trả cho toàn bộ nhân viên bán thời gian.
                        5. Sắp xếp nhân viên toàn thời gian theo số lương tăng dần.
                        0. Thoát.
                        ----------------------------------------------------------------
                        """);
                System.out.print("Mời nhập lựa chọn: ");
                selection = scanner.nextInt();
                switch (selection) {
                    case 0 -> System.exit(0);
                    case 1 -> quanLyNV.hienThiNV();
                    case 2 -> {
                        System.out.println("------------------------------------------------");
                        System.out.println("Lương trung bình của tất cả nhân viên là: " + quanLyNV.trungBinhLuong() + "vnd");
                    }
                    case 3 -> quanLyNV.hienThiNvDuoiAvg();
                    case 4 -> quanLyNV.tongLuongParttime();
                    case 5 -> quanLyNV.sapXepNV();
                    default -> System.out.println("Không hợp lê, mời nhập lại!!!");
                }
            } while (selection != 0);
        } catch (InputMismatchException e) {
            System.err.println("Nhập số, không được nhập chữ!!!");
        }
    }


    private static StringBuilder getStringBuilder(int n, String chars) {
        StringBuilder randomNumberString = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int randomIndex = random.nextInt(chars.length());
            randomNumberString.append(chars.charAt(randomIndex));
        }
        return randomNumberString;
    }

    private static StringBuilder randomNumbers(int n) {
        String chars = "0123456789";
        return getStringBuilder(n, chars);
    }

    private static StringBuilder randomString() {
        int length = 6;
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "abcdefghijklmnopqrstuvwxyz" +
                "0123456789";
        return getStringBuilder(length, chars);
    }

    private static String randomName() {
        String[] firstNames = {"Nguyễn", "Lê", "Trịnh", "Hồ", "Trân", "Phạm"};
        String[] lastNames = {"Huy", "Khang", "Bảo", "Minh", "Anh", "Khoa", "Hồng"};

        Random random = new Random();
        int firstNameIndex = random.nextInt(firstNames.length);
        int lastNameIndex = random.nextInt(lastNames.length);

        return firstNames[firstNameIndex] + " " + lastNames[lastNameIndex];
    }
}
