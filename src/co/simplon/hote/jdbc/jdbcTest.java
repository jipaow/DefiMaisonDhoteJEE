package co.simplon.hote.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import co.simplon.hote.model.Client;
import co.simplon.hote.model.ClientImpl;



public class jdbcTest {
	private final static String BDPATH = "jdbc:mysql://localhost:3306/maisonhotedb";
	private final static String DBUSER = "admin";
	private final static String DBPASSWORD = "admin";
	
	private static Connection connection;
	private static Statement statement = null;
	private static ResultSet rs = null;
	
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
	
	
	public static void insertData(String nom, String prenom, String tel, String mail, String parking, String animal,String fumeur,String ptiDej,String sejour,String nuit,String nbreDeVisiteur) throws SQLException, ClassNotFoundException{
		
		Statement statement = null;
		try {
		statement = connection.createStatement();
		String sql = "INSERT INTO reservationhote (nom, prenom, tel, mail, parking, animal, fumeur, ptidej, sejour, nuit, nbredevisiteurs) VALUES ('"+nom+"' , '"+prenom+"','"+tel+"','"+mail+"','"+parking+"','"+animal+"','"+fumeur+"','"+ptiDej+"','"+sejour+"','"+nuit+"','"+nbreDeVisiteur+"')";
		//String sql = "INSERT INTO `reservationhote` (`nom`, `prenom`,`tel`,`mail`,`parking`,`animal`,`fumeur`,`ptidej`,`sejour`,`nuit`,`nbredevisiteurs`) VALUES ('" + nom + "', '" + prenom + "','" + tel + "','" + mail + "', '"+ parking +"','"+ animal +"','"+ fumeur +"','"+ ptiDej +"','" + sejour + "','"+ nuit +"','"+ nbreDeVisiteur +"')";
		statement.executeUpdate(sql);
		}
		catch(SQLException e){
			System.out.println("error insert new data");
			
		}
		finally {
			statement.close();
			
		}
		
		
	}
	
	public static ArrayList<Client>readData() throws SQLException
	{
		Statement statement = null;
		ResultSet rs = null;
		ArrayList<Client>tab = new ArrayList<Client>();
		Client clientInfo = new ClientImpl();

		try {
			// Create the statement
			statement = connection.createStatement();
			String sql = "SELECT * FROM reservationhote";
			
			// Execute the query
			rs = statement.executeQuery(sql);
		
			// Loop on the results extracted from the database
			
			while (rs.next()) {
			clientInfo.setNom(rs.getString("nom"));
			clientInfo.setPrenom(rs.getString("prenom"));
			clientInfo.setTel(rs.getString("tel"));
			clientInfo.setmail(rs.getString("mail"));
			clientInfo.setParking(rs.getString("parking"));
			clientInfo.setAnimal(rs.getString("animal"));
			clientInfo.setFumeur(rs.getString("fumeur"));
			clientInfo.setPtiDej(rs.getString("ptidej"));
			clientInfo.setSejour(rs.getString("sejour"));
			clientInfo.setNuit(rs.getString("nuit"));
			clientInfo.setNbreDeVisiteur(rs.getString("nbredevisiteurs"));
			
			tab.add(clientInfo);
			}
		}
		catch(SQLException e){
			System.out.println("An error occured trying to read the data !");
		}
		finally{	 
			statement.close();
		}
		return tab;
		
		
	}
	

}
