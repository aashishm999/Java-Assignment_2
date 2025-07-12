public class statmethod {
    public static void hello() {
        System.out.println("Hello guys");
    }

    public void hie(){
        System.out.println("Hie guys");
    }

    public static void main(String[] args) {
        statmethod.hello();

        statmethod hiee = new statmethod();
            hiee.hie();
            
    }
}
