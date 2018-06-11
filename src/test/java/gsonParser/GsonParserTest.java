package gsonParser;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class GsonParserTest {


    private GsonParser gsonParser=new GsonParser();
    @Test
    public void testParseFile() {
        List<Currency> currencyList = gsonParser.parsing("src/main/resources/exchange.json");
        Currency currency = currencyList.get(1);
        assertEquals(702, currency.getR030());
        assertEquals("Сінгапурський долар", currency.getTxt());
    }


}
