public class HiFriend {
    public static void main (String[] args) {
        String firstName = "Patrick";
        String lastName = "Rallings";
        String fullName = firstName + " " + lastName;
        System.out.println(textStructure(fullName));
    }
    public static String textStructure (String s) {
        return "Hi " + s +"!";
    }
}