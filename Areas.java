class Areas {
    public static void main(String args[]) {
        Areas obj = new Areas();
        obj.area(5);
        obj.area(4, 5);
        obj.area(4.5, 5.5);

    }

    void area(int a) {
        System.out.println("Area of circle is" + (3.14 * a * a));
    }

    void area(int n, int m) {
        System.out.println("Area of rectangle is:" + (n * m));
        ;

    }

    void area(double c, double d) {
        System.out.println("Area of triangle is:" + (0.5 * c * d));
    }
}