package Actividad1;

import java.io.FileOutputStream;
import java.io.OutputStream;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class HTML {

	public static void main(String[] args) {
		 try{

			   TransformerFactory tFactory = TransformerFactory.newInstance();

			   Source xslDoc = new StreamSource("Estilos.xsl");

			   Source xmlDoc = new StreamSource("alumnos.xml");

			   String outputFileName = "report.html";

			   OutputStream htmlFile = new FileOutputStream(outputFileName);

			   Transformer trasform = tFactory.newTransformer(xslDoc);

			   trasform.transform(xmlDoc, new StreamResult(htmlFile));

			  } catch (Exception e)

			  {

			   e.printStackTrace();

			  }
	}

}
