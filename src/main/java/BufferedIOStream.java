import java.io.*;

public class BufferedIOStream {
    public static void main(String[] args) throws IOException {
        try (BufferedOutputStream bufferedOutputStream
                     = new BufferedOutputStream(
                             new FileOutputStream("simple.txt"))) {
            bufferedOutputStream.write(2);
            bufferedOutputStream.write(3);
            bufferedOutputStream.write(4);
            bufferedOutputStream.write(5);
            bufferedOutputStream.write(6);
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("simple.txt"));
        int x;
        while ((x = bufferedInputStream.read())!= -1) {
            System.out.println(x+" ");
        }
    }
}
