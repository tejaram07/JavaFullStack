// CODE 1
import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        File f = new File("/Users/motur/Desktop/TestFile.txt");
        
        if (f.exists()) {
            System.out.println("Printing File Details");
            System.out.println("----------------------");
            System.out.println("File Name: " + f.getName());
            System.out.println("File Size: " + f.length());
            System.out.println("File Path: " + f.getAbsolutePath());
            System.out.println("Is File Readable? " + f.canRead());
            System.out.println("Is File Writable? " + f.canWrite());
        }
    }
}


// CODE 2
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        
        FileWriter fw = new FileWriter("/Users/motur/Desktop/TestFile.txt");

        fw.write("I am The Earth \n");
        fw.write("I am The Forest Green \n");
        fw.write("I am the Four Winds Blowing \n");
        fw.write("I am the Earth \n");

        fw.flush();


        fw.close();

        System.out.println("File Prepared Successfully");
    }
}


// CODE 3
import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        File f = new File("/Users/motur/Downloads/datasets");

        String[] files = f.list();

        for (String file : files) {
            System.out.println(file);
        }

        File[] files_arr = f.listFiles();

        for (File ff : files_arr) {
            ff.delete();
        }
    }
}


//CODE 4
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        String filePath = "C:\Users\motur\OneDrive\Desktop\2nd week";  // Specify the file path here

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);  // Print each line to the console
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}