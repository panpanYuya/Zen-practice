package foo.bar;


public class CaffeLatteSample {
      public static void main(String[] args) {
            for(int i =1; i<=50 ;i++){
            if(i % 3 == 0 && i % 5 == 0){
            System.out.println("CafffeLatte");
            }else if(i % 5 == 0){
            System.out.println("Latte");
            }else if(i % 3 == 0){
            System.out.println("Caffe");
            }else{
            System.out.println(i);
            }
            }
      }
}