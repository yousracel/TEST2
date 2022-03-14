import java.io.*;

public class BufferTest {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileInputStream bis;
        FileOutputStream bos;
        bos= new FileOutputStream(new File("output.txt"));
        bis= new FileInputStream(new File("5mb.txt"));
        BufferedInputStream fis;
        BufferedOutputStream fos;


        byte[] bytee = new byte[8];

        long time = System.currentTimeMillis();

        while ( bis.read(bytee) != -1){
            bos.write(bytee);
        }


        System.out.println("time spent " + ( System.currentTimeMillis()-time));


        fis = new BufferedInputStream(new FileInputStream(new File("5mb.txt")));
        fos = new BufferedOutputStream(new FileOutputStream(new File("bufferout.txt")));

        byte[] bytee2 = new byte[8];

        long time2 = System.currentTimeMillis();

        while ( fis.read(bytee) != -1){
            fos.write(bytee2);
        }


        System.out.println("time spent v2 " + ( System.currentTimeMillis()-time2));




    }
}
