/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sof203.sd1701.entity;

/**
 *
 * @author nguyenvv
 */
public class SanPham {
    private Integer id;
    
    private String tenSanPham;
    
    private String danhMuc;
    
    private Integer soLuongTon;
    
    private String trangThai;

    public SanPham() {
    }

    public SanPham(Integer id, String tenSanPham, String danhMuc, Integer soLuongTon, String trangThai) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.danhMuc = danhMuc;
        this.soLuongTon = soLuongTon;
        this.trangThai = trangThai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public Integer getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(Integer soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
