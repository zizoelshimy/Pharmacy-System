/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databproject;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Branch extends Stock{

    Connection con;

    Branch(PharmacyAPI pharma) {
        super(pharma);
        con = pharma.con;
    }
    public boolean ifexistbill(int Branchid) throws SQLException {
    boolean flag = false;
    try {
        PreparedStatement ps = con.prepareStatement("SELECT * FROM branch WHERE branch_id=?");
        ps.setInt(1, Branchid);
        // Execute the SELECT query
        ResultSet rs = ps.executeQuery();
        // Check if the result set has any rows
        if (rs.next()) {
            // User exists
            flag = true;
        }
    } catch (SQLException e) {
        // Handle the exception or log the error
        e.printStackTrace();
    }
    return flag;
} 

    public void insert(int id, String location) throws SQLException {
        PreparedStatement ps = con.prepareStatement("INSERT INTO BRANCH VALUES(?,?)");
        ps.setInt(1, id);
        ps.setString(2, location);
        ps.executeUpdate();
    }

    public int delete(int branchId) throws SQLException {
        super.deleteB(branchId);
        PreparedStatement ps = con.prepareStatement("DELETE FROM branch WHERE Branch_id=?");
        ps.setInt(1, branchId);
        return ps.executeUpdate();
    }

    public String get(int id) throws SQLException{
        PreparedStatement ps = con.prepareStatement("SELECT * from branch where branch_id=?",ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ps.setInt(1,id);
        ResultSet result=ps.executeQuery();
        result.first();
        StringBuilder stb = new StringBuilder();
        stb.append("Branch id = ").append(id).append(": ");
        stb.append(" Location:").append(result.getString(2));
        return stb.toString();
    }
   public ArrayList<ArrayList<String>> selectall() throws SQLException {
    PreparedStatement ps = con.prepareStatement("SELECT * FROM branch", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
    ResultSet result = ps.executeQuery();
    ArrayList<ArrayList<String>> twoDArrayList = new ArrayList<>();

    ResultSetMetaData metaData = result.getMetaData();
    int columnCount = metaData.getColumnCount();

    while (result.next()) {
        ArrayList<String> row = new ArrayList<>();
        for (int i = 1; i <= columnCount; i++) {
            row.add(result.getString(i));
        }
        twoDArrayList.add(row);
    }

        return twoDArrayList;
    }

}
