import java.io.*;

public class ObjectIOStream {

    public static void main(String[] args) {
        SimpleObject object = new SimpleObject();
        object.setNumber(20);
        object.setString("Вася");

        ComplexObject complexObject = new ComplexObject();
        complexObject.setString("Сложнааа, непонятно");
        complexObject.setObject(object);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("simple.txt"));) {
            objectOutputStream.writeObject(complexObject);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("simple.txt"))) {
            ComplexObject writtenObject = (ComplexObject) objectInputStream.readObject();
            System.out.println(writtenObject.getObject().toString());
            System.out.println(writtenObject.getString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
