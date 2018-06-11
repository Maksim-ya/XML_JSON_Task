package saxParser;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        SaxParser saxParser = new SaxParser();
        new StartParcer().startParsing(saxParser);
        List<Person> personList = saxParser.getPersonList();
        for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);
            if (person.getCash() >= 10000) {
                System.out.println(person);
                new SAXFile().createFile(person);
            }
        }
    }
}
