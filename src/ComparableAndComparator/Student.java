package ComparableAndComparator;

public class Student implements Comparable<Student> {

	int rollNo;
    String name;
	
	public Student(int rollNo){
		this.rollNo=rollNo;
	}
	
	public Student(int rollNo,String name){
		this.rollNo=rollNo;
		this.name=name;
	}

	@Override
	public int compareTo(Student o) {
		if(rollNo==o.rollNo)
		return 0;
		else if(rollNo>o.rollNo)
			return 1;
		else 
			return -1;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	
}
