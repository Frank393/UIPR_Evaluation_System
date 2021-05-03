package evaluation;

import java.io.IOException;

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



public class Results2 {
	public static void main(String args[]) throws Exception {  
		String[] fac = new String[162];
		Instruments In = new Instruments();
		int i = 2;

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


		paragraph1.add("Universidad Interamericana de Puerto Rico \n" + "Recinto de Bayamón").setTextAlignment(TextAlignment.CENTER);
		paragraph2.add("VALENCIAS DE LOS SUBCRITERIOS DE EVALUACIÓN DE FACULTAD").setTextAlignment(TextAlignment.CENTER).setPaddingTop(10);
		paragraph3.add("Profesor: _________________________\t\t\t\t\t\t\t\t").setTextAlignment(TextAlignment.LEFT).setPaddingTop(10);
		paragraph3.add("\t\t\t\t\t\t\t\t\t\t\t\t\t\t Departamento: _________________________").setTextAlignment(TextAlignment.LEFT).setPaddingTop(10);

		paragraph4.add("Fecha: _________________________").setTextAlignment(TextAlignment.LEFT).setPaddingTop(10);
		paragraph5.add("(MM/DD/YY)").setTextAlignment(TextAlignment.LEFT).setPaddingLeft(70).setMarginTop(-10);
		paragraph6.add("RANGO CATEDRÁTICO ASOCIADO").setTextAlignment(TextAlignment.CENTER);


		// Creating a table       
		float [] pointColumnWidths = {160F, 250F, 160F};   
		Table table = new Table(pointColumnWidths).setFont(font); 
		Table table2 =  new Table(pointColumnWidths).setFont(font);

		table.addCell(new Cell().add("I. Experiencia y Calidad Docente").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          
		table.addCell(new Cell().add("Catedratico Asociado Valencia (65%)").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));          
		table.addCell(new Cell().add("Puntuacion Obtenida").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(2)).setBorderBottom(new SolidBorder(2)));    

