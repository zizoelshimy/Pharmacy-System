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
import java.util.ArrayList;
import java.util.Date;

public class Employee {
   static Connection con;
   static Employeephonenumber EPN;

    public   Employee(PharmacyAPI pharma){

        this.con = pharma.con;
        this.EPN = new Employeephonenumber(pharma.con);

    }
    public boolean ifexist(String Name, int ssn) throws SQLException {
    boolean flag = false;
    try (PreparedStatement ps = con.prepareStatement("SELECT * FROM employee WHERE ssn=? AND name=? AND manager_ssn is NULL")) {
        ps.setInt(1, ssn);
        ps.setString(2, Name);

        // Execute the SELECT query
        try (ResultSet rs = ps.executeQuery()) {
            // Check if the result set has any rows
            if (rs.next()) {
                // User exists
                flag = true;
            }
        }
    } catch (SQLException e) {
        // Handle the exception or log the error
        e.printStackTrace();
    }
    return flag;
}

public boolean ifexistemp(String Name, int ssn) throws SQLException {
    boolean flag = false;
    try (PreparedStatement ps = con.prepareStatement("SELECT * FROM employee WHERE ssn=? AND name=?")) {
        ps.setInt(1, ssn);
        ps.setString(2, Name);

        // Execute the SELECT query
        try (ResultSet rs = ps.executeQuery()) {
            // Check if the result set has any rows
            if (rs.next()) {
                // User exists
                flag = true;
            }
        }
    } catch (SQLException e) {
        // Handle the exception or log the error
        e.printStackTrace();
    }
    return flag;
}


    public   void insert(int SSN, String Name, int salary, int branchid,String phonenumber) throws SQLException {
        PreparedStatement ps = con.prepareStatement("INSERT INTO employee VALUES(?,?,?,null,?)");
        Date date = new Date();
        ps.setInt(1,SSN);
        ps.setString(2,Name);
        ps.setInt(3,salary);
        ps.setInt(4,branchid);
        

        ps.executeUpdate();
        EPN.insert(SSN, phonenumber);

    }
    public void insert(int SSN, String Name, int salary, int branchid,int manager_id,String phonenumber) throws SQLException {
        PreparedStatement ps = con.prepareStatement("INSERT INTO employee VALUES(?,?,?,?,?)");
        ps.setInt(1,SSN);
        ps.setString(2,Name);
        ps.setInt(3,salary);
        ps.setInt(5,branchid);
        ps.setInt(4,manager_id);

        ps.executeUpdate();
        EPN.insert(SSN, phonenumber);
    }
//    public int updatename(int SSN,String Name) throws SQLException{
//        PreparedStatement ps = con.prepareStatement("UPDATE employee SET name=? WHERE SSN=?");
//        ps.setString(1,Name);
//        ps.setInt(2,SSN);
//        return ps.executeUpdate();
//    }
    public int updatemanager(int SSN,int managerSSN) throws SQLException{
        PreparedStatement ps = con.prepareStatement("UPDATE employee SET Manager_SSN=? WHERE SSN=?");
        ps.setInt(1,managerSSN);
        ps.setInt(2,SSN);
        return ps.executeUpdate();
    }
    public int updatesalary(int SSN,int salary) throws SQLException{
        PreparedStatement ps = con.prepareStatement("UPDATE employee SET salary=? WHERE SSN=?");
        ps.setInt(1,salary);
        ps.setInt(2,SSN);
        return ps.executeUpdate();
    }
    public int deletePN(String phonenumber) throws SQLException{
        return EPN.delete(phonenumber);
    }


    public void insertPN(int SSN, String phonenumber) throws SQLException {
        EPN.insert(SSN, phonenumber);
    }

    public int delete(int ssn) throws SQLException {
    // Delete related records in the bill table first
    deleteBills(ssn);

    // Now delete the employee record
    PreparedStatement ps = con.prepareStatement("DELETE FROM employee WHERE SSN=?");
    ps.setInt(1, ssn);
    return ps.executeUpdate();
    }
        //PreparedStatement ps2=con.prepareStatement("DELETE FROM employee WHERE Manager_SSN=?");
    
// Helper method to delete related records in the bill table
    private void deleteBills(int ssn) throws SQLException {
    PreparedStatement ps = con.prepareStatement("DELETE FROM bill WHERE E_SSN=?");
    ps.setInt(1, ssn);
    ps.executeUpdate();
    }
    public ArrayList<ArrayList<String>> selectall() throws SQLException {
    PreparedStatement ps = con.prepareStatement("SELECT * FROM employee", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
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
    public ArrayList<ArrayList<String>> selectallbranid(int brnid) throws SQLException {
    PreparedStatement ps = con.prepareStatement("SELECT * FROM employee where branch_id=?", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
    ps.setInt(1, brnid);
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
    public String get(int id) throws SQLException{
        PreparedStatement ps = con.prepareStatement("SELECT * from employee where SSN=?",ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ps.setInt(1,id);
        ResultSet result=ps.executeQuery();
        ps = con.prepareStatement("SELECT * from Employee_Phone_number where SSN=?",ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ps.setInt(1,id);
        ResultSet result2=ps.executeQuery();
        result.first();
        StringBuilder stb = new StringBuilder();
        stb.append("SSN = ").append(id).append(": ");
        stb.append(" Name:").append(result.getString(2));
        stb.append(" Salary:").append(result.getString(3));
        stb.append(" Manager SSN:").append(result.getInt(4));
        stb.append(" Phone numbers:");
        result2.beforeFirst();
        while (result2.next()) {
            stb.append(" ").append(result2.getString(1)).append(",");
        }
        stb.replace(stb.length()-1,stb.length(),".");
        return stb.toString();
    }
}
