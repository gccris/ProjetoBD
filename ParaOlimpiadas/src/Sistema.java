import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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
		
		Button CPok = new Button("CADASTRAR");
		
		VBox layoutCP = new VBox(7);
		layoutCP.getChildren().addAll(CPnomeH, CPcpfH, CPnacH, CPrgH, CPok);
		latoutCP.setAlignment(Pos.CENTER);
		
		// CADASTRO HOTEL
		
		// CADASTRO ESTADIO
		
		// CADASTRO RESERVA
		
		// CONSULTA PESSOA
		
		// CONSULTA HOTEL
		
		// CONSULTA ESTADIO
		
		// LAYOUT PRINCIPAL
		
	}

}
