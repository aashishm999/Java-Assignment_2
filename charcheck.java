public class charcheck {
    public static void main(String[] args) {
        char letter = '4';
        if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {

            if ("aeiouAEIOU".indexOf(letter) != -1)
                System.out.println("Vovel");

            else
                
            System.out.println("Consonant");

        } else
            System.out.println("Not a Letter");
    }
}
