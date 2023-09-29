package basicCodes;


@FunctionalInterface

interface sum{
    int calculation(int y);

    default void multiply()
    {
        test();
        System.out.println("Multiplication done");
    }

    default void test()
    {
        System.out.println("testing done");
    }
}

public class Functional_Interface {
    public static void main(String [] args)
    {
        int s=10;

        sum s1 = (int y) -> y+y;

        int answer = s1.calculation(s);
        System.out.println(answer);

//      Functionaltest d1 = new
        s1.multiply();

    }
}
