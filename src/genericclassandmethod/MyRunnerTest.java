package genericclassandmethod;

public class MyRunnerTest {
    public static void main(String[] args) {
//        // initialize the class with Integer data
//        DemoGenericMethodClass dObj = new DemoGenericMethodClass();
//        dObj.genericsMethod(25); // passing int
//        dObj.genericsMethod("Per Scholas"); // passing String
//        dObj.genericsMethod(2563.5); // passing float
//        dObj.genericsMethod('H'); // passing Char


        // initialize generic class
        // with String and Integer data

        GenericClassMultipleDatatype<String, Integer> mobj = new GenericClassMultipleDatatype("Per Scholas", 11025);

        System.out.println(mobj.getValueOne());
        System.out.println(mobj.getValueTwo());

        // initialize generic class
        // with String and String data
        GenericClassMultipleDatatype<String, String> mobj2 = new GenericClassMultipleDatatype("Per Scholas", "Non profit");
        System.out.println(mobj2.getValueOne());
        System.out.println(mobj2.getValueTwo());

    }
}
