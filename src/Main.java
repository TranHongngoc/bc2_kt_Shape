public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red",false);
        System.out.println(shape);


        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("indigo",false,3.5);
        System.out.println(circle);


        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.0,4.0);
        System.out.println(rectangle);

        rectangle = new Rectangle(3.0,6.0,"red",false);
        System.out.println(rectangle);
    }


}
