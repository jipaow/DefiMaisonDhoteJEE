package co.simplon.hote.jdbc;

public class MainTest {

	public static void main(String[] args) throws Exception {
		
		jdbcTest db = new jdbcTest();
		
		db.connectToDB();
		db.insertData("jojo", "pren", "098876544E", "mail.com");
		db.close();
		
		

	}

}

