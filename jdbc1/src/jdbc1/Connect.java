package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	String url = "jdbc:postgresql://localhost/test?user=fred&password=secret&ssl=true";
	Connection conn = DriverManager.getConnection(url);
}
