package xmlstreams;
import java.io.File;import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;import org.w3c.dom.Document;
import org.w3c.dom.Element;
public class XMLCreation {
	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbf.newDocumentBuilder();
		Document doc = dBuilder.newDocument();
		Element rootElement = doc.createElement("Users");
		doc.appendChild(rootElement);
		
		rootElement.appendChild(createNewUser(doc,"ramu","34","id1234"));
		rootElement.appendChild(createNewUser(doc, "somu", "22", "id4567"));
		DOMSource source = new DOMSource(doc);
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		
		transformer.setOutputProperty(OutputKeys.INDENT,"yes");
		
		StreamResult console = new StreamResult(System.out);
		StreamResult file = new StreamResult(new File("userDemo.xml"));
		transformer.transform(source, console);
		transformer.transform(source, file);
		
	}
	public static Element createNewUser(Document doc, String name, String age, String id) {
		
		Element user = doc.createElement("User");
		user.setAttribute("id", id);
		user.appendChild(createUserElements(doc,"name",name));
		user.appendChild(createUserElements(doc, "age", age));
		return user;
		
	}
	public static Element createUserElements(Document doc, String name, String value) {
		Element node = doc.createElement(name);
		node.appendChild(doc.createTextNode(value));
		return node;
	}
}
