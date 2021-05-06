import java.io.Serializable;

public class ComplexObject implements Serializable {
    private SimpleObject object;
    private String string;

    public static int staticVariable = 30;

    public SimpleObject getObject() {
        return object;
    }

    public void setObject(SimpleObject object) {
        this.object = object;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "ComplexObject{" +
                "object=" + object +
                ", string='" + string + '\'' +
                '}';
    }
}
