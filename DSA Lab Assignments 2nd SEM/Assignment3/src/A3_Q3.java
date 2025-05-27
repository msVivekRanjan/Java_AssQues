
class MarksOutOfBoundException extends Exception {
    MarksOutOfBoundException(String message) {
        super(message);
    }
}

class Student {
    String name;
    int marks;

    Student(String name, int marks) throws MarksOutOfBoundException {
        if (marks > 100) {
            throw new MarksOutOfBoundException("Marks cannot be more than 100.");
        }
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(name + " scored " + marks + " marks.");
    }
}

public class A3_Q3 {
    public static void main(String[] args) {
        try {
            Student s = new Student("Vivek", 110);
            s.display();
        } catch (MarksOutOfBoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
