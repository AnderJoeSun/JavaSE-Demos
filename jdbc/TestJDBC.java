import java.sql.*;
public class TestJDBC{
	public static void main(String[] args){
		ResultSet rs=null;
		Statement stmt=null;
		Connection conn=null;
		try{
			class.forName("oracle.jdbc.driver.OracleDriver");
			//new oracle.jdbc.driver.OracleDriver();
			conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.13:1521:sxt","sysman","dashi");
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select * from d");
			while(rs.next()){
				System.out.println(rs.getString"id"));
				System.out.println(rs.getInt("id"));
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(rs!=null){
					rs.close();
					rs=null;
				}
				if(stmt!=null){
					stmt.close();
					stmt=null;
				}
				if(conn!=null){
					conn.close();
					conn=null;
					