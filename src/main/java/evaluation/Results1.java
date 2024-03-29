package evaluation;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

public class Results1 {
	public Results1() throws Exception {    

		String[] fac = new String[162];
		Instruments In = new Instruments();
		int i = 1;
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


		paragraph1.add("Universidad Interamericana de Puerto Rico \n" + "Recinto de Bayam贸n").setTextAlignment(TextAlignment.CENTER);
		paragraph2.add("VALENCIAS DE LOS SUBCRITERIOS DE EVALUACI脫N DE FACULTAD").setTextAlignment(TextAlignment.CENTER).setPaddingTop(10);
		paragraph3.add("Profesor: _________________________\t\t\t\t\t\t\t\t").setTextAlignment(TextAlignment.LEFT).setPaddingTop(10);
		paragraph3.add("\t\t\t\t\t\t\t\t\t\t\t\t\t\t Departamento: _________________________").setTextAlignment(TextAlignment.LEFT).setPaddingTop(10);

		paragraph4.add("Fecha: _________________________").setTextAlignment(TextAlignment.LEFT).setPaddingTop(10);
		paragraph5.add("(MM/DD/YY)").setTextAlignment(TextAlignment.LEFT).setPaddingLeft(70).setMarginTop(-10);
		paragraph6.add("RANGO CATEDR肨ICO AUXILIAR").setTextAlignment(TextAlignment.CENTER);


		// Creating a table       
		float [] pointColumnWidths = {160F, 250F, 160F};   
		Table table = new Table(pointColumnWidths).setFont(font); 
		Table table2 =  new Table(pointColumnWidths).setFont(font);

		table.addCell(new Cell().add("I. Experiencia y Calidad Docente").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          
		table.addCell(new Cell().add("Catedratico Auxiliar Valencia (67%)").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          
		table.addCell(new Cell().add("Puntuacion Obtenida").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));    

		table.addCell(new Cell().add("a. Dominio de la disciplina que ense帽a.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("16").setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("b. Habilidad para organizar el contenido y presentarlo en forma clara, l贸gica e imaginativa.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("12").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("c. Conocimiento de los desarrollos actuales de la disciplina.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("8").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("d. Habilidad para relacionar la disciplina con otras esferas de conocimiento.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("6").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("e. Habilidad para promover y ampliar el inter茅s del estudiante en la disciplina.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("6").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("f. Habilidad para desarrollar y utilizar m茅todos y estrategias adecuadas, incluyendo el 鈥渁ssessment鈥 para una ense帽anza efectiva.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("9").setTextAlignment(TextAlignment.CENTER).setPaddingTop(40).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(40).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("g. Disponibilidad y eficacia en la orientaci贸n acad茅mica del estudiante. \n" + "h. Posesi贸n de los atributos de integridad, laboriosidad, liberalidad y objetividad en la ense帽anza." ).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("10").setTextAlignment(TextAlignment.CENTER).setPaddingTop(50).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(50).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("II. Servicio a la Instituci贸n").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
		table.addCell(new Cell().add("Catedratico Auxiliar Valencia (12%)").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
		table.addCell(new Cell().add("Puntuacion Obtenida").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));    

		table.addCell(new Cell().add("a. Trabajo en comit茅s de facultad a nivel departamental.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("3").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("b. Participaci贸n y aportaci贸n a reuniones de facultad y de comit茅s a nivel de Recinto.\n"
				+ "c. Servicio en comit茅s y en organizaciones a nivel institucional.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("4").setTextAlignment(TextAlignment.CENTER).setPaddingTop(40).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(40).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("d. Colaboraci贸n en actividades estudiantiles. \n" + "e. Asistencia a actos oficiales.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("2").setTextAlignment(TextAlignment.CENTER).setPaddingTop(30).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(30).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("f. Designaci贸n como director/a de departamento, presidente de comit茅 y otras.\n"
				+ "g. Participaci贸n en organismos de gobierno; tales como: el Senado y el Consejo Universitario.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("3").setTextAlignment(TextAlignment.CENTER).setPaddingTop(50).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(50).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("III. Servicio a la Comunidad").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
		table.addCell(new Cell().add("Catedratico Auxiliar Valencia (2%)").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
		table.addCell(new Cell().add("Puntuacion Obtenida").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));    

		table.addCell(new Cell().add("a. Servicio en el campo profesional del profesor como consultor o investigador.\n"
				+ "b. Servicio como recurso: conferenciante de grupos de la comunidad, participaci贸n activa en gestiones pol铆ticas, religiosas o c铆vicas.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("2").setTextAlignment(TextAlignment.CENTER).setPaddingTop(70).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(70).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		///////////////////////////////////////
		table.addCell(new Cell().add("IV. Investigaci贸n y Trabajo Creativo").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
		table.addCell(new Cell().add("Catedratico Auxiliar Valencia (10%)").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
		table.addCell(new Cell().add("Puntuacion Obtenida").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));    

		table.addCell(new Cell().add("a. Publicaciones").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("2").setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("b. Presentaciones y trabajos creativos relacionados con la disciplina que ense帽a.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("4").setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  


		table.addCell(new Cell().add("c. Propuestas dise帽adas y presentadas. \n"
				+ "d. Concesi贸n de ayudas para investigaci贸n y proyectos. \n" + "e. Invenciones, patentes, labor art铆stica y actuaci贸n").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("4").setTextAlignment(TextAlignment.CENTER).setPaddingTop(65).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(65).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		//////////////////////////////////////////////////////
		table.addCell(new Cell().add("V. Crecimiento y Desarrollo Profesional").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
		table.addCell(new Cell().add("Catedratico Auxiliar Valencia (9%)").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
		table.addCell(new Cell().add("Puntuacion Obtenida").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));    

		table.addCell(new Cell().add("a. Obtenci贸n de premios, ayudas y becas.\n"
				+ "b. Nombramiento como asesor/a en agencias de gobierno estatal o federal. \n" + "c. Participaci贸n activa en organizaciones profesionales.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("3").setTextAlignment(TextAlignment.CENTER).setPaddingTop(65).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(65).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("d. Recurso en conferencia y charlas.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("3").setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("e. Participaci贸n en conferencias, congresos o institutos.\n"
				+ "f. Educaci贸n post doctoral, educaci贸n continua.").setBorder(Border.NO_BORDER));       
		table.addCell(new Cell().add("3").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER));  

		//////////////////////////////////////////////
		table2.addCell(new Cell().add("CRITERIOS").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(1)).setBorderBottom(new SolidBorder(1))); 
		table2.addCell(new Cell().add("VALENCIAS").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(1)).setBorderBottom(new SolidBorder(1))); 
		table2.addCell(new Cell().add("DEL PROFESOR").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(1)).setBorderBottom(new SolidBorder(1)));  

		table2.addCell(new Cell().add("I. Experiencia y Calidad Docente").setBorder(Border.NO_BORDER).setPaddingTop(15));       
		table2.addCell(new Cell().add("67%").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setPaddingTop(20));       
		table2.addCell(new Cell().add("____________________________________").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setPaddingTop(20));  

		table2.addCell(new Cell().add("II. Servicio a la Instituci贸n").setBorder(Border.NO_BORDER));       
		table2.addCell(new Cell().add("12%").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setPaddingTop(5));       
		table2.addCell(new Cell().add("____________________________________").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setPaddingTop(5));  

		table2.addCell(new Cell().add("III. Servicio a la Comunidad").setBorder(Border.NO_BORDER));       
		table2.addCell(new Cell().add("2%").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setPaddingTop(10));       
		table2.addCell(new Cell().add("____________________________________").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setPaddingTop(10));

		table2.addCell(new Cell().add("IV. Investigaci贸n y Trabajo Creativo").setBorder(Border.NO_BORDER));       
		table2.addCell(new Cell().add("10%").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setPaddingTop(10));       
		table2.addCell(new Cell().add("____________________________________").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setPaddingTop(10));  

		table2.addCell(new Cell().add("V. Crecimiento y Desarrollo Profesional").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table2.addCell(new Cell().add("9%").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setPaddingTop(10).setBorderBottom(new SolidBorder(1)));       
		table2.addCell(new Cell().add("____________________________________").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setPaddingTop(10).setBorderBottom(new SolidBorder(1)));  
		paragraph7.add("Evaluaci贸n Promedio Final:").setTextAlignment(TextAlignment.CENTER);
		paragraph8.add("El/la profesor/a ________________________________________ cumple con los criterios requeridos para el Rango de Catedr谩tico Auxiliar,  seg煤n consta en la Parte II, 2.2.2 del Manual de Facultad y "
				+ "cumple con los criterios de  Calidad Docente, Servicio a la Instituci贸n y Servicio a la Comunidad,"
				+ " seg煤n descritos en la Parte V,  5.6 y en las Gu铆as para la Evaluaci贸n del Personal Docente,  correspondientes al rango que solicita. \n").setTextAlignment(TextAlignment.LEFT);
		paragraph8.add("\nEste comit茅 recomienda en forma ____________________ que se le otorgue a el/la _________________ el ascenso en rango de Instructor/a a Catedr谩tico/a Auxiliar \n\n").setTextAlignment(TextAlignment.LEFT);///////////////////////////////
		paragraph9.add("\n\n Miembros del Comit茅 de Evaluaci贸n Sumativa:").setTextAlignment(TextAlignment.LEFT);
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

		doc.close();
		System.out.println("PDF2 created successfully..");   
	}     
}
