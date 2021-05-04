package evaluation;

import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ResultsBackend {
	Instruments mm = new Instruments();
	ValenciasRango vr = new ValenciasRango(mm.rangoNum());
	ValenciasRubrica rub = new ValenciasRubrica();
	Login_backend lg = new Login_backend();
	ConfigBackend cb = new ConfigBackend();
	@FXML Label rangoText = new Label();
	
	int[] valencia = new int [18];
	
	// Score weights
	@FXML Label ScoreW1A = new Label();
	@FXML Label ScoreW1B = new Label();
	@FXML Label ScoreW1C = new Label();
	@FXML Label ScoreW1D = new Label();
	@FXML Label ScoreW1E = new Label();
	@FXML Label ScoreW1F = new Label();
	@FXML Label ScoreW1GH = new Label();
	
	@FXML Label ScoreW2A = new Label();
	@FXML Label ScoreW2BC = new Label();
	@FXML Label ScoreW2DE = new Label();
	@FXML Label ScoreW2FG = new Label();
	
	@FXML Label ScoreW3AB = new Label();
	
	@FXML Label ScoreW4A = new Label();
	@FXML Label ScoreW4B = new Label();
	@FXML Label ScoreW4CDE = new Label();
	
	@FXML Label ScoreW5ABC = new Label();
	@FXML Label ScoreW5C = new Label();
	@FXML Label ScoreW5EF = new Label();
	
	// Scores
	@FXML Label Score1A = new Label();
	@FXML Label Score1B = new Label();
	@FXML Label Score1C = new Label();
	@FXML Label Score1D = new Label();
	@FXML Label Score1E = new Label();
	@FXML Label Score1F = new Label();
	@FXML Label Score1GH = new Label();
	
	@FXML Label Score2A = new Label();
	@FXML Label Score2BC = new Label();
	@FXML Label Score2DE = new Label();
	@FXML Label Score2FG = new Label();
	
	@FXML Label Score3AB = new Label();
	
	@FXML Label Score4A = new Label();
	@FXML Label Score4B = new Label();
	@FXML Label Score4CDE = new Label();
	
	@FXML Label Score5ABC = new Label();
	@FXML Label Score5C = new Label();
	@FXML Label Score5EF = new Label();
	
	@FXML private void initialize() throws IOException{
		  rankFill();
		  ScoreW1A.setText (String.valueOf(valencia[0]));
		  ScoreW1B.setText (String.valueOf(valencia[1]));
		  ScoreW1C.setText (String.valueOf(valencia[2]));
		  ScoreW1D.setText (String.valueOf(valencia[3]));
		  ScoreW1E.setText (String.valueOf(valencia[4]));
		  ScoreW1F.setText (String.valueOf(valencia[5]));
		  ScoreW1GH.setText (String.valueOf(valencia[6]));
		
		  ScoreW2A.setText (String.valueOf(valencia[7]));
		  ScoreW2BC.setText (String.valueOf(valencia[8]));
		  ScoreW2DE.setText (String.valueOf(valencia[9]));
		  ScoreW2FG.setText (String.valueOf(valencia[10]));
		
		  ScoreW3AB.setText (String.valueOf(valencia[11]));
		
		  ScoreW4A.setText (String.valueOf(valencia[12]));
		  ScoreW4B.setText (String.valueOf(valencia[13]));
		  ScoreW4CDE.setText (String.valueOf(valencia[14]));
		
		  ScoreW5ABC.setText (String.valueOf(valencia[15]));
		  ScoreW5C.setText (String.valueOf(valencia[16]));
		  ScoreW5EF.setText (String.valueOf(valencia[17]));
		  
		  Score1A.setText (String.valueOf(rub.CalidadDocente()[0]));
		  Score1B.setText (String.valueOf(rub.CalidadDocente()[1]));
		  Score1C.setText (String.valueOf(rub.CalidadDocente()[2]));
		  Score1D.setText (String.valueOf(rub.CalidadDocente()[3]));
		  Score1E.setText (String.valueOf(rub.CalidadDocente()[4]));
		  Score1F.setText (String.valueOf(rub.CalidadDocente()[5]));
		  Score1GH.setText (String.valueOf(rub.CalidadDocente()[6]));
		
		  Score2A.setText (String.valueOf(rub.ServicioInstitucion()[0]));
		  Score2BC.setText (String.valueOf(rub.ServicioInstitucion()[1]));
		  Score2DE.setText (String.valueOf(rub.ServicioInstitucion()[2]));
		  Score2FG.setText (String.valueOf(rub.ServicioInstitucion()[3]));
		
		  Score3AB.setText (String.valueOf(rub.ServicioComunidad()));
		
		  Score4A.setText (String.valueOf(rub.InvestigacionTrabajo()[0]));
		  Score4B.setText (String.valueOf(rub.InvestigacionTrabajo()[1]));
		  Score4CDE.setText (String.valueOf(rub.InvestigacionTrabajo()[2]));
		
		  Score5ABC.setText (String.valueOf(rub.CrecimientoDesarrollo()[0]));
		  Score5C.setText (String.valueOf(rub.CrecimientoDesarrollo()[1]));
		  Score5EF.setText (String.valueOf(rub.CrecimientoDesarrollo()[2]));
	}
	
	public void rankFill() throws FileNotFoundException {
		cb.fillValen(lg.getID());
		int rango = mm.rangoNum();
		//int rango = 1;
		int sum = 0;
		
		if (rango == 1) {
			for(int i = 0;i < 18;i++) {
				rangoText.setText("Rango Catedratico Asociado");
				valencia[sum] = ConfigBackend.valen[i];
				sum++;
			}
		}
		
		else if (rango == 2) {
			for(int i = 18;i < 36;i++) {
				rangoText.setText("Rango Catedratico Auxiliar");
				valencia[sum] = ConfigBackend.valen[i];
				sum++;
			}
		}
		
		else if (rango == 3) {
			for(int i = 37;i < 54;i++) {
				rangoText.setText("Rango Catedratico");
				valencia[sum] = ConfigBackend.valen[i];
				sum++;
			}
		}
	}
}
