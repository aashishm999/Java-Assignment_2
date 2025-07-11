public class largestofthree {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        if ((a >= b) && (a >= c))
        System.out.println("Biggest is " + a);
        else if (b >= a && b >= c)
        System.out.println("Biggest is " + b);
        else
        System.out.println("Biggest is " + c); 
    }
}
