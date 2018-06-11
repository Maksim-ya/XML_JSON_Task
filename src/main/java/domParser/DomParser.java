package domParser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomParser {
    public  List<Person> parsing()  {
        List<Person> personList = new ArrayList<Person>();
        try {
            File file = new File("src/main/resources/XMLDocument.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = dbFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);

            NodeList nList = document.getElementsByTagName("person");
            for (int i = 0; i < nList.getLength(); i++) {
                Node nNode = nList.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Person person = new Person();
                    Element personElement = (Element) nNode;
                    person.setName(String.valueOf(personElement.getElementsByTagName("name").item(0).getTextContent()));
                    person.setAddress(String.valueOf(personElement.getElementsByTagName("address").item(0).getTextContent()));
                    person.setCash(Integer.valueOf(String.valueOf(personElement.getElementsByTagName("cash").item(0).getTextContent())));
                    personList.add(person);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return personList;
    }
}
