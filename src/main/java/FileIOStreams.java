import java.io.*;

public class FileIOStreams {
    public static void main(String[] args) throws IOException {
        File simpleFile = new File("simple.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(simpleFile, true);
        fileOutputStream.write(24);
        fileOutputStream.write(25);
        fileOutputStream.write(26);
        FileInputStream fileInputStream = new FileInputStream("simple.txt");
        int x;
        while ((x = fileInputStream.read()) != -1) {
            System.out.println(x+" ");
        }


    }
}
