package directpizzam1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;


public class client_lect {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost/pizzadb";

		String login = "root";
		String passwd = "";
		
		Connection cn =null; 
		Statement st =null;
		ResultSet rs =null;

				try {
						// Etape 1 : Chargement du driver
						Class.forName("com.mysql.cj.jdbc.Driver");

						// Etape 2 : récupération de la connexion
						cn = DriverManager.getConnection(url, login, passwd);

						// Etape 3 : Création d'un statement
						st = cn.createStatement();

						String sql = "SELECT * FROM CLIENT  "   ;

						// Etape 4 : exécution requête
						rs = st.executeQuery(sql);
						
						// Si récup données alors étapes 5 (parcours Resultset)
						System.out.println(rs);
						
						
						while (rs.next()) {System.out.println(rs.getString("NROCLIE"));System.out.println(rs.getString(1));}
					
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
	}
}
