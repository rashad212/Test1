package DataJDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainJdbcQuery{

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/mydb";
        Connection connection = DriverManager.getConnection(url, "postgres", "ghffymh");

//        Statement statement = connection.createStatement();
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Ad");
//        String name =sc.next();
//        System.out.println("Soyad");
//        String surname =sc.next();
//        String sql = "insert into resschema.students " +
//                "values (8),'"+name+"' ,'"+surname+"','c++')";
//
//        String sql1= "insert into resschema.students values (8),? ,?,'c++')";
//
//        PreparedStatement preparedStatement = connection.prepareStatement(sql1);
//        preparedStatement.setString(1, name);
//        preparedStatement.setString(2,surname);
//        System.out.println(preparedStatement.execute());


//        System.out.println(statement.executeUpdate(sql));

        PreparedStatement ps = connection.prepareStatement("select * from resschema.students");
        ResultSet rs = ps.executeQuery();

        while (rs.next()){
            Integer id1= rs.getInt(1);
            String name1 = rs.getString("name");
            String surname1 = rs.getString("lesson");
            System.out.println(id1+" "+name1+" "+surname1);
        }

        ps.close();
        connection.close();
    }
}
