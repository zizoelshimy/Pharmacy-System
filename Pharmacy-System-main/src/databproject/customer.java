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
public class customer {
    Connection con;
    public customer(PharmacyAPI pharma) {
        this.con = pharma.con;
    }
    public void insert(String phone_num,String customer_name) throws SQLException{
        PreparedStatement ps = con.prepareStatement("INSERT INTO CUSTOMER VALUES(?,?)");
        ps.setString(1,phone_num);//make first ? convert to int
        ps.setString(2,customer_name);////make first ? convert to string
        ps.executeUpdate();
    }
    public int update(String phoneNew , String phoneOld) throws SQLException{
        PreparedStatement ps = con.prepareStatement("UPDATE customer SET phone_number=?  WHERE phone_number=?");
        ps.setString(1,phoneNew);//make first ? convert to int
        ps.setString(2,phoneOld);
        return ps.executeUpdate();
    }
    public int delete(int phone_num) throws SQLException{
        PreparedStatement ps = con.prepareStatement("DELETE FROM customer WHERE phone_num=?");
        ps.setInt(1,phone_num);
        return ps.executeUpdate();
    }
    public ArrayList<ArrayList<String>> selectall() throws SQLException {
    PreparedStatement ps = con.prepareStatement("SELECT * FROM customer", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
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
    public String get(int phone_num) throws SQLException{
        PreparedStatement ps = con.prepareStatement("SELECT * from customer where phone_num=?",ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ps.setInt(1,phone_num);
        ResultSet result=ps.executeQuery();
        result.first();
        StringBuilder stb = new StringBuilder();
        stb.append("phone_num = ").append(phone_num).append(": ");
        stb.append("customer_name =:").append(result.getInt(2));
        return stb.toString();
    }
}
