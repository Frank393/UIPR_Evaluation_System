package evaluation;

import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class test {
	public static void main(String[] args) throws FileNotFoundException {
		
		String path = "F:/HelloD.pdf";
		String paragraph1 = "Bitch";
		Paragraph paragraphText = new Paragraph(paragraph1);
		PdfWriter pdfWriter = new PdfWriter(path);
		
		PdfDocument pdfDocument = new PdfDocument(pdfWriter);
		pdfDocument.addNewPage();
		
		Document document = new Document(pdfDocument);
		document.add(paragraphText);
		
		document.close();
		
	}

}
