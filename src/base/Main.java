package base;

public class Main {
    public static void main(String[] args) {
        // Loop for creating 5 instances of MySampleClass
        for (int i = 0; i < 5; i++) {
            MySampleClass sample = new MySampleClass(i);
            sample.setOk(true);
            System.out.println("My number is " + sample.myNumber + " and isOk is " + sample.isOk() + ".");
        }
    }
}
