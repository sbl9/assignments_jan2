package jan2JavaExam;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//java program to store 5 students information in a treeMap
//Note: student object has student name and student reg no
public class Assignment2 {
	
	private Map map = null;
	public Assignment2() {
	map = new TreeMap();
	}
	public void addItems() {
	Student stu1 = new Student(1, "BIJOY");
	map.put(stu1 ,"one");
	Student stu2 = new Student(2, "Karthik");
	map.put(stu2,"two");
	Student stu3 = new Student(3, "Dexter");
	map.put(stu3,"zero");
	Student stu4 = new Student(4, "JayaKrishnan");
	map.put(stu4,"four");
	}
	public void displayItems() {
	Set set = map.entrySet();
	System.out.println("Size = " + set.size());
	Iterator i = set.iterator();
	while (i.hasNext()) {
	Map.Entry entry = (Map.Entry) i.next();
	System.out.print(entry.getKey() + ": ");
	System.out.println(entry.getValue());
	}
	}
	public static void main(String[] args) {
	Assignment2 main = new Assignment2();
	main.addItems();
	main.displayItems();

}
}
