public class overloadsum {
    int sum(int a, int b){
    return a + b;
    }

    double dsum(double a, double b){
    return a + b;
    }


public static void main(String[] args) {
    overloadsum ovs = new overloadsum();
    System.out.println("Integer sum :" + ovs.sum(4 , 5));
    System.out.println("Double sum :" + ovs.dsum(2.5, 7.2));
}
}