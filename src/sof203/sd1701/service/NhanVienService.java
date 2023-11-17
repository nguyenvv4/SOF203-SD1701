/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sof203.sd1701.service;

import java.util.ArrayList;
import sof203.sd1701.entity.NhanVien;
import sof203.sd1701.repository.NhanVienRepository;

/**
 *
 * @author nguyenvv
 */
public class NhanVienService {
    // service goi repo de lay danh sach nhan vien trong csdl
    
    NhanVienRepository nhanVienRepository = new NhanVienRepository();
    public ArrayList<NhanVien> getList(){
        return nhanVienRepository.getList();
    }
}
