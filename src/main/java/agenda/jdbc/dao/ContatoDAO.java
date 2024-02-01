package agenda.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import agenda.jdbc.ConnectionFactory;
import agenda.jdbc.modelo.Contato;

public class ContatoDAO {

	private Connection connection;
	
	public ContatoDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adicionaContato(Contato contato) {
		String sql = "insert into contatos" +
				"(nome, email, endereco, data_nascimento)" +
				"values(?, ?, ?, ?)"; 
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
			
			stmt.execute();
			stmt.close();
			
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}

	}
	
	
}
