package agenda.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import agenda.jdbc.ConnectionFactory;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = new ConnectionFactory().getConnection();
		System.out.println("Conexao aberta");
		conn.close();
	}

}
