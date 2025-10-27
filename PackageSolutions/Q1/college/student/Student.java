package college.student;

public class Student {
    private String name;
    private int rollNumber;
    
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public int getRollNumber() {
        return rollNumber;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
    
    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNumber=" + rollNumber + "}";
    }
}
