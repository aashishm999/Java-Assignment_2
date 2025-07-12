public class student {
    String name;
    int rollno;
    
    void display(){
        System.out.println("Name : " + name);
        System.out.println("Roll no. : " + rollno);

    }

    public static void main(String[] args) {
        student details = new student();
        details.name = "Ashish";
        details.rollno = 1001;
        details.display();
    }
}
