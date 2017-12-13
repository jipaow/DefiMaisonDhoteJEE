package co.simplon.hote.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class jdbcTest {
	private final static String BDPATH = "jdbc:mysql://localhost:3306/maisonhotedb";
	private final static String DBUSER = "admin";
	private final static String DBPASSWORD = "admin";
	
	private static Connection connection;
	private static Statement statement = null;
	private ResultSet rs = null;
	
	public void connectToDB() throws Exception {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver ok");

            // Setup the connection with the DB
            connection = DriverManager.getConnection(BDPATH,DBUSER,DBPASSWORD);

        } catch (Exception e) {
            System.out.println("no connecion");
            throw e;
        }
    }
	
	public void close() {
	
        try {
            if (rs != null) {
                rs.close();
            }

            if (statement != null) {
                statement.close();
            }
			
			if (connection != null) {
                connection.close();
                System.out.println("fermeture ok");
            }
        } catch (Exception e) {

        }
    }
	
	
	public static void insertData(String nom, String prenom, String tel, String mail) throws SQLException, ClassNotFoundException{
     
    	
		
		Statement statement = null;
		try {
		statement = connection.createStatement();
		String sql = "INSERT INTO `reservationhote` (`nom`, `prenom`,`tel`,`mail`) VALUES ('" + nom + "', '" + prenom + "','"+ tel +"','"+ mail +"')";
		statement.executeUpdate(sql);
		}
		catch(SQLException e){
			System.out.println("error insert new data");
			
		}
		finally {
			statement.close();
			
		}
		
		
	}
	

}
