package jsonParser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;


import java.io.FileReader;
import java.util.List;

public class GsonParser {
//    private static  final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {
        Response response = null;
        try {
            JsonReader jsonReader = new JsonReader(new FileReader("src/main/resources/exchange.json"));
            Gson gson = new Gson();
            response = gson.fromJson(jsonReader, Response.class);
//            Response response = gson.fromJson(jsonReader, Response.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(response);
    }
}
