public class trangletype {
    public static void main(String[] args) {
        int a=5, b=10, c=5;

        if (a == b && b == c)
        System.out.println("Equilateral");
        
        else if (a == b || b == c || c == a)
        System.out.println("Isosceles");

        else
        System.out.println("Scales");
        
    }
}
