import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoBanco {
	
		private Statement stmt;
		private String server,port,dataBase,user,password;
		
		
		public ConexaoBanco(String server,String port, String dataBase,String user,String password){
			this.server = server;
			this.port = port;
			this.dataBase = dataBase;
			this.user = user;
			this.password = password;
		}
		
		public void abrirConexao(){
            String url = "jdbc:oracle:thin:@" + this.server + ":" + this.port + ":" + this.dataBase;

            // Abre-se a conex�o com o Banco de Dados
            Connection con;
			try {
				con = DriverManager.getConnection(url, this.user, this.password);
	            // Cria-se Statement com base na conex�o con
	            this.stmt = con.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public ResultSet executaSql(String sql) throws SQLException{
			return this.stmt.executeQuery(sql);
		}
		
}
