package Practice.Jdbc;

import java.sql.*;
import java.util.Scanner;

public class Crud {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost:5432/dbtest";
        Connection c = DriverManager.getConnection(url, "postgres", "ghffymh");
        Statement st = c.createStatement();

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Customer id: ");
//        int id = scan.nextInt();
//
//        System.out.println("Customer name: ");
//        String name = scan.nextLine();
//
//        System.out.println("Customer surname: ");
//        String surname = scan.nextLine();

        //-------- Statement
//        String query = "INSERT INTO customer (id, name, surname) VALUES (" + id + ",'" + name + "', '" + surname + "')";
//        int result = st.executeUpdate(query);
//        System.out.println(result);
//        st.close();

        // ------- Prepared Statement
//        String q = "INSERT INTO customer (id, name, surname) VALUES (?,?,?)";
//        PreparedStatement ps = c.prepareStatement(q);
//        ps.setInt(1,id);
//        ps.setString(2,name);
//        ps.setString(3,surname);
//        ps.executeUpdate();

        PreparedStatement pt = c.prepareStatement("SELECT * FROM customer");
        ResultSet rs = pt.executeQuery();

        while(rs.next()) {
            System.out.println(rs.getInt("id") + " - " + rs.getString("name") + " - " + rs.getString("surname"));
        }

    }
}
