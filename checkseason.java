public class checkseason {
    public static void main(String[] args) {
        int month = 7;

        if (month == 12 || month == 1 || month == 2 || month == 11)
        System.out.println("Winter");
        
        else if (month >= 3 && month <= 6)
        System.out.println("Summer");

        else if (month >= 7 && month <= 10)
        System.out.println("Monsoon");
            
        else
        System.out.println("Enter valid month number");
        
    }
}
