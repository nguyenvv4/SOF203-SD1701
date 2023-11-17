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

//    public String addNew(HoaDon hoaDon) {
//        list.add(hoaDon);
//        return "Them thanh cong";
//    }
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
}
