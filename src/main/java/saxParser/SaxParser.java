package saxParser;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SaxParser extends DefaultHandler {
    Person person;
    String element = "";
    List<Person> personList = new ArrayList<Person>();
    public List<Person>  getPersonList() {
        return personList;
    }
    @Override
    public void startDocument() {
        System.out.println("Start parse XML...");
    }

    @Override
    public void endDocument() {
        System.out.println("End parse XML...");

    }

    @Override
    public void startElement(String namespace, String localName, String qName, Attributes attributes) {
        element = qName;
        if(element.equals("person")) {
            person = new Person();
            person.setId(Integer.parseInt(attributes.getValue(0)));
        }
    }

    @Override
    public void endElement(String namespace, String localName, String qName) {
        element="";
    }

    @Override
    public void characters(char[] ch, int start, int length) {

        if (element.equals("name")) {
            person.setName(new String(ch, start, length));
        }
        if (element.equals("address")) {
            person.setAddress(new String(ch, start, length));
        }
        if (element.equals("cash")) {
            person.setCash(new Integer(new String(ch, start, length)));
        }
        if (element.equals("education")) {
            person.setEducation(new String(ch, start, length));
            personList.add(person);
        }

    }
}
