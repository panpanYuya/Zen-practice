package foo.bar;

import java.util.HashMap;
import java.util.Map;

public class MapSample {
 public static void main(String[] args) {
 Map<String, String> map = new HashMap<String, String>();
 map.put("sunday", "日曜日");
 map.put("monday", "月曜日");
 map.put("tuesday", "火曜日");
 map.put("wednesday", "水曜日");
 map.put("thursday", "木曜日");
 map.put("friday", "金曜日");
 map.put("saturday", "土曜日");

 for(Map.Entry<String, String> key: map.entrySet()){
  System.out.println(key);
 }

 System.out.println(map.get("sunday"));
 }
}