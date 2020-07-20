package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MSI2
 */
public class DataBase {
    
    static private String hostname = "localhost";
    static private String SID = "orcl";
    static private String username = "quy";
    static private String password = "quy123";
    
    public static Connection conectionJDBC() //Ket noi oracle
    {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@" + hostname + ":1521:" + SID, username, password);
            return con; //ket noi thanh cong
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Kết nối thất bại");
        }
        return null; //ket noi khong thanh cong
    }
    
    public static ResultSet getData(Connection con, String sql) //lay du lieu load len
    {
        ResultSet rs = null;
        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Lấy dữ liệu thất bại");
        }
        return rs;
    }
    
}