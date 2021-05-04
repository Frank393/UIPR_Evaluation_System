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
	
	
	@FXML Label comment_1_1_on = new Label();
	@FXML Label comment_1_2_on = new Label();
	@FXML Label comment_1_3_on = new Label();
	@FXML Label comment_1_4_on = new Label();
	
	@FXML Label comment_3_1_on = new Label();
	@FXML Label comment_3_2_on = new Label();
	@FXML Label comment_3_3_on = new Label();
	@FXML Label comment_3_4_on = new Label();
	@FXML Label comment_3_5_on = new Label();
	@FXML Label comment_3_6_on = new Label();
	@FXML Label comment_3_7_on = new Label();
	@FXML Label comment_3_8_on = new Label();
	@FXML Label comment_3_9_on = new Label();
	@FXML Label comment_3_10_on = new Label();
	@FXML Label comment_3_11_on = new Label();
	@FXML Label comment_3_12_on = new Label();
	@FXML Label comment_3_13_on = new Label();
	@FXML Label comment_3_14_on = new Label();
	@FXML Label comment_3_15_on = new Label();
	@FXML Label comment_3_16_on = new Label();
	@FXML Label comment_3_17_on = new Label();
	@FXML Label comment_3_18_on = new Label();
	@FXML Label comment_3_19_on = new Label();
	@FXML Label comment_3_20_on = new Label();
	
	
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
		  
		  if(mm.gettipo()== 0) {
			  comment_1_1_on.setVisible(false);
			  comment_1_2_on.setVisible(false);
			  comment_1_3_on.setVisible(false);
			  comment_1_4_on.setVisible(false);

			  comment_3_1_on.setText ("Mediante la interacción con los estudiantes, el profesor demostró   conocimiento suficiente del tema evaluado.");
			  comment_3_2_on.setText ("Mediante la interacción con los estudiantes, el profesor integró conceptos o experiencias de otras disciplinas para enriquecer el tema evaluado.");
			  comment_3_3_on.setText ("El profesor resaltó la utilidad del tema para otros cursos o áreas del conocimiento.");
			  comment_3_4_on.setText ("El profesor facilitó que los estudiantes relacionen el tema con sus experiencias personales o el mundo del trabajo.");
			  comment_3_5_on.setText ("El profesor ejerció la docencia como un guía o facilitador de los estudiantes, mediante la comunicación e interacción con los mismos, así como en las diversas actividades docentes.");
			  comment_3_6_on.setText ("En su interacción con los estudiantes, el profesor utilizó un lenguaje que corresponde con el nivel de los estudiantes en el curso.");
			  comment_3_7_on.setText ("El profesor promovió la comunicación e interacción estudiante-estudiante.");
			  comment_3_8_on.setText ("El profesor fomentó la comunicación e interacción estudiante-profesor.");
			  comment_3_9_on.setText ( "El profesor planificó la distribución del tiempo de forma tal que los estudiantes pueden cumplir con los objetivos establecidos.");
			  comment_3_10_on.setText ("El profesor informó a los estudiantes del tiempo estimado para responder a los mensajes, para informar sobre los resultados de los exámenes, asignaciones y otros trabajos corregidos; aunque el diseño del curso pueda incluir algo sobre esto.");
			  comment_3_11_on.setText ("El profesor informó a los estudiantes de los resultados de las actividades realizadas por aquellos no más tarde de dos semanas de haber sido entregados durante el semestre o su equivalente en los diversos términos académicos. ");
			  comment_3_12_on.setText ("El profesor respondió en el tiempo establecido, los mensajes, las preguntasy las consultas de los estudiantes, que se recibieron mediante el correo electrónico.");
			  comment_3_13_on.setText ("El profesor utilizó las herramientas disponibles en la plataforma y presentó elcontenido del curso en forma organizada y coherente.");
			  comment_3_14_on.setText ("El profesor mantuvo un clima de confianza y respeto");
			  comment_3_15_on.setText ("El profesor facilitó la discusión para complementar, aclarar o enriquecer");
			  comment_3_16_on.setText ("El profesor promovió la búsqueda de información o experiencias para enriqueser el conocimento.");
			  comment_3_17_on.setText ("El profesor fomentó el pensamiento crítico.");
			  comment_3_18_on.setText ("El profesor aportó recursos de apoyo adicionales para enriquecer el tema evaluado.");
			  comment_3_19_on.setText ("El profesor utilizó diferentes recursos de enseñanza para facilitar el aprendizajePor ejemplo: trabajo colaborativo, vídeos, presentaciones, seminarios y conferencias a través de la web, entre otros.");
			  comment_3_20_on.setVisible(false);
		  }         
		  
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
