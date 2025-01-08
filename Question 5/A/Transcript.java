class Transcript {
    private String course;
    private double grade;

    public Transcript(String course, double grade) {
        this.course = course;
        this.grade = grade;
    }

    public String getCourse() {
        return course;
    }

    public double getGrade() {
        return grade;
    }

    public void printTranscript() {
        System.out.println("Course: " + course + ", Grade: " + grade);
    }
}