class Course {
    private int code;

    public Course(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void displayCourseDetails() {
        System.out.println("Course Code: " + code);
    }
}