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

        System.out.println(r2.getSquare());

        //r2 = rect;

        Circle c;
        c = new Circle();
        c.r = 5;
        c.x = 1;
        c.y = 2;

        System.out.println( c.getLength() );

    }
}
