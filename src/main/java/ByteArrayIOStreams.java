import java.io.*;

public class ByteArrayIOStreams {
    public static void main(String[] args) throws IOException {
        byte[] arrayForReading = new byte[]{23, 24, 25, 26, 27};
        byte[] arrayForWriting = new byte[6];
        ByteArrayOutputStream simpleByteArrayOutputStream = new ByteArrayOutputStream();

        for (int i = 0; i < 10; i++) {
            simpleByteArrayOutputStream.write(i);
        }

        byte[] result = simpleByteArrayOutputStream.toByteArray();
        ByteArrayInputStream simpleByteArrayInputStream = new ByteArrayInputStream(result);
        int x;
        while ((x = simpleByteArrayInputStream.read()) != -1) {
            System.out.println(x + " ");
        }



//        File simpleFile = new File("simple.txt");
//        System.out.println(simpleFile.exists());
    }

}
