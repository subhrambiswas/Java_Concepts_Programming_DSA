package basicCodes;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.net.CookieHandler;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class Java8Features {
    public static void main(String args[]){

        List<String> subject = new ArrayList<>();

        subject.add("English");
        subject.add("Maths");
        subject.add("Physics");
        subject.add("Chemistry");
        subject.add("Biology");
        subject.add("Electronics");
        subject.add("Bengali");

        List<Integer> marks = new ArrayList<>();

        marks.add(79);
        marks.add(100);
        marks.add(99);
        marks.add(95);
        marks.add(85);
        marks.add(75);
        marks.add(99);

        Map<String, Integer> subjectScore = new HashMap<>();

        subjectScore.put("English", 79);
        subjectScore.put("Maths", 100);
        subjectScore.put("Physics", 99);
        subjectScore.put("Chemistry", 95);
        subjectScore.put("Biology", 85);
        subjectScore.put("English", 75);

//        Map<Integer, Long> scoreRepetition = marks.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(scoreRepetition);

//      Find the number of vowels present in the subject name
//        Map<String, Integer> result = subject.stream()
//                                  .collect(Collectors.toMap(Function.identity(), cname -> cname.toLowerCase().replaceAll("[^aeiou]","").length()));
//
//          System.out.println(result);

//        List<Integer> above90 = marks.stream().filter(p -> p > 90).collect(Collectors.toList());
//        System.out.println(above90);

                List<Integer> list = Arrays.asList(1,2,3,3,4,4,4,5);
                List<Integer> arr = Arrays.asList(15,20,48,63,49,27,56,32,9);

//                Stream<String> str = Stream.of("Subhram", "Biswas", "Kolkata", "Bangalore");
//                str.map(String::length).forEach(System.out :: println);


                //Find the distinct element list

//        List<Integer> fliest =  list.stream().distinct().collect(Collectors.toList());
//        list.stream().distinct().forEach(System.out :: println);
//        System.out.println(fliest);

                //Find the list of even numbers
//         arr.stream().filter(i->i%2 == 0).forEach(System.out :: println);

//          List<Integer> evenList =  arr.stream().filter(i->i%2 == 0).map(i -> i).collect(Collectors.toList());
//          System.out.println(evenList);

//        int a = arr.stream().findFirst().get();
//        System.out.println(a);
//
//        Optional<Integer> fany = arr.stream().filter(i-> i%4 ==0).findAny();
//        fany.ifPresent(System.out::println);

        List<Point> aList = new ArrayList<>();
        aList.add(new Point(10, 20));
        aList.add(new Point(5, 10));
        aList.add(new Point(1, 100));
        aList.add(new Point(50, 2000));

                //Sort the above List

//        List <Point> sortedlist = aList.stream().sorted((p1,p2) -> p1.getX().compareTo(p2.getX())).collect(Collectors.toList());
//        aList.stream()
//                .sorted((p1, p2)->p1.x.compareTo(p2.x))
//                .forEach(System.out::println);

                //Sorting of a list
//          arr.stream().sorted().forEach(
//                                System.out::println);
//          List<Integer> sortList =  arr.stream().sorted().collect(Collectors.toList());
//          System.out.println(sortList.get(1));

//            arr.stream().sorted(Comparator.reverseOrder()).forEach(System.out :: println);


//          Reverse words in a string

//        String str = "quick brown fox jumps over lazy dog";
//        String reverseStr = Arrays
//                .stream(str.split(" "))
//                .map(word -> new StringBuilder(word).reverse())
//                .collect(Collectors.joining(" "));

        List<Person> personList =  new ArrayList<>();

        personList.add(new Person("Subhram",Gender.MALE,26));
        personList.add(new Person("Subhendu",Gender.MALE,66));
        personList.add(new Person("Srabani",Gender.FEMALE,56));
        personList.add(new Person("Moumita",Gender.FEMALE,31));
        personList.add(new Person("Ram",Gender.MALE,26));
        personList.add(new Person("Rohit",Gender.MALE,36));
        personList.add(new Person("Shyam",Gender.MALE,46));
        personList.add(new Person("Madhumita",Gender.FEMALE,11));


//       System.out.println( personList.stream().map(Person::getAge).reduce(0,Integer.sum()); not possible

//         System.out.println( personList.stream().mapToInt(Person::getAge).sum());
//
//         List<String> names2 = personList.stream().filter(person -> person.getAge() >30)
//                 .map(person -> person.getName().toUpperCase())
//                 .collect(toList());
//
         Set<String> malesList = personList.stream()
                                      .filter(person -> person.getAge() > 30)
                                      .filter(person ->person.getGender() == Gender.MALE)
                                      .map(Person::getName)
                                      .collect(Collectors.toSet());

         System.out.println(malesList);

         Map<String, Person> mapPerson = personList.stream()
                 .collect(Collectors.toMap(person ->person.getName() + ":" + person.getAge(), Person ->Person));

        System.out.println(mapPerson);

        Map<Boolean,List<Person>> personGrpMap = personList.stream().collect(Collectors.groupingBy(Person -> Person.getGender() == Gender.FEMALE));

        System.out.println(personGrpMap);

    }

        }


