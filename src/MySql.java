import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySql {

        public static void main(String args[]){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con= DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/samarth","root","samarth9011");
                Statement stmt=con.createStatement();
               // stmt.executeUpdate("Insert into persons( PersonID,LastName,FirstName) values(12,'gunshettiwar','akshay')");
                stmt.executeUpdate("delete from persons where PersonID=11");
                ResultSet rs=stmt.executeQuery("select * from persons");
                while(rs.next())
                    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
                con.close();
            }catch(Exception e){ System.out.println(e);}
        }
    }
