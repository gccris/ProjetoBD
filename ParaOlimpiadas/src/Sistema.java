import javafx.application.*;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
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
		Label titulo = new Label("SISTEMA PARAOLIMPÍADAS");
		titulo.setFont(new Font(20));
		Label disciplina = new Label("Base de Dados");
		Label professora = new Label("Profª. Elaine Parros M. de Souza");
		Label nome1 = new Label("Gabriel Campos Cristiano (8937138)");
		Label nome2 = new Label("Gustavo Dias Cavalheri (8937159)");
		Label nome3 = new Label("Leonardo Ventura (8937211)");

		VBox projeto = new VBox(7);
		projeto.getChildren().addAll(titulo, disciplina, professora);
		projeto.setAlignment(Pos.TOP_CENTER);
		
		VBox nomes = new VBox(7);
		nomes.getChildren().addAll(nome1, nome2, nome3);
		nomes.setAlignment(Pos.BOTTOM_CENTER);
		
		
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
		HBox linha1 = new HBox (50);
		linha1.getChildren().addAll(CPtipoH, CPnomeH);
		linha1.setAlignment(Pos.CENTER_RIGHT);
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
		Label CPop = new Label("Opcionais:");
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
		
		VBox layoutCP = new VBox(10);
		layoutCP.getChildren().addAll(
				CPtitulo, linha1, CPcpfH, CPnacH, CPrgH,
				CPmodH, CPpaisH,
				CPcelH, CPpagH, CPhabH, CPcarH, CPplacaH, CPopH, CPok);
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
				"where r.dataEntrada>= SYSDATE and r.dataSaida<= SYSDATE";
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
		
		/*TableView<> SHtab = new TableView<>();
		TableColumn SHtab1 = new TableColumn("Hotel");
		TableColumn SHtab2 = new TableColumn("Quartos Disponíveis");
		SHtab.getColumns().addAll(SHtab1, SHtab2);*/
		//TODO: TABLE
		
		Button SHcons = new Button("CONSULTAR");
		
		VBox layoutSH = new VBox(20);
		layoutSH.getChildren().addAll(SHtitulo, SHdata, SHcons);
		layoutSH.setAlignment(Pos.TOP_CENTER);
		
		// CONSULTA QUARTOS -------------------------------
		Label SQtitulo = new Label("CONSULTAR QUARTOS");
		SQtitulo.setFont(new Font(20));
		
		//TODO: TABLE
		
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
		
		VBox layoutInicio = new VBox(30);
		layoutInicio.getChildren().addAll(projeto, nomes);
		layoutInicio.setAlignment(Pos.TOP_CENTER);
		
		VBox principal = new VBox(20);
		principal.getChildren().addAll(navbar, layoutInicio);
		Scene scene = new Scene(principal, 600, 600);
		window.setScene(scene);
		window.show();
		
		// BOTOES -----------------------------------
		navPcad.setOnAction(e -> {
			principal.getChildren().clear();
			principal.getChildren().addAll(navbar, layoutCP);
		});
		
		navPcon.setOnAction(e -> {
			principal.getChildren().clear();
			principal.getChildren().addAll(navbar, layoutPH);
		});
		
		navHcon.setOnAction(e -> {
			principal.getChildren().clear();
			principal.getChildren().addAll(navbar, layoutSH);
		});
		
		navCcon.setOnAction(e -> {
			principal.getChildren().clear();
			//principal.getChildren().addAll(navbar, XXX);
		});
		
		navOcon.setOnAction(e -> {
			principal.getChildren().clear();
			principal.getChildren().addAll(navbar,vBoxDistancia);
		});
		
		SHcons.setOnAction(e -> {
			principal.getChildren().clear();
			principal.getChildren().addAll(navbar, layoutSQ);
			//TODO: selecionar hotel
		});
		
		SQres.setOnAction(e ->{
			principal.getChildren().clear();
			principal.getChildren().addAll(navbar,layoutCR);
			//TODO: selecionar quarto
		});
		
		CRok.setOnAction(e ->{
			//TODO: reservar
		});
	}

}