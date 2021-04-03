package evaluation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.StackPane;

public class MainMenu_GUI {
	@FXML private ToggleButton tgl_info = new ToggleButton();
	@FXML private ToggleButton tgl_inst1 = new ToggleButton();
	@FXML private ToggleButton tgl_inst2 = new ToggleButton();
	@FXML private ToggleButton tgl_inst3 = new ToggleButton();
	@FXML private ToggleButton tgl_inst4 = new ToggleButton();
	@FXML private ToggleButton tgl_terminar = new ToggleButton();
	@FXML private ToggleButton tgl_borrar = new ToggleButton();
	@FXML private ToggleButton tgl_config = new ToggleButton();
	@FXML private ToggleButton tgl_salir = new ToggleButton();
	
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
	
//	@FXML private void tgl_init() {
//		tgl_info.setToggleGroup(sideBar);
//		tgl_inst1.setToggleGroup(sideBar);
//		tgl_inst2.setToggleGroup(sideBar);
//		tgl_inst3.setToggleGroup(sideBar);
//		tgl_inst4.setToggleGroup(sideBar);
//		tgl_terminar.setToggleGroup(sideBar);
//		tgl_borrar.setToggleGroup(sideBar);
//		tgl_config.setToggleGroup(sideBar);
//		tgl_salir.setToggleGroup(sideBar);
//	}
	
	public void tgl_pane(ActionEvent event) {
		tgl_info.setToggleGroup(sideBar);
		tgl_inst1.setToggleGroup(sideBar);
		tgl_inst2.setToggleGroup(sideBar);
		tgl_inst3.setToggleGroup(sideBar);
		tgl_inst4.setToggleGroup(sideBar);
		tgl_terminar.setToggleGroup(sideBar);
		tgl_borrar.setToggleGroup(sideBar);
		tgl_config.setToggleGroup(sideBar);
		tgl_salir.setToggleGroup(sideBar);
		
		ToggleButton selected = (ToggleButton) sideBar.getSelectedToggle();
		
		paneChange(selected,pane_info);
	}
	
	public void paneChange(ToggleButton tgl, StackPane pane) {
		if(tgl.isSelected()) {
			pane_info.setVisible(true);
		}
		else
			pane.setVisible(false);
	}
}
