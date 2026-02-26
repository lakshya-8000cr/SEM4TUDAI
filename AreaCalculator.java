class AreaCalculator {

    double area(double radius) {
        double ans = 3.14 * radius * radius;
        return ans;
    }

    double area(double length, double breadth) {
        return length * breadth;
    }

    double area(double base, double height, boolean triangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();

        System.out.println("Circle: " + obj.area(5));
        System.out.println("Rectangle: " + obj.area(4,6));
        System.out.println("Triangle: " + obj.area(3,4,true));
    }
}