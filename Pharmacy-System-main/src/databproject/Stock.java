/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databproject;

import javax.lang.model.type.ArrayType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class Stock {
    Connection con;

    Stock(PharmacyAPI pharma) {
        con = pharma.con;
    }

    public boolean checkIfExist(int branchId, int medicineId, ArrayList<ArrayList<String>> data) {
    for (ArrayList<String> row : data) {
        try {
            int storedBranchId = Integer.parseInt(row.get(0));
            int storedMedicineId = Integer.parseInt(row.get(1));

            if (storedBranchId == branchId && storedMedicineId == medicineId) {
                return true;
            }
        } catch (NumberFormatException e) {
            // Handle invalid data or log the error
            e.printStackTrace();
        }
    }
    return false;
}
    public void insert(int branchId, int medicineId, int amount) throws SQLException {
    ArrayList<ArrayList<String>> data = selectall();
    if (checkIfExist(branchId, medicineId, data)) {
        update(branchId, medicineId, amount);
    } else {
        PreparedStatement ps = con.prepareStatement("INSERT INTO STOCK (Branch_id, Medicine_id, amount) VALUES (?, ?, ?)");
        ps.setInt(1, branchId);
        ps.setInt(2, medicineId);
        ps.setInt(3, amount);
        ps.executeUpdate();
    }
}
    
    public void update(int branchId,int medicineId , int amount ) throws SQLException {
        if(checkIfExist(branchId,medicineId,selectall())) {
            PreparedStatement ps = con.prepareStatement("UPDATE STOCK SET amount=? WHERE branch_id=?,medicine_id=?");
            ps.setInt(1, amount);
            ps.setInt(2, branchId);
            ps.setInt(3, medicineId);
            ps.executeUpdate();
        }else{
            insert(branchId,medicineId,amount);
        }
    }

    public int delete(int medicineId, int branchId) throws SQLException {
        PreparedStatement ps = con.prepareStatement("DELETE FROM Stock WHERE branch_id=?,medicine_id=?");
        ps.setInt(1, branchId);
        ps.setInt(2, medicineId);
        return ps.executeUpdate();
    }

    public int deleteM(int medicineId) throws SQLException {
        PreparedStatement ps = con.prepareStatement("DELETE FROM Stock WHERE medicine_id=?");
        ps.setInt(1, medicineId);
        return ps.executeUpdate();
    }
    public int deleteB(int branchId) throws SQLException {
        PreparedStatement ps = con.prepareStatement("DELETE FROM Stock WHERE branch_id=?");
        ps.setInt(1, branchId);
        return ps.executeUpdate();
    }
    public String get(int medicineId ,int branchId) throws SQLException{
        PreparedStatement ps = con.prepareStatement("SELECT * from stock where medicine_id=?,branch_id=?", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ps.setInt(1,medicineId);
        ps.setInt(2,branchId);
        ResultSet result=ps.executeQuery();
        result.first();
        StringBuilder stb = new StringBuilder();
        return String.valueOf(stb);
    }
    public ArrayList<ArrayList<String>> selectall() throws SQLException {
    PreparedStatement ps = con.prepareStatement("SELECT * FROM stock", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
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