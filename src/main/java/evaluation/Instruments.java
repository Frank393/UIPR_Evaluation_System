package evaluation;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.*;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Instruments  {
	int tipo ;
	static String[] values = new String[162];
	int[] I2re = new int[21];
	Login_backend user = new Login_backend();
	String User = user.getID();
	String[] ag = new String[160];
	int size = 0;
	ObservableList<String> objetivo = FXCollections.observableArrayList("Formativa","Sumativa"); // String array for choice box 1
	ObservableList<String> rangoAcademico = FXCollections.observableArrayList("Rango Catedratico","Rango Catedratico Asociado","Rango Catedratico Auxiliar"); // String array for choice box 2
	ObservableList<String> contrato = FXCollections.observableArrayList("Temporero","Sustituto","Probatorio","Permanente"); 
	ObservableList<String> TipoEv = FXCollections.observableArrayList("Online","Manual"); 
	ObservableList<String> Instrument3 = FXCollections.observableArrayList("N/A","1","2","3","4"); 
	// Spinner value factory
	SpinnerValueFactory<Integer> spin1list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 99,0);
	SpinnerValueFactory<Integer> spin2list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 99,0);
	SpinnerValueFactory<Integer> spin3list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 4,1);
	SpinnerValueFactory<Integer> spin4list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 4,1);
	SpinnerValueFactory<Integer> spin5list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 3,1);
	SpinnerValueFactory<Integer> spin6list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 3,1);
	SpinnerValueFactory<Integer> spin7list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	SpinnerValueFactory<Integer> spin8list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	SpinnerValueFactory<Integer> spin9list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	SpinnerValueFactory<Integer> spin10list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	SpinnerValueFactory<Integer> spin11list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	SpinnerValueFactory<Integer> spin12list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	SpinnerValueFactory<Integer> spin13list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	SpinnerValueFactory<Integer> spin14list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	SpinnerValueFactory<Integer> spin15list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	SpinnerValueFactory<Integer> spin16list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	SpinnerValueFactory<Integer> spin17list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	SpinnerValueFactory<Integer> spin18list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	SpinnerValueFactory<Integer> spin19list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	SpinnerValueFactory<Integer> spin20list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	
	SpinnerValueFactory<Integer> spin21list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	SpinnerValueFactory<Integer> spin22list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	SpinnerValueFactory<Integer> spin23list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	SpinnerValueFactory<Integer> spin24list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	SpinnerValueFactory<Integer> spin25list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	SpinnerValueFactory<Integer> spin26list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	SpinnerValueFactory<Integer> spin27list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	SpinnerValueFactory<Integer> spin28list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	SpinnerValueFactory<Integer> spin29list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	SpinnerValueFactory<Integer> spin30list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	SpinnerValueFactory<Integer> spin31list = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 4,0);
	
	SpinnerValueFactory<Integer> spin1Ins2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 99,0);
	SpinnerValueFactory<Integer> spin2Ins2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 99,0);
	SpinnerValueFactory<Integer> spin3Ins2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 99,0);
	SpinnerValueFactory<Integer> spin4Ins2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 99,0);
	SpinnerValueFactory<Integer> spin5Ins2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 99,0);
	SpinnerValueFactory<Integer> spin6Ins2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 99,0);
	SpinnerValueFactory<Integer> spin7Ins2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 99,0);
	SpinnerValueFactory<Integer> spin8Ins2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 99,0);
	SpinnerValueFactory<Integer> spin9Ins2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 99,0);
	SpinnerValueFactory<Integer> spin10Ins2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 99,0);
	SpinnerValueFactory<Integer> spin11Ins2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 99,0);
	SpinnerValueFactory<Integer> spin12Ins2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 99,0);
	SpinnerValueFactory<Integer> spin13Ins2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 99,0);
	SpinnerValueFactory<Integer> spin14Ins2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 99,0);
	SpinnerValueFactory<Integer> spin15Ins2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 99,0);
	SpinnerValueFactory<Integer> spin16Ins2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 99,0);
	SpinnerValueFactory<Integer> spin17Ins2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 99,0);
	SpinnerValueFactory<Integer> spin18Ins2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 99,0);
	
	// Config table
	@FXML private TableView<tableColum> tv;
	
	@FXML private TableColumn<tableColum, String> Id = new TableColumn<tableColum, String>("Id");;
	@FXML private TableColumn<tableColum, String> Profesor = new TableColumn<tableColum, String>("Profesor");;
	@FXML private TableColumn<tableColum, String> Modalidad = new TableColumn<tableColum, String>("Modalidad");;
	@FXML private TableColumn<tableColum, String> Termino= new TableColumn<tableColum, String>("Termino");;
	
	@FXML private ComboBox<String> instrument3_1 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument3_2 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument3_3 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument3_4 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument3_5 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument3_6 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument3_7 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument3_8 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument3_9 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument3_10 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument3_11 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument3_12 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument3_13 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument3_14 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument3_15 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument3_16 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument3_17 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument3_18 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument3_19 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument3_20 = new ComboBox<String>();
	
	@FXML private ComboBox<String> instrument4_1 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument4_2 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument4_3 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument4_4 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument4_5 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument4_6 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument4_7 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument4_8 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument4_9 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument4_10 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument4_11 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument4_12 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument4_13 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument4_14 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument4_15 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument4_16 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument4_17 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument4_18 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument4_19 = new ComboBox<String>();
	@FXML private ComboBox<String> instrument4_20 = new ComboBox<String>();
	
	
	@FXML private TextField Unidadacademica_textField;
	@FXML private TextField nombre_prof_textField;
	@FXML private TextField departamento_textField;
	@FXML private TextField disiplina_textField;
	@FXML private DatePicker periodo_evaluado_textField;
	@FXML private TextField codigo_textField;
	@FXML private TextField tutulo_del_curso_textField;
	
	
	@FXML private TextField InsRe_1;
	@FXML private TextField InsRe_2;
	@FXML private TextField InsRe_3;
	@FXML private TextField InsRe_4;
	@FXML private TextField InsRe_5;
	@FXML private TextField InsRe_6;
	@FXML private TextField InsRe_7;
	@FXML private TextField InsRe_8;
	@FXML private TextField InsRe_9;
	@FXML private TextField InsRe_10;
	@FXML private TextField InsRe_11;
	@FXML private TextField InsRe_12;
	@FXML private TextField InsRe_13;
	@FXML private TextField InsRe_14;
	@FXML private TextField InsRe_15;
	@FXML private TextField InsRe_16;
	@FXML private TextField InsRe_17;
	@FXML private TextField InsRe_18;
	

	//private JLabel titulo_curso_lblNewLabel;

	//private JTextField textField_2;


	@FXML private ComboBox<String> rangoAcademico_comboBox = new ComboBox<String>();
	@FXML private ComboBox<String> objetivo_eval_comboBox = new ComboBox<String>();
	@FXML private ComboBox<String> Tipo_EV = new ComboBox<String>();
	@FXML private Spinner<Integer> jornada_comple_comboBox = new Spinner<Integer>();
	@FXML private Spinner<Integer> jornada_parcial_comboBox = new Spinner<Integer>();
	@FXML private ComboBox<String> contrato_comboBox = new ComboBox<String>();
	@FXML private Spinner<Integer> instrument1_1 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_2 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_3 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_4 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_5 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_6 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_7 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_8 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_9 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_10 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_11 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_12 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_13 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_14 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_15 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_16 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_17 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_18 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_19 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_20 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_21 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_22 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_23 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_24 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_25 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_26 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_27 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_28 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument1_29 = new Spinner<Integer>();
	
	
	
	@FXML private Spinner<Integer> instrument2_1 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument2_2 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument2_3 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument2_4 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument2_5 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument2_6 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument2_7 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument2_8 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument2_9 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument2_10 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument2_11 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument2_12 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument2_13 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument2_14 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument2_15 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument2_16 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument2_17 = new Spinner<Integer>();
	@FXML private Spinner<Integer> instrument2_18 = new Spinner<Integer>();
	
	
	
	@FXML private TextField Comment_3_1;
	@FXML private TextField Comment_3_2;
	@FXML private TextField Comment_3_3;
	@FXML private TextField Comment_3_4;
	@FXML private TextField Comment_3_5;
	@FXML private TextField Comment_3_6;
	@FXML private TextField Comment_3_7;
	@FXML private TextField Comment_3_8;
	@FXML private TextField Comment_3_9;
	@FXML private TextField Comment_3_10;
	@FXML private TextField Comment_3_11;
	@FXML private TextField Comment_3_12;
	@FXML private TextField Comment_3_13;
	@FXML private TextField Comment_3_14;
	@FXML private TextField Comment_3_15;
	@FXML private TextField Comment_3_16;
	@FXML private TextField Comment_3_17;
	@FXML private TextField Comment_3_18;
	@FXML private TextField Comment_3_19;
	@FXML private TextField Comment_3_20;
	
	@FXML private TextField Comment_4_1;
	@FXML private TextField Comment_4_2;
	@FXML private TextField Comment_4_3;
	@FXML private TextField Comment_4_4;
	@FXML private TextField Comment_4_5;
	@FXML private TextField Comment_4_6;
	@FXML private TextField Comment_4_7;
	@FXML private TextField Comment_4_8;
	@FXML private TextField Comment_4_9;
	@FXML private TextField Comment_4_10;
	@FXML private TextField Comment_4_11;
	@FXML private TextField Comment_4_12;
	@FXML private TextField Comment_4_13;
	@FXML private TextField Comment_4_14;
	@FXML private TextField Comment_4_15;
	@FXML private TextField Comment_4_16;
	@FXML private TextField Comment_4_17;
	@FXML private TextField Comment_4_18;
	@FXML private TextField Comment_4_19;
	@FXML private TextField Comment_4_20;
	@FXML private TextField Comment_4_21;
	@FXML private TextField Comment_4_22;
	@FXML private TextField Comment_4_23;
	
	@FXML private TextField Comment_2_1;
	@FXML private TextField Comment_2_2;
	@FXML private TextField Comment_2_3;
	@FXML private TextField Comment_2_4;
	@FXML private TextField Comment_2_5;
	@FXML private TextField Comment_2_6;
	@FXML private TextField Comment_2_7;
	@FXML private TextField Comment_2_8;
	@FXML private TextField Comment_2_9;
	@FXML private TextField Comment_2_10;
	@FXML private TextField Comment_2_11;
	@FXML private TextField Comment_2_12;
	@FXML private TextField Comment_2_13;
	@FXML private TextField Comment_2_14;
	@FXML private TextField Comment_2_15;
	@FXML private TextField Comment_2_16;
	@FXML private TextField Comment_2_17;
	@FXML private TextField Comment_2_18;
	@FXML private TextField Comment_2_19;
	@FXML private TextField Comment_2_20;
	
	
	@FXML private TextField CotiBor;
	
	
	
	
	// Config Spinners
		@FXML protected Spinner cat_valen1A = new Spinner();
		@FXML protected Spinner cat_valen1B = new Spinner();
		@FXML protected Spinner cat_valen1C = new Spinner();
		@FXML protected Spinner cat_valen1D = new Spinner();
		@FXML protected Spinner cat_valen1E = new Spinner();
		@FXML protected Spinner cat_valen1F = new Spinner();
		@FXML protected Spinner cat_valen1GH = new Spinner();
		@FXML protected Spinner cat_valen2A = new Spinner();
		@FXML protected Spinner cat_valen2BC = new Spinner();
		@FXML protected Spinner cat_valen2DE = new Spinner();
		@FXML protected Spinner cat_valen2FG = new Spinner();
		@FXML protected Spinner cat_valen3AB = new Spinner();
		@FXML protected Spinner cat_valen4A = new Spinner();
		@FXML protected Spinner cat_valen4B = new Spinner();
		@FXML protected Spinner cat_valen4CDE = new Spinner();
		@FXML protected Spinner cat_valen5ABC = new Spinner();
		@FXML protected Spinner cat_valen5D = new Spinner();
		@FXML protected Spinner cat_valen5EF = new Spinner();
	    
		@FXML protected Spinner aso_valen1A = new Spinner();
		@FXML protected Spinner aso_valen1B = new Spinner();
		@FXML protected Spinner aso_valen1C = new Spinner();
		@FXML protected Spinner aso_valen1D = new Spinner();
		@FXML protected Spinner aso_valen1E = new Spinner();
		@FXML protected Spinner aso_valen1F = new Spinner();
		@FXML protected Spinner aso_valen1GH = new Spinner();
		@FXML protected Spinner aso_valen2A = new Spinner();
		@FXML protected Spinner aso_valen2BC = new Spinner();
		@FXML protected Spinner aso_valen2DE = new Spinner();
		@FXML protected Spinner aso_valen2FG = new Spinner();
		@FXML protected Spinner aso_valen3AB = new Spinner();
		@FXML protected Spinner aso_valen4A = new Spinner();
		@FXML protected Spinner aso_valen4B = new Spinner();
		@FXML protected Spinner aso_valen4CDE = new Spinner();
		@FXML protected Spinner aso_valen5ABC = new Spinner();
		@FXML protected Spinner aso_valen5D = new Spinner();
		@FXML protected Spinner aso_valen5EF = new Spinner();
	    
		@FXML protected Spinner aux_valen1A = new Spinner();
		@FXML protected Spinner aux_valen1B = new Spinner();
		@FXML protected Spinner aux_valen1C = new Spinner();
		@FXML protected Spinner aux_valen1D = new Spinner();
		@FXML protected Spinner aux_valen1E = new Spinner();
		@FXML protected Spinner aux_valen1F = new Spinner();
		@FXML protected Spinner aux_valen1GH = new Spinner();
		@FXML protected Spinner aux_valen2A = new Spinner();
		@FXML protected Spinner aux_valen2BC = new Spinner();
		@FXML protected Spinner aux_valen2DE = new Spinner();
		@FXML protected Spinner aux_valen2FG = new Spinner();
		@FXML protected Spinner aux_valen3AB = new Spinner();
		@FXML protected Spinner aux_valen4A = new Spinner();
		@FXML protected Spinner aux_valen4B = new Spinner();
		@FXML protected Spinner aux_valen4CDE = new Spinner();
		@FXML protected Spinner aux_valen5ABC = new Spinner();
		@FXML protected Spinner aux_valen5D = new Spinner();
		@FXML protected Spinner aux_valen5EF = new Spinner();
		
		// Create value factories
	    SpinnerValueFactory<Integer> cat_valen1A_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> cat_valen1B_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> cat_valen1C_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> cat_valen1D_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> cat_valen1E_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> cat_valen1F_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> cat_valen1GH_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> cat_valen2A_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> cat_valen2BC_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> cat_valen2DE_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> cat_valen2FG_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> cat_valen3AB_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> cat_valen4A_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> cat_valen4B_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> cat_valen4CDE_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> cat_valen5ABC_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> cat_valen5D_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> cat_valen5EF_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    
	    SpinnerValueFactory<Integer> aso_valen1A_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aso_valen1B_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aso_valen1C_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aso_valen1D_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aso_valen1E_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aso_valen1F_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aso_valen1GH_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aso_valen2A_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aso_valen2BC_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aso_valen2DE_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aso_valen2FG_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aso_valen3AB_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aso_valen4A_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aso_valen4B_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aso_valen4CDE_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aso_valen5ABC_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aso_valen5D_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aso_valen5EF_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    
	    SpinnerValueFactory<Integer> aux_valen1A_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aux_valen1B_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aux_valen1C_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aux_valen1D_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aux_valen1E_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aux_valen1F_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aux_valen1GH_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aux_valen2A_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aux_valen2BC_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aux_valen2DE_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aux_valen2FG_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aux_valen3AB_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aux_valen4A_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aux_valen4B_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aux_valen4CDE_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aux_valen5ABC_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aux_valen5D_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	    SpinnerValueFactory<Integer> aux_valen5EF_list = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 99);
	
	
	
	
	
	
	
	@FXML private void initialize() { // For initializing lists of things
		tv.setFixedCellSize(25);
		//tv.prefHeightProperty().bind(Bindings.size(tv.getItems()).multiply(tv.getFixedCellSize()).add(30));
		Id.setCellValueFactory(new PropertyValueFactory<tableColum,String>("Id"));
	    Profesor.setCellValueFactory(new PropertyValueFactory<tableColum,String>("Profesor"));
	    Modalidad.setCellValueFactory(new PropertyValueFactory<tableColum,String>("Modalidad"));
	    Termino.setCellValueFactory(new PropertyValueFactory<tableColum,String>("Termino")); 
		 
		    // load table data
		    
		    tv.setItems(SetEval());
		
		rangoAcademico_comboBox.setItems(rangoAcademico);
		objetivo_eval_comboBox.setItems(objetivo);
		Tipo_EV.setItems(TipoEv);
		contrato_comboBox.setItems(contrato);
		jornada_comple_comboBox.setValueFactory(spin1list);
		jornada_parcial_comboBox.setValueFactory(spin2list);
		instrument1_1.setValueFactory(spin3list);
		instrument1_2.setValueFactory(spin4list);
		instrument1_3.setValueFactory(spin5list);
		instrument1_4.setValueFactory(spin6list);
		instrument1_5.setValueFactory(spin7list);
		instrument1_6.setValueFactory(spin8list);
		instrument1_7.setValueFactory(spin9list);
		instrument1_8.setValueFactory(spin10list);
		instrument1_9.setValueFactory(spin11list);
		instrument1_10.setValueFactory(spin12list);
		instrument1_11.setValueFactory(spin13list);
		instrument1_12.setValueFactory(spin14list);
		instrument1_13.setValueFactory(spin15list);
		instrument1_14.setValueFactory(spin16list);
		instrument1_15.setValueFactory(spin17list);
		instrument1_16.setValueFactory(spin18list);
		instrument1_17.setValueFactory(spin19list);
		instrument1_18.setValueFactory(spin20list);
		instrument1_19.setValueFactory(spin21list);
		instrument1_20.setValueFactory(spin22list);
		instrument1_21.setValueFactory(spin23list);
		instrument1_22.setValueFactory(spin24list);
		instrument1_23.setValueFactory(spin25list);
		instrument1_24.setValueFactory(spin26list);
		instrument1_25.setValueFactory(spin27list);
		instrument1_26.setValueFactory(spin28list);
		instrument1_27.setValueFactory(spin29list);
		instrument1_28.setValueFactory(spin30list);
		instrument1_29.setValueFactory(spin31list);	
		
		instrument2_1.setValueFactory(spin1Ins2);
		instrument2_2.setValueFactory(spin2Ins2);
		instrument2_3.setValueFactory(spin3Ins2);
		instrument2_4.setValueFactory(spin4Ins2);
		instrument2_5.setValueFactory(spin5Ins2);
		instrument2_6.setValueFactory(spin6Ins2);
		instrument2_7.setValueFactory(spin7Ins2);
		instrument2_8.setValueFactory(spin8Ins2);
		instrument2_9.setValueFactory(spin9Ins2);
		instrument2_10.setValueFactory(spin10Ins2);
		instrument2_11.setValueFactory(spin11Ins2);
		instrument2_12.setValueFactory(spin12Ins2);
		instrument2_13.setValueFactory(spin13Ins2);
		instrument2_14.setValueFactory(spin14Ins2);
		instrument2_15.setValueFactory(spin15Ins2);
		instrument2_16.setValueFactory(spin16Ins2);
		instrument2_17.setValueFactory(spin17Ins2);
		instrument2_18.setValueFactory(spin18Ins2);
		
		
		instrument3_1.setItems(Instrument3);
		instrument3_2.setItems(Instrument3); 
		instrument3_3.setItems(Instrument3); 
		instrument3_4.setItems(Instrument3);
		instrument3_5.setItems(Instrument3); 
		instrument3_6.setItems(Instrument3); 
		instrument3_7.setItems(Instrument3);
		instrument3_8.setItems(Instrument3);
		instrument3_9.setItems(Instrument3); 
		instrument3_10.setItems(Instrument3); 
		instrument3_11.setItems(Instrument3); 
		instrument3_12.setItems(Instrument3); 
		instrument3_13.setItems(Instrument3); 
		instrument3_14.setItems(Instrument3); 
		instrument3_15.setItems(Instrument3);
		instrument3_16.setItems(Instrument3);
		instrument3_17.setItems(Instrument3);
		instrument3_18.setItems(Instrument3); 
		instrument3_19.setItems(Instrument3);
		instrument3_20.setItems(Instrument3);
		
		// Initialize Configurations
		cat_valen1A.setValueFactory(cat_valen1A_list);
    	cat_valen1B.setValueFactory(cat_valen1B_list);
    	cat_valen1C.setValueFactory(cat_valen1C_list);
    	cat_valen1D.setValueFactory(cat_valen1D_list);
    	cat_valen1E.setValueFactory(cat_valen1E_list);
    	cat_valen1F.setValueFactory(cat_valen1F_list);
    	cat_valen1GH.setValueFactory(cat_valen1GH_list);
    	cat_valen2A.setValueFactory(cat_valen2A_list);
    	cat_valen2BC.setValueFactory(cat_valen2BC_list);
    	cat_valen2DE.setValueFactory(cat_valen2DE_list);
    	cat_valen2FG.setValueFactory(cat_valen2FG_list);
    	cat_valen3AB.setValueFactory(cat_valen3AB_list);
    	cat_valen4A.setValueFactory(cat_valen4A_list);
    	cat_valen4B.setValueFactory(cat_valen4B_list);
    	cat_valen4CDE.setValueFactory(cat_valen4CDE_list);
    	cat_valen5ABC.setValueFactory(cat_valen5ABC_list);
    	cat_valen5D.setValueFactory(cat_valen5D_list);
    	cat_valen5EF.setValueFactory(cat_valen5EF_list);
    	
    	aso_valen1A.setValueFactory(aso_valen1A_list);
    	aso_valen1B.setValueFactory(aso_valen1B_list);
    	aso_valen1C.setValueFactory(aso_valen1C_list);
    	aso_valen1D.setValueFactory(aso_valen1D_list);
    	aso_valen1E.setValueFactory(aso_valen1E_list);
    	aso_valen1F.setValueFactory(aso_valen1F_list);
    	aso_valen1GH.setValueFactory(aso_valen1GH_list);
    	aso_valen2A.setValueFactory(aso_valen2A_list);
    	aso_valen2BC.setValueFactory(aso_valen2BC_list);
    	aso_valen2DE.setValueFactory(aso_valen2DE_list);
    	aso_valen2FG.setValueFactory(aso_valen2FG_list);
    	aso_valen3AB.setValueFactory(aso_valen3AB_list);
    	aso_valen4A.setValueFactory(aso_valen4A_list);
    	aso_valen4B.setValueFactory(aso_valen4B_list);
    	aso_valen4CDE.setValueFactory(aso_valen4CDE_list);
    	aso_valen5ABC.setValueFactory(aso_valen5ABC_list);
    	aso_valen5D.setValueFactory(aso_valen5D_list);
    	aso_valen5EF.setValueFactory(aso_valen5EF_list);
    	
    	aux_valen1A.setValueFactory(aux_valen1A_list);
    	aux_valen1B.setValueFactory(aux_valen1B_list);
    	aux_valen1C.setValueFactory(aux_valen1C_list);
    	aux_valen1D.setValueFactory(aux_valen1D_list);
    	aux_valen1E.setValueFactory(aux_valen1E_list);
    	aux_valen1F.setValueFactory(aux_valen1F_list);
    	aux_valen1GH.setValueFactory(aux_valen1GH_list);
    	aux_valen2A.setValueFactory(aux_valen2A_list);
    	aux_valen2BC.setValueFactory(aux_valen2BC_list);
    	aux_valen2DE.setValueFactory(aux_valen2DE_list);
    	aux_valen2FG.setValueFactory(aux_valen2FG_list);
    	aux_valen3AB.setValueFactory(aux_valen3AB_list);
    	aux_valen4A.setValueFactory(aux_valen4A_list);
    	aux_valen4B.setValueFactory(aux_valen4B_list);
    	aux_valen4CDE.setValueFactory(aux_valen4CDE_list);
    	aux_valen5ABC.setValueFactory(aux_valen5ABC_list);
    	aux_valen5D.setValueFactory(aux_valen5D_list);
    	aux_valen5EF.setValueFactory(aux_valen5EF_list);
    	
    	ConfigBackend cb = new ConfigBackend();
    	
    	System.out.println("Spinner value: "+aux_valen1A.getValue());
    	System.out.println("Valen: "+cb.valen[5]);
		aux_valen1A.getValueFactory().setValue(cb.valen[0]);
		aux_valen1B.getValueFactory().setValue(cb.valen[1]);
		aux_valen1C.getValueFactory().setValue(cb.valen[2]);
		aux_valen1D.getValueFactory().setValue(cb.valen[3]);
		aux_valen1E.getValueFactory().setValue(cb.valen[4]);
		aux_valen1F.getValueFactory().setValue(cb.valen[5]);
		aux_valen1GH.getValueFactory().setValue(cb.valen[6]);
		aux_valen2A.getValueFactory().setValue(cb.valen[7]);
    	aux_valen2BC.getValueFactory().setValue(cb.valen[8]);
    	aux_valen2DE.getValueFactory().setValue(cb.valen[9]);
    	aux_valen2FG.getValueFactory().setValue(cb.valen[10]);
    	aux_valen3AB.getValueFactory().setValue(cb.valen[11]);
    	aux_valen4A.getValueFactory().setValue(cb.valen[12]);
    	aux_valen4B.getValueFactory().setValue(cb.valen[13]);
    	aux_valen4CDE.getValueFactory().setValue(cb.valen[14]);
    	aux_valen5ABC.getValueFactory().setValue(cb.valen[15]);
    	aux_valen5D.getValueFactory().setValue(cb.valen[16]);
    	aux_valen5EF.getValueFactory().setValue(cb.valen[17]);
    	
    	aso_valen1A.getValueFactory().setValue(cb.valen[18]);
		aso_valen1B.getValueFactory().setValue(cb.valen[19]);
		aso_valen1C.getValueFactory().setValue(cb.valen[20]);
		aso_valen1D.getValueFactory().setValue(cb.valen[21]);
		aso_valen1E.getValueFactory().setValue(cb.valen[22]);
		aso_valen1F.getValueFactory().setValue(cb.valen[23]);
		aso_valen1GH.getValueFactory().setValue(cb.valen[24]);
		aso_valen2A.getValueFactory().setValue(cb.valen[25]);
    	aso_valen2BC.getValueFactory().setValue(cb.valen[26]);
    	aso_valen2DE.getValueFactory().setValue(cb.valen[27]);
    	aso_valen2FG.getValueFactory().setValue(cb.valen[28]);
    	aso_valen3AB.getValueFactory().setValue(cb.valen[29]);
    	aso_valen4A.getValueFactory().setValue(cb.valen[30]);
    	aso_valen4B.getValueFactory().setValue(cb.valen[31]);
    	aso_valen4CDE.getValueFactory().setValue(cb.valen[32]);
    	aso_valen5ABC.getValueFactory().setValue(cb.valen[33]);
    	aso_valen5D.getValueFactory().setValue(cb.valen[34]);
    	aso_valen5EF.getValueFactory().setValue(cb.valen[35]);
    	
    	cat_valen1A.getValueFactory().setValue(cb.valen[36]);
		cat_valen1B.getValueFactory().setValue(cb.valen[37]);
		cat_valen1C.getValueFactory().setValue(cb.valen[38]);
		cat_valen1D.getValueFactory().setValue(cb.valen[39]);
		cat_valen1E.getValueFactory().setValue(cb.valen[40]);
		cat_valen1F.getValueFactory().setValue(cb.valen[41]);
		cat_valen1GH.getValueFactory().setValue(cb.valen[42]);
		cat_valen2A.getValueFactory().setValue(cb.valen[43]);
    	cat_valen2BC.getValueFactory().setValue(cb.valen[44]);
    	cat_valen2DE.getValueFactory().setValue(cb.valen[45]);
    	cat_valen2FG.getValueFactory().setValue(cb.valen[46]);
    	cat_valen3AB.getValueFactory().setValue(cb.valen[47]);
    	cat_valen4A.getValueFactory().setValue(cb.valen[48]);
    	cat_valen4B.getValueFactory().setValue(cb.valen[49]);
    	cat_valen4CDE.getValueFactory().setValue(cb.valen[50]);
    	cat_valen5ABC.getValueFactory().setValue(cb.valen[51]);
    	cat_valen5D.getValueFactory().setValue(cb.valen[52]);
    	cat_valen5EF.getValueFactory().setValue(cb.valen[53]);
		
		//set();
		System.out.println("im in ininininin");
		 // Column setup
		//Load();
	 
	}
	
	
	// Config backend
	
    public void assignDefault() { // Assign default values to spinners and valencias
    	
    	ValenciasRango vr = null;
    	ConfigBackend cb = new ConfigBackend();
    	
    	vr.setValen(defValues()); // Set array in ValenciasRango
    	vr = new ValenciasRango(3);    	
    	vr = new ValenciasRango(2);
    	vr = new ValenciasRango(1);
    	
    	Instruments inst = new Instruments();
    	
    	aux_valen1A.getValueFactory().setValue(cb.valen[0]);
		aux_valen1B.getValueFactory().setValue(cb.valen[1]);
		aux_valen1C.getValueFactory().setValue(cb.valen[2]);
		aux_valen1D.getValueFactory().setValue(cb.valen[3]);
		aux_valen1E.getValueFactory().setValue(cb.valen[4]);
		aux_valen1F.getValueFactory().setValue(cb.valen[5]);
		aux_valen1GH.getValueFactory().setValue(cb.valen[6]);
		aux_valen2A.getValueFactory().setValue(cb.valen[7]);
    	aux_valen2BC.getValueFactory().setValue(cb.valen[8]);
    	aux_valen2DE.getValueFactory().setValue(cb.valen[9]);
    	aux_valen2FG.getValueFactory().setValue(cb.valen[10]);
    	aux_valen3AB.getValueFactory().setValue(cb.valen[11]);
    	aux_valen4A.getValueFactory().setValue(cb.valen[12]);
    	aux_valen4B.getValueFactory().setValue(cb.valen[13]);
    	aux_valen4CDE.getValueFactory().setValue(cb.valen[14]);
    	aux_valen5ABC.getValueFactory().setValue(cb.valen[15]);
    	aux_valen5D.getValueFactory().setValue(cb.valen[16]);
    	aux_valen5EF.getValueFactory().setValue(cb.valen[17]);
    	
    	aso_valen1A.getValueFactory().setValue(cb.valen[18]);
		aso_valen1B.getValueFactory().setValue(cb.valen[19]);
		aso_valen1C.getValueFactory().setValue(cb.valen[20]);
		aso_valen1D.getValueFactory().setValue(cb.valen[21]);
		aso_valen1E.getValueFactory().setValue(cb.valen[22]);
		aso_valen1F.getValueFactory().setValue(cb.valen[23]);
		aso_valen1GH.getValueFactory().setValue(cb.valen[24]);
		aso_valen2A.getValueFactory().setValue(cb.valen[25]);
    	aso_valen2BC.getValueFactory().setValue(cb.valen[26]);
    	aso_valen2DE.getValueFactory().setValue(cb.valen[27]);
    	aso_valen2FG.getValueFactory().setValue(cb.valen[28]);
    	aso_valen3AB.getValueFactory().setValue(cb.valen[29]);
    	aso_valen4A.getValueFactory().setValue(cb.valen[30]);
    	aso_valen4B.getValueFactory().setValue(cb.valen[31]);
    	aso_valen4CDE.getValueFactory().setValue(cb.valen[32]);
    	aso_valen5ABC.getValueFactory().setValue(cb.valen[33]);
    	aso_valen5D.getValueFactory().setValue(cb.valen[34]);
    	aso_valen5EF.getValueFactory().setValue(cb.valen[35]);
    	
    	cat_valen1A.getValueFactory().setValue(cb.valen[36]);
		cat_valen1B.getValueFactory().setValue(cb.valen[37]);
		cat_valen1C.getValueFactory().setValue(cb.valen[38]);
		cat_valen1D.getValueFactory().setValue(cb.valen[39]);
		cat_valen1E.getValueFactory().setValue(cb.valen[40]);
		cat_valen1F.getValueFactory().setValue(cb.valen[41]);
		cat_valen1GH.getValueFactory().setValue(cb.valen[42]);
		cat_valen2A.getValueFactory().setValue(cb.valen[43]);
    	cat_valen2BC.getValueFactory().setValue(cb.valen[44]);
    	cat_valen2DE.getValueFactory().setValue(cb.valen[45]);
    	cat_valen2FG.getValueFactory().setValue(cb.valen[46]);
    	cat_valen3AB.getValueFactory().setValue(cb.valen[47]);
    	cat_valen4A.getValueFactory().setValue(cb.valen[48]);
    	cat_valen4B.getValueFactory().setValue(cb.valen[49]);
    	cat_valen4CDE.getValueFactory().setValue(cb.valen[50]);
    	cat_valen5ABC.getValueFactory().setValue(cb.valen[51]);
    	cat_valen5D.getValueFactory().setValue(cb.valen[52]);
    	cat_valen5EF.getValueFactory().setValue(cb.valen[53]);
    }
    
	public void applyValue() {
			ConfigBackend cb = new ConfigBackend();
	    	
			cb.valen[0] = (Integer) aux_valen1A.getValue();
			cb.valen[1] = (Integer) aux_valen1B.getValue();
			cb.valen[2] = (Integer) aux_valen1C.getValue();
			cb.valen[3] = (Integer) aux_valen1D.getValue();
			cb.valen[4] = (Integer) aux_valen1E.getValue();
			cb.valen[5] = (Integer) aux_valen1F.getValue();
			cb.valen[6] = (Integer) aux_valen1GH.getValue();
			cb.valen[7] = (Integer) aux_valen2A.getValue();
			cb.valen[8] = (Integer) aux_valen2BC.getValue();
			cb.valen[9] = (Integer) aux_valen2DE.getValue();
			cb.valen[10] = (Integer) aux_valen2FG.getValue();
			cb.valen[11] = (Integer) aux_valen3AB.getValue();
			cb.valen[12] = (Integer) aux_valen4A.getValue();
			cb.valen[13] = (Integer) aux_valen4B.getValue();
			cb.valen[14] = (Integer) aux_valen4CDE.getValue();
			cb.valen[15] = (Integer) aux_valen5ABC.getValue();
			cb.valen[16] = (Integer) aux_valen5D.getValue();
			cb.valen[17] = (Integer) aux_valen5EF.getValue();
			
			cb.valen[18] = (Integer) aso_valen1A.getValue();
			cb.valen[19] = (Integer) aso_valen1B.getValue();
			cb.valen[20] = (Integer) aso_valen1C.getValue();
			cb.valen[21] = (Integer) aso_valen1D.getValue();
			cb.valen[22] = (Integer) aso_valen1E.getValue();
			cb.valen[23] = (Integer) aso_valen1F.getValue();
			cb.valen[24] = (Integer) aso_valen1GH.getValue();
			cb.valen[25] = (Integer) aso_valen2A.getValue();
			cb.valen[26] = (Integer) aso_valen2BC.getValue();
			cb.valen[27] = (Integer) aso_valen2DE.getValue();
			cb.valen[28] = (Integer) aso_valen2FG.getValue();
			cb.valen[29] = (Integer) aso_valen3AB.getValue();
			cb.valen[30] = (Integer) aso_valen4A.getValue();
			cb.valen[31] = (Integer) aso_valen4B.getValue();
			cb.valen[32] = (Integer) aso_valen4CDE.getValue();
			cb.valen[33] = (Integer) aso_valen5ABC.getValue();
			cb.valen[34] = (Integer) aso_valen5D.getValue();
			cb.valen[35] = (Integer) aso_valen5EF.getValue();
			
			cb.valen[36] = (Integer) cat_valen1A.getValue();
			cb.valen[37] = (Integer) cat_valen1B.getValue();
			cb.valen[38] = (Integer) cat_valen1C.getValue();
			cb.valen[39] = (Integer) cat_valen1D.getValue();
			cb.valen[40] = (Integer) cat_valen1E.getValue();
			cb.valen[41] = (Integer) cat_valen1F.getValue();
			cb.valen[42] = (Integer) cat_valen1GH.getValue();
			cb.valen[43] = (Integer) cat_valen2A.getValue();
			cb.valen[44] = (Integer) cat_valen2BC.getValue();
			cb.valen[45] = (Integer) cat_valen2DE.getValue();
			cb.valen[46] = (Integer) cat_valen2FG.getValue();
			cb.valen[47] = (Integer) cat_valen3AB.getValue();
			cb.valen[48] = (Integer) cat_valen4A.getValue();
			cb.valen[49] = (Integer) cat_valen4B.getValue();
			cb.valen[50] = (Integer) cat_valen4CDE.getValue();
			cb.valen[51] = (Integer) cat_valen5ABC.getValue();
			cb.valen[52] = (Integer) cat_valen5D.getValue();
			cb.valen[53] = (Integer) cat_valen5EF.getValue();
			
	    	ValenciasRango vr = null;
	    	vr.setValen(cb.valenDouble());
	    	vr = new ValenciasRango(3);
	    	vr = new ValenciasRango(2);
	    	vr = new ValenciasRango(1);
	    	
	    	System.out.println("Valencia: "+vr.valen1A);
	    }
    
    public double[] defValues(){ // Default values
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

        return valen;
    }
	
	
	
