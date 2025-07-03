public class Person {
    private String name;
    private MyDate dateOfBirth;

    public Person(String name, MyDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public MyDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String toString() {
        return "Name: " + name + ", DOB: " + dateOfBirth;
    }
}
