package J0419.p913;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Connection conn = null;
				try {
					Class.forName("oracle.jdbc.OracleDriver");

					conn = DriverManager.getConnection("Jdbc:oracle:thin:@localhost:1521:xe", "C##GREEN", "GREEN1234");
					String sql = ""+
					"INSERT INTO users(userid,username,userpassword, userage, useremail) " + "VALUES(?,?,?,?,?)";
					
					PreparedStatement pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, "winter");
					pstmt.setString(2, "한겨울");
					pstmt.setString(3, "12345");
					pstmt.setInt(4, 25);
					pstmt.setString(5, "winter@mycompany.com");
					
					int rows = pstmt.executeUpdate();
					System.out.println("저장된 행 수: " + rows);
					
					pstmt.close();
					}catch(ClassNotFoundException e) {
						e.printStackTrace();
					}catch(SQLException e) {
						e.printStackTrace();
					}finally {
						if(conn != null) {
							try {
								conn.close();
							}catch(SQLException e) {}
						}
					}

}
}