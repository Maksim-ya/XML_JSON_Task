package gsonParser;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class GsonParser {
    public  List<Currency> parsing(String filename)  {
        List<Currency> currencyList = new ArrayList<Currency>();
        try {
            JsonReader jsonReader = new JsonReader(new FileReader(filename));
            jsonReader.beginArray();
            Gson gson = new Gson();
            while (jsonReader.hasNext()) {
                Currency currency = gson.fromJson(jsonReader, Currency.class);
                currencyList.add(currency);
            }
            jsonReader.endArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return currencyList;
    }
}
