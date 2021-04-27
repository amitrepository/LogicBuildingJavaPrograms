package Stream.Stream.java8;

import java.util.Map;

class Student{
    Map<String,Integer> subjectMarks;
    String name;
    
    
    public Student(Map<String,Integer> subject, String name) {
        super();
        this.subjectMarks = subject;
        this.name = name;
    }
    public Map<String,Integer> getSubjectMarks() {
        return subjectMarks;
    }
    public void setSubjectMarks(Map<String,Integer> subject) {
        this.subjectMarks = subject;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
 }