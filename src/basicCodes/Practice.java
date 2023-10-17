package basicCodes;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice {
    public static void main(String[] args)
    {
//        List<Integer> arrLst = Arrays.asList(10,15,8,49,25,98,98,32,15);
//        List<String>  strLst = Arrays.asList("Pune","Solapur","Nasik","Satara","Sangali","Kolhapur");
//
//        System.out.println(strLst.stream().filter(s -> s.length() < 5).collect(Collectors.toList()));
//
//        System.out.println(new HashSet<>(arrLst));
//
//        List<Person> personlist = new ArrayList<>();
//
//        personlist.add(new Person("Subhram", Gender.MALE, 26));
//        personlist.add(new Person("Srabani", Gender.FEMALE, 56));
//        personlist.add(new Person("Moumita", Gender.FEMALE, 36));
//        personlist.add(new Person("Subhendu", Gender.MALE, 66));
//        personlist.add(new Person("Rakesh", Gender.MALE, 26));
//
//        System.out.println(personlist.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList()));
//
//        IntStream.rangeClosed(1,10).forEach(System.out::println);
//
//        String str = "abcdABCDabcd";
//        Map<Character, Integer> frequency =
//                str.chars()
//                        .mapToObj(c -> (char)c)
//                        .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(c -> 1)));
//        System.out.println(frequency);

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        String s = "aasjajikkk";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer val = map.get(c);
            if (val != null) {
                map.put(c, val + 1);
            }
            else {
                map.put(c, 1);
            }
        }




    }
}


