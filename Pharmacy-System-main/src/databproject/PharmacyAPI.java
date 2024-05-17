package databproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class PharmacyAPI {
   static private String url = "jdbc:mysql://localhost:3306/pharmacy";//delete ip adderess and put local host
   static private String username = "root";
   static private String password = "********";// delete pass we put my sql pass
   private static PharmacyAPI instance;
   public Connection con = null; //this is form for connection we create it 
  private PharmacyAPI() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//make dynamic call for driver if it true yes else driver field 
            System.out.println("Driver Loaded");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver loading failed");
            throw new RuntimeException(e);
        }
        try {
            this.con = DriverManager.getConnection(// give url and pass of connection to to check connection is true b3d m rabt b sever 
                    url, username, password);
            System.out.println("Connection Established");
        } catch (SQLException e) {
            System.out.println("Cannot form connection");
            throw new RuntimeException(e);
        }

    }

    public static PharmacyAPI getInstance() {
        if (instance == null) {
            instance = new PharmacyAPI();
        }
        return instance;
    }

    public static void setUrl(String url) {
        PharmacyAPI.url = url;
    }

    public static void setPassword(String password) {
        PharmacyAPI.password = password;
    }

    public static void setUsername(String username) {
        PharmacyAPI.username = username;
    }
    
   // public void insert_into(int id,String Name,int Pharmacy_id,double SSN,int Managed_by) throws SQLException {
     //   Statement st = con.createStatement();
       // StringBuilder stb = new StringBuilder("INSERT INTO EMPLOYEE");
       // stb.append(" values(");
        //stb.append(id).append(",");
        //stb.append("'" +Name+"'").append(",");
        //stb.append(Pharmacy_id).append(",");
        //stb.append(SSN).append(",");
        //stb.append(Managed_by);
        //stb.append(");");
        //System.out.println(stb.toString());
        //int result=st.executeUpdate(stb.toString());
    //}

}
