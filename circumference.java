import java.util.Scanner;

class circumference{

    public static void radintocirc(int r) {
        System.out.println("Circumference ="+2*3.14*r);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        radintocirc(r);

        
    }
}