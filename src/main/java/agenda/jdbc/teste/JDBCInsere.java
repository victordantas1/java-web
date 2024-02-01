package agenda.jdbc.teste;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import agenda.jdbc.ConnectionFactory;

public class JDBCInsere {

	public static void main(String[] args) throws SQLException {
		Connection conn = new ConnectionFactory().getConnection();
		try {
			String sql = "INSERT INTO contatos (nome, email, endereco, data_nascimento)"
					+ "values(?, ?, ?, ?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "Caelum");
			stmt.setString(2, "caleum@gmail.com");
			stmt.setString(3, "R. Vergueiro");
			stmt.setDate(4, new Date(Calendar.getInstance().getTimeInMillis()));
			
			stmt.execute();
			stmt.close();
			
			System.out.println("Gravado");
			
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
		finally {
			conn.close();
		}

	}

}
