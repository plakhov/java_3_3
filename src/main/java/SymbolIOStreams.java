import java.io.*;

public class SymbolIOStreams {

    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("simple.txt")));) {
            bufferedWriter.write("Привет символьные потоки!\n");
            bufferedWriter.write("Привет символьные потоки!\n");
            bufferedWriter.write("Привет символьные потоки!\n");
            bufferedWriter.write("Привет символьные потоки!\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("simple.txt")));) {
            bufferedReader.lines().forEach(row -> {
                System.out.println(row);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