//	// Config table
//		@FXML private TableView<tableColum> tv;
//		@FXML private TableColumn<tableColum, String> Id;
//		@FXML private TableColumn<tableColum, String> Profesor;
//		@FXML private TableColumn<tableColum, String> Modalidad;
//		@FXML private TableColumn<tableColum, String> Termino;
	
	
	

            
    
	
	
	
	
//	 public void bruh() {
//
//		    TableView tableView = new TableView();
//
//		    TableColumn<tableColum, String> column1 = new TableColumn<tableColum, String>("First Name");
//		    column1.setCellValueFactory(new PropertyValueFactory<tableColum,String>("firstName"));
//		    
//		    TableColumn<tableColum, String> column2 = new TableColumn<tableColum, String>("First Name");
//		    column1.setCellValueFactory(new PropertyValueFactory<tableColum,String>("firstName"));
//		    
//		    
//		    TableColumn<tableColum, String> column3 = new TableColumn<tableColum, String>("First Name");
//		    column1.setCellValueFactory(new PropertyValueFactory<tableColum,String>("firstName"));
//
//		    TableColumn<tableColum, String> column4 = new TableColumn<tableColum, String>("Last Name");
//		    column2.setCellValueFactory(new PropertyValueFactory<tableColum,String>("lastName"));
//
//
//		    tableView.getColumns().add(column1);
//		    tableView.getColumns().add(column2);
//		    tableView.getColumns().add(column3);
//		    tableView.getColumns().add(column4);
//
//		    tableView.getItems().add(new tableColum("John", "Doe", "ffe", "fef"));
//		    tableView.getItems().add(new tableColum("Jane", "Deer", "fefe", "fef"));
//
//		   
//		  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//@FXML public void set() { // For initializing lists of things
//        
//	 
//}
	
	
	
	public ObservableList<tableColum> SetEval() { // Create observable list
		ObservableList<tableColum> eval = FXCollections.observableArrayList();
		System.out.print("set eval");
		Load();
		for(int i = 0; i <size ;i++) {

			fileManager continuar = new fileManager();
			ag = continuar.combobox(User,i);

			System.out.println("Numero de evaluacion: "+ag[12]+" \tProfesor evaluado: "+ag[1]+" \tModalidad: "+ag[13]+ " \tPeriodo: "+ag[6]);
			
			if(ag[1] != null) {
				
				
				    eval.add(new tableColum(ag[12], ag[1],ag[13],ag[6]));
				 
				    
			}

		}	
		
	   
	    
	    return eval;

}
//	
//	private JComboBox comboBox = new JComboBox();
//	private JComboBox comboBox_1 = new JComboBox();
//	private JComboBox comboBox_3 = new JComboBox();
//	private JComboBox comboBox_3_1 = new JComboBox();
//	private JComboBox comboBox_4 = new JComboBox();
//	private JComboBox comboBox_4_1 = new JComboBox();
//	private JComboBox comboBox_5 = new JComboBox();
//	private JComboBox comboBox_6 = new JComboBox();
//	private JComboBox comboBox_7 = new JComboBox();
//	private JComboBox comboBox_9 = new JComboBox();
//	private JComboBox comboBox_10 = new JComboBox();
//	private JComboBox comboBox_5_1 = new JComboBox();
//	private JComboBox comboBox_5_2 = new JComboBox();
//	private JComboBox comboBox_5_3 = new JComboBox();
//	private JComboBox comboBox_5_4 = new JComboBox();
//	private JComboBox comboBox_5_5 = new JComboBox();
//	private JComboBox comboBox_5_1_1 = new JComboBox();
//	private JComboBox comboBox_5_1_2 = new JComboBox();
//	private JComboBox comboBox_5_1_3 = new JComboBox();
//	private JComboBox comboBox_5_1_4 = new JComboBox();
//
//	private JComboBox comboBox_8 = new JComboBox();
//	private JComboBox comboBox_12 = new JComboBox();
//	private JComboBox comboBox_13 = new JComboBox();
//	private JComboBox comboBox_14 = new JComboBox();
//	private JComboBox comboBox_15 = new JComboBox();
//	private JComboBox comboBox_16 = new JComboBox();
//	private JComboBox comboBox_17 = new JComboBox();
//	private JComboBox comboBox_18 = new JComboBox();
//	private JComboBox comboBox_19 = new JComboBox();
//	private JComboBox comboBox_20 = new JComboBox();
//	private JComboBox comboBox_21 = new JComboBox();
//	private JComboBox comboBox_22 = new JComboBox();
//	private JComboBox comboBox_23 = new JComboBox();
//	private JComboBox comboBox_24 = new JComboBox();
//	private JComboBox combobox25 = new JComboBox();
//	private JComboBox combobox25_2 = new JComboBox();
//	private JComboBox comboBox_26 = new JComboBox();
//	private JComboBox comboBox_27 = new JComboBox();
//	private JComboBox comboBox_28 = new JComboBox();
//	private JComboBox comboBox_29 = new JComboBox();
//	private JComboBox comboBox_30 = new JComboBox();
//
//
//	private JTextField ins2_4_a_textField;
//	private JTextField ins2_a_textField;
//	private JTextField ins2_b_textField;
//	private JTextField ins2_c_textField;
//	private JTextField ins2_d_textField;
//	private JTextField ins2_e_textField;
//	private JTextField ins2_f_textField;
//	private JTextField ins2_gh_textField;
//	private JTextField ins2_1_ab_textField;
//	private JTextField ins2_1_cd_textField;
//	private JTextField ins2_1_ef_textField;
//	private JTextField ins2_3_ab_textField;
//	private JTextField ins2_4_b_textField;
//	private JTextField ins2_4_cde_textField;
//	private JTextField ins2_5_abc_textField;
//	private JTextField ins2_5_b_textField;
//	private JTextField ins2_5_ef_textField;
//	private JTextField textField;
//
//
//	private JTextPane textPane_1 = new JTextPane();
//	private JTextPane textPane_1_1_1 = new JTextPane();
//	private JTextPane textPane_1_1 = new JTextPane();
//	private JTextPane textPane = new JTextPane();
//	private JTextPane textPane_2_1 = new JTextPane();
//	private JTextPane textPane_2 = new JTextPane();
//	private JTextPane textPane_1_2 = new JTextPane();
//	private JTextPane textPane_1_3 = new JTextPane();
//	private JTextPane textPane_1_4 = new JTextPane();
//	private JTextPane textPane_1_5 = new JTextPane();
//	private JTextPane textPane_1_6 = new JTextPane();
//	private JTextPane textPane_1_2_1 = new JTextPane();
//	private JTextPane textPane_1_2_2 = new JTextPane();
//	private JTextPane textPane_1_2_3 = new JTextPane();
//	private JTextPane textPane_1_2_4 = new JTextPane();
//	private JTextPane textPane_1_2_5 = new JTextPane();
//	private JTextPane textPane_1_2_1_1 = new JTextPane();
//	private JTextPane textPane_1_2_1_2 = new JTextPane();
//	private JTextPane textPane_1_2_1_3 = new JTextPane();
//	private JTextPane textPane_1_2_1_3_1 = new JTextPane();
//
//	private JTextPane textPane_1_7_4 = new JTextPane();
//	private JTextPane textPane_1_7_1_2 = new JTextPane();
//	private JTextPane textPane_1_7_1_1_1 = new JTextPane();
//	private JTextPane textPane_1_7_4_1 = new JTextPane();
//	private JTextPane textPane_1_7_4_2 = new JTextPane();
//	private JTextPane textPane_1_7_4_3 = new JTextPane();
//	private JTextPane textPane_1_7_3 = new JTextPane();
//	private JTextPane textPane_1_7_3_1 = new JTextPane();
//	private JTextPane textPane_1_7_3_1_1 = new JTextPane();
//	private JTextPane textPane_1_7_3_2 = new JTextPane();
//	private JTextPane textPane_1_7_3_2_1 = new JTextPane();
//	private JTextPane textPane_1_7_3_2_1_1 = new JTextPane();
//	private JTextPane textPane_1_7_3_3 = new JTextPane();
//	private JTextPane textPane_1_7_3_3_1 = new JTextPane();
//	private JTextPane textPane_1_7_3_3_2 = new JTextPane();
//	private JTextPane textPane_1_7_3_3_2_1 = new JTextPane();
//	private JTextPane textPane_1_7_3_3_2_1_1 = new JTextPane();
//	private JTextPane textPane_1_7_3_3_2_2 = new JTextPane();
//	private JTextPane textPane_1_7_3_3_2_2_1 = new JTextPane();
//	private JTextPane textPane_1_7_3_3_2_2_1_1 = new JTextPane();
//	private JTextPane textPane_1_7_3_3_2_3 = new JTextPane();
//	private JTextPane textPane_1_7_3_3_2_3_1 = new JTextPane();
//	private JTextPane textPane_1_7_3_3_2_3_1_1 = new JTextPane();
//
//	private JSpinner spinner = new JSpinner();
//	private JSpinner spinner_1 = new JSpinner();
//	private JSpinner spinner_2 = new JSpinner();
//	private JSpinner spinner_3 = new JSpinner();
//	private JSpinner spinner_4 = new JSpinner();
//	private JSpinner spinner_5 = new JSpinner();
//	private JSpinner spinner_5_1 = new JSpinner();
//	private JSpinner spinner_6 = new JSpinner();
//	private JSpinner spinner_1_1 = new JSpinner();
//	private JSpinner spinner_3_1 = new JSpinner();
//	private JSpinner spinner_5_2 = new JSpinner();
//	private JSpinner spinner_6_1 = new JSpinner();
//	private JSpinner spinner_6_2 = new JSpinner();
//	private JSpinner spinner_1_1_1 = new JSpinner();
//	private JSpinner spinner_3_1_1 = new JSpinner();
//	private JSpinner spinner_1_1_1_1 = new JSpinner();
//	private JSpinner spinner_3_1_1_1 = new JSpinner();
//	private JSpinner spinner_3_1_1_1_1 = new JSpinner();
//
//	private JTextArea textArea = new JTextArea();
//	private JTextArea textArea_1 = new JTextArea();
//	private JTextArea textArea_2 = new JTextArea();
//	private JTextArea textArea_3 = new JTextArea();
//	private JTextArea textArea_4 = new JTextArea();
//	private JTextArea textArea_5 = new JTextArea();
//	private JTextArea textArea_6 = new JTextArea();
//	private JTextArea textArea_8 = new JTextArea();
//	private JTextArea textArea_1_1 = new JTextArea();
//	private JTextArea textArea_3_1 = new JTextArea();
//	private JTextArea textArea_5_1 = new JTextArea();
//	private JTextArea textArea_8_1 = new JTextArea();
//	private JTextArea textArea_8_2 = new JTextArea();
//	private JTextArea textArea_1_1_1 = new JTextArea();
//	private JTextArea textArea_8_2_1 = new JTextArea();
//	private JTextArea textArea_8_2_1_1 = new JTextArea();
//	private JTextArea textArea_8_2_1_1_1 = new JTextArea();
//	private JTextField parte1_perfil_de_estudiante_1;
//	private JTextField parte1_perfil_de_estudiante_2;
//	private JTextField parte2_estudi_3;
//	private JTextField parte2_estudi_4;
//	private JTextField parte3_estudi_5_;
//	private JTextField parte3_estudi_6;
//	private JTextField parte3_estudi_7;
//	private JTextField parte3_estudi_8;
//	private JTextField parte3_estudi_9;
//	private JTextField parte3_estudi_10;
//	private JTextField parte3_estudi_11;
//	private JTextField parte3_estudi_12;
//	private JTextField parte3_desarollo_de_clase_13;
//	private JTextField parte3_desarollo_de_clase_14;
//	private JTextField parte3_desarollo_de_clase_15;
//	private JTextField parte3_desarollo_de_clase_16;
//	private JTextField parte3_desarollo_de_clase_17;
//	private JTextField parte5_gerencia_18;
//	private JTextField parte5_gerencia_19;
//	private JTextField parte5_gerencia_20;
//	private JTextField parte5_gerencia_21;
//	private JTextField parte5_gerencia_22;
//	private JTextField parte5_gerencia_23;
//	private JTextField parte5_gerencia_24;
//	private JTextField parte5_gerencia_25;
//	private JTextField parte5_gerencia_26;
//	private JTextField parte5_gerencia_27;
//	private JTextField parte5_gerencia_28;
//	private JTextField parte5_gerencia_29;
//	private JTextField textField_15;
//	private JCheckBox chckbxNewCheckBox;
//	private JCheckBox chckbxNewCheckBox_1;
//	private JCheckBox chckbxNewCheckBox_2;
//	private JCheckBox chckbxNewCheckBox_3;

	
	
	
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
	
	
	
	
	
	

	//Testing
