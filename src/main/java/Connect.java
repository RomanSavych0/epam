import java.sql.*;
//
public class Connect {
//    private  static final String url = "jdbc:h2:file:C:\\testh2/trainsStantion";
//    private static  final String user = "roma";
//    private  static final  String password = "1234";
//private static Connection con;
//private static  Statement stmt;
//private  static
// ResultSet rs;
    public static void main(String[] args) throws SQLException{
        try{
        Class.forName("org.h2.Driver");
        }catch(ClassNotFoundException e){
        e.printStackTrace();
        }
        }
//        con = DriverManager.getConnection(url , user , password);
//
//        stmt= con.createStatement();
//        stmt.executeUpdate("INSERT INTO  PASSENGERS ( FIRST_NAME , SURNAME , PRIVILLAGE) VALUES( 'oleg' , 'prtriv' , false )");
//        rs = stmt.executeQuery("SELECT *FROM PASSENGERS");
//       while(rs.next())
//       {            System.out.println(rs.getInt("ID") + ""+ rs.getString("FIRST_NAME"));
//       }
//
//       con.close();
//    }
//
}
