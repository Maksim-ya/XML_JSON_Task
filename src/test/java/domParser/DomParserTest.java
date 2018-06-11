package domParser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DomParserTest {
    @Test
    public void testPerson(){
        Person expectedPerson = new Person();
        expectedPerson.setName("John");
        DomParser domParser = new DomParser();
        Person person = domParser.parsing().get(0);
        assertNotNull(person);
        assertEquals(expectedPerson.getName(),person.getName());
    }
}
