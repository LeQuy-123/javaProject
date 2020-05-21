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
public class PhieuKhaiBao {
    int id;
    String ten;
    String tuoi;
    String tinhTrang;
    String tiepXuc;
    String diaChi;
    String diLai;
    public PhieuKhaiBao( String ten, String tuoi, String tinhTrang, String tiepXuc, String diaChi, String diLai) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.tinhTrang = tinhTrang;
        this.tiepXuc = tiepXuc;
        this.diaChi = diaChi;
        this.diLai = diLai;
    }

    public PhieuKhaiBao() {
         //To change body of generated methods, choose Tools | Templates.
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

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getTiepXuc() {
        return tiepXuc;
    }

    public void setTiepXuc(String tiepXuc) {
        this.tiepXuc = tiepXuc;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDiLai() {
        return diLai;
    }

    public void setDiLai(String diLai) {
        this.diLai = diLai;
    }
    public boolean CheckEmpty(){
        return this.getTen().equals("")||this.getDiLai().equals("")||this.getTiepXuc().equals("")||this.getTinhTrang().equals("");
    }
    
}
