
package databproject;
import java.sql.*;
public class DataBProject {

   
    public static void main(String[] args) throws SQLException {
        PharmacyAPI pharma = PharmacyAPI.getInstance();
//ad.insert(55, "zoz", "77");
    Employee emp=new Employee(pharma);
    Branch brn=new Branch (pharma);
    brn.insert(173691, "sidibeshr");
    customer cas=new customer(pharma);
    cas.insert("0127", "salma");
    }
  
    
}
