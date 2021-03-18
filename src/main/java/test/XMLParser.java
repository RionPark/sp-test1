package test;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLParser {

	public static void main(String[] args) {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder db = dbFactory.newDocumentBuilder();
			Document document = db.parse("http://api.kcisa.kr/openapi/service/rest/convergence2017/conver3?serviceKey=acf4f9b4-a6a2-44ed-b5c4-0a467dba1820");
			System.out.println(document.toString());
			Element root = document.getDocumentElement();
			NodeList nodeList = root.getChildNodes();
			for(int i=0;i<nodeList.getLength();i++) {
				Node n = nodeList.item(i);
				System.out.println(i + "n번 : " + n.getNodeName());
				if(n.getNodeName().equals("body")) {
					NodeList bodyNodeList = n.getChildNodes();
					for(int j=0;j<bodyNodeList.getLength();j++) {
						Node n2 = bodyNodeList.item(j);
						
						System.out.println(j + "n2번 : " + n2.getNodeName());
						NodeList itemNodeList = n2.getChildNodes();
						for(int k=0;k<itemNodeList.getLength();k++) {
							Node n3 = itemNodeList.item(k);
							System.out.println(k + "n3번 : " + n3.getNodeName());
							System.out.println(n3.getTextContent());
						}
					}
				}
				System.out.println(n);
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