		table.addCell(new Cell().add("a. Dominio de la disciplina que enseña.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("15").setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("b. Habilidad para organizar el contenido y presentarlo en forma clara, lógica e imaginativa.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("10").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("c. Conocimiento de los desarrollos actuales de la disciplina.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("10").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("d. Habilidad para relacionar la disciplina con otras esferas de conocimiento.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("6").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("e. Habilidad para promover y ampliar el interés del estudiante en la disciplina.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("7").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("f. Habilidad para desarrollar y utilizar métodos y estrategias adecuadas, incluyendo el “assessment” para una enseñanza efectiva.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("9").setTextAlignment(TextAlignment.CENTER).setPaddingTop(40).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(40).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("g. Disponibilidad y eficacia en la orientación académica del estudiante. \n" + "h. Posesión de los atributos de integridad, laboriosidad, liberalidad y objetividad en la enseñanza." ).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("8").setTextAlignment(TextAlignment.CENTER).setPaddingTop(50).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(50).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("II. Servicio a la Institución").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
		table.addCell(new Cell().add("Catedratico Asociado Valencia (11%)").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
		table.addCell(new Cell().add("Puntuacion Obtenida").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));    

		table.addCell(new Cell().add("a. Trabajo en comités de facultad a nivel departamental.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("3").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("b. Participación y aportación a reuniones de facultad y de comités a nivel de Recinto.\n"
				+ "c. Servicio en comités y en organizaciones a nivel institucional.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("3").setTextAlignment(TextAlignment.CENTER).setPaddingTop(40).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(40).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("d. Colaboración en actividades estudiantiles. \n" + "e. Asistencia a actos oficiales.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("2").setTextAlignment(TextAlignment.CENTER).setPaddingTop(30).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(30).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("f. Designación como director/a de departamento, presidente de comité y otras.\n"
				+ "g. Participación en organismos de gobierno; tales como: el Senado y el Consejo Universitario.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("3").setTextAlignment(TextAlignment.CENTER).setPaddingTop(50).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(50).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("III. Servicio a la Comunidad").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
		table.addCell(new Cell().add("Catedratico Asociado Valencia (2%)").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
		table.addCell(new Cell().add("Puntuacion Obtenida").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));    

		table.addCell(new Cell().add("a. Servicio en el campo profesional del profesor como consultor o investigador.\n"
				+ "b. Servicio como recurso: conferenciante de grupos de la comunidad, participación activa en gestiones políticas, religiosas o cívicas.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("2").setTextAlignment(TextAlignment.CENTER).setPaddingTop(70).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(70).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("IV. Investigación y Trabajo Creativo").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
		table.addCell(new Cell().add("Catedratico Asociado Valencia (12%)").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
		table.addCell(new Cell().add("Puntuacion Obtenida").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));    

		table.addCell(new Cell().add("a. Obtención de premios, ayudas y becas.\n"
				+ "b. Nombramiento como asesor/a en agencias de gobierno estatal o federal. \n" + "c. Participación activa en organizaciones profesionales.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("4").setTextAlignment(TextAlignment.CENTER).setPaddingTop(65).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(65).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("d. Recurso en conferencia y charlas.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("3").setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("e. Participación en conferencias, congresos o institutos.\n"
				+ "f. Educación post doctoral, educación continua.").setBorder(Border.NO_BORDER));       
		table.addCell(new Cell().add("3").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER));  

		table.addCell(new Cell().add("V. Crecimiento y Desarrollo Profesional").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
		table.addCell(new Cell().add("Catedratico Asociado Valencia (12%)").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));          
		table.addCell(new Cell().add("Puntuacion Obtenida").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));    

		table.addCell(new Cell().add("a. Obtención de premios, ayudas y becas.\n"
				+ "b. Nombramiento como asesor/a en agencias de gobierno estatal o federal. \n" + "c. Participación activa en organizaciones profesionales.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("3").setTextAlignment(TextAlignment.CENTER).setPaddingTop(65).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(65).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("d. Recurso en conferencia y charlas.").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("4").setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(10).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));  

		table.addCell(new Cell().add("e. Participación en conferencias, congresos o institutos.\n"
				+ "f. Educación post doctoral, educación continua.").setBorder(Border.NO_BORDER));       
		table.addCell(new Cell().add("5").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER));       
		table.addCell(new Cell().add("PO1").setTextAlignment(TextAlignment.CENTER).setPaddingTop(20).setBorder(Border.NO_BORDER));  

		table2.addCell(new Cell().add("CRITERIOS").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(1)).setBorderBottom(new SolidBorder(1))); 
		table2.addCell(new Cell().add("VALENCIAS").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(1)).setBorderBottom(new SolidBorder(1))); 
		table2.addCell(new Cell().add("DEL PROFESOR").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(1)).setBorderBottom(new SolidBorder(1)));  

		table2.addCell(new Cell().add("I. Experiencia y Calidad Docente").setBorder(Border.NO_BORDER).setPaddingTop(15));       
		table2.addCell(new Cell().add("65%").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setPaddingTop(20));       
		table2.addCell(new Cell().add("____________________________________").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setPaddingTop(20));  

		table2.addCell(new Cell().add("II. Servicio a la Institución").setBorder(Border.NO_BORDER));       
		table2.addCell(new Cell().add("11%").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setPaddingTop(5));       
		table2.addCell(new Cell().add("____________________________________").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setPaddingTop(5));  

		table2.addCell(new Cell().add("III. Servicio a la Comunidad").setBorder(Border.NO_BORDER));       
		table2.addCell(new Cell().add("2%").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setPaddingTop(10));       
		table2.addCell(new Cell().add("____________________________________").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setPaddingTop(10));

		table2.addCell(new Cell().add("IV. Investigación y Trabajo Creativo").setBorder(Border.NO_BORDER));       
		table2.addCell(new Cell().add("12%").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setPaddingTop(10));       
		table2.addCell(new Cell().add("____________________________________").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setPaddingTop(10));  

		table2.addCell(new Cell().add("V. Crecimiento y Desarrollo Profesional").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(1)));       
		table2.addCell(new Cell().add("10%").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setPaddingTop(10).setBorderBottom(new SolidBorder(1)));       
		table2.addCell(new Cell().add("____________________________________").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setPaddingTop(10).setBorderBottom(new SolidBorder(1)));  
		paragraph7.add("Evaluación Promedio Final:").setTextAlignment(TextAlignment.CENTER);
		paragraph8.add("El/la profesor/a ________________________________________ cumple con los criterios requeridos para el Rango de Catedrático Asociado,  según consta en la Parte II, 2.2.3 del Manual de Facultad y "
				+ "cumple con los criterios de Experiencia y Calidad Docente, Servicio a la Institución y Servicio a la Comunidad,"
				+ " según descritos en la Parte V,  5.6 y en las Guías para la Evaluación del Personal Docente,  correspondientes al rango que solicita. \n").setTextAlignment(TextAlignment.LEFT);
		paragraph8.add("\nEste comité recomienda en forma ____________________ que se le otorgue a el/la _________________ el ascenso en rango de Catedrático/a Auxiliar a Catedrático/a Asociado/a. \n\n").setTextAlignment(TextAlignment.LEFT);///////////////////////////////
		paragraph9.add("Miembros del Comité de Evaluación Sumativa:").setTextAlignment(TextAlignment.LEFT);
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
		System.out.println("PDF created successfully..");  

	}     

}
