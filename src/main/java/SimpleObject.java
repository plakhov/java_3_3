import java.io.Serializable;

public class SimpleObject implements Serializable {
    private int number;
    private String string;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "SimpleObject{" +
                "number=" + number +
                ", string='" + string + '\'' +
                '}';
    }
}
