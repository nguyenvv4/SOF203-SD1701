/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sof203.sd1701.service;

import java.util.ArrayList;
import sof203.sd1701.entity.HoaDon;
import sof203.sd1701.repository.HoaDonRepository;

/**
 *
 * @author nguyenvv
 */
public class HoaDonService {

    HoaDonRepository hoaDonRepository = new HoaDonRepository();

    public ArrayList<HoaDon> getList() {
        return hoaDonRepository.getList();
    }

    public String addNew(HoaDon hoaDon) {
        // truyền hoa don sang phan repo để insert
        Boolean check = hoaDonRepository.addNew(hoaDon);
        if (check == true) {
            return "Them thanh cong";
        } else {
            return "Them that bai";
        }
    }
    
    public String update(HoaDon hoaDon) {
        // truyền hoa don sang phan repo để insert
        Boolean check = hoaDonRepository.update(hoaDon);
        if (check == true) {
            return "Update thanh cong";
        } else {
            return "Update that bai";
        }
    }
//
//    public String update(int index, HoaDon hoaDon) {
//        list.set(index, hoaDon);
//        return "Update thanh cong";
//    }
//

    public ArrayList<HoaDon> searchByName(String name) {
        // truyen thong tin sang repo de lay du lieu
        ArrayList<HoaDon> listHoaDonByName = hoaDonRepository.searchByName(name);
        return listHoaDonByName;
    }

    public String delete(Integer id) {
        Boolean check = hoaDonRepository.delete(id);
        if (check) {
            return "Xoa thanh cong";
        } else {
            return "Xoa that bai";
        }
    }
}
