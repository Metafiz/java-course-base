import classes.figures.*;

public class TestClasses {
    public void testChangeVals(int a, double b, String s, Circle c) {
        System.out.println("Текущие значения: " + c.r);
        a = 777;
        b = 12.34;
        s = "new string";
        c.r = 123;
        System.out.println("значения после изменений: " + c.r);
    }
    public static void main(String[] args) {
        TestClasses tc = new TestClasses();
        int a = 5;
        double d = 3.14;
        String s = "aaa";
        Circle cc = new Circle();
        cc.r = 10;
        tc.testChangeVals(a, d, s, cc);
        System.out.println("Значения после вызова: " + cc.r);

        Rectangle rect;
        rect = new Rectangle(11, 10, 20, 150, 180);
//        rect.x1 = 10;
//        rect.y1 = 20;
//        rect.x2 = 150;
//        rect.y2 = 180;

        Rectangle r2 = new Rectangle(12, 20, 25, 111, 222);
        r2.setX1(-11);
        r2.setY1(30);

        System.out.println(r2.getSquare());

        //r2 = rect;

        Circle c;
        c = new Circle();
        c.r = 5;
        c.x = 1;
        c.y = 2;

        System.out.println( c.getLength() );

        // создаём массив объектов класса Rectangle из 3х элементов
        Rectangle[] rects = new Rectangle[3];
        rects[0] = new Rectangle(1);
        rects[1] = new Rectangle(2, 110, 210);
        rects[2] = new Rectangle(3, 21, 21, 210, 220);

        // в цикле проходим по массиву
        for (Rectangle r : rects) {
            r.printInfo();
        }

    }
}
