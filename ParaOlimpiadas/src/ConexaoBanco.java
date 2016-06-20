public class ConexaoBanco {
	
		private String server,port,dataBase;
		public void abrirConexao(String server,String port, String dataBase){
			this.server = server;
			this.port = port;
			this.dataBase = dataBase;
			
		}
}
