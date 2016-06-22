import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.text.StyledEditorKit.BoldAction;

import javafx.application.*;
import javafx.collections.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Sistema extends Application {
	
	Stage window;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		
		// INICIO --------------------------------------
		Label cab1 = new Label("Universidade de São Paulo");
		Label cab2 = new Label("Instituto de Ciências Matemáticas e de Computação");
		Label titulo = new Label("PROJETO PARAOLIMPÍADAS");
		titulo.setFont(new Font(30));
		Label disciplina = new Label("Base de Dados");
		Label professora = new Label("Profª. Elaine Parros M. de Souza");
		Label nome1 = new Label("Gabriel Campos Cristiano (8937138)");
		Label nome2 = new Label("Gustavo Dias Cavalheri (8937159)");
		Label nome3 = new Label("Leonardo Ventura (8937211)");
		
		VBox cabecalho = new VBox(7);
		cabecalho.getChildren().addAll(cab1, cab2);
		cabecalho.setAlignment(Pos.TOP_CENTER);

		VBox projeto = new VBox(7);
		projeto.getChildren().addAll(titulo, disciplina, professora);
		projeto.setAlignment(Pos.TOP_CENTER);
		
		VBox nomes = new VBox(7);
		nomes.getChildren().addAll(nome1, nome2, nome3);
		nomes.setAlignment(Pos.BOTTOM_CENTER);
		
		VBox layoutInicio = new VBox(120);
		layoutInicio.getChildren().addAll(cabecalho, projeto, nomes);
		layoutInicio.setAlignment(Pos.TOP_CENTER);
		
		
		// CADASTRO PESSOA -------------------------------
		Label CPtitulo = new Label("CADASTRAR PESSOA");
		CPtitulo.setFont(new Font(20));
		Label CPtipo = new Label("Tipo:");
		ComboBox<String> CPcombo = new ComboBox<>();
		CPcombo.getItems().addAll("Turista", "Comissão", "Taxista");
		CPcombo.setValue("Turista");
		HBox CPtipoH = new HBox(10);
		CPtipoH.getChildren().addAll(CPtipo, CPcombo);
		CPtipoH.setAlignment(Pos.CENTER_LEFT);
		
		Label CPnome = new Label("Nome:");
		Label CPcpf = new Label("CPF/Passaporte:");
		Label CPnac = new Label("Nacionalidade:");
		Label CPrg = new Label("RG:");
		TextField CPnomeT = new TextField();
		TextField CPcpfT = new TextField();
		TextField CPnacT = new TextField();
		TextField CPrgT = new TextField();
		
		HBox CPnomeH = new HBox(10);
		CPnomeH.getChildren().addAll(CPnome, CPnomeT);
		CPnomeH.setAlignment(Pos.CENTER_RIGHT);
		HBox CPcpfH = new HBox(10);
		CPcpfH.getChildren().addAll(CPcpf, CPcpfT);
		CPcpfH.setAlignment(Pos.CENTER_RIGHT);
		HBox CPnacH = new HBox(10);
		CPnacH.getChildren().addAll(CPnac, CPnacT);
		CPnacH.setAlignment(Pos.CENTER_RIGHT);
		HBox CPrgH = new HBox(10);
		CPrgH.getChildren().addAll(CPrg, CPrgT);
		CPrgH.setAlignment(Pos.CENTER_RIGHT);
		
		Label CPmod = new Label("Modalidade:");
		Label CPpais = new Label("País:");
		TextField CPmodT = new TextField();
		TextField CPpaisT = new TextField();
		
		HBox CPmodH = new HBox(10);
		CPmodH.getChildren().addAll(CPmod, CPmodT);
		CPmodH.setAlignment(Pos.CENTER_RIGHT);
		CPmodT.setDisable(true);
		HBox CPpaisH = new HBox(10);
		CPpaisH.getChildren().addAll(CPpais, CPpaisT);
		CPpaisH.setAlignment(Pos.CENTER_RIGHT);
		CPpaisT.setDisable(true);
		
		Label CPcel = new Label("Celular:");
		Label CPpag = new Label("Pagamento:");
		Label CPhab = new Label("CNH:");
		Label CPcar = new Label("Carro:");
		Label CPplaca = new Label("Placa:");
		Label CPop = new Label("Ar Condicionado:");
		TextField CPcelT = new TextField();
		TextField CPpagT = new TextField();
		TextField CPhabT = new TextField();
		TextField CPcarT = new TextField();
		TextField CPplacaT = new TextField();
		TextField CPopT = new TextField();
		
		HBox CPcelH = new HBox(10);
		CPcelH.getChildren().addAll(CPcel, CPcelT);
		CPcelH.setAlignment(Pos.CENTER_RIGHT);
		CPcelT.setDisable(true);
		HBox CPpagH = new HBox(10);
		CPpagH.getChildren().addAll(CPpag, CPpagT);
		CPpagH.setAlignment(Pos.CENTER_RIGHT);
		CPpagT.setDisable(true);
		HBox CPhabH = new HBox(10);
		CPhabH.getChildren().addAll(CPhab, CPhabT);
		CPhabH.setAlignment(Pos.CENTER_RIGHT);
		CPhabT.setDisable(true);
		HBox CPcarH = new HBox(10);
		CPcarH.getChildren().addAll(CPcar, CPcarT);
		CPcarH.setAlignment(Pos.CENTER_RIGHT);
		CPcarT.setDisable(true);
		HBox CPplacaH = new HBox(10);
		CPplacaH.getChildren().addAll(CPplaca, CPplacaT);
		CPplacaH.setAlignment(Pos.CENTER_RIGHT);
		CPplacaT.setDisable(true);
		HBox CPopH = new HBox(10);
		CPopH.getChildren().addAll(CPop, CPopT);
		CPopH.setAlignment(Pos.CENTER_RIGHT);
		CPopT.setDisable(true);

		
		Button CPok = new Button("CADASTRAR");
		
		Label idiomas = new Label("Idiomas falados:");
		TextField idioma1 = new TextField();
		TextField idioma2 = new TextField();
		VBox CPidiomas = new VBox(10);
		CPidiomas.getChildren().addAll(idiomas, idioma1, idioma2);
		
		VBox layoutCP1 = new VBox(10);
		layoutCP1.getChildren().addAll(
				CPnomeH, CPcpfH, CPnacH, CPrgH,
				CPmodH, CPpaisH,
				CPcelH, CPpagH, CPhabH, CPcarH, CPplacaH, CPopH);
		layoutCP1.setAlignment(Pos.TOP_CENTER);
		
		VBox layoutCP2 = new VBox(100);
		layoutCP2.getChildren().addAll(CPtipoH, CPidiomas);
		
		HBox layoutCPH = new HBox(40);
		layoutCPH.getChildren().addAll(layoutCP1, layoutCP2);
		layoutCPH.setAlignment(Pos.TOP_CENTER);
		
		VBox layoutCP = new VBox(10);
		layoutCP.getChildren().addAll(CPtitulo, layoutCPH, CPok);
		layoutCP.setAlignment(Pos.TOP_CENTER);
		
		CPcombo.setOnAction(e -> {
			if(CPcombo.getValue().equals("Turista")){
				CPmodT.setDisable(true);
				CPpaisT.setDisable(true);
				CPcelT.setDisable(true);
				CPpagT.setDisable(true);
				CPhabT.setDisable(true);
				CPcarT.setDisable(true);
				CPplacaT.setDisable(true);
				CPopT.setDisable(true);
			}
			else if(CPcombo.getValue().equals("Comissão")){
				CPmodT.setDisable(false);
				CPpaisT.setDisable(false);
				CPcelT.setDisable(true);
				CPpagT.setDisable(true);
				CPhabT.setDisable(true);
				CPcarT.setDisable(true);
				CPplacaT.setDisable(true);
				CPopT.setDisable(true);
			}
			else if(CPcombo.getValue().equals("Taxista")){
				CPmodT.setDisable(true);
				CPpaisT.setDisable(true);
				CPcelT.setDisable(false);
				CPpagT.setDisable(false);
				CPhabT.setDisable(false);
				CPcarT.setDisable(false);
				CPplacaT.setDisable(false);
				CPopT.setDisable(false);
			}
		});
		
			CPok.setOnAction((event) -> {
				//verifica se existe o cpf
				String queryVerificacao = "select nome from pessoa where CPF_Passaporte = '"+CPcpfT.getText()+"'";
				Boolean alterar = false;
				try {
					ObservableList<String> pessoaIncluir = Consultor.retornaListConsulta(queryVerificacao);
					if (!pessoaIncluir.isEmpty()){
						alterar = true;
						Alert a = new Alert(AlertType.INFORMATION);
						a.setTitle("CPF Existente");
						a.setHeaderText(null);
						a.setContentText("CPF já existe");
						a.showAndWait();
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				

				if(!alterar){
					String sqlCadastra = new String();
					if(CPcombo.getValue().equals("Turista")){
						sqlCadastra = "INSERT INTO Pessoa (nome, CPF_Passaporte, RG, tipoPessoa, nacionalidade) "+
											"VALUES ('"+CPnomeT.getText()+"', '"+CPcpfT.getText()+"', '"+CPrgT.getText()+
											"', 'TURISTA', '"+CPnacT.getText()+"')";
						Consultor.executaUpdate(sqlCadastra);
						
					}
					else if(CPcombo.getValue().equals("Comissão")){
						sqlCadastra = "INSERT INTO Pessoa (nome, CPF_Passaporte, RG, tipoPessoa, nacionalidade, idModalidade, pais) "+
											"VALUES ('"+CPnomeT.getText()+"', '"+CPcpfT.getText()+"', '"+CPrgT.getText()+
											"', 'COMISSAO', '"+CPnacT.getText()+"')";
						Consultor.executaUpdate(sqlCadastra);
						sqlCadastra = "INSERT INTO Comissao VALUES ('"+CPcpfT.getText()+"', "+CPmodT.getText()+", '"+CPpaisT.getText()+"')";
						Consultor.executaUpdate(sqlCadastra);
					
					}
					else if(CPcombo.getValue().equals("Taxista")){
						sqlCadastra = "INSERT INTO Pessoa (nome, CPF_Passaporte, RG, tipoPessoa, nacionalidade) "+
											"VALUES ('"+CPnomeT.getText()+"', '"+CPcpfT.getText()+"', '"+CPrgT.getText()+
											"', 'TAXISTA', '"+CPnacT.getText()+"')";
						Consultor.executaUpdate(sqlCadastra);
						sqlCadastra = "INSERT INTO Taxista VALUES ('"+CPcpfT.getText()+"', '"+CPcelT.getText()+"', '"
											+CPhabT.getText()+"', '"+CPplacaT.getText()+"')";
						Consultor.executaUpdate(sqlCadastra);
						sqlCadastra = "INSERT INTO Carro VALUES ('"+CPplacaT.getText()+"', '"+CPcarT.getText()+"', '"+CPopT.getText()+"')";
						Consultor.executaUpdate(sqlCadastra);
						
					}
					if(!idioma1.getText().isEmpty()){
						sqlCadastra = "INSERT INTO IdiomaFalado VALUES ('"+CPcpfT.getText()+"', '"+idioma1.getText()+"')";
						Consultor.executaUpdate(sqlCadastra);
					}
					
					if(!idioma2.getText().isEmpty()){
						sqlCadastra = "INSERT INTO IdiomaFalado VALUES ('"+CPcpfT.getText()+"', '"+idioma2.getText()+"')";
						Consultor.executaUpdate(sqlCadastra);
					}
					Alert a = new Alert(AlertType.INFORMATION);
					a.setTitle("Cadastro concluido");
					a.setHeaderText(null);
					a.setContentText("Pessoa cadastrada com sucesso");
					a.showAndWait();
					CPnomeT.clear();
					CPcpfT.clear();
					CPrgT.clear();
					CPnacT.clear();
					CPmodT.clear();
					CPpaisT.clear();
					CPcelT.clear();
					CPhabT.clear();
					CPplacaT.clear();
					CPcarT.clear();
					CPopT.clear();
					idioma1.clear();
					idioma2.clear();
				}
		});
		
		//CADASTRO HOTEL ------------------------------------
		/*
		Label CHrua= new Label("Rua:");
		Label CHbairro = new Label("Bairro:");
		Label CHcidade = new Label("Cidade:");
		Label CHestado = new Label("Estado:");
		Label CHpais = new Label("País:");
		Label CHnome = new Label("Nome do Hotel:");
		Label CHestrelas= new Label("Estrelas:");
		Label CHrestaurantes= new Label("Restaurantes:");
		TextField CHruaT = new TextField();
		TextField CHbairroT = new TextField();
		TextField CHcidadeT = new TextField();
		TextField CHestadoT = new TextField();
		TextField CHpaisT = new TextField();
		TextField CHnomeT = new TextField();
		ChoiceBox CHestrelasR = new ChoiceBox(FXCollections.observableArrayList(
			    "1", "2", "3", "4", "5"));
		ChoiceBox CHrestaurantesR = new ChoiceBox(FXCollections.observableArrayList(
			    "1", "2", "3", "4", "5"));
		
		HBox CHruaH = new HBox(10);
		CHruaH.getChildren().addAll(CHrua, CHruaT);
		HBox CHbairroH = new HBox(10);
		CHbairroH.getChildren().addAll(CHbairro, CHbairroT);
		HBox CHcidadeH = new HBox(10);
		CHcidadeH.getChildren().addAll(CHcidade, CHcidadeT);
		HBox CHestadoH = new HBox(10);
		CHestadoH.getChildren().addAll(CHestado, CHestadoT);
		HBox CHpaisH = new HBox(10);
		CHpaisH.getChildren().addAll(CHpais, CHpaisT);
		HBox CHnomeH = new HBox(10);
		CHnomeH.getChildren().addAll(CHnome, CHnomeT);
		HBox CHestrelasH = new HBox(10);
		CHestrelasH.getChildren().addAll(CHestrelas, CHestrelasR);
		HBox CHrestaurantesH = new HBox(10);
		CHrestaurantesH.getChildren().addAll(CHrestaurantes, CHrestaurantesR);
		
		Button CHok = new Button("CADASTRAR");
		
		VBox layoutCH = new VBox(7);
		layoutCH.getChildren().addAll(CHruaH, CHbairroH, CHcidadeH, CHestadoH, CHpaisH, CHnomeH, CHestrelasH, CHrestaurantesH,CHok,Consultor.retornaTabelaConsulta("select * from carro"));
		layoutCH.setAlignment(Pos.CENTER);
		*/
		
		// CONSULTA PESSOA -------------------------------------
		Label SPtitulo = new Label("PESSOA HOSPEDADA POR NACIONALIDADE");
		SPtitulo.setFont(new Font(20));
		
		String sqlPessoaHotel = "select p.nome,p.nacionalidade,h.nomeHotel from pessoa p "+
				"join reserva r on r.cpfPessoa = p.CPF_Passaporte "+
				"join hotel h on h.idHotel = r.idHotel "+
				"where SYSDATE>=r.dataEntrada or SYSDATE <= r.dataSaida "+
				"order by h.nomeHotel";
		TableView pessoaHotel = new TableView();
		Consultor.alteraTabela(sqlPessoaHotel, pessoaHotel);

		
		VBox layoutSP = new VBox(20);
		layoutSP.getChildren().addAll(SPtitulo);
		layoutSP.setAlignment(Pos.TOP_CENTER);
		
		VBox layoutPH = new VBox(5);
		layoutPH.getChildren().addAll(layoutSP,pessoaHotel);
		
		//OFERTA DISTANCIA HOTEL-ESTADIO
				Label ofertaTitulo = new Label("MELHOR OFERTA PARA SEU BOLSO");
				ofertaTitulo.setFont(new Font(20));
				
				Label escolhaEstadio = new Label("Escolha o estádio em que você está:");
				String sqlEstadios = "select nome from estadio";
				ObservableList<String> listEstadios = Consultor.retornaListConsulta(sqlEstadios);
				ComboBox<String> estadiosCadastrados = new ComboBox<String>(listEstadios);
				Label lbBandeirada = new Label("Preço bandeirada:");
				TextField bandeirada = new TextField("3.40");
				HBox hBoxBuscaEstadio = new HBox(4);
				hBoxBuscaEstadio.getChildren().addAll(escolhaEstadio,estadiosCadastrados,lbBandeirada,bandeirada);
				
				TableView<String> tableOfertas = new TableView<String>();
				VBox vBoxDistancia = new VBox(10);
				
				vBoxDistancia.getChildren().addAll(ofertaTitulo,hBoxBuscaEstadio,tableOfertas);
				vBoxDistancia.setAlignment(Pos.CENTER);
				
				estadiosCadastrados.setOnAction((event)->{
					String sqlOferta = 
							"select h.nomeHotel,h.estrelas,q.numero,q.tipo,q.precoDiaria,d.distancia,("+bandeirada.getText()+"*d.distancia+q.precoDiaria) as PrecoTotal from hotel h "+
							"join quarto q on q.idhotel = h.idhotel "+
							"join distancia d on d.idhotel = h.idhotel "+
							"join estadio e on e.idestadio = d.idestadio "+
							"where not exists (select r.numReserva from reserva r where r.idHotel = h.idHotel and r.numeroQuarto=q.numero and dataEntrada = SYSDATE) and "+
							"e.nome = '"+estadiosCadastrados.getValue()+"' "+
							"order by precoTotal";
					try {
						Consultor.alteraTabela(sqlOferta, tableOfertas);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				});
		
		
		// CONSULTA HOTEL --------------------------------------
		
		Label SHtitulo = new Label("CONSULTAR HOTÉIS");
		SHtitulo.setFont(new Font(20));
		Label SHperiodo = new Label("Período:");
		DatePicker SHdata1 = new DatePicker();
		DatePicker SHdata2 = new DatePicker();
		HBox SHdata = new HBox(10);
		SHdata.getChildren().addAll(SHperiodo, SHdata1, SHdata2);
		SHdata.setAlignment(Pos.CENTER);
		
		TableView tabelaHoteis = new TableView();
		SHdata1.setOnAction(e -> {
			String sqlBuscaHoteis = "SELECT H.nomeHotel AS NOME, COUNT(H.nomeHotel) AS DISPONIVEIS FROM Hotel H "+
					"JOIN Quarto Q ON Q.idHotel = H.idHotel "+
					"WHERE (Q.numero, Q.idHotel) NOT IN ("+
					"SELECT Q.numero, Q.idHotel FROM Quarto Q "+
					"JOIN Reserva R ON (Q.numero = R.numeroQuarto AND Q.idHotel = R.idHotel) "+
					"WHERE ('"+SHdata1.getValue()+"' NOT BETWEEN R.dataEntrada AND R.dataSaida) "+
					"AND ('"+SHdata1.getValue()+"' NOT BETWEEN R.dataEntrada AND R.dataSaida)) "+
					"GROUP BY H.nomeHotel";
			try{
				Consultor.alteraTabela(sqlBuscaHoteis, tabelaHoteis);
			} catch (Exception e7){
				e7.printStackTrace();
			}
		});
		
		Button SHcons = new Button("CONSULTAR");
		
		/*tabelaHoteis.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		tabelaHoteis.getSelectionModel().selectedItemProperty().addListener((observableValue, oldValue, newValue) -> {
			if(tabelaHoteis.getSelectionModel().getSelectedItem(). != null){
				SHcons.setOnAction(e ->{
					//TODO: botao
				});
			}
		});
		*/
		VBox layoutSH = new VBox(20);
		layoutSH.getChildren().addAll(SHtitulo, SHdata, tabelaHoteis, SHcons);
		layoutSH.setAlignment(Pos.TOP_CENTER);
		
		// CONSULTA QUARTOS -------------------------------
		Label SQtitulo = new Label("CONSULTAR QUARTOS");
		SQtitulo.setFont(new Font(20));
		
		// CONSULTA TAXIS
		Label lblDescricao = new Label("Insira seu cpf para verificacao de taxistas disponíveis do seu idioma");
		Label lblIdiomaFalado = new Label("Cpf da pessoa para consulta de taxis: ");
		TextField txtCpf = new TextField();
		Button btnConsultarIdioma = new Button("Consultar taxis");
		Label lblInforma = new Label();
		Label lblIdioma = new Label();
		Label lblCPF = new Label();
		VBox vConsultaIdioma = new VBox(4);
		HBox hConsultaIdioma = new HBox(3);
		vConsultaIdioma.getChildren().addAll(lblDescricao);
		vConsultaIdioma.getChildren().add(lblInforma);
		hConsultaIdioma.getChildren().addAll(lblIdiomaFalado,txtCpf);
		hConsultaIdioma.getChildren().addAll(btnConsultarIdioma);
		vConsultaIdioma.getChildren().add(hConsultaIdioma);
		btnConsultarIdioma.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		    	TableView<String> tbTaxistas = new TableView<String>(); 
		    	if(!txtCpf.getText().equals("")) {
		    		lblInforma.setText("");
		    		
		    		try {
						tbTaxistas = Consultor.retornaTabelaConsulta
						("select t.*,i.idioma from taxista t join idiomafalado i on i.cpfpessoa = t.cpf where i.idioma in (select idioma from idiomafalado where cpfpessoa= '"+txtCpf.getText()+"')");
					} catch (SQLException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
		    		if(vConsultaIdioma.getChildren().size() == 3) {
		    			vConsultaIdioma.getChildren().add(tbTaxistas);
		    		}
		    		else {
		    			vConsultaIdioma.getChildren().remove(3);
		    			vConsultaIdioma.getChildren().add(tbTaxistas);
		    		}
		    		
		    		if(!tbTaxistas.getItems().isEmpty()) {
		    			lblInforma.setText("Clique duas vezes no taxista para escolher.");
			    		tbTaxistas.setOnMousePressed(new EventHandler<MouseEvent>() {
			    		    @Override 
			    		    public void handle(MouseEvent event) {
			    		    	
			    		        if (event.isPrimaryButtonDown() && event.getClickCount() == 2) {
				    		    	TableView<String> tbEstadios = new TableView<String>();
				    				TableView<String> tbHoteis = new TableView<String>();
				    				try {
										tbHoteis = Consultor.retornaTabelaConsulta("SELECT * FROM HOTEL");
										tbEstadios = Consultor.retornaTabelaConsulta("SELECT * FROM ESTADIO");
									} catch (SQLException e2) {
										// TODO Auto-generated catch block
										e2.printStackTrace();
									}
				    				
				    				Button btnHotelEstadio = new Button("Hotel -> Estadio");
				    				Button btnEstadioHotel = new Button("Estadio -> Hotel");
				    				Label lblEstadio = new Label();
				    				Label lblHotel = new Label();
				    				
				    				Node node = ((Node) event.getTarget()).getParent();
			    		            TableRow row;
			    		            if (node instanceof TableRow) {
			    		                row = (TableRow) node;
			    		            } else {
			    		                row = (TableRow) node.getParent();
			    		            }
			    		            
			    		            if(row.getItem() != null) {
			    		            	lblCPF.setText(row.getItem().toString().split(",")[0].substring(1));
			    		            	lblIdioma.setText(row.getItem().toString().split(",")[5].substring(1,row.getItem().toString().split(",")[5].indexOf(']')));
			    		            	vConsultaIdioma.getChildren().remove(3);	
				    				
					    				tbEstadios.setOnMousePressed(new EventHandler<MouseEvent>() {
					    				    @Override 
					    				    public void handle(MouseEvent event) {
					    				        if (event.isPrimaryButtonDown()) {
					    				            Node node = ((Node) event.getTarget()).getParent();
					    				            TableRow row;
					    				            if (node instanceof TableRow) {
					    				                row = (TableRow) node;
					    				            } else {
					    				                // clicking on text part
					    				                row = (TableRow) node.getParent();
					    				            }
					    				            if(row.getItem() != null) {
					    				            	lblEstadio.setText(row.getItem().toString().split(",")[0].substring(1));
					    				            	lblEstadio.setVisible(false);
					    				            }
					    				        }
					    				    }
					    				});
					    				
					    				tbHoteis.setOnMousePressed(new EventHandler<MouseEvent>() {
					    				    @Override 
					    				    public void handle(MouseEvent event) {
					    				        if (event.isPrimaryButtonDown()) {
					    				            Node node = ((Node) event.getTarget()).getParent();
					    				            TableRow row;
					    				            if (node instanceof TableRow) {
					    				                row = (TableRow) node;
					    				            } else {
					    				                // clicking on text part
					    				                row = (TableRow) node.getParent();
					    				            }
					    				            if(row.getItem() != null) {
					    				            	lblHotel.setText(row.getItem().toString().split(",")[0].substring(1));
					    				            	lblHotel.setVisible(false);
					    				            }
					    				        }
					    				    }
					    				});  
				    		    		
				    		            btnHotelEstadio.setOnAction(new EventHandler<ActionEvent>() {
					    				    @Override public void handle(ActionEvent e) {
					    				        if(!lblEstadio.getText().equals("") && !lblHotel.getText().equals("")) {
					    				        	ConexaoBanco cb = new ConexaoBanco("192.168.1.103","1521","xe","system","123456");
					    				        	cb.abrirConexao();
					    				        	Random rd = new Random();
					    				        	try {
					    				        		SimpleDateFormat format = new SimpleDateFormat( "dd/MM/yyyy HH:mm:ss" );
					    				        		Integer distancia = rd.nextInt(500);
					    				        		Integer dur = rd.nextInt(30);
					    				        		String insertion = new String("INSERT INTO CORRIDA VALUES ('"+format.format(new Date())+"','"+lblCPF.getText()+"', '"+txtCpf.getText()+"',"+lblHotel.getText()+",null,null,"+lblEstadio.getText()+","+dur+","+distancia+","+dur*3.4+",'"+lblIdioma.getText()+"')");
					    								cb.executaUpdate(insertion);
					    								lblInforma.setText("CORRIDA INSERIDA COM SUCESSO");
					    								lblInforma.setVisible(true);
					    							} catch (SQLException e1) {
					    								lblInforma.setText("HOUVE UM PROBLEMA NA INSERÇÃO DA CORRIDA");
					    								lblInforma.setVisible(true);
					    							}
					    				        }   	
					    				    }
					    				});
				    		            
				    		            btnEstadioHotel.setOnAction(new EventHandler<ActionEvent>() {
					    				    @Override public void handle(ActionEvent e) {
					    				        if(!lblEstadio.getText().equals("") && !lblHotel.getText().equals("")) {
					    				        	ConexaoBanco cb = new ConexaoBanco("192.168.1.103","1521","xe","system","123456");
					    				        	cb.abrirConexao();
					    				        	try {
					    				        		Random rd = new Random();
					    				        		Integer distancia = rd.nextInt(500);
					    				        		Integer dur = rd.nextInt(30);
					    				        		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					    				        		String insertion = "INSERT INTO CORRIDA VALUES ('"+format.format(new Date())+"','"+lblCPF.getText()+"', '"+txtCpf.getText()+"',null,"+lblEstadio.getText()+","+lblHotel.getText()+",null,"+dur+","+distancia+","+dur*3.4+",'"+lblIdioma.getText()+"')";
					    								cb.executaUpdate(insertion);
					    								lblInforma.setText("CORRIDA INSERIDA COM SUCESSO");
					    								lblInforma.setVisible(true);
					    							} catch (SQLException e1) {
					    								lblInforma.setText("HOUVE UM PROBLEMA NA INSERÇÃO DA CORRIDA");
					    								lblInforma.setVisible(true);
					    							}
					    				        }   	
					    				    }
					    				});
				    		            btnConsultarIdioma.setVisible(false);
				    		            vConsultaIdioma.getChildren().addAll(tbEstadios, tbHoteis,btnEstadioHotel,btnHotelEstadio,lblEstadio,lblHotel);
				    		    		txtCpf.setEditable(false);
				    		    		lblInforma.setVisible(false);
				    		    		lblDescricao.setText("Escolha o hotel e o estadio e clique no botao com a rota");
			    		            }
			    		        }
			    		    }
			    		});
		    		}
		    	}
		    	else {
		    		lblInforma.setText("Insira um cpf ou numero de passaporte no campo sugerido.");
		    		vConsultaIdioma.getChildren().add(lblInforma);
		    	}
		    }
		});
		// ------------ FIm do cadastro de corridas ----------- //
		
		Button SQres = new Button("RESERVAR");
		
		VBox layoutSQ = new VBox(20);
		layoutSQ.getChildren().addAll(SQtitulo, SQres);
		layoutSQ.setAlignment(Pos.TOP_CENTER);
		
		// CADASTRA RESERVA ------------------------------
		Label CRtitulo = new Label("CADASTRAR RESERVA");
		CRtitulo.setFont(new Font(20));
				
		Label CRcpf = new Label("CPF:");
		TextField CRcpfT = new TextField();
		HBox CRcpfH = new HBox(10);
		CRcpfH.getChildren().addAll(CRcpf, CRcpfT);
		CRcpfH.setAlignment(Pos.CENTER);
				
		Button CRok = new Button("CONFIRMAR");
				
		VBox layoutCR = new VBox(20);
		layoutCR.getChildren().addAll(CRtitulo, CRcpfH, CRok);
		layoutCR.setAlignment(Pos.TOP_CENTER);
				
		// LAYOUT PRINCIPAL -------------------------------
		MenuBar navbar = new MenuBar();
		Menu navP = new Menu("Pessoas");
		MenuItem navPcad = new MenuItem("Cadastrar");
		MenuItem navPcon = new MenuItem("Pessoas hospedadas");
		navP.getItems().addAll(navPcad, navPcon);
		Menu navH = new Menu("Hotéis");
		MenuItem navHcon = new MenuItem("Consultar");
		navH.getItems().addAll(navHcon);
		Menu navC = new Menu("Taxi");
		MenuItem navCcon = new MenuItem("Consultar");
		navC.getItems().addAll(navCcon);
		Menu navO = new Menu("Oferta");
		MenuItem navOcon = new MenuItem("Consultar");
		navO.getItems().addAll(navOcon);
		navbar.getMenus().addAll(navP, navH, navC, navO);
		
		VBox principal = new VBox(20);
		principal.getChildren().addAll(navbar, layoutInicio);
		Scene scene = new Scene(principal, 600, 600);
		window.setScene(scene);
		window.show();
		
		// BOTOES -----------------------------------
		navPcad.setOnAction((event) -> {
			principal.getChildren().clear();
			principal.getChildren().addAll(navbar, layoutCP);
		});
		
		navPcon.setOnAction((event) -> {
			principal.getChildren().clear();
			principal.getChildren().addAll(navbar, layoutPH);
		});
		
		navHcon.setOnAction((event) -> {
			principal.getChildren().clear();
			principal.getChildren().addAll(navbar, layoutSH);
		});
		
		navCcon.setOnAction((event) -> {
			principal.getChildren().clear();
			principal.getChildren().addAll(navbar, vConsultaIdioma);
		});
		
		navOcon.setOnAction((event) -> {
			principal.getChildren().clear();
			principal.getChildren().addAll(navbar,vBoxDistancia);
		});
		
		SHcons.setOnAction((event) -> {
			principal.getChildren().clear();
			principal.getChildren().addAll(navbar, layoutSQ);
			//TODO: selecionar hotel
		});
		
		SQres.setOnAction((event) ->{
			principal.getChildren().clear();
			principal.getChildren().addAll(navbar,layoutCR);
			//TODO: selecionar quarto
		});
		
		CRok.setOnAction((event) -> {
			//TODO: reservar
		});
	}
}