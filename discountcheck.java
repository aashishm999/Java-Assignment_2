public class discountcheck {
    public static void main(String[] args) {
        int dis = 799;
        if (dis >= 1000) 
            System.out.println("20% Discount");
        
        else if (dis >= 800) 
            System.out.println("40% Discount");
            
        else if (dis >= 600) 
            System.out.println("60% Discount");
            
        else
            System.out.println("No Discount");
        
    }

}
