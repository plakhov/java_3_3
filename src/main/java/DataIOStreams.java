import java.io.*;

public class DataIOStreams {

    public static void main(String[] args) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(
                        new FileOutputStream("simple.txt")
        );
        dataOutputStream.writeUTF("Привет потоки!");

        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("simple.txt"));
        System.out.println(dataInputStream.readDouble());
    }

}
