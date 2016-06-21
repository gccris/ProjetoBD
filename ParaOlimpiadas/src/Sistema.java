import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Sistema extends Application {
	
	Stage window;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		
		// INICIO
		Label titulo = new Label("SISTEMA PARAOLIMPÍADAS");
		Label disciplina = new Label("Base de Dados");
		Label professora = new Label("Profª. Elaine Parros M. de Souza");
		Label nome1 = new Label("Gabriel Campos Cristiano (8937138)");
		Label nome2 = new Label("Gustavo Dias Cavalheri (8937159)");
		Label nome3 = new Label("Leonardo Ventura (8937211)");

		VBox projeto = new VBox(7);
		projeto.getChildren().addAll(titulo, disciplina, professora);
		projeto.setAlignment(Pos.CENTER);
		
		VBox nomes = new VBox(7);
		nomes.getChildren().addAll(nome1, nome2, nome3);
		nomes.setAlignment(Pos.CENTER);
		
		VBox layoutInicio = new VBox(30);
		layoutInicio.getChildren().addAll(projeto, nomes);
		layoutInicio.setAlignment(Pos.CENTER_RIGHT);
		
		// CADASTRO PESSOA
		Label CPtitulo = new Label("CADASTRAR PESSOA");
		Label CPtipo = new Label("Tipo:");
		ComboBox<String> CPcombo = new ComboBox<>();
		CPcombo.getItems().addAll("Turista", "Comissão", "Taxista");
		CPcombo.setValue("Turista");
		HBox CPtipoH = new HBox(10);
		CPtipoH.getChildren().addAll(CPtipo, CPcombo);
		
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
		HBox CPcpfH = new HBox(10);
		CPcpfH.getChildren().addAll(CPcpf, CPcpfT);
		HBox CPnacH = new HBox(10);
		CPnacH.getChildren().addAll(CPnac, CPnacT);
		HBox CPrgH = new HBox(10);
		CPrgH.getChildren().addAll(CPrg, CPrgT);
		
		Label CPmod = new Label("Modalidade:");
		Label CPpais = new Label("País:");
		TextField CPmodT = new TextField();
		TextField CPpaisT = new TextField();
		
		HBox CPmodH = new HBox(10);
		CPmodH.getChildren().addAll(CPmod, CPmodT);
		HBox CPpaisH = new HBox(10);
		CPpaisH.getChildren().addAll(CPpais, CPpaisT);
		
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
		HBox CPpagH = new HBox(10);
		CPpagH.getChildren().addAll(CPpag, CPpagT);
		HBox CPhabH = new HBox(10);
		CPhabH.getChildren().addAll(CPhab, CPhabT);
		HBox CPcarH = new HBox(10);
		CPcarH.getChildren().addAll(CPcar, CPcarT);
		HBox CPplacaH = new HBox(10);
		CPplacaH.getChildren().addAll(CPplaca, CPplacaT);
		HBox CPopH = new HBox(10);
		CPopH.getChildren().addAll(CPop, CPopT);

		
		Button CPok = new Button("CADASTRAR");
		
		VBox layoutCP = new VBox(7);
		layoutCP.getChildren().addAll(
				CPtitulo, CPtipoH, CPnomeH, CPcpfH, CPnacH, CPrgH,
				CPmodH, CPpaisH,
				CPcelH, CPpagH, CPhabH, CPcarH, CPplacaH, CPopH, CPok);
		layoutCP.setAlignment(Pos.CENTER);
		
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
		
		//CADASTRO HOTEL
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
		
		// CADASTRO ESTADIO
		
		// CONSULTA PESSOA
		
		// CONSULTA HOTEL
		Label SHtitulo = new Label("CONSULTAR HOTÉIS");
		Label SHperiodo = new Label("Período:");
		DatePicker SHdata1 = new DatePicker();
		DatePicker SHdata2 = new DatePicker();
		HBox SHdata = new HBox(7);
		SHdata.getChildren().addAll(SHperiodo, SHdata1, SHdata2);
		
		/*TableView<> SHtab = new TableView<>();
		TableColumn SHtab1 = new TableColumn("Hotel");
		TableColumn SHtab2 = new TableColumn("Quartos Disponíveis");
		SHtab.getColumns().addAll(SHtab1, SHtab2);*/
		
		Button SHcons = new Button();
		
		// CONSULTA QUARTOS
		Label SQtitulo = new Label("CONSULTAR QUARTOS");
		
		
		// CONSULTA ESTADIO
		
		//OFERTA DISTANCIA HOTEL-ESTADIO
		Label ofertaTitulo = new Label("MELHOR OFERTA PARA SEU BOLSO");
		Label escolhaEstadio = new Label("Escolha o estádio em que você está:");
		TableView<String> tableOfertas = new TableView<String>();
		TextField bandeirada = new TextField("0");
		String sqlEstadios = "select nome from estadio";
		ObservableList<String> listEstadios = Consultor.retornaListConsulta(sqlEstadios);
		ComboBox<String> estadiosCadastrados = new ComboBox<String>(listEstadios);
		estadiosCadastrados.setOnAction((event)->{
			String sqlOferta = 
					"select h.nome,h.estrelas,q.tipo,q.precoDiaria,d.distancia,("+bandeirada.getText()+"*d.distancia+q.precoDiaria) as PrecoTotal from hotel h"+
					"join quarto q on q.idhotel = h.idhotel"+
					"join distancia d on d.idhotel = h.idhotel"+
					"join estadio e on e.idestadio = d.idestadio"+
					"where not exists (select r.numReserva from reserva r where r.idHotel = h.idHotel and r.numeroQuarto=q.numero and dataEntrada = getDate()) and"+
					"e.nome = "+estadiosCadastrados.getValue();			
			try {
				TableView ofertas = Consultor.retornaTabelaConsulta(sqlOferta);
				tableOfertas.setItems(ofertas.getItems());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		
		// LAYOUT PRINCIPAL
		
	}

}
