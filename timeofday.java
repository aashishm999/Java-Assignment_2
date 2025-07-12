public class timeofday {
    public static void main(String[] args) {
        int time = 9;

        if (time >= 1 && time <= 12)
            System.out.println("Morning");
            
        else if (time >=13 && time <= 15)
        System.out.println("Afternoon");

        else if (time >= 16 && time <= 20)
        System.out.println("Evening");

        else
        System.out.println("Night");
    }
}
