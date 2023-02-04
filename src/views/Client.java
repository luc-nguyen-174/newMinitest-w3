package views;

import controller.QuanLyNV;
import model.NhanVien;
import model.NhanVienFulltime;
import model.NhanVienParttime;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Client {
    public static List<NhanVien> nhanVien = new ArrayList<>();
    public static QuanLyNV quanLyNV = new QuanLyNV(nhanVien);
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        NhanVien nv1 = new NhanVienFulltime(1, randomString() + "", 35, "03" + randomNumbers(8),
                randomString() + "@gmail.com",
                13000000, 1000000, 300000);
        NhanVien nv2 = new NhanVienFulltime(2, randomString() + "", 34, "03" + randomNumbers(8),
                randomString() + "@gmail.com",
                5000000, 1000000, 300000);
        NhanVien nv3 = new NhanVienFulltime(3, randomString() + "", 36, "03" + randomNumbers(8),
                randomString() + "@gmail.com",
                5000000, 1000000, 300000);
        NhanVien nv4 = new NhanVienFulltime(4, randomString() + "", 41, "03" + randomNumbers(8),
                randomString() + "@gmail.com",
                8000000, 1000000, 300000);
        NhanVien nv5 = new NhanVienFulltime(5, randomString() + "", 38, "03" + randomNumbers(8),
                randomString() + "@gmail.com",
                21000000, 1000000, 300000);
        NhanVien nv6 = new NhanVienParttime(6, randomString() + "", 25, "03" + randomNumbers(8),
                randomString() + "@gmail.com", 23);
        NhanVien nv7 = new NhanVienParttime(7, randomString() + "", 23, "03" + randomNumbers(8),
                randomString() + "@gmail.com", 32);
        NhanVien nv8 = new NhanVienParttime(8, randomString() + "", 22, "03" + randomNumbers(8),
                randomString() + "@gmail.com", 40);
        NhanVien nv9 = new NhanVienParttime(9, randomString() + "", 18, "03" + randomNumbers(8),
                randomString() + "@gmail.com", 31);
        NhanVien nv10 = new NhanVienParttime(10, randomString() + "", 19, "03" + randomNumbers(8),
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

        int selection;
        do {
            System.out.println("--------------------------Menu------------------------");
            System.out.println("""
                    1. Hiển thị danh sách nhân viên.
                    2. Tính lương trung bình của tất cả nhân viên.
                    3. Hiển thi danh sách nhân viên chính thức có lương thấp hơn trung bình.
                    4. Tính số lương phải trả cho toàn bộ nhân viên bán thời gian.
                    5. Sắp xếp nhân viên toàn thời gian theo số lương tăng dần.
                    0. Thoát.
                    ----------------------------------------------------------------
                    """);
            System.out.print("\nMời nhập lựa chọn: ");
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
            }
        } while (selection != 0);
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
}
