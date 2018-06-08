package jsonParser;

import java.util.List;
import java.util.Map;

public class Response {
    List<Currency> descriptor;

    public List<Currency> getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(List<Currency> descriptor) {
        this.descriptor = descriptor;
    }
    //    Map<String,Currency> descriptor;
//
//    public Map<String, Currency> getDescriptor() {
//        return descriptor;
//    }
//
//    public void setDescriptor(Map<String, Currency> descriptor) {
//        this.descriptor = descriptor;
//    }
}
