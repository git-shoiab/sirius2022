package xmlstreams;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxDemo {
	public static void main(String[] args)throws Exception {
		SAXParserFactory spf=SAXParserFactory.newInstance();
		SAXParser sp=spf.newSAXParser();
		sp.parse("books.xml", new MyDefaultHandler());
	}
}
class MyDefaultHandler extends DefaultHandler{
	@Override
	public void startDocument() throws SAXException {
		System.out.println("document parsing started....");
	}
	@Override
	public void endDocument() throws SAXException {
		System.out.println("document parsing ends.....");
	}
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println(qName);
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String s=new String(ch,start,length);
		System.out.println(s);
		new Prison().openGate(s);
	}
}
class Prison{
	public void openGate(String s) {
		switch(s) {
		case "Java":{
			System.out.println("open the gate......");
		}
		}
	}
}