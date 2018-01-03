package jan2JavaExam;

public class Student implements Comparable {

	private int id;
	private String name;
	public Student(int stuId, String name) {
	this.id = stuId;
	this.name = name;
	}
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String toString() {
	return "Id = " + getId() + " ; Name = " + getName();
	}
	public int compareTo(Object o) {
	Student  stu = (Student)o;
	return getId()-stu.getId();
	}
	}
	


