package xmlstreams;

import java.io.File;
import java.util.ArrayList;
import java.util.List;import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class XMLReadDemo {
	public static void main(String[] args) throws Exception {
		String filePath = "userDemo.xml";
		File xmlFile = new File(filePath);
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder dbuilder = dbf.newDocumentBuilder();
		Document doc = dbuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();
		
		System.out.println("Root elem:"+ doc.getDocumentElement().getNodeName());
		NodeList nodeList = doc.getElementsByTagName("User");
		
		for(int i=0;i < nodeList.getLength(); i++) {
			
			getUser(nodeList.item(i));
		}
		
	}
	
	static void getUser(Node node) {
		
		Element element = (Element) node;
		System.out.println(getTagValue("name", element));
		System.out.println(getTagValue("age", element));
		
	}
	static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
//		System.out.println(element.getElementsByTagName(tag).item(0).getChildNodes().item(0));
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}
}class User {
	
}
