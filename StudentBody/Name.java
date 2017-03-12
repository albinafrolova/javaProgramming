/**
 *
 * @author albinafrolova
 */
public class Name 
{
    private String firstName, lastName;
    public Name (String first, String last)
    {
        firstName = first;
        lastName = last;       
    }
    public String toString() 
    {
        String result;
        
        result = firstName + lastName;
        return result;
    }
}
