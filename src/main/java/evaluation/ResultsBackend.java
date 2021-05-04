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
	
	// Comments
	
	@FXML Label comment_2_1 = new Label();
	@FXML Label comment_2_2 = new Label();
	@FXML Label comment_2_3 = new Label();
	@FXML Label comment_2_4 = new Label();
	@FXML Label comment_2_5 = new Label();
	@FXML Label comment_2_6 = new Label();
	@FXML Label comment_2_7 = new Label();
	@FXML Label comment_2_8 = new Label();
	@FXML Label comment_2_9 = new Label();
	@FXML Label comment_2_10 = new Label();
	@FXML Label comment_2_11 = new Label();
	@FXML Label comment_2_12 = new Label();
	@FXML Label comment_2_13 = new Label();
	@FXML Label comment_2_14 = new Label();
	@FXML Label comment_2_15 = new Label();
	@FXML Label comment_2_16 = new Label();
	@FXML Label comment_2_17 = new Label();
	@FXML Label comment_2_18 = new Label();
	
	@FXML Label comment_3_1_text = new Label();
	@FXML Label comment_3_2_text = new Label();
	@FXML Label comment_3_3_text = new Label();
	@FXML Label comment_3_4_text = new Label();
	@FXML Label comment_3_5_text = new Label();
	@FXML Label comment_3_6_text = new Label();
	@FXML Label comment_3_7_text = new Label();
	@FXML Label comment_3_8_text = new Label();
	@FXML Label comment_3_9_text = new Label();
	@FXML Label comment_3_10_text = new Label();
	@FXML Label comment_3_11_text = new Label();
	@FXML Label comment_3_12_text = new Label();
	@FXML Label comment_3_13_text = new Label();
	@FXML Label comment_3_14_text = new Label();
	@FXML Label comment_3_15_text = new Label();
	@FXML Label comment_3_16_text = new Label();
	@FXML Label comment_3_17_text = new Label();
	@FXML Label comment_3_18_text = new Label();
	@FXML Label comment_3_19_text = new Label();
	@FXML Label comment_3_20_text = new Label();
	
	@FXML Label comment_4_1 = new Label();
	@FXML Label comment_4_2 = new Label();
	@FXML Label comment_4_3 = new Label();
	@FXML Label comment_4_4 = new Label();
	@FXML Label comment_4_5 = new Label();
	@FXML Label comment_4_6 = new Label();
	@FXML Label comment_4_7 = new Label();
	@FXML Label comment_4_8 = new Label();
	@FXML Label comment_4_9 = new Label();
	@FXML Label comment_4_10 = new Label();
	@FXML Label comment_4_11 = new Label();
	@FXML Label comment_4_12 = new Label();
	@FXML Label comment_4_13 = new Label();
	@FXML Label comment_4_14 = new Label();
	@FXML Label comment_4_15 = new Label();
	@FXML Label comment_4_16 = new Label();
	@FXML Label comment_4_17 = new Label();
	@FXML Label comment_4_18 = new Label();
	@FXML Label comment_4_19 = new Label();
	@FXML Label comment_4_20 = new Label();
	@FXML Label comment_4_21 = new Label();
	@FXML Label comment_4_22 = new Label();
	@FXML Label comment_4_23 = new Label();
	
	// Descriptions
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
	
	@FXML Label comment_1_1_on = new Label();
	@FXML Label comment_1_2_on = new Label();
	@FXML Label comment_1_3_on = new Label();
	@FXML Label comment_1_4_on = new Label();
	
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
		  
		  System.out.println("Tipo: "+mm.gettipo());
		  
		  if(mm.gettipo()== 0) {
			  comment_1_1_on.setVisible(false);
			  comment_1_2_on.setVisible(false);
			  comment_1_3_on.setVisible(false);
			  comment_1_4_on.setVisible(false);

			  comment_3_1_on.setText ("Mediante la interacci�n con los estudiantes, el profesor demostr� conocimiento suficiente del tema evaluado.");
			  comment_3_2_on.setText ("Mediante la interacci�n con los estudiantes, el profesor integr� conceptos o experiencias de otras disciplinas para enriquecer el tema evaluado.");
			  comment_3_3_on.setText ("El profesor resalt� la utilidad del tema para otros cursos o �reas del conocimiento.");
			  comment_3_4_on.setText ("El profesor facilit� que los estudiantes relacionen el tema con sus experiencias personales o el mundo del trabajo.");
			  comment_3_5_on.setText ("El profesor ejerci� la docencia como un gu�a o facilitador de los estudiantes, mediante la comunicaci�n e interacci�n con los mismos, as� como en las diversas actividades docentes.");
			  comment_3_6_on.setText ("En su interacci�n con los estudiantes, el profesor utiliz� un lenguaje que corresponde con el nivel de los estudiantes en el curso.");
			  comment_3_7_on.setText ("El profesor promovi� la comunicaci�n e interacci�n estudiante-estudiante.");
			  comment_3_8_on.setText ("El profesor foment� la comunicaci�n e interacci�n estudiante-profesor.");
			  comment_3_9_on.setText ( "El profesor planific� la distribuci�n del tiempo de forma tal que los estudiantes pueden cumplir con los objetivos establecidos.");
			  comment_3_10_on.setText ("El profesor inform� a los estudiantes del tiempo estimado para responder a los mensajes, para informar sobre los resultados de los ex�menes, asignaciones y otros trabajos corregidos; aunque el dise�o del curso pueda incluir algo sobre esto.");
			  comment_3_11_on.setText ("El profesor inform� a los estudiantes de los resultados de las actividades realizadas por aquellos no m�s tarde de dos semanas de haber sido entregados durante el semestre o su equivalente en los diversos t�rminos acad�micos. ");
			  comment_3_12_on.setText ("El profesor respondi� en el tiempo establecido, los mensajes, las preguntasy las consultas de los estudiantes, que se recibieron mediante el correo electr�nico.");
			  comment_3_13_on.setText ("El profesor utiliz� las herramientas disponibles en la plataforma y present� elcontenido del curso en forma organizada y coherente.");
			  comment_3_14_on.setText ("El profesor mantuvo un clima de confianza y respeto");
			  comment_3_15_on.setText ("El profesor facilit� la discusi�n para complementar, aclarar o enriquecer");
			  comment_3_16_on.setText ("El profesor promovi� la b�squeda de informaci�n o experiencias para enriqueser el conocimento.");
			  comment_3_17_on.setText ("El profesor foment� el pensamiento cr�tico.");
			  comment_3_18_on.setText ("El profesor aport� recursos de apoyo adicionales para enriquecer el tema evaluado.");
			  comment_3_19_on.setText ("El profesor utiliz� diferentes recursos de ense�anza para facilitar el aprendizajePor ejemplo: trabajo colaborativo, v�deos, presentaciones, seminarios y conferencias a trav�s de la web, entre otros.");
			  comment_3_20_on.setVisible(false);
		  }         
		  
		  comment_2_1.setText(Instruments.comments[62]);
		  comment_2_2.setText(Instruments.comments[63]);
		  comment_2_3.setText(Instruments.comments[64]);
		  comment_2_4.setText(Instruments.comments[65]);
		  comment_2_5.setText(Instruments.comments[66]);
		  comment_2_6.setText(Instruments.comments[67]);
		  comment_2_7.setText(Instruments.comments[68]);
		  comment_2_8.setText(Instruments.comments[69]);
		  comment_2_9.setText(Instruments.comments[70]);
		  comment_2_10.setText(Instruments.comments[71]);
		  comment_2_11.setText(Instruments.comments[72]);
	      comment_2_12.setText(Instruments.comments[73]);
	      comment_2_13.setText(Instruments.comments[74]);
	      comment_2_14.setText(Instruments.comments[75]);
	      comment_2_15.setText(Instruments.comments[76]);
	      comment_2_16.setText(Instruments.comments[77]);
	      comment_2_17.setText(Instruments.comments[78]);
	      comment_2_18.setText(Instruments.comments[79]);
	      
	      if(mm.gettipo() == 1) {
	    	  comment_3_1_text.setText(Instruments.comments[20]);
		      comment_3_2_text.setText(Instruments.comments[21]);
		      comment_3_3_text.setText(Instruments.comments[22]);
		      comment_3_4_text.setText(Instruments.comments[23]);
		      comment_3_5_text.setText(Instruments.comments[24]);
		      comment_3_6_text.setText(Instruments.comments[25]);
		      comment_3_7_text.setText(Instruments.comments[26]);
		      comment_3_8_text.setText(Instruments.comments[27]);
		      comment_3_9_text.setText(Instruments.comments[28]);
		      comment_3_10_text.setText(Instruments.comments[29]);
		      comment_3_11_text.setText(Instruments.comments[30]);
		      comment_3_12_text.setText(Instruments.comments[31]);
		      comment_3_13_text.setText(Instruments.comments[32]);
		      comment_3_14_text.setText(Instruments.comments[33]);
		      comment_3_15_text.setText(Instruments.comments[34]);
		      comment_3_16_text.setText(Instruments.comments[35]);
		      comment_3_17_text.setText(Instruments.comments[36]);
		      comment_3_18_text.setText(Instruments.comments[37]);
		      comment_3_19_text.setText(Instruments.comments[38]);
		      comment_3_20_text.setVisible(false);
	      }
	      else {
	    	  comment_3_1_text.setText(Instruments.comments[0]);
		      comment_3_2_text.setText(Instruments.comments[1]);
		      comment_3_3_text.setText(Instruments.comments[2]);
		      comment_3_4_text.setText(Instruments.comments[3]);
		      comment_3_5_text.setText(Instruments.comments[4]);
		      comment_3_6_text.setText(Instruments.comments[5]);
		      comment_3_7_text.setText(Instruments.comments[6]);
		      comment_3_8_text.setText(Instruments.comments[7]);
		      comment_3_9_text.setText(Instruments.comments[8]);
		      comment_3_10_text.setText(Instruments.comments[9]);
		      comment_3_11_text.setText(Instruments.comments[10]);
		      comment_3_12_text.setText(Instruments.comments[11]);
		      comment_3_13_text.setText(Instruments.comments[12]);
		      comment_3_14_text.setText(Instruments.comments[13]);
		      comment_3_15_text.setText(Instruments.comments[14]);
		      comment_3_16_text.setText(Instruments.comments[15]);
		      comment_3_17_text.setText(Instruments.comments[16]);
		      comment_3_18_text.setText(Instruments.comments[17]);
		      comment_3_19_text.setText(Instruments.comments[18]);
		      comment_3_20_text.setText(Instruments.comments[19]);
		      
	      }
	      
	      comment_4_1.setText(Instruments.comments[39]);
	      comment_4_2.setText(Instruments.comments[40]);
	      comment_4_3.setText(Instruments.comments[41]);
	      comment_4_4.setText(Instruments.comments[42]);
	      comment_4_5.setText(Instruments.comments[43]);
	      comment_4_6.setText(Instruments.comments[44]);
	      comment_4_7.setText(Instruments.comments[45]);
	      comment_4_8.setText(Instruments.comments[46]);
	      comment_4_9.setText(Instruments.comments[47]);
	      comment_4_10.setText(Instruments.comments[48]);
	      comment_4_11.setText(Instruments.comments[49]);
	      comment_4_12.setText(Instruments.comments[50]);
	      comment_4_13.setText(Instruments.comments[51]);
	      comment_4_14.setText(Instruments.comments[52]);
	      comment_4_15.setText(Instruments.comments[53]);
	      comment_4_16.setText(Instruments.comments[54]);
	      comment_4_17.setText(Instruments.comments[55]);
	      comment_4_18.setText(Instruments.comments[56]);
	      comment_4_19.setText(Instruments.comments[57]);
	      comment_4_20.setText(Instruments.comments[58]);
	      comment_4_21.setText(Instruments.comments[59]);
	      comment_4_22.setText(Instruments.comments[60]);
	      comment_4_23.setText(Instruments.comments[61]);
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
