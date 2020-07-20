/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Quy
 */
public class TranDau {
    String MAT;
    String NGAYDA;
    String DIADIEM;
    String MAG;
    String MADN;
    String MADK;
    String TISO;

    public TranDau() {
    }

    public TranDau(String MAT, String NGAYDA, String DIADIEM, String MAG, String MADN, String MADK, String TISO) {
        this.MAT = MAT;
        this.NGAYDA = NGAYDA;
        this.DIADIEM = DIADIEM;
        this.MAG = MAG;
        this.MADN = MADN;
        this.MADK = MADK;
        this.TISO = TISO;
    }

    public String getMAT() {
        return MAT;
    }

    public void setMAT(String MAT) {
        this.MAT = MAT;
    }

    public String getNGAYDA() {
        return NGAYDA;
    }

    public void setNGAYDA(String NGAYDA) {
        this.NGAYDA = NGAYDA;
    }

    public String getDIADIEM() {
        return DIADIEM;
    }

    public void setDIADIEM(String DIADIEM) {
        this.DIADIEM = DIADIEM;
    }

    public String getMAG() {
        return MAG;
    }

    public void setMAG(String MAG) {
        this.MAG = MAG;
    }

    public String getMADN() {
        return MADN;
    }

    public void setMADN(String MADN) {
        this.MADN = MADN;
    }

    public String getMADK() {
        return MADK;
    }

    public void setMADK(String MADK) {
        this.MADK = MADK;
    }

    public String getTISO() {
        return TISO;
    }

    public void setTISO(String TISO) {
        this.TISO = TISO;
    }
    public boolean check () {
        if(this.MADN.equals(this.MADK)) {
            return false;
        }   return true;
    }
}
