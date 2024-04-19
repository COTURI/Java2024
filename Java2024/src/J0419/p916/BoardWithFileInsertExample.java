package J0419.p916;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardWithFileInsertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");

			conn = DriverManager.getConnection("Jdbc:oracle:thin:@localhost:1521:xe", "C##GREEN", "GREEN1234");
			String sql = "" + "INSERT INTO boards(bno,btitle, bcontent,bwriter,bdate,bfilename,bfiledata)"
					+ "VALUES(SEQ_BNO.NEXTVAL,?,?,?,sysdate,?,?) ";
//			System.out.println(sql);
			PreparedStatement pstmt = conn.prepareStatement(sql, new String[] { "bno" });
			pstmt.setString(1, "눈 오는 날");
			pstmt.setString(2, "함박눈이 내려요.");
			pstmt.setString(3, "winter");
			pstmt.setString(4, "snow.jpg");
			pstmt.setBlob(5, new FileInputStream("src/J0419/winter.png"));

			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수: " + rows);

			if (rows == 1) {
				ResultSet rs = pstmt.getGeneratedKeys();
				if (rs.next()) {
					int bno = rs.getInt(1);
					System.out.println("저장된 bno: " + bno);
				}
				rs.close();
			}

			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}
	}

}
