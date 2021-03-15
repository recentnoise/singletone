package com.company;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Application {
    public static void main(String args[]) throws ClassNotFoundException, SQLException
    {
        Database foo = Database.getInstance();
        ResultSet rs = foo.query("SELECT * FROM users");
        while(rs.next())
            System.out.println(rs.getInt("id")+"  "+rs.getString("surname")+"  "+rs.getString("name"));

        System.out.println("------------------------------------------");

        Database bar = Database.getInstance();
        ResultSet rs2 = bar.query("SELECT * FROM users");
        while(rs2.next())
            System.out.println(rs2.getInt("id")+"  "+rs2.getString("surname")+"  "+rs2.getString("name"));

        foo.closeCon();
        bar.closeCon();
    }
}
