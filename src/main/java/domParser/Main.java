package domParser;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DomParser domParser =new DomParser();
        List<Person> personList = domParser.parsing();
        for (int i = 0; i <personList.size() ; i++) {
            Person person=personList.get(i);
            if (person.getCash()>=10000){
                System.out.println(person);
                new DomFile().createFile(person);
            }
        }
    }
}
