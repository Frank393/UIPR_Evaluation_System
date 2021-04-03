package evaluation;

import javafx.fxml.FXML;

public class Retainer {
	Login_backend lb = new Login_backend();
	@FXML void initialize() {
		System.out.println(Login_backend.holder[0]+" and "+Login_backend.holder[1]);
		lb.tf.setText(Login_backend.holder[0]);
		lb.tf2.setText(Login_backend.holder[1]);
	}
}
