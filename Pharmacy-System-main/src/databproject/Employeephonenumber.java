/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databproject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Employeephonenumber {
    Connection con;
    public Employeephonenumber(Connection con){
        this.con = con;
    }
    public void insert(int SSN,String phonenumber) throws SQLException {
        PreparedStatement ps = con.prepareStatement("INSERT INTO Employee_Phone_number VALUES(?,?)");
        ps.setString(1,phonenumber);
        ps.setInt(2,SSN);
        ps.executeUpdate();
    }
    public int delete(String ssn) throws SQLException{
        PreparedStatement ps = con.prepareStatement("DELETE FROM Employee_Phone_number  WHERE SSN = ?");
        ps.setString(1,ssn);

        return ps.executeUpdate();
    }
    //add get method
}