
package library.managementsystem;

import java.sql.*;
public class conn {
    Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
                c =DriverManager.getConnection("jdbc:mysql:///project13","root","");
                s =c.createStatement();
               
               
        }catch(Exception e){
            System.out.println(e);
        }
    }    
}
