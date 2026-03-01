package Prototype_1;

public class Student implements Prototype<Student> {
	private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    // Copy constructor
    private Student(Student other) {
        this.id = other.id;
        this.name = other.name;
        this.gpa = other.gpa;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    @Override
    public String toString() {
        return "Student{id='" + id + "', name='" + name + "', gpa=" + gpa + "}";
    }

    // Setter để test thay đổi
    public void setName(String name) {
        this.name = name;
    }
}
