// Qeustion 1b) 5 points
public class StudentTest {
    public static void main(String[] args) {
        // Create first student using the parameterized constructor
        Student student1 = new Student("John", "CS", 3.5);

        // Create second student using the no-arg constructor
        Student student2 = new Student();
        student2.setName("Mary Ann");
        student2.setMajor("CE");
        student2.setGpa(3.3);

        // Print student details using toString()
        System.out.println(student1.toString());
        System.out.println(student2.toString());

        // Compare the two students using equals method
        System.out.println("Are the students equal? " + student1.equals(student2));
    }
}
