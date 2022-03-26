import java.io.RandomAccessFile;

public class flux_octets {

    public static void main(String[] args) {
        try{
            RandomAccessFile monFichier = new RandomAccessFile("monfichier.dat","rw");

            for (int i=0; i < 10;i++){
                monFichier.writeInt(i);
            }

            monFichier.seek(5*4);
            System.out.println(monFichier.readInt());
            System.out.println(monFichier.getFilePointer());
            monFichier.seek(0);
            monFichier.writeInt(122);
            monFichier.seek(0);
            System.out.println(monFichier.readInt());

            monFichier.close();

        } catch ( Exception e) { e.printStackTrace();}
    }
}
