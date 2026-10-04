import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student {
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (Double.compare(s2.getCgpa(), s1.getCgpa()) != 0) {
            return Double.compare(s2.getCgpa(), s1.getCgpa());
        }
        if (!s1.getFname().equals(s2.getFname())) {
            return s1.getFname().compareTo(s2.getFname());
        }
        return Integer.compare(s1.getId(), s2.getId());
    }
}
public class W4_BAI4 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(33, "Rumpa", 3.68));
        studentList.add(new Student(85, "Ashis", 3.85));
        studentList.add(new Student(56, "Samiha", 3.75));
        studentList.add(new Student(19, "Samara", 3.75));
        studentList.add(new Student(22, "Fahim", 3.76));
        System.out.println("Danh sách trước khi sắp xếp:");
        for (Student st : studentList) {
            System.out.println(st.getFname() + " - CGPA: " + st.getCgpa() + " - ID: " + st.getId());
        }
        System.out.println("-------------------------");
        Collections.sort(studentList, new StudentComparator());
        System.out.println("Danh sách sau khi sắp xếp:");
        for (Student st : studentList) {
            System.out.println(st.getFname() + " - CGPA: " + st.getCgpa() + " - ID: " + st.getId());
        }
    }
}