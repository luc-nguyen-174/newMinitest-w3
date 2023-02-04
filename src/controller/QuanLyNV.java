package controller;

import model.NhanVien;
import model.NhanVienFulltime;
import model.NhanVienParttime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QuanLyNV {
    //luu tru du lieu nhan vien
    List<NhanVien> quanLyNv;

    public QuanLyNV(List<NhanVien> quanLyNv) {
        this.quanLyNv = quanLyNv;
    }

    public void setQuanLyNv(List<NhanVien> quanLyNv) {
        this.quanLyNv = quanLyNv;
    }

    public void addNhanVien(NhanVien nhanVien) {
        quanLyNv.add(nhanVien);
    }

    public void xoaNhanVien(int id) {
        quanLyNv.remove(id);
    }

    public double trungBinhLuong() {
        double trungBinhLuong;
        double tongLuong = 0;
        for (NhanVien nhanVien : quanLyNv) {
            tongLuong += nhanVien.tinhLuong();
        }
        trungBinhLuong = tongLuong / quanLyNv.size();
        return trungBinhLuong;
    }

    public void hienThiNV() {
        for (NhanVien nhanVien : quanLyNv) {
            System.out.println(nhanVien);
        }
    }


    public void hienThiNvDuoiAvg() {
        System.out.println("------------------------------------------------");
        System.out.println("Danh sách nhân viên chính thức có lương thấp hơn trung bình:");
        for (NhanVien nhanVien : quanLyNv) {
            if (nhanVien instanceof NhanVienFulltime) {
                if (nhanVien.tinhLuong() < trungBinhLuong()) {
                    System.out.println(nhanVien);
                }
            }
        }
    }

    public void tongLuongParttime() {
        System.out.println("------------------------------------------------");
        System.out.println("Tổng số lương phải trả cho nhân viên bán thời gian là:");
        int total = 0;
        for (NhanVien nhanVien : quanLyNv) {
            if (nhanVien instanceof NhanVienParttime) {
                total += nhanVien.tinhLuong();
            }
        }
        System.out.println(total + "đ");
    }

    public void sapXepNV() {
        System.out.println("------------------------------------------------");
        System.out.println(":");
        Comparator<NhanVien> c = (nhanVien1, nhanVien2) -> (int) (nhanVien1.tinhLuong() - nhanVien2.tinhLuong());
        quanLyNv.sort(c);
        for (NhanVien nhanVien : quanLyNv) {
            if (nhanVien instanceof NhanVienFulltime) {
                System.out.println(nhanVien);
            }
        }
    }
}
