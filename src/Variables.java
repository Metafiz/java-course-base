public class Variables {
    public static void main(String[] args) {
        System.out.println("Работа с переменными");
        int a = 1, b = 2;
        double delta;

        delta = 1.25;
        float value = 7.54f;

        double aa = 7.54;
        float value2 = (float) (aa + 2.2);
        System.out.println(aa + 5);

        char c = 'A';
        String name = "Иван";
        System.out.println(6 + "3");
        a = 15;
        b = 4;
        System.out.println(a % b);

        int i = 10;
        System.out.print("i = " + --i);
        System.out.print("\ni = " + i);

        aa = 5;
        double bb = 0;
        System.out.println("Result = " + (aa / bb));

    }
}
