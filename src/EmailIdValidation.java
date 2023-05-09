import java.util.Scanner;

public class EmailIdValidation {
    private String[] emails = {
        "papathan@outlook.com",
        "report@yahoo.com",
        "crusader@comcast.net",
        "heidrich@optonline.net",
        "tjensen@comcast.net",
        "dogdude@att.net",
        "campbell@msn.com",
        "specprog@aol.com",
        "juerd@verizon.net",
        "british@msn.com",
        "treeves@comcast.net",
        "nullchar@outlook.com"
    };

    public static void main(String[] args) {
        EmailIdValidation obj = new EmailIdValidation();
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter your email: ");
        String e = s.next();
        if (obj.validateEmail(e)) {
            System.out.println("The entered email is valid! 🎉");
        } else {
            System.out.println("The entered email is NOT valid! ☹️");
        }
    }

    public boolean validateEmail(String email) {
        for (String e: this.emails) {
            if (email.equals(e)) {
                return true;
            }
        }
        return false;
    }
}
