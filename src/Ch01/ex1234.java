package Ch01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ex1234 {

   public static void main(String[] args) throws Exception {
      // TODO Auto-generated method stub

      try(FileReader in = new FileReader("C:\\textfile.txt");
         FileWriter out = new FileWriter("C:\\copytest.txt")){
         
         
         int ch;
         
         while ((ch = in.read()) != -1) {
            out.write(ch);
         }
      } catch(IOException e) {
         e.printStackTrace();
      }
         
   }

}