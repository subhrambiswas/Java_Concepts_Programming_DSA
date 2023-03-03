package basicCodes.MethodReference;


public class Java8MethodReference {
     public static void main(String args[]) {

          MethodForReference obj = new MethodForReferenceImpl()::add;


          System.out.println(obj.add(10,20));

     }
}