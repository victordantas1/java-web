package agenda.jdbc.teste;

import java.util.Calendar;

import agenda.jdbc.dao.ContatoDAO;
import agenda.jdbc.modelo.Contato;

public class TesteInsereDAO {

	public static void main(String[] args) {
		
		ContatoDAO contatoDAO = new ContatoDAO();
		
		Contato contato = new Contato();
		contato.setNome("Emmily");
		contato.setEmail("emmily@gmail.com");
		contato.setEndereco("R. Netuno");
		contato.setDataNascimento(Calendar.getInstance());
		
		contatoDAO.adicionaContato(contato);
		
	}

}
