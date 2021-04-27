package evaluation;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainMenu_GUI {
	@FXML TextField tf = new TextField();
	@FXML private Button tgl_info = new Button();
	@FXML private Button tgl_inst1 = new Button();
	@FXML private Button tgl_inst2 = new Button();
	@FXML private Button tgl_inst3 = new Button();
	@FXML private Button tgl_inst4 = new Button();
	@FXML private Button tgl_terminar = new Button();
	@FXML private Button tgl_borrar = new Button();
	@FXML private Button tgl_config = new Button();
	@FXML private Button tgl_salir = new Button();
	
	ToggleGroup sideBar = new ToggleGroup();
	
	@FXML private StackPane pane_info = new StackPane();
	@FXML private StackPane pane_inst1 = new StackPane();
	@FXML private StackPane pane_inst2 = new StackPane();
	@FXML private StackPane pane_inst3 = new StackPane();
	@FXML private StackPane pane_inst4 = new StackPane();
	@FXML private StackPane pane_terminar = new StackPane();
	@FXML private StackPane pane_borrar = new StackPane();
	@FXML private StackPane pane_config = new StackPane();
	@FXML private StackPane pane_salir = new StackPane();
	
	// Abre ventana Main Menu
	public void start() {
		try {
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/evaluation/MainMenu.fxml")); // set pane
			GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("UIPR Evaluation System");
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
			}
	}
	
	public void tgl_info() {
		pane_info.setVisible(true);
		pane_inst1.setVisible(false);
		pane_inst2.setVisible(false);
		pane_inst3.setVisible(false);
		pane_inst4.setVisible(false);
		pane_terminar.setVisible(false);
		pane_borrar.setVisible(false);
		pane_config.setVisible(false);
		pane_salir.setVisible(false);
	}
	
	public void tgl_inst1() {
		pane_info.setVisible(false);
		pane_inst1.setVisible(true);
		pane_inst2.setVisible(false);
		pane_inst3.setVisible(false);
		pane_inst4.setVisible(false);
		pane_terminar.setVisible(false);
		pane_borrar.setVisible(false);
		pane_config.setVisible(false);
		pane_salir.setVisible(false);
	}
	
	public void tgl_inst2() {
		pane_info.setVisible(false);
		pane_inst1.setVisible(false);
		pane_inst2.setVisible(true);
		pane_inst3.setVisible(false);
		pane_inst4.setVisible(false);
		pane_terminar.setVisible(false);
		pane_borrar.setVisible(false);
		pane_config.setVisible(false);
		pane_salir.setVisible(false);
	}
	
	public void tgl_inst3() {
		pane_info.setVisible(false);
		pane_inst1.setVisible(false);
		pane_inst2.setVisible(false);
		pane_inst3.setVisible(true);
		pane_inst4.setVisible(false);
		pane_terminar.setVisible(false);
		pane_borrar.setVisible(false);
		pane_config.setVisible(false);
		pane_salir.setVisible(false);
	}
	
	public void tgl_inst4() {
		pane_info.setVisible(false);
		pane_inst1.setVisible(false);
		pane_inst2.setVisible(false);
		pane_inst3.setVisible(false);
		pane_inst4.setVisible(true);
		pane_terminar.setVisible(false);
		pane_borrar.setVisible(false);
		pane_config.setVisible(false);
		pane_salir.setVisible(false);
	}
	
	public void tgl_terminar() {
		pane_info.setVisible(false);
		pane_inst1.setVisible(false);
		pane_inst2.setVisible(false);
		pane_inst3.setVisible(false);
		pane_inst4.setVisible(false);
		pane_terminar.setVisible(true);
		pane_borrar.setVisible(false);
		pane_config.setVisible(false);
		pane_salir.setVisible(false);
	}
	
	public void tgl_borrar() {
		
		pane_info.setVisible(false);
		pane_inst1.setVisible(false);
		pane_inst2.setVisible(false);
		pane_inst3.setVisible(false);
		pane_inst4.setVisible(false);
		pane_terminar.setVisible(false);
		pane_borrar.setVisible(true);
		pane_config.setVisible(false);
		pane_salir.setVisible(false);
	}
	
	public void tgl_config() {
		
		pane_info.setVisible(false);
		pane_inst1.setVisible(false);
		pane_inst2.setVisible(false);
		pane_inst3.setVisible(false);
		pane_inst4.setVisible(false);
		pane_terminar.setVisible(false);
		pane_borrar.setVisible(false);
		pane_config.setVisible(true);
		pane_salir.setVisible(false);
	}
	
}