//	public Evaluation() throws IOException {
//
//		for (int i = 0 ; i < I2re.length; i++) {
//			I2re[i]= 0;
//		}



		//////////////////////////////////// Info a ingresar ////////////////////////////////////////////
	
//
//		Unidadacademica_textField = new JTextField(); 
//	
//
//		nombre_prof_textField = new JTextField();
//
//
//		departamento_textField = new JTextField();
//	
//
//		disiplina_textField = new JTextField();
//		
//
//		periodo_evaluado_textField = new JTextField();
//		
//
//
//		
//		contrato_comboBox = new JComboBox();
//
//
//		
//
//		codigo_textField = new JTextField();
//	
//
//		
//
//		tutulo_del_curso_textField = new JTextField();
//		
//
//		JSeparator separator = new JSeparator();
//		separator.setBounds(779, 144, 0, 12);
//		panel.add(separator);
//
//		
//
//	
//		
//		
//		
//		/////////////////////////////// INSTRUMENTO I ///////////////////////////////////////////
//
//		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
//		tabbedPane.addTab("Instrumento I", null, tabbedPane_2, null);
//
//		/////////////////////////////// INSTRUMENTO I  PART 1 ///////////////////////////////////////////
//
//		
//		parte1_perfil_de_estudiante_1 = new JTextField();
//		
//
//		parte1_perfil_de_estudiante_2 = new JTextField();
//		
//
//
//		
//
//		parte2_estudi_3 = new JTextField();
//		
//
//		parte2_estudi_4 = new JTextField();
//		
//
//		
//		parte3_estudi_5_ = new JTextField();
//		
//
//		parte3_estudi_6 = new JTextField();
//	
//
//		parte3_estudi_7 = new JTextField();
//		
//
//		parte3_estudi_8 = new JTextField();
//	
//
//		parte3_estudi_9 = new JTextField();
//		
//
//		parte3_estudi_10 = new JTextField();
//	
//
//		parte3_estudi_11 = new JTextField();
//		
//
//		parte3_estudi_12 = new JTextField();
//		
//
//
//		
//
//		parte3_desarollo_de_clase_13 = new JTextField();
//		
//
//		parte3_desarollo_de_clase_14 = new JTextField();
//		
//
//		parte3_desarollo_de_clase_15 = new JTextField();
//		
//
//		parte3_desarollo_de_clase_16 = new JTextField();
//		
//
//		parte3_desarollo_de_clase_17 = new JTextField();
//		
//
//		
//
//		parte5_gerencia_18 = new JTextField();
//	
//
//		parte5_gerencia_19 = new JTextField();
//	
//
//		parte5_gerencia_20 = new JTextField();
//		
//
//		parte5_gerencia_21 = new JTextField();
//		
//
//		parte5_gerencia_22 = new JTextField();
//		
//
//		parte5_gerencia_23 = new JTextField();
//	
//
//		parte5_gerencia_24 = new JTextField();
//		
//
//		parte5_gerencia_25 = new JTextField();
//
//
//		parte5_gerencia_26 = new JTextField();
//		
//
//		parte5_gerencia_27 = new JTextField();
//	
//
//		
//
//		parte5_gerencia_28 = new JTextField();
//		
//
//		parte5_gerencia_29 = new JTextField();
//		
//
//		
//
//		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
//		tabbedPane.addTab("Instrumento II", null, tabbedPane_1, null);
//
//		//EVIDENCIA////
//
//		textField_15 = new JTextField();
//		
//		JButton btnNewButton = new JButton("Calcular");
//		
//		
//
//		///////////////////////////// instrumento 2 ////////////////////////////
//
//		
//
//		ins2_a_textField = new JTextField(" ");
//		
//
//		ins2_b_textField = new JTextField(" ");
//	
//
//		ins2_c_textField = new JTextField(" ");
//	
//
//		ins2_d_textField = new JTextField(" ");
//		
//
//		ins2_e_textField = new JTextField(" ");
//	
//
//		ins2_f_textField = new JTextField(" ");
//	
//
//		ins2_gh_textField = new JTextField(" ");
//		
//
//		
//
//		ins2_1_ab_textField = new JTextField(" ");
//		
//		ins2_1_cd_textField = new JTextField(" ");
//
//
//		ins2_1_ef_textField = new JTextField(" ");
//	
//
//		
//
//		textField = new JTextField(" ");
//	
//
//		
//
//		ins2_3_ab_textField = new JTextField(" ");
//
//
//		
//
//		ins2_5_abc_textField = new JTextField(" ");
//		
//
//		ins2_5_b_textField = new JTextField(" ");
//	
//
//		ins2_5_ef_textField = new JTextField(" ");
//	
//
//		
//
//		ins2_4_a_textField = new JTextField(" ");
//	
//
//		ins2_4_b_textField = new JTextField(" ");
//	
//
//		ins2_4_cde_textField = new JTextField(" ");
//	

		

		///////Instrumento 2////////////////////
		

		
		////////////////////////////Menu bar//////////////////////////////////////////////////
		


		

