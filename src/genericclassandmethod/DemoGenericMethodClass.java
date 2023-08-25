package genericclassandmethod;
// Generic method accepts any datatype input currently
public class DemoGenericMethodClass {

    // create a generics method
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
    }

}
