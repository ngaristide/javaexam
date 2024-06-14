package jsp_projet_pizza_package;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class Dbconnect {

	public static Connection getConnection() throws Exception { // fonction de classe

		String login = "root";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/pizzadb";// socket ip:port
															// emetteur <=>
															// ip:port
															// destinataire

		Connection cn = null;

		// Etape 1 : chargement du driver
		Class.forName("com.mysql.jdbc.Driver"); // MySQL database connection

		// Etape 2 : r�cup�ration de la connexion
		cn = (Connection) DriverManager.getConnection(url, login, password);

		return cn; // return de la connection

	}
}
