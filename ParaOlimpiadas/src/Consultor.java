import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.util.Callback;


public class Consultor {

	private static String ip = "grad.icmc.usp.br";
	private static String porta = "15215";
	private static String type = "orcl";
	private static String login = "g8937159";
	private static String senha = "g8937159";
	
	//ConexaoBanco cb = new ConexaoBanco("192.168.1.103","1521","xe","system","123456");
	public static TableView retornaTabelaConsulta(String query) throws SQLException {
		
		TableView tvTeste = new TableView();
		ObservableList<ObservableList> data = FXCollections.observableArrayList();
		ConexaoBanco cb = new ConexaoBanco(ip,porta,type,login,senha);
		
		cb.abrirConexao();
		ResultSet rs = cb.executaSql(query);
        
		for(int i=0 ; i<rs.getMetaData().getColumnCount(); i++){
			
            final int j = i;                
            TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i+1));
            col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
                public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                    return new SimpleStringProperty(param.getValue().get(j).toString());                        
                }
            });
            tvTeste.getColumns().addAll(col);
        }
		
		while(rs.next()){
            //Iterate Row
            ObservableList<String> row = FXCollections.observableArrayList();
            for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
                //Iterate Column
                row.add(rs.getString(i));
            }
            data.add(row);
        }
		tvTeste.setItems(data);
		
		cb.fechaConexao();
		return tvTeste;
	}
	
public static void alteraTabela(String query,TableView table) throws SQLException {
		
		ObservableList<ObservableList> data = FXCollections.observableArrayList();
		ConexaoBanco cb = new ConexaoBanco(ip,porta,type,login,senha);
		cb.abrirConexao();
		ResultSet rs = cb.executaSql(query);
        table.getColumns().clear();
		for(int i=0 ; i<rs.getMetaData().getColumnCount(); i++){
			
            final int j = i;                
            TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i+1));
            col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
                public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                    return new SimpleStringProperty(param.getValue().get(j).toString());                        
                }
            });

            table.getColumns().addAll(col);
        }
		
		while(rs.next()){
            //Iterate Row
            ObservableList<String> row = FXCollections.observableArrayList();
            for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
                //Iterate Column
                row.add(rs.getString(i));
            }
            data.add(row);
        }
		table.setItems(data);
		
		cb.fechaConexao();
	}
	
	public static ObservableList<String> retornaListConsulta(String query) throws SQLException {
		
		ConexaoBanco cb = new ConexaoBanco(ip,porta,type,login,senha);
		cb.abrirConexao();
		ResultSet rs = cb.executaSql(query);
        ObservableList<String> row = FXCollections.observableArrayList();
		while(rs.next()){
            //Iterate Row
            for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
                //Iterate Column
                row.add(rs.getString(i));
            }
        }
		cb.fechaConexao();
	return row;
	}
	
	public static void executaSql(String query){
		ConexaoBanco cb = new ConexaoBanco(ip,porta,type,login,senha);
		cb.abrirConexao();
		try {
			ResultSet rs = cb.executaSql(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cb.fechaConexao();
	}
	
	public static void executaUpdate(String query){
		ConexaoBanco cb = new ConexaoBanco(ip,porta,type,login,senha);
		cb.abrirConexao();
		try {
			int rs = cb.executaUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cb.fechaConexao();
	}
}
