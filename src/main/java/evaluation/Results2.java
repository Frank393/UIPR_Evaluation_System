package evaluation;

import java.io.FileNotFoundException;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument; 
import com.itextpdf.kernel.pdf.PdfWriter; 

import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.AreaBreakType;
import com.itextpdf.layout.property.TextAlignment;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;  



public class Results2 {
	Instruments mm = new Instruments();
	ValenciasRango vr = new ValenciasRango(mm.rangoNum());
	ValenciasRubrica rub = new ValenciasRubrica();
	Login_backend lg = new Login_backend();
	ConfigBackend cb = new ConfigBackend();
	String rangoText;
	int[] valencia = new int [18];
	

	public Results2 () throws Exception {  
		
		rankFill();
		// Creating a PdfDocument object   
		String dest = "./Results.pdf";   
		PdfWriter writer = new PdfWriter(dest);       

		// Creating a PdfDocument object      
		PdfDocument pdf = new PdfDocument(writer);                  

		// Creating a Document object       
		Document doc = new Document(pdf);  

		PdfFont font = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);

		Paragraph paragraph1 = new Paragraph().setFont(font);
		Paragraph paragraph2 = new Paragraph().setFont(font);
		Paragraph paragraph3 = new Paragraph().setFont(font);
		Paragraph paragraph4 = new Paragraph().setFont(font);
		Paragraph paragraph5 = new Paragraph().setFont(font);
		Paragraph paragraph6 = new Paragraph().setFont(font);
		Paragraph paragraph7 = new Paragraph().setFont(font);
		Paragraph paragraph8 = new Paragraph().setFont(font);
		Paragraph paragraph9 = new Paragraph().setFont(font);
		Paragraph paragraph10 = new Paragraph().setFont(font);


		paragraph1.add("Universidad Interamericana de Puerto Rico \n" + "Recinto de Bayam�n").setTextAlignment(TextAlignment.CENTER);
		paragraph2.add("VALENCIAS DE LOS SUBCRITERIOS DE EVALUACI�N DE FACULTAD").setTextAlignment(TextAlignment.CENTER).setPaddingTop(10);
		paragraph3.add("Profesor: _________________________\t\t\t\t\t\t\t\t").setTextAlignment(TextAlignment.LEFT).setPaddingTop(10);
		paragraph3.add("\t\t\t\t\t\t\t\t\t\t\t\t\t\t Departamento: _________________________").setTextAlignment(TextAlignment.LEFT).setPaddingTop(10);

		paragraph4.add("Fecha: _________________________").setTextAlignment(TextAlignment.LEFT).setPaddingTop(10);
		paragraph5.add("(MM/DD/YY)").setTextAlignment(TextAlignment.LEFT).setPaddingLeft(70).setMarginTop(-10);
		paragraph6.add(rangoText).setTextAlignment(TextAlignment.CENTER);


		// Creating a table       
		float [] pointColumnWidths = {160F, 250F, 160F};   
		Table table = new Table(pointColumnWidths).setFont(font); 
		Table table2 =  new Table(pointColumnWidths).setFont(font);

