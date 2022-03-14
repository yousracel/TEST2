import java.io.*;

public class data {
    public static void main(String[] args) throws FileNotFoundException, IOException, EOFException{
        FileOutputStream fos = new FileOutputStream("input.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.write(2);
        dos.writeChar('y');
        //dos.writeDouble(1.5);

        dos.close();

        FileInputStream fis = new FileInputStream("input.txt");
        DataInputStream dis = new DataInputStream(fis);

        while(dis.available()>0){
            System.out.println(dis.readInt());
        }

    }
}
