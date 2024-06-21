package org.dikshit.responsesheet;


import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Reader {

	public static void main(String[] args) {
			String fileName="C:/Dikshit/Campus/Project/SampleData/2.jpeg";
			
			Tesseract tesseract = new Tesseract();
	        try {
	  
	            tesseract.setDatapath("C:/Dikshit/Tessdata");
	  
	            // the path of your tess data folder
	            // inside the extracted file
	            String text
	                = tesseract.doOCR(new File(fileName));
	  
	            // path of your image file
	            System.out.print(text);
	        }
	        catch (TesseractException e) {
	            e.printStackTrace();
	        }
	}
}
