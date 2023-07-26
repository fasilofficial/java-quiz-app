public class Student {
    String firstName;
    String lastName;
    String major;
    int age;
    double gpa;
    boolean onProbation;
    Student(String firstName, String lastName, String major, int age, double gpa, boolean onProbation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.age = age;
        this.gpa = gpa;
        this.onProbation = onProbation;
    }
}
