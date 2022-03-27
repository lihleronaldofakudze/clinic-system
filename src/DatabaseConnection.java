import java.sql.*;

public class DatabaseConnection {
    private static final String DRIVER_URL = "com.mysql.cj.jdbc.com";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String URL = "jdbc:mysql://localhost:3306/clinic_management";
    private static Connection connection;
    static {
        try {
            Class.forName(DRIVER_URL);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}