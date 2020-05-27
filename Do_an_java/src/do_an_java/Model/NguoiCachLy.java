/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do_an_java.Model;

/**
 *
 * @author Quy
 */
public class NguoiCachLy {
    int id;
    String ten;
    String gioiTinh;
    String ngaySinh;
    String SDT;
    String lydo;
    String tinhTrang;
    String ghiChu;

    public NguoiCachLy(String ten, String gioiTinh, String ngaySinh, String SDT, String lydo, String tinhTrang, String ghiChu) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.SDT = SDT;
        this.lydo = lydo;
        this.tinhTrang = tinhTrang;
        this.ghiChu = ghiChu;
    }

    public NguoiCachLy() {
    }
    
  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getLydo() {
        return lydo;
    }

    public void setLydo(String lydo) {
        this.lydo = lydo;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    public boolean checkEmpty(){
        return this.getTen().isEmpty() || this.getLydo().isEmpty() || this.getGioiTinh().isEmpty() || this.getNgaySinh().isEmpty() || this.getSDT().isEmpty() || this.getTinhTrang().isEmpty();
    }
}
