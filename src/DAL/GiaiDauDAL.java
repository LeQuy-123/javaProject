/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import static DAL.DataBase.conectionJDBC;
import DTO.GiaiDau;
import DTO.TranDau;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;/**
 *
 * @author Quy
 */
public class GiaiDauDAL {
    public boolean ThemGiai(GiaiDau db){
        String sql = "Insert into GIAIDAU values ('"+ db.getMaG()+"','" + db.getTenGiai()+"','" + db.getNgayBD()+"','" + db.getNgayKT()+"')";
        try {
            Statement statement = conectionJDBC().createStatement();
            statement.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(GiaiDauDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
     public boolean ThemTran(TranDau td){
        String sql = "Insert into TRANDAU values ('"
                + td.getMAT()+"','" 
                + td.getNGAYDA()+"','" 
                + td.getDIADIEM()+"','" 
                + td.getMAG()+"','" 
                + td.getMADN()+"','" 
                + td.getMADK()+"','" 
                + td.getTISO() + "')";
        try {
            Statement statement = conectionJDBC().createStatement();
            statement.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(GiaiDauDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
     public ArrayList<GiaiDau> getAllGiaiDau(){
        ArrayList<GiaiDau> listGD = new ArrayList<GiaiDau>();
        String sql = "select * from GIAIDAU";
        ResultSet rs = DataBase.getData(conectionJDBC (),sql);
        try {
            while (rs.next()){
                GiaiDau gdDTO = new GiaiDau();
                gdDTO.setMaG(rs.getString("MAG"));
                gdDTO.setTenGiai(rs.getString("TENGIA"));
                gdDTO.setNgayBD(rs.getString("NGAYBATDAU"));
                gdDTO.setNgayKT(rs.getString("COLUMNGAYKETTHUC"));
                listGD.add(gdDTO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GiaiDauDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listGD;
    }
    public void CT_GD(String maGD, String maDoi){
        String sql = "Insert into CT_GD values ('"+ maGD+"','" + maDoi+"')";
        try {
            Statement statement = conectionJDBC().createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(GiaiDauDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<String> getAllDoiTrongGiai(String MaG){
        ArrayList<String> listDoi = new ArrayList<>();
        String sql = "select MAD from CT_GD where MAG =" + MaG;
        ResultSet rs;
        rs = DataBase.getData(conectionJDBC (),sql);
        try {
            while (rs.next()){                
                listDoi.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GiaiDauDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDoi;
    }
}
