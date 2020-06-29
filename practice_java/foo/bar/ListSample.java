package foo.bar;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
 public static void main(String[] args) {
 List<String> list = new ArrayList<String>();
 list.add("茨城県");
 list.add("栃木県");
 list.add("群馬県");
 list.add("埼玉県");
 list.add("千葉県");
 list.add("東京都");
 list.add("神奈川県");

 for(int i = 0; i<list.size();i++){
  System.out.println(list.get(i));
 }
 System.out.println("");
 
 for(String list2 : list){
  System.out.println(list2);
 }
 }

}