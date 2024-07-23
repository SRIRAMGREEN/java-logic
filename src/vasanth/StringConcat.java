package vasanth;

public class StringConcat {

    // DO NOT write a main method here

    public static String getUserName(String firstName, String lastName) {
        if (firstName == null) {
            return null;  // Or you can handle this case differently if required
        }

        firstName = capitaliseFirstLetter(firstName);

        if (lastName == null) {
            return firstName;
        }

        lastName = capitaliseFirstLetter(lastName);

        return lastName + ", " + firstName;
    }

    public static String capitaliseFirstLetter(String s) {
        if (s == null || s.length() < 1) {
            return s;
        }

        char[] chars = s.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);

        return String.valueOf(chars);
    }

    // Optional: Test main method for local testing (can be removed if not needed)
    public static void main(String[] args) {
        String firstName = "john";
        String lastName = "smith";

        String result = getUserName(firstName, lastName);
        System.out.println("Result: " + result);  // Should print: "Smith, John"

        String firstNameOnly = "john";
        result = getUserName(firstNameOnly, null);
        System.out.println("Result: " + result);  // Should print: "John"
    }
}
