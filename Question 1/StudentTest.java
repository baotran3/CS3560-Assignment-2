//Question 1, Part B - Driver
public class StudentTest {
    public static void main(String[] args) {
        //this creates the first student using the parameterized constructor
        Student student1 = new Student("John", "CS", 3.5);

        //this creates the second student using the no-arg constructor
        Student student2 = new Student();
        student2.setName("Mary Ann");
        student2.setMajor("CE");
        student2.setGpa(3.3);

        //this prints the details of both students
        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }
}
