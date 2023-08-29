import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {

	private String dburl="jdbc:mysql://localhost:3306/userregistration";
	private String dbuname="root";
	private String dbpassword="San@9899$sql";
	private String dbdriver="com.mysql.jdbc.Driver";
	public void loadDriver(String dbDriver)
	 {
	 try {
	 Class.forName(dbDriver);
	 } catch (ClassNotFoundException e) {
	 // TODO Auto-generated catch block
	 e.printStackTrace();
	 }
	 }
	public Connection getConnection()
	{
		Connection con=null;
		try {
			con=DriverManager.getConnection(dburl,dbuname,dbpassword);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
		}
	public String insert(Member member) {
	    loadDriver(dbdriver);
	    Connection con = getConnection();
	    String sql = "INSERT INTO member (FirstName, LastName, Technology, MastersCompletionYear, Email, ContactNumber) VALUES (?,?,?,?,?,?)";
	    String result = "Thank you for registering! We will be in touch with you soon.";

	    try {
	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setString(1, member.getFirstName());
	        ps.setString(2, member.getLastName());
	        ps.setString(3, member.getTechnology());
	        ps.setInt(4, member.getMastersCompletionYear());
	        ps.setString(5, member.getEmail());
	        ps.setString(6, member.getContactNumber());

	        ps.executeUpdate();
	    } catch (SQLException e) {
	        result = "Data Not Entered Successfully";
	        e.printStackTrace();
	    } 
	    return result;
	}
	} 
