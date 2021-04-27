package evaluation;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class WarningPrompt {
	@FXML private Button ok_button;
	@FXML private Label text;
	
	@FXML public void initialize() {
		text.setText(Instruments.warnText);
	}
	
	public void closeWindow() {
		Stage stage = (Stage) ok_button.getScene().getWindow();
		stage.close();
	}
}
