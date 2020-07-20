/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import static DAL.DataBase.conectionJDBC;
import DTO.DoiBong;
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
public class DoiBongDAL {
    public boolean ThemDOi(DoiBong db){
        String sql = "Insert into DOIBONG values ('"+ db.getMaDoi()+"','" + db.getTenDoi()+"','" + db.getQuocGia()+"')";
        try {
            Statement statement = conectionJDBC().createStatement();
            statement.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DoiBongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
     public ArrayList<DoiBong> getAllDoiBong(){
        ArrayList<DoiBong> listDB = new ArrayList<DoiBong>();
        String sql = "select * from DOIBONG";
        ResultSet rs = DataBase.getData(conectionJDBC (),sql);
        try {
            while (rs.next()){
                DoiBong DB = new DoiBong();
                DB.setMaDoi(rs.getString("MAD"));
                DB.setTenDoi(rs.getString("TENDOI"));
                DB.setQuocGia(rs.getString("QUOCGIA"));
                listDB.add(DB);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoiBongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDB;
    }
}
