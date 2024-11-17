public class Student {
    int age = 29; // Non-static variable
    String name = "ABCD"; // Non-static variable

    public static void main(String[] args) {
        Student s = new Student(); // Create an object of the Student class
        System.out.println(s.age); // Access and print the age
        System.out.println(s.name); // Access and print the name
    }
}