		table.addCell(new Cell().add("I. Experiencia y Calidad Docente").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          
		table.addCell(new Cell().add(rangoText).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          
		table.addCell(new Cell().add("Puntuacion Obtenida").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));    

		table.addCell(new Cell().add("a. Dominio de la disciplina que ense�a.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(valencia[0])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(rub.CalidadDocente()[0])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("b. Habilidad para organizar el contenido y presentarlo en forma clara, l�gica e imaginativa.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(valencia[1])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(rub.CalidadDocente()[1])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("c. Conocimiento de los desarrollos actuales de la disciplina.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(valencia[2])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(rub.CalidadDocente()[2])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("d. Habilidad para relacionar la disciplina con otras esferas de conocimiento.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(valencia[3])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(rub.CalidadDocente()[3])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("e. Habilidad para promover y ampliar el inter�s del estudiante en la disciplina.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(valencia[4])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(rub.CalidadDocente()[4])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("f. Habilidad para desarrollar y utilizar m�todos y estrategias adecuadas, incluyendo el �assessment� para una ense�anza efectiva.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(valencia[5])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(40).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(rub.CalidadDocente()[5])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(40).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("g. Disponibilidad y eficacia en la orientaci�n acad�mica del estudiante. \n" + "h. Posesi�n de los atributos de integridad, laboriosidad, liberalidad y objetividad en la ense�anza." ).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(valencia[6])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(50).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(rub.CalidadDocente()[6])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(50).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("II. Servicio a la Instituci�n").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
		table.addCell(new Cell().add(rangoText).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
		table.addCell(new Cell().add("Puntuacion Obtenida").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));    

		table.addCell(new Cell().add("a. Trabajo en comit�s de facultad a nivel departamental.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(valencia[7])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(rub.ServicioInstitucion()[0])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("b. Participaci�n y aportaci�n a reuniones de facultad y de comit�s a nivel de Recinto.\n"
				+ "c. Servicio en comit�s y en organizaciones a nivel institucional.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(valencia[8])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(40).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(rub.ServicioInstitucion()[1])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(40).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("d. Colaboraci�n en actividades estudiantiles. \n" + "e. Asistencia a actos oficiales.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(valencia[9])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(30).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(rub.ServicioInstitucion()[2])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(30).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("f. Designaci�n como director/a de departamento, presidente de comit� y otras.\n"
				+ "g. Participaci�n en organismos de gobierno; tales como: el Senado y el Consejo Universitario.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(valencia[10])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(50).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(rub.ServicioInstitucion()[3])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(50).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("III. Servicio a la Comunidad").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
		table.addCell(new Cell().add(rangoText).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
		table.addCell(new Cell().add("Puntuacion Obtenida").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));    

		table.addCell(new Cell().add("a. Servicio en el campo profesional del profesor como consultor o investigador.\n"
				+ "b. Servicio como recurso: conferenciante de grupos de la comunidad, participaci�n activa en gestiones pol�ticas, religiosas o c�vicas.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(valencia[11])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(70).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(rub.ServicioComunidad())).setTextAlignment(TextAlignment.CENTER).setPaddingTop(70).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("IV. Investigaci�n y Trabajo Creativo").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
		table.addCell(new Cell().add(rangoText).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
		table.addCell(new Cell().add("Puntuacion Obtenida").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));    

		table.addCell(new Cell().add("a. Publicaciones").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(valencia[12])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(rub.InvestigacionTrabajo()[0])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("b. Presentaciones y trabajos creativos relacionados con la disciplina que ense�a.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(valencia[13])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(15).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(rub.InvestigacionTrabajo()[1])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(15).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  


		table.addCell(new Cell().add("c. Propuestas dise�adas y presentadas. \n"
				+ "d. Concesi�n de ayudas para investigaci�n y proyectos. \n" + "e. Invenciones, patentes, labor art�stica y actuaci�n").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(valencia[14])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(35).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(rub.InvestigacionTrabajo()[2])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(35).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("V. Crecimiento y Desarrollo Profesional").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
		table.addCell(new Cell().add(rangoText).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
		table.addCell(new Cell().add("Puntuacion Obteninda").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));    

		table.addCell(new Cell().add("a. Obtenci�n de premios, ayudas y becas.\n"
				+ "b. Nombramiento como asesor/a en agencias de gobierno estatal o federal. \n" + "c. Participaci�n activa en organizaciones profesionales.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(valencia[15])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(65).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(rub.CrecimientoDesarrollo()[0])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(65).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("d. Recurso en conferencia y charlas.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(valencia[16])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(rub.CrecimientoDesarrollo()[1])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("e. Participaci�n en conferencias, congresos o institutos.\n"
				+ "f. Educaci�n post doctoral, educaci�n continua.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(valencia[17])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add(String.valueOf(rub.CrecimientoDesarrollo()[2])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		paragraph8.add("El/la profesor/a ________________________________________ cumple con los criterios requeridos para el Rango de Catedr�tico Asociado,  seg�n consta en la Parte II, 2.2.3 del Manual de Facultad y "
				+ "cumple con los criterios de Experiencia y Calidad Docente, Servicio a la Instituci�n y Servicio a la Comunidad,"
				+ " seg�n descritos en la Parte V,  5.6 y en las Gu�as para la Evaluaci�n del Personal Docente,  correspondientes al rango que solicita. \n").setTextAlignment(TextAlignment.LEFT);
		paragraph8.add("\nEste comit� recomienda en forma ____________________ que se le otorgue a el/la _________________ el ascenso en rango de Catedr�tico/a Auxiliar a Catedr�tico/a Asociado/a. \n\n").setTextAlignment(TextAlignment.LEFT);///////////////////////////////
		paragraph9.add("Miembros del Comit� de Evaluaci�n Sumativa:").setTextAlignment(TextAlignment.LEFT);
		paragraph9.add("\n\n____________________________________").setTextAlignment(TextAlignment.LEFT);
		paragraph9.add("\n____________________________________").setTextAlignment(TextAlignment.LEFT);
		paragraph9.add("\n____________________________________").setTextAlignment(TextAlignment.LEFT);

		paragraph10.add("____________________________________\n").setTextAlignment(TextAlignment.RIGHT);
		paragraph10.add("Firma del/a Profesor/a Evaluado/a").setTextAlignment(TextAlignment.RIGHT);
		paragraph10.add("\n\n____________________________________\n").setTextAlignment(TextAlignment.RIGHT);
		paragraph10.add("Fecha").setTextAlignment(TextAlignment.RIGHT);



		doc.add(paragraph1);
		doc.add(paragraph2);
		doc.add(paragraph3);
		doc.add(paragraph4);
		doc.add(paragraph5);
		doc.add(paragraph6);


		doc.add(table);
		doc.add(table2);
		doc.add(paragraph7);

		doc.add(paragraph8);
		doc.add(paragraph9);
		doc.add(paragraph10);

		doc.add(new AreaBreak(AreaBreakType.NEXT_PAGE));

		/////////////////////////////////////////////Manual//////////////////////////////////////////////////////
		float [] pointColumnWidths2 = {200F, 200F};   
		Table table3 =  new Table(pointColumnWidths2).setFont(font);

		if (mm.gettipo()== 1) {

			table3.addCell(new Cell().add("Premisa").setTextAlignment(TextAlignment.CENTER).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          
			table3.addCell(new Cell().add("Comentario").setTextAlignment(TextAlignment.CENTER).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          

			table3.addCell(new Cell().add("I. Experiencia y Calidad Docente").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          
			table3.addCell(new Cell().add("").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));    

			table3.addCell(new Cell().add("a. Dominio de la disciplina que ense�a.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[62]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("b. Habilidad para organizar el contenido y presentarlo en forma clara, l�gica e imaginativa.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[63]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("c. Conocimiento de los desarrollos actuales de la disciplina.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[64]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("d. Habilidad para relacionar la disciplina con otras esferas de conocimiento.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[65]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("e. Habilidad para promover y ampliar el inter�s del estudiante en la disciplina.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[66]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("f. Habilidad para desarrollar y utilizar m�todos y estrategias adecuadas, incluyendo el �assessment� para una ense�anza efectiva.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[67]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(40).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("g. Disponibilidad y eficacia en la orientaci�n acad�mica del estudiante. \n" + "h. Posesi�n de los atributos de integridad, laboriosidad, liberalidad y objetividad en la ense�anza." ).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[68]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(50).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("II. Servicio a la Instituci�n").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
			table3.addCell(new Cell().add("").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));    

			table3.addCell(new Cell().add("a. Trabajo en comit�s de facultad a nivel departamental.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[69]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(15).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("b. Participaci�n y aportaci�n a reuniones de facultad y de comit�s a nivel de Recinto.\n"
					+ "c. Servicio en comit�s y en organizaciones a nivel institucional.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[70]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(40).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("d. Colaboraci�n en actividades estudiantiles. \n" + "e. Asistencia a actos oficiales.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[71]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("f. Designaci�n como director/a de departamento, presidente de comit� y otras.\n"
					+ "g. Participaci�n en organismos de gobierno; tales como: el Senado y el Consejo Universitario.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[72]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(50).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("III. Servicio a la Comunidad").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
			table3.addCell(new Cell().add("").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));    

			table3.addCell(new Cell().add("a. Servicio en el campo profesional del profesor como consultor o investigador.\n"
					+ "b. Servicio como recurso: conferenciante de grupos de la comunidad, participaci�n activa en gestiones pol�ticas, religiosas o c�vicas.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[73]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(70).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("IV. Investigaci�n y Trabajo Creativo").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
			table3.addCell(new Cell().add("").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));    

			table3.addCell(new Cell().add("a. Publicaciones").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[74]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("b. Presentaciones y trabajos creativos relacionados con la disciplina que ense�a.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[75]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  


			table3.addCell(new Cell().add("c. Propuestas dise�adas y presentadas. \n"
					+ "d. Concesi�n de ayudas para investigaci�n y proyectos. \n" + "e. Invenciones, patentes, labor art�stica y actuaci�n").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[76]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(65).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("V. Crecimiento y Desarrollo Profesional").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
			table3.addCell(new Cell().add("").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));    

			table3.addCell(new Cell().add("a. Obtenci�n de premios, ayudas y becas.\n"
					+ "b. Nombramiento como asesor/a en agencias de gobierno estatal o federal. \n" + "c. Participaci�n activa en organizaciones profesionales.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[77]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(40).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("d. Recurso en conferencia y charlas.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[78]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("e. Participaci�n en conferencias, congresos o institutos.\n"
					+ "f. Educaci�n post doctoral, educaci�n continua.").setBorder(Border.NO_BORDER));       
			table3.addCell(new Cell().add(Instruments.comments[79]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER));  

			//////////////////////instrumento 3////////////////
			table3.addCell(new Cell().add("Premisa").setTextAlignment(TextAlignment.CENTER).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          
			table3.addCell(new Cell().add("Comentario").setTextAlignment(TextAlignment.CENTER).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          

			table3.addCell(new Cell().add("Visita al salon de clase").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          
			table3.addCell(new Cell().add("").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));    

			table3.addCell(new Cell().add("1. Domina el tema discutido en clase.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[0]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("2. Usa ejemplos o ejercicios relacionados con el tema de la clase.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[1]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("3. Integra conceptos o experiencias de otras disciplinas para enriquecer la clase.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[2]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("4. Relaciona la utilidad del tema con otros cursos o areas del conocimiento.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[3]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("5. Presenta el tema en forma actualizada.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[4]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("6. Incorpora en la clase las nuevas tendencias de la disciplina.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[5]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("7. Presenta el material de la clase en forma organizada y coherente.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[6]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("8. Utiliza el vocabulario propio de la materia.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[7]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("9. Cumple con los objetivos establecidos para la clase.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[8]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("10. Utiliza el tiempo de la clase de acuerdo con los objetivos establecidos").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[9]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("11. Resume los conceptos discutidos en clase y las actividades planificadas.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[10]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("12. Estimula la participacion de los estudiantes en la clase").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[11]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("13. Mantiene un clima de confianza y respeto.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[12]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("14. Facilita relacionar el contenido de la clase con las experiencias del estudiante en su  diario vivir.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[13]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("15. Promueve la discusion para complementar, aclarar o enriquecer la clase.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[14]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("16. Promueve en los estudiantes la busqueda de informacion y otras experiensas que enriquezcan sus conocimientos y estimulen el pensamiento critico.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[15]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("17. Fomenta la colaboraci�n y el trabajo en equipo entre los estudiantes.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[16]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("18. Utiliza recursos de apoyo (pizarra, materiales educativos o tecnol�gicos) adecuados para desarrollar la clase.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[17]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("19. Utiliza estrategias y metodos que promueven el aprendizaje de los estudiantes.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[18]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("20. Utiliza estrategias para verificar si los estudiantes entienden el material durante el transcurso de la clase.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[19]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			///////////////////////////////
			//////////////////////instrumento 4////////////////
			table3.addCell(new Cell().add("Premisa").setTextAlignment(TextAlignment.CENTER).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          
			table3.addCell(new Cell().add("Comentario").setTextAlignment(TextAlignment.CENTER).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          

			table3.addCell(new Cell().add("Evaluacion al Director").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          
			table3.addCell(new Cell().add("").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));    

			table3.addCell(new Cell().add("1. Cumple con las horas de oficina seg�n establecidas.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[39]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("2. Presenta evidencia sobre las diferentes formas en la que cumple con la consejer�a acad�mica ofrecida a sus estudiantes, seg�n definida en el Manual de la Facultad").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[40]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("3. Informa al Director del Departamento sobre sus ausencias.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[41]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("4. Informa al Director del Departamento c�mo repone sus ausencias.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[42]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("5. Contribuye a las deliberaciones de las reuniones de su Departamento.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[43]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("6. Colabora en las actividades que desarrolla el Departamento.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[44]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("7. Cumple con las normas y procedimientos de la Instituci�n. Somete dentro del tiempo establecido por la Universidad y la unidad acad�mica, "
					+ "los siguientes documentos: el cotejo de listas, el informe de estudiantes que nunca han las calificaciones finales, la remoci�n de incompletos, la notificaci�n de extramuros, "
					+ "los horarios de clase, entre otros, y sigue el calendario acad�mico.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[45]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("8. Atiende las indicaciones, memorandos y recomendaciones del personal gerencial.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[46]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("9. Est� disponible para ofrecer cursos, seg�n las necesidades establecidas en el horario de clases para la oferta acad�mica del t�rmino.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[47]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("10. Participa en comit�s departamentales, de la unidad acad�mica, institucional o en organismos universitarios cuando as� se le solicita.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[48]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("11. Asiste a las convocatorias de facultad, tales como actividades de reconocimientos acad�micos a estudiantes, el Servicio de Graduaci�n, la Graduaci�n, entre otros.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[49]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("12. Asiste a actividades de desarrollo profesional como congresos, seminarios, cursos de educaci�n continuada, entre otros.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[50]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("13. Mantiene un clima de respeto con los colegas y con los compa�eros de trabajo").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[51]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("14. Mantiene un clima de respeto con los estudiantes.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[52]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("15. Contribuye al enriquecimiento de los recursos del Centro de Acceso a la Informaci�n.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[53]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("16. Contribuye al mejoramiento y actualizaci�n de su disciplina o de la materia que ense�a, a trav�s del dise�o de cursos nuevos, la preparaci�n de materiales educativos o de prontuarios, proyectos innovadores, "
					+ "entre otros.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[54]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("17. Est� disponible para ense�ar cursos en diferentes modalidades de estudio (por ejemplo, estudio independiente, contrato, cursos en l�nea, combinados, entre otros).").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[55]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("18. Trabaja con sus compa�eros en tareas de equipo cuando es necesario.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[56]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("19. Evidencia en sus cursos el uso de los resultados del assessment de los cursos y del programa para el mejoramiento de los logros en el aprendizaje de los estudiantes..").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[57]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("20. Colabora con el fortalecimiento de los programas acad�micos.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[58]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("Fortalezas del evaluado").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[59]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("Areas que debe mejorar").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[60]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("Recomendacion para el plan de Accion del profesor evaluado").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(Instruments.comments[61]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			doc.add(table3);
			System.out.println("PDF2 Manual created successfully..");
			System.out.println(String.valueOf(valencia[0])); 
			System.out.println("Calidad docente" + rub.CalidadDocente()[0]); 
			////////////////////////////////// Manual //////////////////////////////////


		} else if (mm.gettipo() == 0) {
			/////////////////////// Online ////////////////////
			table3.addCell(new Cell().add("Premisa").setTextAlignment(TextAlignment.CENTER).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          
			table3.addCell(new Cell().add("Comentario").setTextAlignment(TextAlignment.CENTER).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          
			/////////////////////// Instrumento 1///////////////////////////////
			table3.addCell(new Cell().add("Otras Apreciaciones del estudiante").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          
			table3.addCell(new Cell().add("")).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2));    

			Instruments onlineC = new Instruments();
			String[] coments = onlineC.getvalue();
			
			table3.addCell(new Cell().add("�Qu� fue lo que m�s te gust� del curso?").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(String.valueOf(coments[38])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("�Qu� fue lo que menos te gust� del curso?").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(String.valueOf(coments[39])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("�Tomar�as otro curso en l�nea con el mismo profesor o lo recomendar�as a un compa�ero? Explica.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(String.valueOf(coments[40])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("�Qu� sugerencias har�as para que el profesor mejore su ense�anza  y participe m�s en tu aprendizaje en esta modalidad?").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(String.valueOf(coments[41])).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			///////////////////////////////////////////////////////////////////
			table3.addCell(new Cell().add("I. Experiencia y Calidad Docente").setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          
			table3.addCell(new Cell().add("").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));    

			table3.addCell(new Cell().add("a. Dominio de la disciplina que ense�a.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[144]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("b. Habilidad para organizar el contenido y presentarlo en forma clara, l�gica e imaginativa.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[145]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("c. Conocimiento de los desarrollos actuales de la disciplina.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[146]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("d. Habilidad para relacionar la disciplina con otras esferas de conocimiento.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[147]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("e. Habilidad para promover y ampliar el inter�s del estudiante en la disciplina.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[148]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("f. Habilidad para desarrollar y utilizar m�todos y estrategias adecuadas, incluyendo el �assessment� para una ense�anza efectiva.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[149]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(40).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("g. Disponibilidad y eficacia en la orientaci�n acad�mica del estudiante. \n" + "h. Posesi�n de los atributos de integridad, laboriosidad, liberalidad y objetividad en la ense�anza." ).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[150]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(50).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("II. Servicio a la Instituci�n").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
			table3.addCell(new Cell().add("").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));    

			table3.addCell(new Cell().add("a. Trabajo en comit�s de facultad a nivel departamental.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[151]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(15).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("b. Participaci�n y aportaci�n a reuniones de facultad y de comit�s a nivel de Recinto.\n"
					+ "c. Servicio en comit�s y en organizaciones a nivel institucional.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[152]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(40).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("d. Colaboraci�n en actividades estudiantiles. \n" + "e. Asistencia a actos oficiales.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[153]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("f. Designaci�n como director/a de departamento, presidente de comit� y otras.\n"
					+ "g. Participaci�n en organismos de gobierno; tales como: el Senado y el Consejo Universitario.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[154]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(50).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("III. Servicio a la Comunidad").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
			table3.addCell(new Cell().add("").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));    

			table3.addCell(new Cell().add("a. Servicio en el campo profesional del profesor como consultor o investigador.\n"
					+ "b. Servicio como recurso: conferenciante de grupos de la comunidad, participaci�n activa en gestiones pol�ticas, religiosas o c�vicas.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[155]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(70).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("IV. Investigaci�n y Trabajo Creativo").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
			table3.addCell(new Cell().add("").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));    

			table3.addCell(new Cell().add("a. Publicaciones").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[156]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("b. Presentaciones y trabajos creativos relacionados con la disciplina que ense�a.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[157]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  


			table3.addCell(new Cell().add("c. Propuestas dise�adas y presentadas. \n"
					+ "d. Concesi�n de ayudas para investigaci�n y proyectos. \n" + "e. Invenciones, patentes, labor art�stica y actuaci�n").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[158]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(65).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("V. Crecimiento y Desarrollo Profesional").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
			table3.addCell(new Cell().add("").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));    

			table3.addCell(new Cell().add("a. Obtenci�n de premios, ayudas y becas.\n"
					+ "b. Nombramiento como asesor/a en agencias de gobierno estatal o federal. \n" + "c. Participaci�n activa en organizaciones profesionales.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[159]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(40).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("d. Recurso en conferencia y charlas.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[160]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("e. Participaci�n en conferencias, congresos o institutos.\n"
					+ "f. Educaci�n post doctoral, educaci�n continua.").setBorder(Border.NO_BORDER));       
			table3.addCell(new Cell().add(coments[161]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER));  

			//////////////////////instrumento 3////////////////
			table3.addCell(new Cell().add("Premisa").setTextAlignment(TextAlignment.CENTER).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          
			table3.addCell(new Cell().add("Comentario").setTextAlignment(TextAlignment.CENTER).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          

			table3.addCell(new Cell().add("Dominio de la disciplina y su relacion con otras esferas del conocimiento.").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          
			table3.addCell(new Cell().add("").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));    

			table3.addCell(new Cell().add("1. Mediante la interacci�n con los estudiantes, el profesor demostr�   conocimiento suficiente del tema evaluado.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[101]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("2. Mediante la interacci�n con los estudiantes, el profesor integr� conceptos o experiencias de otras disciplinas para enriquecer el tema evaluado.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[102]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("3. El profesor resalt� la utilidad del tema para otros cursos o �reas del conocimiento.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[103]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("4. El profesor facilit� que los estudiantes relacionen el tema con sus experiencias personales o el mundo del trabajo.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[104]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("5. El profesor ejerci� la docencia como un gu�a o facilitador de los estudiantes, mediante la comunicaci�n e interacci�n con los mismos, as� como en las diversas actividades docentes.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[105]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("6. En su interacci�n con los estudiantes, el profesor utiliz� un lenguaje que corresponde con el nivel de los estudiantes en el curso.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[106]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("7. El profesor promovi� la comunicaci�n e interacci�n estudiante-estudiante.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[107]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("8. El profesor foment� la comunicaci�n e interacci�n estudiante-profesor.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[108]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("9. El profesor planific� la distribuci�n del tiempo de forma tal que los estudiantes pueden cumplir con los objetivos establecidos.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[109]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("10. El profesor inform� a los estudiantes del tiempo estimado para responder a los mensajes, para informar sobre los resultados de los ex�menes, asignaciones y otros trabajos corregidos; aunque el dise�o del curso pueda incluir algo sobre esto.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[110]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("11. El profesor inform� a los estudiantes de los resultados de las actividades realizadas por aquellos no m�s tarde de dos semanas de haber sido entregados durante el semestre o su equivalente en los diversos t�rminos acad�micos. ").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[111]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("12. El profesor respondi� en el tiempo establecido, los mensajes, las preguntasy las consultas de los estudiantes, que se recibieron mediante el correo electr�nico.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[112]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("13. El profesor utiliz� las herramientas disponibles en la plataforma y present� elcontenido del curso en forma organizada y coherente.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[113]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("14. El profesor mantuvo un clima de confianza y respeto").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[114]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("15. El profesor facilit� la discusi�n para complementar, aclarar o enriquecer").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[115]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("16. El profesor promovi� la b�squeda de informaci�n o experiencias para enriqueser el conocimento.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[116]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("17. El profesor foment� el pensamiento cr�tico.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[117]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("18. El profesor aport� recursos de apoyo adicionales para enriquecer el tema evaluado.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[118]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("19. El profesor utiliz� diferentes recursos de ense�anza para facilitar el aprendizajePor ejemplo: trabajo colaborativo, v�deos, presentaciones, seminarios y conferencias a trav�s de la web, entre otros.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[119]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			///////////////////////////////
			//////////////////////instrumento 4////////////////
			table3.addCell(new Cell().add("Premisa").setTextAlignment(TextAlignment.CENTER).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          
			table3.addCell(new Cell().add("Comentario").setTextAlignment(TextAlignment.CENTER).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          

			table3.addCell(new Cell().add("Evaluacion al Director").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          
			table3.addCell(new Cell().add("").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));    

			table3.addCell(new Cell().add("1. Cumple con las horas de oficina seg�n establecidas.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[121]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("2. Presenta evidencia sobre las diferentes formas en la que cumple con la consejer�a acad�mica ofrecida a sus estudiantes, seg�n definida en el Manual de la Facultad").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[122]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("3. Informa al Director del Departamento sobre sus ausencias.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[123]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("4. Informa al Director del Departamento c�mo repone sus ausencias.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[124]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("5. Contribuye a las deliberaciones de las reuniones de su Departamento.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[125]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("6. Colabora en las actividades que desarrolla el Departamento.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[126]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("7. Cumple con las normas y procedimientos de la Instituci�n. Somete dentro del tiempo establecido por la Universidad y la unidad acad�mica, "
					+ "los siguientes documentos: el cotejo de listas, el informe de estudiantes que nunca han las calificaciones finales, la remoci�n de incompletos, la notificaci�n de extramuros, "
					+ "los horarios de clase, entre otros, y sigue el calendario acad�mico.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[127]).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("8. Atiende las indicaciones, memorandos y recomendaciones del personal gerencial.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[128]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("9. Est� disponible para ofrecer cursos, seg�n las necesidades establecidas en el horario de clases para la oferta acad�mica del t�rmino.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[129]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("10. Participa en comit�s departamentales, de la unidad acad�mica, institucional o en organismos universitarios cuando as� se le solicita.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[130]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("11. Asiste a las convocatorias de facultad, tales como actividades de reconocimientos acad�micos a estudiantes, el Servicio de Graduaci�n, la Graduaci�n, entre otros.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[131]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("12. Asiste a actividades de desarrollo profesional como congresos, seminarios, cursos de educaci�n continuada, entre otros.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[132]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("13. Mantiene un clima de respeto con los colegas y con los compa�eros de trabajo").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[133]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("14. Mantiene un clima de respeto con los estudiantes.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[134]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("15. Contribuye al enriquecimiento de los recursos del Centro de Acceso a la Informaci�n.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[135]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("16. Contribuye al mejoramiento y actualizaci�n de su disciplina o de la materia que ense�a, a trav�s del dise�o de cursos nuevos, la preparaci�n de materiales educativos o de prontuarios, proyectos innovadores, "
					+ "entre otros.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[136]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("17. Est� disponible para ense�ar cursos en diferentes modalidades de estudio (por ejemplo, estudio independiente, contrato, cursos en l�nea, combinados, entre otros).").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[137]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("18. Trabaja con sus compa�eros en tareas de equipo cuando es necesario.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[138]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("19. Evidencia en sus cursos el uso de los resultados del assessment de los cursos y del programa para el mejoramiento de los logros en el aprendizaje de los estudiantes..").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[139]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("20. Colabora con el fortalecimiento de los programas acad�micos.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[140]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("Fortalezas del evaluado").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[141]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("Areas que debe mejorar").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[142]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			table3.addCell(new Cell().add("Recomendacion para el plan de Accion del profesor evaluado").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
			table3.addCell(new Cell().add(coments[143]).setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

			doc.add(table3);

			
			System.out.println("PDF2 online created successfully..");

		}
		doc.close();
	}
	public void rankFill() throws FileNotFoundException {

		cb.fillValen(lg.getID());
		int rango = mm.rangoNum();
		//int rango = 1;
		int sum = 0;


		if (rango == 1) {
			for(int i = 0;i < 18;i++) {
				rangoText = "Rango Catedratico Asociado";
				valencia[sum] = ConfigBackend.valen[i];
				sum++;
			}
		}

		else if (rango == 2) {
			for(int i = 18;i < 36;i++) {
				rangoText = "Rango Catedratico Auxiliar";
				valencia[sum] = ConfigBackend.valen[i];
				sum++;
			}
		}

		else if (rango == 3) {
			for(int i = 37;i < 54;i++) {
				rangoText = "Rango Catedratico";
				valencia[sum] = ConfigBackend.valen[i];
				sum++;
			}
		}
	}
}
