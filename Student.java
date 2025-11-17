public class Student {
    int id, roll;
    String name, course;

    void registerStudent(int id, int roll, String name, String course) {
        this.id = id;
        this.roll = roll;
        this.name = name;
        this.course = course;

    }

    void displayStudent() {
        System.out.println(
                "Student id is : " + id + " Name is: " + name + " Roll no. is : " + roll + " and Course is " + course);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.registerStudent(1, 1001, "Sujal Awale", "BCA");
        s1.displayStudent();

    }
}
