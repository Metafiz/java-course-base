public class TestClasses {
    public static void main(String[] args) {
        Rectangle rect;
        rect = new Rectangle();
        rect.x1 = 10;
        rect.y1 = 20;
        rect.x2 = 150;
        rect.y2 = 180;

        Rectangle r2 = new Rectangle();
        r2.x1 = 20;
        r2.y1 = 25;
        r2.x2 = 111;
        r2.y2 = 222;

        r2 = rect;

        Circle c;
        c = new Circle();
        c.r = 5;
        c.x = 1;
        c.y = 2;

        System.out.println( c.getLength() );

    }
}
