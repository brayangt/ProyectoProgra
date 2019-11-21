
package edu.upana.dbconnection;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author bcojom
 */
public class Connexion {
    private static Connection con = null;
    public static Connection getConnection(){
        if(con != null) {
            return con;
        }
        else {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/proyectobd";
                String user = "root";
                String passwd = "Seguni1789%";
                
            con = DriverManager.getConnection(url,user,passwd);
                System.out.println("Conexion effective :");
                
            }catch (ClassNotFoundException cne) {
                    System.out.println("***Driver***");
                    cne.printStackTrace();
            }catch (SQLException e) {
                System.out.println("***SQLException***");
                System.out.println(e);
            }
            return con;
        }
    }
}
