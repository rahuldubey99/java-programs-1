package demo;

public class circles {
    public static void main(String[] args) {
        circle c1 = new circle(2,3,5);
        circle c2 = new circle(3,0,4);

        System.out.print(c1.area());
        System.out.println(c1.circumference());
        System.out.print(c2.area());
        System.out.println(c2.circumference());

    }
}