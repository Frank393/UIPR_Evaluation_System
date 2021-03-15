package evaluation;

import java.awt.Color;
import java.io.FileNotFoundException;


import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.*;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.DashedBorder;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.*;


import com.itextpdf.layout.border.DottedBorder; 
import com.itextpdf.layout.border.DoubleBorder; 
import com.itextpdf.layout.border.RoundDotsBorder; 

public class test {
	public static void main(String[] args) throws FileNotFoundException {
		int bub = 3;
		String path = "F:/HelloD.pdf";
		String paragraph1 = "Bitch";
		Paragraph paragraphText = new Paragraph(paragraph1);
		PdfWriter pdfWriter = new PdfWriter(path);
		
		PdfDocument pdfDocument = new PdfDocument(pdfWriter);
		pdfDocument.addNewPage();

		Document document = new Document(pdfDocument);
		
		document.add(paragraphText);
		
		float [] pointColumnWidths = {150F, 150F, 150F};   
	    Table table = new Table(pointColumnWidths);
	   
		// Adding cell 1 to the table 
		Cell cell1 = new Cell();   // Creating a cell 
	    cell1.add("frffr");
	    Border b1 = new DashedBorder(Color.RED, 3);
	    cell1.setBorder 
	    
		//cell1.add("Name");         // Adding content to the cell 
		table.addCell("Name");    // Adding cell to the table       
		table.addCell(String.valueOf(bub));
		table.addCell("paboo"); 
		
		document.add(table);  
		document.close();
		
	}

}
