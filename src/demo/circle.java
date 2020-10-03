package demo;

public class circle {
    double radius,x,y;

    circle (double x, double y, double radius) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
    double area(){
        return (22/7)*radius*radius;
    }
    double circumference(){
        return (22/7)*2*radius;
    }

}
