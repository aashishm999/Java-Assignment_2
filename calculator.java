public class calculator {

    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        calculator cal = new calculator();
        System.out.println("Addition : " + cal.add(50, 10));

        System.out.println("Substraction : " + cal.sub(50, 10));

        System.out.println("Multiplication : " + cal.add(50, 10));

        System.out.println("Division : " + cal.add(50, 10));

    }

}
