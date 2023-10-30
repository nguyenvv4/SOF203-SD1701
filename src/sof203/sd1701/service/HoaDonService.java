/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sof203.sd1701.service;

import java.util.ArrayList;
import sof203.sd1701.entity.HoaDon;

/**
 *
 * @author nguyenvv
 */
public class HoaDonService {

    ArrayList<HoaDon> list = new ArrayList<>();

    public ArrayList<HoaDon> getList() {
        list.add(new HoaDon("Nguyen Van A", 10, "Hoc Lai"));
        list.add(new HoaDon("Nguyen Van B", 10, "Hoc Lai"));
        return list;
    }

}
