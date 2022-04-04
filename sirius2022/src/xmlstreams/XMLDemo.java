package xmlstreams;

import java.io.ObjectInputStream.GetField;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class XMLDemo {
	public static void main(String[] args)throws Exception {
		//DOM - SAX - XSL
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		dbf.setIgnoringElementContentWhitespace(true);
		DocumentBuilder db=dbf.newDocumentBuilder();
		
		Document doc=db.parse("books.xml");
		
		Element rootelement=doc.getDocumentElement();
		
		System.out.println("The Root Element Name..:"+rootelement.getNodeName());
	
		System.out.println("The length...:"+rootelement.getChildNodes().getLength());
		
		//traversing
		int n=rootelement.getFirstChild().getFirstChild().getNodeType();
		System.out.println(n);
		rootelement.getFirstChild().getNextSibling().getFirstChild().getFirstChild().getNodeValue();
		
		String s=rootelement.getChildNodes().item(2).getFirstChild().getFirstChild().getNodeValue();
		System.out.println(s);
	}
}
