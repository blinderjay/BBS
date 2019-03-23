
import com.blinderjay.sql.sqlConnection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author blinderjay
 */
public class testConnect_Sql {

    public static void main(String[] args) {

        try {
            sqlConnection UserSql = new sqlConnection("org.mariadb.jdbc.Driver", "jdbc:mariadb://127.0.0.1/bbs", "root", "root");
            java.sql.Connection conn = UserSql.connect();

            try {
                java.sql.Statement stmt = conn.createStatement();
                java.sql.ResultSet rs = stmt.executeQuery("SELECT * FROM users ;");
    
                
                for (;;) {
                    if (rs.next()) {
                        int id = rs.getInt("uid");
                        String email = rs.getString("email");
                        System.out.println(id + "  :  " + email);
                    } else {
                        break;
                    }
                }
            } finally {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(testConnect_Sql.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
