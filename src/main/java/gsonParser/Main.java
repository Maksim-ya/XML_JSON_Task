package gsonParser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class Main {
    private  static  final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    public static void main(String[] args) {
        GsonParser gsonParser =new GsonParser();
        List<Currency> currencyList = gsonParser.parsing("src/main/resources/exchange.json");
        GsonFile file = new GsonFile();
        file.deleteOldFile();
        for (int i = 0; i < currencyList.size(); i++) {
            String json = GSON.toJson(currencyList.get(i));
            file.createFile(json);
        }
        file.readFromFile();
    }
}
