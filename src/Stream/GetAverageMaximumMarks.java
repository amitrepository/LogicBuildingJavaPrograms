package Stream;

import java.util.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class GetAverageMaximumMarks {
    public static void main(String args[]) {
        ArrayList<Student> arr = new ArrayList<Student>();

        Map m1 = new HashMap();
        m1.put("Maths", 40);
        m1.put("Science", 50);

        Map m2 = new HashMap();
        m2.put("Maths", 60);
        m2.put("Science", 20);

        arr.add(new Student(m1, "RAJ"));
        arr.add(new Student(m2, "AMIT"));

        arr.stream().map(s->s.getSubjectMarks().values().stream().mapToInt(Integer:: intValue).average());

        System.out.println( arr.stream().map(s->s.getSubjectMarks().values().stream().mapToInt(Integer:: intValue).average()).collect(Collectors.toList()));
        Object[] result = arr.stream().map(s -> new Object[] {
                        s.getName(),
                        s.getSubjectMarks().values().stream()
                                .mapToInt(Integer::valueOf)
                                .summaryStatistics().getAverage() })
                .max(Comparator.comparing(obj -> (double) obj[1]))
                .get();

        System.out.println(Arrays.toString(result));

    }
}

class Student {
    Map<String, Integer> subjectMarks;
    String name;


    public Student(Map<String, Integer> subject, String name) {
        super();
        this.subjectMarks = subject;
        this.name = name;
    }

    public Map<String, Integer> getSubjectMarks() {
        return subjectMarks;
    }

    public void setSubjectMarks(Map<String, Integer> subject) {
        this.subjectMarks = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}