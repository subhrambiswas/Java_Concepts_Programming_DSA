package basicCodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

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

        Map<Integer, Long> scoreRepetition = marks.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(scoreRepetition);

        List<Integer> above90 = marks.stream().filter(p -> p > 90).collect(Collectors.toList());
        System.out.println(above90);


    }
}
