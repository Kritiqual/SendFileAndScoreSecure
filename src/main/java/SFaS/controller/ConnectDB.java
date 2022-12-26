package SFaS.controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author kritiqual
 */
public class ConnectDB {

    private static final String URL = "jdbc:sqlserver://localhost:1433;database=SFaS;encrypt=true;trustServerCertificate=true;";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "K813138@sa";

    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (connection == null) {
                throw new Exception();
            }

            System.out.println("Ket noi CSDL thanh cong");
            return connection;
        } catch (Exception e) {
            System.out.println("Ket noi CSDL that bai");
            return null;
        }
    }
}
