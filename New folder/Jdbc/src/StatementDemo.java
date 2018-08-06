import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {
	public static void main(String[] args) {
		String sql = "insert into product values(123,'marker',25)";
		Connection con = null;

		try {
			con = JdbcUtil.getConnection();
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("row inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
