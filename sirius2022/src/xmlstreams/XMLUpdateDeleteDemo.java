package xmlstreams;


import java.io.File;import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class XMLUpdateDeleteDemo {
	public static void main(String[] args) throws Exception{
		File xmlFile = new File("userDemo.xml");
		DocumentBuilderFactory dbf =  DocumentBuilderFactory.newInstance();
		DocumentBuilder dbuilder = dbf.newDocumentBuilder();
		
		Document doc = dbuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();
//		addElement(doc);
		deleteElement(doc);
//		UpdateElement(doc);
		
		
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		DOMSource source = new DOMSource(doc);
		
		StreamResult console = new StreamResult(System.out);
		StreamResult file = new StreamResult(new File("users.xml"));
		
		transformer.transform(source, file);
		transformer.transform(source, console);
		
		
	}
	public static void UpdateElement(Document doc) {
		NodeList users = doc.getElementsByTagName("User");
		Element user = null;
		for(int i=0; i<users.getLength(); i++) {
			user = (Element) users.item(i);
			Node name = user.getElementsByTagName("name").item(0).getFirstChild();
			name.setNodeValue(name.getNodeValue().toUpperCase());
		}
	}
	public static void deleteElement(Document doc) {
		NodeList users = doc.getElementsByTagName("User");
		Element user = null;
		for(int i=0; i<users.getLength();i++) {
			user = (Element) users.item(i);
			Node genderNode = user.getElementsByTagName("salary").item(0);
			user.removeChild(genderNode);
		}
	}
	public static void addElement(Document doc) {
		NodeList users = doc.getElementsByTagName("User");
		Element emp = null;
		
		for(int i=0; i<users.getLength();i++) {
			emp = (Element) users.item(i);
			Element salaryElement = doc.createElement("salary");
			salaryElement.appendChild(doc.createTextNode("10000"));
			emp.appendChild(salaryElement);
		}
	}
}
