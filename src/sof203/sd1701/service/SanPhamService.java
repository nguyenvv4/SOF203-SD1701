/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sof203.sd1701.service;

import java.util.ArrayList;
import sof203.sd1701.entity.SanPham;
import sof203.sd1701.repository.SanPhamRepository;

/**
 *
 * @author nguyenvv
 */
public class SanPhamService {

    SanPhamRepository sanPhamRepository = new SanPhamRepository();

    public ArrayList<SanPham> getAll() {
        // goi sang repo de lay du lieu
        return sanPhamRepository.getList();
    }

    public String addNew(SanPham sanPham) {
        // truyen sanpham sang repo de them vao csdl
        Boolean check = sanPhamRepository.addNew(sanPham);
        if (check) {
            return "Them thanh cong";
        } else {
            return "Them that bai";
        }

    }

    public String delete(Integer id) {
        // truyen sanpham sang repo de them vao csdl
        Boolean check = sanPhamRepository.delete(id);
        if (check) {
            return "Xoa thanh cong";
        } else {
            return "Xoa that bai";
        }

    }

    public String update(SanPham sanPham) {
        // truyen sanpham sang repo de them vao csdl
        Boolean check = sanPhamRepository.update(sanPham);
        if (check) {
            return "Update thanh cong";
        } else {
            return "Update that bai";
        }

    }
}
