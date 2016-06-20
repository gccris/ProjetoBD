import java.sql.ResultSet;
import java.sql.SQLException;


public class teste {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ConexaoBanco cb = new ConexaoBanco("grad.icmc.usp.br", "15215", "orcl", "g8937159", "g8937159");
		cb.abrirConexao();
		ResultSet x = cb.executaSql("select * from carro");
	}

}
