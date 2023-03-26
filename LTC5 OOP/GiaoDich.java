/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.congtyx;

/**
 *
 * @author ADMIN
 */
import java.util.ArrayList;

class GiaoDich {
    protected String maGiaoDich;
    protected String ngayGiaoDich;
    protected float donGia;
    protected int soLuong;

    public GiaoDich(String maGiaoDich, String ngayGiaoDich, float donGia, int soLuong) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public float tinhThanhTien() {
        return this.soLuong * this.donGia;
    }
}

class GiaoDichVang extends GiaoDich {
    protected String loaiVang;

    public GiaoDichVang(String maGiaoDich, String ngayGiaoDich, float donGia, int soLuong, String loaiVang) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
    }
}

class GiaoDichTienTe extends GiaoDich {
    protected float tiGia;
    protected String loaiTienTe;

    public GiaoDichTienTe(String maGiaoDich, String ngayGiaoDich, float donGia, int soLuong, float tiGia, String loaiTienTe) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTienTe = loaiTienTe;
    }

    @Override
    public float tinhThanhTien() {
        if (this.loaiTienTe.equals("USD") || this.loaiTienTe.equals("Euro")) {
            return this.soLuong * this.donGia * this.tiGia;
        } else {
            return super.tinhThanhTien();
        }
    }
}

public class QuanLyGiaoDich {
    public static void main(String[] args) {
        ArrayList<GiaoDich> danhSachGiaoDich = new ArrayList<GiaoDich>();
        danhSachGiaoDich.add(new GiaoDichVang("GD001", "01/01/2022", 50f, 100, "18K"));
        danhSachGiaoDich.add(new GiaoDichVang("GD002", "02/01/2022", 55f, 200, "24K"));
        danhSachGiaoDich.add(new GiaoDichVang("GD003", "03/01/2022", 60f, 150, "SJC"));
        danhSachGiaoDich.add(new GiaoDichTienTe("GD004", "04/01/2022", 25000f, 1000, 0.000043f, "USD"));
        danhSachGiaoDich.add(new GiaoDichTienTe("GD005", "04/03/2022", 25000f, 1000, 0.000043f, "USD"));
         danhSachGiaoDich.add(new GiaoDichTienTe("GD006", "04/03/2022", 25000f, 1000, 0.000043f, "USD"));
        