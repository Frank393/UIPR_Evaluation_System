package evaluation;



//import register;



import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.*;

public class Login_backend {

	
	@FXML BorderPane borderPane = new BorderPane();
	@FXML AnchorPane anchorPane = new AnchorPane();
	@FXML private PasswordField passwordField;
	@FXML private TextField numeroFacultad_textField;
	
	
	@FXML private TextField Nombre_textField;
	@FXML private TextField Apellido_textField;
	@FXML private TextField numeroFacultadRe_textField;
	@FXML private TextField PasswordRe_textField;
	@FXML private TextField PasswordReCom_textField;
	//private JButton btnNewButton;
	static String userName;
	@FXML Button botonInicioSesion;
	@FXML Button botonRegistrarse;
	@FXML StackPane logPane = new StackPane();
	@FXML StackPane regPane = new StackPane();
	@FXML BorderPane bp = new BorderPane();
	
	public Login_backend() {
		initialize();

	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		double [] valen = new double[54];
		valen[0] = 16;
		valen[1] = 12;
		valen[2] = 8;
		valen[3] = 6;
		valen[4] = 6;
		valen[5] = 9;
		valen[6] = 10;

		// Servicio a la institucion
		valen[7] = 3;
		valen[8] = 4;
		valen[9] = 2;
		valen[10] = 3;

		// Servicio a la comunidad
		valen[11] = 2;

		// Investigacion y trabajo creativo
		valen[12] = 2;
		valen[13] = 4;
		valen[14] = 4;

		// Crecimiento y desarrollo profesional
		valen[15] = 3;
		valen[16] = 3;
		valen[17] = 3;

		valen[18] = 15;
		valen[19] = 10;
		valen[20] = 10;
		valen[21] = 6;
		valen[22] = 7;
		valen[23] = 9;
		valen[24] = 8;

		// Servicio a la institucion
		valen[25] = 3;
		valen[26] = 3;
		valen[27] = 2;
		valen[28] = 3;

		// Servicio a la comunidad
		valen[29] = 2;

		// Investigacion y trabajo creativo
		valen[30] = 3;
		valen[31] = 4;
		valen[32] = 5;

		// Crecimiento y desarrollo profesional
		valen[33] = 4;
		valen[34] = 3;
		valen[35] = 3;

		// Calidad docente
		valen[36] = 13;
		valen[37] = 10;
		valen[38] = 12;
		valen[39] = 6;
		valen[40] = 5;
		valen[41] = 9;
		valen[42] = 8;

		// Servicio a la institucion
		valen[43] = 2;
		valen[44] = 3;
		valen[45] = 2;
		valen[46]= 2;

		// Servicio a la comunidad
		valen[47] = 2;

		// Investigacion y trabajo creativo
		valen[48] = 5;
		valen[49] = 5;
		valen[50] = 4;

		// Crecimiento y desarrollo profesional
		valen[51] = 4;
		valen[52] = 4;
		valen[53] = 4;

		ValenciasRango.setValen(valen);


		

		//Password input
		passwordField = new PasswordField();
		
	

		// Username input
		numeroFacultad_textField = new TextField();
		 botonInicioSesion = new Button();
		 botonRegistrarse = new Button();
		 
		 
		 
		 
		Nombre_textField = new TextField();
		Apellido_textField = new TextField();
		numeroFacultadRe_textField= new TextField();
		PasswordRe_textField= new TextField();
		PasswordReCom_textField= new TextField();
	}
			

	public String getID() {
		return userName;

	}
	
	public void Login(ActionEvent event ) {

		Instruments mm = new Instruments();
		Main main = new Main();
		

		userName = numeroFacultad_textField.getText();
		String test = userName;
		String pass = passwordField.getText();
		int found = 0;
		
		

		fileManager  file = new fileManager();
		found =	file.login(getID(), pass);

		
		if (found == 1) {
			
			mm.start();
			main.close();
//			Instruments inst = new Instruments();
//			inst.Load();

		}else{
			
		}
	}
	
	public void Register(ActionEvent event ) {
		
		
		String ID = numeroFacultadRe_textField.getText();
		String pass = PasswordRe_textField.getText();
		String passCom = PasswordReCom_textField.getText();
		String name = Nombre_textField.getText();
		String lastName = Apellido_textField.getText(); 
		
		
		
		fileManager  file = new fileManager();
		if (pass.equals(passCom)) {
	    file.register(ID, pass, name, lastName);
	    login();
		}
		else
		{
			 System.out.println("password not the same");
		}
	}
	
	public void pass(ActionEvent event) {    // Pass Field
        
        System.out.println("fcuk you");
    }
	
	public void login() {
		logPane.setVisible(true);
		regPane.setVisible(false);
	}
	
	public void register() {
		logPane.setVisible(false);
		regPane.setVisible(true);
	}
	
	public void mainMenu() {
//		MainMenu_GUI mm = new MainMenu_GUI();
//		Main main = new Main();
//		
//		mm.start();
//		main.close();
	}
	
	
	
	
	
	
	
	
	
} 