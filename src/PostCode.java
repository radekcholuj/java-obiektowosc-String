public class PostCode {
    public static void main(String[] args) {
        String postcode = "264700";

        if (postcode.length() == 6 && postcode.charAt(2) == '-'){
            System.out.println("Podany kod pocztowy jest poprawny");
        } else {
            System.out.println("Podany kod pocztowy jest niepoprawny");
        }
    }
}

