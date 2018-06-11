package gsonParser;


import java.io.*;


public class GsonFile {
    private final String filename = "out/GsonParserResult.txt";

    public void deleteOldFile() {
        File oldfile = new File(filename);
        if (oldfile.exists())
            oldfile.delete();
    }

    public void createFile(String currency) {
        try {
            FileWriter writer = new FileWriter(filename, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(currency + "\r\n");
            bufferWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile() {
        File f = new File(filename);
        String line;
        try {
            BufferedReader fin = new BufferedReader(new FileReader(f));
            while ((line = fin.readLine()) != null)
                System.out.println(line);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
