package jdbc;

import java.sql.*;

public class Tests {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("", "", "");

        PreparedStatement ps = conn.prepareStatement("SELECT * FROM users");

        ResultSet rs = ps.executeQuery();
    }

    void testSQLEx() throws SQLException {
        try(Connection conn = DriverManager.getConnection("", "", "");
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM users")) {

        }
    }

    void cloneTest() {

    }
}
