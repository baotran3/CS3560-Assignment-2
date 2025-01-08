//Question 1, Part A
public class Student {
    private String name;
    private String major;
    private double gpa;

    // No-argument constructor
    public Student() {
        this.name = "";
        this.major = "";
        this.gpa = 0.0;
    }

    //constructor with name and major
    public Student(String name, String major) {
        this.name = name;
        this.major = major;
        this.gpa = 0.0; // Default GPA
    }

    //constructor with all fields
    public Student(String name, String major, double gpa) {
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    //getter + getter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getter + setter for major
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    //getter + setter  for GPA
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //override toString method
    @Override
    public String toString() {
        return "Name: " + name + ", Major: " + major + ", GPA: " + gpa;
    }

    //override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Student) {
            Student other = (Student) obj;
            return this.name.equals(other.name) && this.major.equals(other.major);
        }
        return false;
    }
}
