import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        File file = new File("testfilewriter.txt");
        FileWriter fw;
        FileReader fr;
        try {
            fw= new FileWriter(file);
            String str = "bonjour a tous \n";
            str +=" ccava";
            fw.write(str);
            fw.close();

            fr = new FileReader(file);
            int var;
            while( (var= fr.read()) != -1 )
                System.out.print((char) var);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//la serialisation