/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlycongdan;

import java.io.Serializable;
import javax.swing.ImageIcon;


/**
 *
 * @author Hades
 */
public class CongDan implements Serializable  {

    public String CMND;
    public String ten;
    public String gioiTinh;
    public String namSinh;
    public String queQuan;
    public String ngheNghiep;
    public String choOHienNay;
    public ImageIcon hinhAnh;


     public ImageIcon getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(ImageIcon hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
