import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ResultSetScrollable {

	
	
	
	Connection con = null;
	String sql = "select *from product";
	Statement stmt=(Statement) con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

	try {
		con = JdbcUtil.getConnection();
		ResultSet rs = con.createStatement().executeQuery(sql);
		ResultSetMetaData meta = rs.getMetaData();
		for (int c = 1; c <= meta.getColumnCount(); c++)
			System.out.println(meta.getColumnName(c) + "\t");
		System.out.println();
	
	rs.afterLast();
	while(rs.previous())
	{
	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
	}

	//move the cursor to 3rd record
	rs.absolute(3);
	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));

	//move the cursor to 2nd record using relative()
	rs.relative(-1);
	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
	int i=rs.getRow(); // get cursor position
	System.out.println("cursor position="+i);
	}

	//cleanup
	rs.close();
	stmt.close();
	con.close();
	 }
	}
}
