/**
 *
 * @author albinafrolova
 */
public class Student {

    private String firstName, lastName;
    private Address homeAddress, schoolAddress;

    public Student(String first, String last, Address home, Address school)

    {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
    }

    public String toString()

    {
        String result;
        result = "Student's name:\n";
        result += firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Adress:\n" + schoolAddress;
        return result;
    }
}
