import java.io.BufferedReader;
import java.io.FileReader;

public class Test0 {
  public static void main(String[] args)throw Exception {
    FileReader fr = new FileReader ("/user/rajan/Desktop/rhyme.txt";)
    BufferredReader br = new BufferedReader(fr);
    while((line= br.readLine())!=null){
      String line = br.readLine();
    System.out.println(line);

    line = br.readLine();
    System.out.println(line);

    line = br.readLine();
    System.out.println(line);
    }
    br.close();
    fr.close();
  }
}