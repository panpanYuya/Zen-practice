package foo.bar;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;


public class FileSample {
 public static void main(String[]args){

   Writer out = new CharArrayWriter();
   try {
   File file = new File("foo/bar/ListSample.java");
   FileInputStream fIStream = new FileInputStream(file);
   Charset charset = Charset.forName("UTF-8");
   InputStreamReader iSReader = new InputStreamReader(fIStream, charset);
   while(true){
    int c = iSReader.read();
    if(c!=-1){
     out.write(c);
    }else{
     break;
    }
   }
   iSReader.close();
   String src = out.toString();
   System.out.println(src);
 }catch(IOException e){
  e.printStackTrace();
 }
}