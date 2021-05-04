package evaluation;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ResultsBackend {
	Instruments mm = new Instruments();
	ValenciasCapsule vr = new ValenciasCapsule();
	ValenciasRubrica rub = new ValenciasRubrica();
	
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
		  ScoreW1A.setText (String.valueOf(vr.valen1A));
		  ScoreW1B.setText (String.valueOf(vr.valen1B));
		  ScoreW1C.setText (String.valueOf(vr.valen1C));
		  ScoreW1D.setText (String.valueOf(vr.valen1D));
		  ScoreW1E.setText (String.valueOf(vr.valen1E));
		  ScoreW1F.setText (String.valueOf(vr.valen1F));
		  ScoreW1GH.setText (String.valueOf(vr.valen1GH));
		
		  ScoreW2A.setText (String.valueOf(vr.valen2A));
		  ScoreW2BC.setText (String.valueOf(vr.valen2BC));
		  ScoreW2DE.setText (String.valueOf(vr.valen2DE));
		  ScoreW2FG.setText (String.valueOf(vr.valen2FG));
		
		  ScoreW3AB.setText (String.valueOf(vr.valen3AB));
		
		  ScoreW4A.setText (String.valueOf(vr.valen4A));
		  ScoreW4B.setText (String.valueOf(vr.valen4B));
		  ScoreW4CDE.setText (String.valueOf(vr.valen4CDE));
		
		  ScoreW5ABC.setText (String.valueOf(vr.valen5ABC));
		  ScoreW5C.setText (String.valueOf(vr.valen5D));
		  ScoreW5EF.setText (String.valueOf(vr.valen5EF));
		  
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
}
