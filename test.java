import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test {
    public static void main(String args[]){
        try{
            File file = new File("/Users/yu/大学/3年生/月曜日/1限 情報セキュリティ概論/caeser_code/test.txt");
            FileReader filereader = new FileReader(file);
      
            int k = 1 ;
            int m;
            while((m = filereader.read()) != -1){
                if (m == 32) {
                    System.out.print((char)m) ;
                } else {
                    m = m - 97 ;
                    m = (m + k) % 26 ;
                    m = m + 97 ;
                    System.out.print((char)m);
                }
            }
      
            filereader.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}