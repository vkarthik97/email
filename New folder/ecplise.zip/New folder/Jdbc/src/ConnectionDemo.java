import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";
		Connection conn = null;

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "training", "oracle");
			System.out.println("connection successfull");
			
			DatabaseMetaData meta=conn.getMetaData();
			System.out.println("DB Name:  "+meta.getDatabaseProductName());
			System.out.println("version: "+meta.getDatabaseProductVersion());
			System.out.println("Driver Name: "+meta.getDriverName());
			System.out.println("Driver ver: "+meta.getDriverVersion());
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {

			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
