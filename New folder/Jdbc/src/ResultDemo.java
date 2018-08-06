import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultDemo {

	public static void main(String[] args) {
		Connection con = null;
		String sql = "select code,name,price from product";

		try {
			con = JdbcUtil.getConnection();
//			ResultSet rs = con.createStatement().executeQuery(sql);
//       		ResultSetMetaData meta = rs1.getMetaData();
//			for (int c = 1; c <= meta.getColumnCount(); c++)
//				System.out.println(meta.getColumnName(c) + "\t");
//			System.out.println();
			Statement stmt = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery(sql);
//			rs.absolute(3); // moves the cursor to the fifth row of rs
		   // rs.updateString(123, "AINSWORTH"); // updates the
//		           NAME column of row 5 to be AINSWORTH
		//    rs.updateRow(); // updates the row in the data source

		 
			ResultSetMetaData meta = rs.getMetaData();
			for (int c = 1; c <= meta.getColumnCount(); c++)
				System.out.println(meta.getColumnName(c) + "\t");
			System.out.println();
			//rs.absolute(4);
			rs.absolute(2); // moves the cursor to the fifth row of rs
		    rs.updateString(2, "AINSWORTH"); // updates the
//		           NAME column of row 5 to be AINSWORTH
		    rs.updateRow(); // updates the row in the data source
			// rs will be scrollable, will not show changes made by others,
			// and will be updatable

			while (rs.next())
				System.out.printf("%5d\t%-15s\t%5s\n",rs.getInt(1),rs.getString("name"),"\t", rs.getString(3));
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
