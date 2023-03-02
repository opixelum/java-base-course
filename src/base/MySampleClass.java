package base;

public class MySampleClass {
    // Constant
    public static final double PI = 3.14159265358979323846;

    // Type is a class
    public Integer myNumber;

    // Variable only accessible within the class
    private boolean isOk;

    // Constructor
    public MySampleClass(Integer myNumber) {
        this.myNumber = myNumber;
    }

    // Accessors

    // Getter
    public boolean isOk() {
        return isOk;
    }

    // Setter
    public void setOk(boolean ok) {
        isOk = ok;
    }
}
