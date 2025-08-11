package designPattern.facade;

import java.util.HashMap;
import java.util.Map;

public class Json {
    public Map<String , Object> parse(String str){
        Map<String , Object> result = new HashMap<>();
        result.put("address" , "서울시 강남구");
        return result;
    }
}
