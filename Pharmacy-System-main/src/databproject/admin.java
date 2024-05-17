/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author zozel
 */
public class admin {
    Connection con;

    public admin(PharmacyAPI pharma) {
         this.con = pharma.con;
    }
         public void insert(int AdminID,String Username,String Passwordd) throws SQLException{
        PreparedStatement ps = con.prepareStatement("INSERT INTO ADMIN VALUES(?,?,?)");// we can use it to make statmen and ? to we can update it bra7ty
        
        ps.setInt(1,AdminID);//make first ? convert to int 
        ps.setString(2,Username);////make first ? convert to string
        ps.setString(3,Passwordd);
        ps.executeUpdate();
    }
 public int update(int AdminID, String Username, String Passwordd) throws SQLException {
    PreparedStatement ps = con.prepareStatement("UPDATE admin SET Username=?, Passwordd=? WHERE AdminID=?");//take old id and ubadte on it the user name and password
    ps.setString(1, Username);
    ps.setString(2, Passwordd);
    ps.setInt(3, AdminID);
    return ps.executeUpdate();
}
    public int delete(int AdminID) throws SQLException{
        PreparedStatement ps = con.prepareStatement("DELETE FROM admin WHERE AdminID=?");
        ps.setInt(1,AdminID);
        return ps.executeUpdate();
    }
       public ArrayList<ArrayList<String>> selectall() throws SQLException{
        PreparedStatement ps = con.prepareStatement("SELECT * from admin",ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet result=ps.executeQuery();
        ArrayList<ArrayList<String>> twoDArrayList = new ArrayList<>();
        twoDArrayList.add(new ArrayList<>());
        twoDArrayList.add(new ArrayList<>());

        while (result.next()) {
            twoDArrayList.get(0).add(result.getString(2));
        }
        while (result.next()) {
            twoDArrayList.get(1).add(result.getString(3));
        }
        return twoDArrayList;
    }
       public String get(int AdminID) throws SQLException {
    PreparedStatement ps = con.prepareStatement("SELECT * FROM admin WHERE AdminID=?", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
    ps.setInt(1, AdminID);
    ResultSet result = ps.executeQuery();

    if (result.first()) {
     
   StringBuilder stb = new StringBuilder();
        stb.append("AdminID = ").append(AdminID).append(": ");
        stb.append("Username = ").append(result.getString("Username"));
        // Add more fields as needed

        return stb.toString();
    } else {
        return "Admin not found with ID: " + AdminID;
    }
}
}
