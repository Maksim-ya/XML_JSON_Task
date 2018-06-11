package saxParser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SaxParserTest {
    @Test
    public void testPerson(){
        domParser.Person expectedPerson = new domParser.Person();
        expectedPerson.setName("John");
        SaxParser saxParser = new SaxParser();
        new StartParcer().startParsing(saxParser);
        Person person = saxParser.getPersonList().get(0);
        assertNotNull(person);
        assertEquals(expectedPerson.getName(),person.getName());
    }
}
