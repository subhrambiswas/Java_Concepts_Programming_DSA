package basicCodes;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBasics {

    public static void main(String args[]){

        List<String> ns = new ArrayList<String>();

        ns.add("Subhram");
        ns.add("Biswas");

        //Print in list form
        System.out.println(ns);

        //Print element wise
        for(String s : ns){
            System.out.println(s);
        }
    }
}