//		fileMenu.add(eMenuItem1);
//		menuBar.add(fileMenu);
//
//		JMenuItem eMenuItem1_1 = new JMenuItem("Continuar Luego");//// item 2
//		eMenuItem1_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {/// action listener 
//
//				int valueID;
//				int value ;
//				int j = 0;
//				int IDEInt = 0;
//				String[] ops;
//				File instru;
//				int size = 0;
//				Boolean type = false;
//				Boolean IN = false;
//				String[] ag = new String[162];
//				ContinuarEvaluacion IDE = new ContinuarEvaluacion();
//				fileManager borrar = new fileManager();
//				MainMenu typeM = new MainMenu();
//				type = typeM.getContinuar(); 
//
//				if(type == true) {
//					IDEInt = Integer.valueOf(IDE.getIDEBox());
//
//					try {
//						borrar.borrarEV3(IDEInt);
//					} catch (IOException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
//				}
//				fileManager IDgen = new fileManager();
//				ag = IDgen.IDGen();
//
//				//Informacion a ingresar
//				System.out.println("woooooooooooooooooooow ");
//				System.out.println(ag[12]);
//				//				for (int i = 0; i < ag.length; i++) {
//				//					System.out.println("Test " + i + ": " +ag[i]);
//				//				}
//
//				values [0] = Unidadacademica_textField.getText();
//				values [1] = nombre_prof_textField.getText();
//				values [2] = rangoAcademico_comboBox.getSelectedItem().toString();
//				values [3] = departamento_textField.getText();
//				values [4] = disiplina_textField.getText();
//				values [5] = objetivo_eval_comboBox.getSelectedItem().toString();
//				values [6] = periodo_evaluado_textField.getText();
//				values [7] = jornada_comple_comboBox.getSelectedItem().toString();
//				values [8] = jornada_parcial_comboBox.getSelectedItem().toString();
//				values [9] = contrato_comboBox.getSelectedItem().toString();
//				values [10] = codigo_textField.getText();
//				values [11] = tutulo_del_curso_textField.getText();
//
//				try {
//					instru = new File("./instrumentos.csv");
//					Scanner scanner = new Scanner(instru);
//
//					while(scanner.hasNextLine()) {
//						String data = scanner.nextLine();
//						ops = data.split(",", 170);
//						size++;
//
//					}
//					scanner.close();
//
//
//				}catch(Exception ex) {
//
//					System.out.print("404 "+ ex);
//				}
//
//				do 
//				{
//					IN = false;
//					j++;
//					for (int i = 1 ;i < size ;i++ ){
//
//						System.out.println(" esta es la J y AG "+j+" " + ag[i]);
//						if (Integer.valueOf(ag[i]).equals(j)){
//
//
//							IN = true;
//
//						}
//
//					}
//				}while(IN == true ) ;
//
//
//
//				values [12] =  String.valueOf(j);
//
//
//				values [13] = "Manual";
//
//
//
//				values [14] = parte1_perfil_de_estudiante_1.getText();
//				values [15] = parte1_perfil_de_estudiante_2.getText();
//				values [16] = parte2_estudi_3.getText();
//				values [17] = parte2_estudi_4.getText();
//				values [18] = parte3_estudi_5_.getText();
//				values [19] = parte3_estudi_6.getText();
//				values [20] = parte3_estudi_7.getText();
//				values [21] = parte3_estudi_8.getText();
//				values [22] = parte3_estudi_9.getText();
//				values [23] = parte3_estudi_10.getText();
//				values [24] = parte3_estudi_11.getText();
//				values [25] = parte3_estudi_12.getText();
//				values [26] = parte3_desarollo_de_clase_13.getText();
//				values [27] = parte3_desarollo_de_clase_14.getText();
//				values [28] = parte3_desarollo_de_clase_15.getText();
//				values [29] = parte3_desarollo_de_clase_16.getText();
//				values [30] = parte3_desarollo_de_clase_17.getText();
//				values [31] = parte5_gerencia_18.getText();
//				values [32] = parte5_gerencia_19.getText();
//				values [33] = parte5_gerencia_20.getText();
//				values [34] = parte5_gerencia_21.getText();
//				values [35] = parte5_gerencia_22.getText();
//				values [36] = parte5_gerencia_23.getText();
//				values [37] = parte5_gerencia_24.getText();
//				values [38] = parte5_gerencia_25.getText();
//				values [39] = parte5_gerencia_26.getText();
//				values [40] = parte5_gerencia_27.getText();
//				values [41] = parte5_gerencia_28.getText();
//				values [42] = parte5_gerencia_29.getText();
//
//
//
//				values [43] = spinner.getValue().toString();
//				values [44] = spinner_1.getValue().toString();
//				values [45] = spinner_2.getValue().toString();
//				values [46] = spinner_3.getValue().toString();
//				values [47] = spinner_4.getValue().toString();
//				values [48] = spinner_5.getValue().toString();
//				values [49] = spinner_5_1.getValue().toString();
//				values [50] = spinner_6.getValue().toString();
//				values [51] = spinner_1_1.getValue().toString();
//				values [52] = spinner_3_1.getValue().toString();
//				values [53] = spinner_5_2.getValue().toString();
//				values [54] = spinner_6_1.getValue().toString();
//				values [55] = spinner_6_2.getValue().toString();
//				values [56] = spinner_1_1_1.getValue().toString();
//				values [57] = spinner_3_1_1.getValue().toString();
//				values [58] = spinner_1_1_1_1.getValue().toString();
//				values [59] = spinner_3_1_1_1.getValue().toString();
//				values [60] = spinner_3_1_1_1_1.getValue().toString();
//
//
//
//
//
//				////////////////////////////NEW VALUES ///////////////////////////////
//				if (comboBox.getSelectedItem().toString() == " ") {
//
//					values [61] = "0";
//
//				} else {
//
//					values [61] = comboBox.getSelectedItem().toString();
//
//				}	
//				if (comboBox_1.getSelectedItem().toString() == " ") {
//
//					values [62] = "0";
//
//				} else {
//
//					values [62] = comboBox_1.getSelectedItem().toString();
//
//				}
//				if (comboBox_3.getSelectedItem().toString() == " ") {
//
//					values [63] = "0";
//
//				} else {
//
//					values [63] = comboBox_3.getSelectedItem().toString();
//
//				}
//				if (comboBox_3_1.getSelectedItem().toString() == " ") {
//
//					values [64] = "0";
//
//				} else {
//
//					values [64] = comboBox_3_1.getSelectedItem().toString();
//
//				}
//				if (comboBox_4.getSelectedItem().toString() == " ") {
//
//					values [65] = "0";
//
//				} else {
//
//					values [65] = comboBox_4.getSelectedItem().toString();
//
//				}
//				if (comboBox_4_1.getSelectedItem().toString() == " ") {
//
//					values [66] = "0";
//
//				} else {
//
//					values [66] = comboBox_4_1.getSelectedItem().toString();
//
//				}
//				if (comboBox_5.getSelectedItem().toString() == " ") {
//
//					values [67] = "0";
//
//				} else {
//
//					values [67] = comboBox_5.getSelectedItem().toString();
//
//				}
//				if (comboBox_6.getSelectedItem().toString() == " ") {
//
//					values [68] = "0";
//
//				} else {
//
//					values [68] = comboBox_6.getSelectedItem().toString();
//
//				}
//				if (comboBox_7.getSelectedItem().toString() == " ") {
//
//					values [69] = "0";
//
//				} else {
//
//					values [69] = comboBox_7.getSelectedItem().toString();
//
//				}
//				if (comboBox_9.getSelectedItem().toString() == " ") {
//
//					values [70] = "0";
//
//				} else {
//
//					values [70] = comboBox_9.getSelectedItem().toString();
//
//				}
//				if (comboBox_10.getSelectedItem().toString() == " ") {
//
//					values [71] = "0";
//
//				} else {
//
//					values [71] = comboBox_10.getSelectedItem().toString();
//
//				}
//				if (comboBox_5_1.getSelectedItem().toString() == " ") {
//
//					values [72] = "0";
//
//				} else {
//
//					values [72] = comboBox_5_1.getSelectedItem().toString();
//
//				}
//				if (comboBox_5_2.getSelectedItem().toString() == " ") {
//
//					values [73] = "0";
//
//				} else {
//
//					values [73] = comboBox_5_2.getSelectedItem().toString();
//
//				}
//				if (comboBox_5_3.getSelectedItem().toString() == " ") {
//
//					values [74] = "0";
//
//				} else {
//
//					values [74] = comboBox_5_3.getSelectedItem().toString();
//
//				}
//				if (comboBox_5_4.getSelectedItem().toString() == " ") {
//
//					values [75] = "0";
//
//				} else {
//
//					values [75] = comboBox_5_4.getSelectedItem().toString();
//
//				}
//				if (comboBox_5_5.getSelectedItem().toString() == " ") {
//
//					values [76] = "0";
//
//				} else {
//
//					values [76] = comboBox_5_5.getSelectedItem().toString();
//
//				}
//				if (comboBox_5_1_1.getSelectedItem().toString() == " ") {
//
//					values [77] = "0";
//
//				} else {
//
//					values [77] = comboBox_5_1_1.getSelectedItem().toString();
//
//				}
//				if (comboBox_5_1_2.getSelectedItem().toString() == " ") {
//
//					values [78] = "0";
//
//				} else {
//
//					values [78] = comboBox_5_1_2.getSelectedItem().toString();
//
//				}
//				if (comboBox_5_1_3.getSelectedItem().toString() == " ") {
//
//					values [79] = "0";
//
//				} else {
//
//					values [79] = comboBox_5_1_3.getSelectedItem().toString();
//
//				}
//				if (comboBox_5_1_4.getSelectedItem().toString() == " ") {
//
//					values [80] = "0";
//
//				} else {
//
//					values [80] = comboBox_5_1_4.getSelectedItem().toString();
//
//				}
//
//				if (comboBox_8.getSelectedItem().toString() == " ") {
//
//					values [81] = "0";
//
//				} else {
//
//					values [81] = comboBox_8.getSelectedItem().toString();
//
//				}	
//				if (comboBox_12.getSelectedItem().toString() == " ") {
//
//					values [82] = "0";
//
//				} else {
//
//					values [82] = comboBox_12.getSelectedItem().toString();
//
//				}
//				if (comboBox_13.getSelectedItem().toString() == " ") {
//
//					values [83] = "0";
//
//				} else {
//
//					values [83] = comboBox_13.getSelectedItem().toString();
//
//				}
//				if (comboBox_14.getSelectedItem().toString() == " ") {
//
//					values [84] = "0";
//
//				} else {
//
//					values [84] = comboBox_14.getSelectedItem().toString();
//
//				}
//				if (comboBox_15.getSelectedItem().toString() == " ") {
//
//					values [85] = "0";
//
//				} else {
//
//					values [85] = comboBox_15.getSelectedItem().toString();
//
//				}
//				if (comboBox_16.getSelectedItem().toString() == " ") {
//
//					values [86] = "0";
//
//				} else {
//
//					values [86] = comboBox_16.getSelectedItem().toString();
//
//				}
//				if (comboBox_17.getSelectedItem().toString() == " ") {
//
//					values [87] = "0";
//
//				} else {
//
//					values [87] = comboBox_17.getSelectedItem().toString();
//
//				}
//				if (comboBox_18.getSelectedItem().toString() == " ") {
//
//					values [88] = "0";
//
//				} else {
//
//					values [88] = comboBox_18.getSelectedItem().toString();
//
//				}
//				if (comboBox_19.getSelectedItem().toString() == " ") {
//
//					values [89] = "0";
//
//				} else {
//
//					values [89] = comboBox_19.getSelectedItem().toString();
//
//				}
//				if (comboBox_20.getSelectedItem().toString() == " ") {
//
//					values [90] = "0";
//
//				} else {
//
//					values [90] = comboBox_20.getSelectedItem().toString();
//
//				}
//				if (comboBox_21.getSelectedItem().toString() == " ") {
//
//					values [91] = "0";
//
//				} else {
//
//					values [91] = comboBox_21.getSelectedItem().toString();
//
//				}
//				if (comboBox_22.getSelectedItem().toString() == " ") {
//
//					values [92] = "0";
//
//				} else {
//
//					values [92] = comboBox_22.getSelectedItem().toString();
//
//				}
//				if (comboBox_23.getSelectedItem().toString() == " ") {
//
//					values [93] = "0";
//
//				} else {
//
//					values [93] = comboBox_23.getSelectedItem().toString();
//
//				}
//				if (comboBox_24.getSelectedItem().toString() == " ") {
//
//					values [94] = "0";
//
//				} else {
//
//					values [94] = comboBox_24.getSelectedItem().toString();
//
//				}
//				if (combobox25.getSelectedItem().toString() == " ") {
//
//					values [95] = "0";
//
//				} else {
//
//					values [95] = combobox25.getSelectedItem().toString();
//
//				}
//				if (comboBox_26.getSelectedItem().toString() == " ") {
//
//					values [96] = "0";
//
//				} else {
//
//					values [96] = comboBox_26.getSelectedItem().toString();
//
//				}
//				if (comboBox_27.getSelectedItem().toString() == " ") {
//
//					values [97] = "0";
//
//				} else {
//
//					values [97] = comboBox_27.getSelectedItem().toString();
//
//				}
//				if (comboBox_28.getSelectedItem().toString() == " ") {
//
//					values [98] = "0";
//
//				} else {
//
//					values [98] = comboBox_28.getSelectedItem().toString();
//
//				}
//				if (comboBox_29.getSelectedItem().toString() == " ") {
//
//					values [99] = "0";
//
//				} else {
//
//					values [99] = comboBox_29.getSelectedItem().toString();
//
//				}
//				if (comboBox_30.getSelectedItem().toString() == " ") {
//
//					values [100] = "0";
//
//				} else {
//
//					values [100] = comboBox_30.getSelectedItem().toString();
//
//				}
//
//				values [101] = textPane_1.getText();
//				values [102] = textPane_1_1_1.getText();
//				values [103] = textPane_1_1.getText();
//				values [104] = textPane.getText();
//				values [105] = textPane_2_1.getText();
//				values [106] = textPane_2.getText();
//				values [107] = textPane_1_2.getText();
//				values [108] = textPane_1_3.getText();
//				values [109] = textPane_1_4.getText();
//				values [110] = textPane_1_5.getText();
//				values [111] = textPane_1_6.getText();
//				values [112] = textPane_1_2_1.getText();
//				values [113] = textPane_1_2_2.getText();
//				values [114] = textPane_1_2_3.getText();
//				values [115] = textPane_1_2_4.getText();
//				values [116] = textPane_1_2_5.getText();
//				values [117] = textPane_1_2_1_1.getText();
//				values [118] = textPane_1_2_1_2.getText();
//				values [119] = textPane_1_2_1_3.getText();
//				values [120] = textPane_1_2_1_3_1.getText();
//
//
//				 
//
//
//				values [144] = textArea.getText();
//				values [145] = textArea_1.getText();
//				values [146] = textArea_2.getText();
//				values [147] = textArea_3.getText();
//				values [148] = textArea_4.getText();
//				values [149] = textArea_5.getText();
//				values [150] = textArea_6.getText();
//				values [151] = textArea_8.getText();
//				values [152] = textArea_1_1.getText();
//				values [153] = textArea_3_1.getText();
//				values [154] = textArea_5_1.getText();
//				values [155] = textArea_8_1.getText();
//				values [156] = textArea_8_2.getText();
//				values [157] = textArea_1_1_1.getText();
//				values [158] = textField_15.getText();
//				values [159] = textArea_8_2_1.getText();
//				values [160] = textArea_8_2_1_1.getText();
//				values [161] = textArea_8_2_1_1_1.getText();
//
//
//				if(rangoAcademico_comboBox.getSelectedItem()== "Rango Catedratico") 
//				{
//					Results1 w = null;
//					try {
//						w = new Results1();
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					w.setVisible(true);
//
//				}
//				if(rangoAcademico_comboBox.getSelectedItem()== "Rango Catedratico Asociado")  { 
//
//					Results2 w = null;
//					try {
//						w = new Results2();
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					w.setVisible(true);
//				}
//
//				if(rangoAcademico_comboBox.getSelectedItem()== "Rango Catedratico Asociado"){
//					Results3 w = null;
//					try {
//						w = new Results3();
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					w.setVisible(true);
//				}
//
//
//
//
//
//
//				/////////////////TESTING//////////////////////////////
//				for (int i = 0; i < values.length; i++) {
//					System.out.println("Test " + i + ": " +values[i]);
//				}
//				/////////////////////////////////////////////////////////
//
//				Login_backend user = new Login_backend();
//
//				String ID = user.getID();
//				System.out.print("\n"+ID+" hooooooolaaaaaa\n");
//				File guardar;
//
//				try {
//					guardar = new File("./instrumentos.csv");
//					FileWriter fw = new FileWriter("./instrumentos.csv",true);
//					BufferedWriter bw = new BufferedWriter(fw);
//					PrintWriter pw = new PrintWriter(bw);
//
//					pw.print("FALSE"+","+"FALSE"+","+ID+",");
//
//					for(int i = 0 ; i < values.length ;i++) {
//						pw.print(values[i]+",");	
//					}
//					pw.println(" ");
//					pw.flush();
//					pw.close();
//
//
//				}catch(Exception ex) {
//
//					System.out.print("404 "+ ex);
//				}
//
//
//
//
//			}
//
//
//		});
//		eMenuItem1_1.setMnemonic(KeyEvent.VK_E);
//		fileMenu.add(eMenuItem1_1);
//
//		setJMenuBar(menuBar);
//
//
//
//		//////////////////////////////Menu bar finish//////////////////////////////////////////////////
//
//		/////////////////////////////////////BOTON GUARDAR /////////////////////////////////////
//
//		JTabbedPane tabbedPane_5 = new JTabbedPane(JTabbedPane.TOP);
//		tabbedPane.addTab("Instrumento IV", null, tabbedPane_5, null);
//
//
//
//		chckbxNewCheckBox = new JCheckBox("Instrumento 1");
//		chckbxNewCheckBox.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//
//
//
//			}
//		});
//	
//
//		JLabel lblNewLabel_50 = new JLabel("Terminado:");
//		lblNewLabel_50.setFont(new Font("Tahoma", Font.BOLD, 14));
//		lblNewLabel_50.setBounds(1218, 1, 91, 14);
//		contentPane.add(lblNewLabel_50);
//
//
//
//		JButton btnNewButton8 = new JButton("Print");
//
//
//		//load test
//		//		LogIn user = new LogIn();
//		//		String User = user.getID();
//		//		comboboxItems(User);
//
//	}
	
	public void testsave(ActionEvent event ) throws FileNotFoundException {
	 
//		int valueID;
//		int value ;
//		int j = 0;
//		int IDEInt = 0;
//		String[] ops;
//		File instru;
//		int size = 0;
//		Boolean type = false;
//		Boolean IN = false;
//		String[] ag = new String[162];
//		ContinuarEvaluacion IDE = new ContinuarEvaluacion();
//		fileManager borrar = new fileManager();
//		MainMenu typeM = new MainMenu();
//		type = typeM.getContinuar(); 
//
//		if(type == true) {
//			IDEInt = Integer.valueOf(IDE.getIDEBox());
//
//			try {
//				borrar.borrarEV3(IDEInt);
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//		}
//		fileManager IDgen = new fileManager();
//		ag = IDgen.IDGen();
		
		String[] ag = new String[160];
		
		fileManager IDgen = new fileManager();	
		ag = IDgen.IDGen();
//
//		//Informacion a ingresar
//		System.out.println("woooooooooooooooooooow ");
	System.out.println(ag[12]);
//		//				for (int i = 0; i < ag.length; i++) {
//		//					System.out.println("Test " + i + ": " +ag[i]);
//		//				}
		
		
		values [0] = Unidadacademica_textField.getText();
		values [1] = nombre_prof_textField.getText();
		values [2] = rangoAcademico_comboBox.getValue().toString();
		values [3] = departamento_textField.getText();
		values [4] = disiplina_textField.getText();
		values [5] = objetivo_eval_comboBox.getValue().toString();
		values [6] = periodo_evaluado_textField.getValue().toString();
		values [7] = jornada_comple_comboBox.getValue().toString();
		values [8] = jornada_parcial_comboBox.getValue().toString();
		values [9] = contrato_comboBox.getValue().toString();
		values [10] = codigo_textField.getText();
		values [11] = tutulo_del_curso_textField.getText();
		
		 
		 if (Tipo_EV.getValue().toString().equals("Manual")) {
			 tipo = 1;
			 
		 }
		 else {
			 tipo = 0;
		 }
		values [12] = ag[12];
		values [13] = Tipo_EV.getValue().toString();
		values [14] =instrument1_1.getValue().toString();
		values [15] =instrument1_2.getValue().toString();
		values [16] =instrument1_3.getValue().toString();
		values [17] =instrument1_4.getValue().toString();
		values [18] =instrument1_5.getValue().toString();
		values [19] =instrument1_6.getValue().toString();
		values [20] =instrument1_7.getValue().toString();
		values [21] =instrument1_8.getValue().toString();
		values [22] =instrument1_9.getValue().toString();
		values [23] =instrument1_10.getValue().toString();
		values [24] =instrument1_11.getValue().toString();
		values [25] =instrument1_12.getValue().toString();
		values [26] =instrument1_13.getValue().toString();
		values [27] =instrument1_14.getValue().toString();
		values [28] =instrument1_15.getValue().toString();
		values [29] =instrument1_16.getValue().toString();
		values [30] =instrument1_17.getValue().toString();
		values [31] =instrument1_18.getValue().toString();
		values [32] =instrument1_19.getValue().toString();
		values [33] =instrument1_20.getValue().toString();
		values [34] =instrument1_21.getValue().toString();
		values [35] =instrument1_22.getValue().toString();
		values [36] =instrument1_23.getValue().toString(); 
		values [37] =instrument1_24.getValue().toString(); 
		values [38] =instrument1_25.getValue().toString(); 
		values [39] =instrument1_26.getValue().toString();
		values [40] =instrument1_27.getValue().toString();
		values [41] =instrument1_28.getValue().toString();
		values [42] =instrument1_29.getValue().toString(); 
		
		values [43] = instrument2_1.getValue().toString();
		values [44] = instrument2_2.getValue().toString();
		values [45] = instrument2_3.getValue().toString();
		values [46] = instrument2_4.getValue().toString();
		values [47] = instrument2_5.getValue().toString();
		values [48] = instrument2_6.getValue().toString();
		values [49] = instrument2_7.getValue().toString();
		values [50] = instrument2_8.getValue().toString();
		values [51] = instrument2_9.getValue().toString();
		values [52] = instrument2_10.getValue().toString();
		values [53] = instrument2_11.getValue().toString();
		values [54] = instrument2_12.getValue().toString();
		values [55] = instrument2_13.getValue().toString();
		values [56] = instrument2_14.getValue().toString();
		values [57] = instrument2_15.getValue().toString();
		values [58] = instrument2_16.getValue().toString();
		values [59] = instrument2_17.getValue().toString();
		values [60] = instrument2_18.getValue().toString();
		
	
		values [61] = instrument3_1.getValue().toString();
		values [62] = instrument3_2.getValue().toString();
		values [63] = instrument3_3.getValue().toString();
		values [64] = instrument3_4.getValue().toString();
		values [65] = instrument3_5.getValue().toString();
		values [66] = instrument3_6.getValue().toString();
		values [67] = instrument3_7.getValue().toString();
		values [68] = instrument3_8.getValue().toString();
		values [69] = instrument3_9.getValue().toString();
		values [70] = instrument3_10.getValue().toString();
		values [71] = instrument3_11.getValue().toString();
		values [72] = instrument3_12.getValue().toString();
		values [73] = instrument3_13.getValue().toString();
		values [74] = instrument3_14.getValue().toString();
		values [75] = instrument3_15.getValue().toString();
		values [76] = instrument3_16.getValue().toString();
		values [77] = instrument3_17.getValue().toString();
		values [78] = instrument3_18.getValue().toString();
		values [79] = instrument3_19.getValue().toString();
		values [80] = instrument3_20.getValue().toString();
		
		values [81] = instrument4_1.getValue().toString();
		values [82] = instrument4_2.getValue().toString();
		values [83] = instrument4_3.getValue().toString();
		values [84] = instrument4_4.getValue().toString();
		values [85] = instrument4_5.getValue().toString();
		values [86] = instrument4_6.getValue().toString();
		values [87] = instrument4_7.getValue().toString();
		values [88] = instrument4_8.getValue().toString();
		values [89] = instrument4_9.getValue().toString();
		values [90] = instrument4_10.getValue().toString();
		values [91] = instrument4_11.getValue().toString();
		values [92] = instrument4_12.getValue().toString();
		values [93] = instrument4_13.getValue().toString();
		values [94] = instrument4_14.getValue().toString();
		values [95] = instrument4_15.getValue().toString();
		values [96] = instrument4_16.getValue().toString();
		values [97] = instrument4_17.getValue().toString();
		values [98] = instrument4_18.getValue().toString();
		values [99] = instrument4_19.getValue().toString();
		values [100] = instrument4_20.getValue().toString();
		
		values [101] =Comment_3_1.getText();
		values [102] =Comment_3_2.getText();
		values [103] =Comment_3_3.getText();
		values [104] =Comment_3_4.getText();
		values [105] =Comment_3_5.getText();
		values [106] =Comment_3_6.getText();
		values [107] =Comment_3_7.getText();
		values [108] =Comment_3_8.getText();
		values [109] =Comment_3_9.getText();
		values [110] =Comment_3_10.getText();
		values [111] =Comment_3_11.getText();
		values [112] =Comment_3_12.getText();
		values [113] =Comment_3_13.getText();
		values [114] =Comment_3_14.getText();
		values [115] =Comment_3_15.getText();
		values [116] =Comment_3_16.getText();
		values [117] =Comment_3_17.getText();
		values [118] =Comment_3_18.getText();
		values [119] =Comment_3_19.getText();
		values [120] =Comment_3_20.getText();
		
		
		values [121] = Comment_4_1.getText();
		values [122] = Comment_4_2.getText();
		values [123] = Comment_4_3.getText();
		values [124] = Comment_4_4.getText();
		values [125] = Comment_4_5.getText();
		values [126] = Comment_4_6.getText();
		values [127] = Comment_4_7.getText();
		values [128] = Comment_4_8.getText();
		values [129] = Comment_4_9.getText();
		values [130] = Comment_4_10.getText();
		values [131] = Comment_4_11.getText();
		values [132] = Comment_4_12.getText();
		values [133] = Comment_4_13.getText();
		values [134] = Comment_4_14.getText();
		values [135] = Comment_4_15.getText();
		values [136] = Comment_4_16.getText();
		values [137] = Comment_4_17.getText();
		values [138] = Comment_4_18.getText();
		values [139] = Comment_4_19.getText();
		values [140] = Comment_4_20.getText();
		values [141] = Comment_4_21.getText();
		values [142] = Comment_4_22.getText();
		values [143] = Comment_4_23.getText();
		
		values [144] = Comment_2_1.getText();
		values [145] = Comment_2_2.getText();
		values [146] = Comment_2_3.getText();
		values [147] = Comment_2_4.getText();
		values [148] = Comment_2_5.getText();
		values [149] = Comment_2_6.getText();
		values [150] = Comment_2_7.getText();
		values [151] = Comment_2_8.getText();
		values [152] = Comment_2_9.getText();
		values [153] = Comment_2_10.getText();
		values [154] = Comment_2_11.getText();
		values [155] = Comment_2_12.getText();
		values [156] = Comment_2_13.getText();
		values [157] = Comment_2_14.getText();
		values [158] = Comment_2_15.getText();
		values [159] = Comment_2_16.getText();
		values [160] = Comment_2_17.getText();
		values [161] = Comment_2_18.getText();
		
		Login_backend user = new Login_backend();

		String ID = user.getID();
		System.out.print("\n"+ID+" hooooooolaaaaaa\n");
		File guardar;

		try {
			guardar = new File("./instrumentos.csv");
			FileWriter fw = new FileWriter("./instrumentos.csv",true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			pw.print("FALSE"+","+"FALSE"+","+ID+",");

			for(int i = 0 ; i < values.length ;i++) {
				pw.print(values[i]+",");	
			}
			pw.println(" ");
			pw.flush();
			pw.close();


		}catch(Exception ex) {

			System.out.print("404 "+ ex);
		}
		
		
		
		
		
		
		
	}
	
	public void calcular(ActionEvent event ) {
		
		try {
			
			System.out.println("DataView2: "+values[1]);
			DataView DV = new DataView(values[1]);
			int r =0;
			//r = Integer.parseInt(spinner.getValue());
			//System.out.println(spinner.getValue()+ "soy yo tu padre ");


			
			I2re[0] = DV.EvidenceCalc((int)instrument2_1.getValue());
			I2re[1] = DV.EvidenceCalc((int)instrument2_2.getValue());
			I2re[2] = DV.EvidenceCalc((int)instrument2_3.getValue());
			I2re[3] = DV.EvidenceCalc((int) instrument2_4.getValue());
			I2re[4] = DV.EvidenceCalc((int) instrument2_5.getValue());
			I2re[5] = DV.EvidenceCalc((int) instrument2_6.getValue());
			I2re[6] = DV.EvidenceCalc((int)instrument2_7.getValue());
			I2re[7] = DV.EvidenceCalc((int)instrument2_8.getValue());
			I2re[8] = DV.EvidenceCalc((int) instrument2_9.getValue());
			I2re[9] = DV.EvidenceCalc((int) instrument2_10.getValue());
			I2re[10] = DV.EvidenceCalc((int)instrument2_11.getValue());
			I2re[11] = DV.EvidenceCalc((int) instrument2_12.getValue());
			I2re[12] = DV.EvidenceCalc((int)instrument2_13.getValue());
			I2re[13] = DV.EvidenceCalc((int)instrument2_14.getValue());
			I2re[14] = DV.EvidenceCalc((int) instrument2_15.getValue());
			I2re[15] = DV.EvidenceCalc((int)instrument2_16.getValue());
			I2re[16] = DV.EvidenceCalc((int) instrument2_17.getValue());
			I2re[17] = DV.EvidenceCalc((int) instrument2_18.getValue());
			
			
			InsRe_1.setText(String.valueOf(I2re[0]));
			InsRe_2.setText(String.valueOf(I2re[1]));
			InsRe_3.setText(String.valueOf(I2re[2]));
			InsRe_4.setText(String.valueOf(I2re[3]));
			InsRe_5.setText(String.valueOf(I2re[4]));
			InsRe_6.setText(String.valueOf(I2re[5]));
			InsRe_7.setText(String.valueOf(I2re[6]));
			InsRe_8.setText(String.valueOf(I2re[7]));
			InsRe_9.setText(String.valueOf(I2re[8]));
			InsRe_10.setText(String.valueOf(I2re[9]));
			InsRe_11.setText(String.valueOf(I2re[10]));
			InsRe_12.setText(String.valueOf(I2re[11]));
			InsRe_13.setText(String.valueOf(I2re[12]));
			InsRe_14.setText(String.valueOf(I2re[13]));
			InsRe_15.setText(String.valueOf(I2re[14]));
			InsRe_16.setText(String.valueOf(I2re[15]));
			InsRe_17.setText(String.valueOf(I2re[16]));
			InsRe_18.setText(String.valueOf(I2re[17]));

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	
	
	

	

	
	
	public void Load() {
		
		

		int j = 40;

		String[] ops;
		File instru;
		System.out.print("im in load ");

		try {
			instru = new File("./instrumentos.csv");
			Scanner scanner = new Scanner(instru);

			while(scanner.hasNextLine()) {
				String data = scanner.nextLine();
				ops = data.split(",", 170);
				size++;

			}
			scanner.close();


		}catch(Exception ex) {

			System.out.print("404 "+ ex);
		}
		

		
		
	}
	
	
	
	public void comboboxItems() {
		System.out.print("entre mmmm que rico");
		String[] ap = new String[162];
		int re;
		re = Integer.parseInt(CotiBor.getText());

		fileManager continueI = new fileManager();
		ap = continueI.combobox(user.getID(),re);

		System.out.print("ewewwewewewewew" + ap[1]);
		LocalDate localDate = LocalDate.parse("2021-05-04");
		String pattern = "yyyy-dd-MM";
		DateTimeFormatter dtFormatter;
		 dtFormatter = DateTimeFormatter.ofPattern(pattern);
		 LocalDate date = LocalDate.parse(ap[6], dtFormatter);
		 
		 
		Unidadacademica_textField.setText(ap[0]);
		nombre_prof_textField.setText(ap[1]);
		rangoAcademico_comboBox.getSelectionModel().select(ap[2]);
		departamento_textField.setText(ap[3]);
		disiplina_textField.setText(ap[4]);
		objetivo_eval_comboBox.getSelectionModel().select(ap[5]);
		periodo_evaluado_textField.setValue(date);
		jornada_comple_comboBox.getValueFactory().setValue(Integer.parseInt(ap[7])); 
		jornada_parcial_comboBox.getValueFactory().setValue(Integer.parseInt(ap[8])); 
		contrato_comboBox.getSelectionModel().select(ap[9]);
		codigo_textField.setText(ap[10]);
		tutulo_del_curso_textField.setText(ap[11]);
		
	}
	
	
	
	

//public void comboboxItems(String ID , int IDE) {
//		String bruh = "hola";
//		String[] ap = new String[162];
//
//		fileManager continueI = new fileManager();
//		ap = continueI.combobox(ID,IDE);
//
//		Unidadacademica_textField.setText(ap[0]);
//		nombre_prof_textField.setText(ap[1]);
//		rangoAcademico_comboBox.setSelectedItem(ap[2]);
//		departamento_textField.setText(ap[3]);
//		disiplina_textField.setText(ap[4]);
//		objetivo_eval_comboBox.setSelectedItem(ap[5]);
//		periodo_evaluado_textField.setText(ap[6]);
//		jornada_comple_comboBox.setSelectedItem(ap[7]); 
//		jornada_parcial_comboBox.setSelectedItem(ap[8]); 
//		contrato_comboBox.setSelectedItem(ap[9]);
//		codigo_textField.setText(ap[10]);
//		tutulo_del_curso_textField.setText(ap[11]);
//
//
//
//
//		parte1_perfil_de_estudiante_1.setText(ap[14]);
//
//		parte1_perfil_de_estudiante_2.setText(ap[15]);
//
//		parte2_estudi_3.setText(ap[16]);
//
//		parte2_estudi_4.setText(ap[17]);
//
//		parte3_estudi_5_.setText(ap[18]);
//
//		parte3_estudi_6.setText(ap[19]);
//
//		parte3_estudi_7.setText(ap[20]);
//
//		parte3_estudi_8.setText(ap[21]);
//
//		parte3_estudi_9.setText(ap[22]);
//
//		parte3_estudi_10.setText(ap[23]);
//
//		parte3_estudi_11.setText(ap[24]);
//
//		parte3_estudi_12.setText(ap[25]);
//
//		parte3_desarollo_de_clase_13.setText(ap[26]);
//
//		parte3_desarollo_de_clase_14.setText(ap[27]);
//
//		parte3_desarollo_de_clase_15.setText(ap[28]);
//
//		parte3_desarollo_de_clase_16.setText(ap[29]);
//
//		parte3_desarollo_de_clase_17.setText(ap[30]);
//
//		parte5_gerencia_18.setText(ap[31]);
//
//		parte5_gerencia_19.setText(ap[32]);
//
//		parte5_gerencia_20.setText(ap[33]);
//
//		parte5_gerencia_21.setText(ap[34]);
//
//		parte5_gerencia_22.setText(ap[35]);
//
//		parte5_gerencia_23.setText(ap[36]);
//
//		parte5_gerencia_24.setText(ap[37]);
//
//		parte5_gerencia_25.setText(ap[38]);
//
//		parte5_gerencia_26.setText(ap[39]);
//
//		parte5_gerencia_27.setText(ap[40]);
//
//		parte5_gerencia_28.setText(ap[41]);
//
//		parte5_gerencia_29.setText(ap[42]);
//
//
//		///////////////////////////Instrument 2////////////////////////////////
//
//		spinner.setValue(Integer.parseInt(ap[43]));
//		spinner_1.setValue(Integer.parseInt(ap[44]));
//		spinner_2.setValue(Integer.parseInt(ap[45]));
//		spinner_3.setValue(Integer.parseInt(ap[46]));
//		spinner_4.setValue(Integer.parseInt(ap[47]));
//		spinner_5.setValue(Integer.parseInt(ap[48]));
//		spinner_5_1.setValue(Integer.parseInt(ap[49]));
//		spinner_6.setValue(Integer.parseInt(ap[50]));
//		spinner_1_1.setValue(Integer.parseInt(ap[51]));
//		spinner_3_1.setValue(Integer.parseInt(ap[52]));
//		spinner_5_2.setValue(Integer.parseInt(ap[53]));
//		spinner_6_1.setValue(Integer.parseInt(ap[54]));
//		spinner_6_2.setValue(Integer.parseInt(ap[55]));
//		spinner_1_1_1.setValue(Integer.parseInt(ap[56]));
//		spinner_3_1_1.setValue(Integer.parseInt(ap[57]));
//		spinner_1_1_1_1.setValue(Integer.parseInt(ap[58]));
//		spinner_3_1_1_1.setValue(Integer.parseInt(ap[59]));
//		spinner_3_1_1_1_1.setValue(Integer.parseInt(ap[60]));
//
//		////////////////////////////Instrument 3//////////////////////////////////////
//		if(ap[61] == "0") {
//			comboBox.setSelectedIndex(0); 
//
//		}
//		else {
//			comboBox.setSelectedItem(ap[61]); 
//		}
//		if(ap[62] == "0") {
//			comboBox_1.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_1.setSelectedItem(ap[62]);
//		}
//
//
//		if(ap[63] == "0") {
//			comboBox_3.setSelectedIndex(0); 
//
//		}
//		else {
//			comboBox_3.setSelectedItem(ap[63]);
//		}
//
//		if(ap[64] == "0") {
//			comboBox_3_1.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_3_1.setSelectedItem(ap[64]);
//		}
//
//		if(ap[65] == "0") {
//			comboBox_4.setSelectedIndex(0); 
//
//		}
//		else {
//			comboBox_4.setSelectedItem(ap[65]);
//		}
//
//		if(ap[66] == "0") {
//			comboBox_4_1.setSelectedIndex(0); 
//
//		}
//		else {
//			comboBox_4_1.setSelectedItem(ap[66]);
//		}
//
//		if(ap[67] == "0") {
//			comboBox_5.setSelectedIndex(0); 
//
//		}
//		else {
//			comboBox_5.setSelectedItem(ap[67]);
//		}
//
//		if(ap[68] == "0") {
//			comboBox_6.setSelectedIndex(0); 
//
//		}
//		else {
//			comboBox_6.setSelectedItem(ap[68]);
//		}
//
//		if(ap[69] == "0") {
//			comboBox_7.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_7.setSelectedItem(ap[69]);
//		}
//
//		if(ap[70] == "0") {
//			comboBox_9.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_9.setSelectedItem(ap[70]);
//		}
//
//		if(ap[71] == "0") {
//			comboBox_10.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_10.setSelectedItem(ap[71]);
//		}
//
//		if(ap[72] == "0") {
//			comboBox_5_1.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_5_1.setSelectedItem(ap[72]);
//		}
//
//		if(ap[73] == "0") {
//			comboBox_5_2.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_5_2.setSelectedItem(ap[73]);
//		}
//
//		if(ap[74] == "0") {
//			comboBox_5_3.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_5_3.setSelectedItem(ap[74]);
//		}
//
//		if(ap[75] == "0") {
//			comboBox_5_4.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_5_4.setSelectedItem(ap[75]);
//		}
//
//		if(ap[76] == "0") {
//			comboBox_5_5.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_5_5.setSelectedItem(ap[76]);
//		}
//
//		if(ap[77] == "0") {
//			comboBox_5_1_1.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_5_1_1.setSelectedItem(ap[77]);
//		}
//
//		if(ap[78] == "0") {
//			comboBox_5_1_2.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_5_1_2.setSelectedItem(ap[78]);
//		}
//
//		if(ap[79] == "0") {
//			comboBox_5_1_3.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_5_1_3.setSelectedItem(ap[79]);
//		}
//
//		if(ap[80] == "0") {
//			comboBox_5_1_4.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_5_1_4.setSelectedItem(ap[80]);
//		}
//
//
//		if(ap[81] == "0") {
//			comboBox_8.setSelectedIndex(0); 
//
//		}
//		else {
//			comboBox_8.setSelectedItem(ap[81]); 
//		}
//		if(ap[82] == "0") {
//			comboBox_12.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_12.setSelectedItem(ap[82]);
//		}
//
//
//		if(ap[83] == "0") {
//			comboBox_13.setSelectedIndex(0); 
//
//		}
//		else {
//			comboBox_13.setSelectedItem(ap[83]);
//		}
//
//		if(ap[84] == "0") {
//			comboBox_14.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_14.setSelectedItem(ap[84]);
//		}
//
//		if(ap[85] == "0") {
//			comboBox_15.setSelectedIndex(0); 
//
//		}
//		else {
//			comboBox_15.setSelectedItem(ap[85]);
//		}
//
//		if(ap[86] == "0") {
//			comboBox_16.setSelectedIndex(0); 
//
//		}
//		else {
//			comboBox_16.setSelectedItem(ap[86]);
//		}
//
//		if(ap[87] == "0") {
//			comboBox_17.setSelectedIndex(0); 
//
//		}
//		else {
//			comboBox_17.setSelectedItem(ap[87]);
//		}
//
//		if(ap[88] == "0") {
//			comboBox_18.setSelectedIndex(0); 
//
//		}
//		else {
//			comboBox_18.setSelectedItem(ap[88]);
//		}
//
//		if(ap[89] == "0") {
//			comboBox_19.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_19.setSelectedItem(ap[89]);
//		}
//
//		if(ap[90] == "0") {
//			comboBox_20.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_20.setSelectedItem(ap[90]);
//		}
//
//		if(ap[91] == "0") {
//			comboBox_21.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_21.setSelectedItem(ap[91]);
//		}
//
//		if(ap[92] == "0") {
//			comboBox_22.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_22.setSelectedItem(ap[92]);
//		}
//
//		if(ap[93] == "0") {
//			comboBox_23.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_23.setSelectedItem(ap[93]);
//		}
//
//		if(ap[94] == "0") {
//			comboBox_24.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_24.setSelectedItem(ap[94]);
//		}
//
//		if(ap[95] == "0") {
//			combobox25.setSelectedIndex(0);
//
//		}
//		else {
//			combobox25.setSelectedItem(ap[95]);
//		}
//
//		if(ap[96] == "0") {
//			comboBox_26.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_26.setSelectedItem(ap[96]);
//		}
//
//		if(ap[97] == "0") {
//			comboBox_27.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_27.setSelectedItem(ap[97]);
//		}
//
//		if(ap[98] == "0") {
//			comboBox_28.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_28.setSelectedItem(ap[98]);
//		}
//
//		if(ap[99] == "0") {
//			comboBox_29.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_29.setSelectedItem(ap[99]);
//		}
//
//		if(ap[100] == "0") {
//			comboBox_30.setSelectedIndex(0);
//
//		}
//		else {
//			comboBox_30.setSelectedItem(ap[100]);
//		}
//
//		textPane_1.setText(ap[101]);
//		textPane_1_1_1.setText(ap[102]);
//		textPane_1_1.setText(ap[103]);
//		textPane.setText(ap[104]);
//		textPane_2_1.setText(ap[105]);
//		textPane_2.setText(ap[106]);
//		textPane_1_2.setText(ap[107]);
//		textPane_1_3.setText(ap[108]);
//		textPane_1_4.setText(ap[109]);
//		textPane_1_5.setText(ap[110]);
//		textPane_1_6.setText(ap[111]);
//		textPane_1_2_1.setText(ap[112]);
//		textPane_1_2_2.setText(ap[113]);
//		textPane_1_2_3.setText(ap[114]);
//		textPane_1_2_4.setText(ap[115]);
//		textPane_1_2_5.setText(ap[116]);
//		textPane_1_2_1_1.setText(ap[117]);
//		textPane_1_2_1_2.setText(ap[118]);
//		textPane_1_2_1_3.setText(ap[119]);
//		textPane_1_2_1_3_1.setText(ap[120]);
//
//		textPane_1_7_4.setText(ap[121]);
//		textPane_1_7_1_2.setText(ap[122]);
//		textPane_1_7_1_1_1.setText(ap[123]);
//		textPane_1_7_4_1.setText(ap[124]);
//		textPane_1_7_4_2.setText(ap[125]);
//		textPane_1_7_4_3.setText(ap[126]);
//		textPane_1_7_3.setText(ap[127]);
//		textPane_1_7_3_1.setText(ap[128]);
//		textPane_1_7_3_1_1.setText(ap[129]);
//		textPane_1_7_3_2.setText(ap[130]);
//		textPane_1_7_3_2_1.setText(ap[131]);
//		textPane_1_7_3_2_1_1.setText(ap[132]);
//		textPane_1_7_3_3.setText(ap[133]);
//		textPane_1_7_3_3_1.setText(ap[134]);
//		textPane_1_7_3_3_2.setText(ap[135]);
//		textPane_1_7_3_3_2_1.setText(ap[136]);
//		textPane_1_7_3_3_2_1_1.setText(ap[137]);
//		textPane_1_7_3_3_2_2.setText(ap[138]);
//		textPane_1_7_3_3_2_2_1.setText(ap[139]);
//		textPane_1_7_3_3_2_2_1_1.setText(ap[140]);
//		textPane_1_7_3_3_2_3.setText(ap[141]);
//		textPane_1_7_3_3_2_3_1.setText(ap[142]);
//		textPane_1_7_3_3_2_3_1_1.setText(ap[143]);
//
//		textArea.setText(ap[144]);
//		textArea_1.setText(ap[145]);
//		textArea_2.setText(ap[146]);
//		textArea_3.setText(ap[147]);
//		textArea_4.setText(ap[148]);
//		textArea_5.setText(ap[149]);
//		textArea_6.setText(ap[150]);
//		textArea_8.setText(ap[151]);
//		textArea_1_1.setText(ap[152]);
//		textArea_3_1 .setText(ap[153]);
//		textArea_5_1.setText(ap[154]);
//		textArea_8_1.setText(ap[155]);
//		textArea_8_2.setText(ap[156]);
//		textArea_1_1_1.setText(ap[157]);
//		textField_15.setText(ap[158]);
//		textArea_8_2_1.setText(ap[159]);
//		textArea_8_2_1_1.setText(ap[160]);
//		textArea_8_2_1_1_1.setText(ap[161]);
//
//
//
//
//	}

	public String[] getvalue() {
		return values;

	}
	
	public int gettipo() {
		return tipo;

	}
	
}