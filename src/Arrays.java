public class Arrays {
    public static void main(String[] args) {
        int arr1[] = new int[10];
        int[] arr2;
        arr2 = new int[20];

        int a = 5;
        int[] arr3 = {1, a, 7, 11};
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Длина массива arr3: " + arr3.length);
        System.out.println(arr3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        for (int day : days) {
            System.out.println(day);
        }

        arr1[0] = 123;
        arr1[1] = arr1[0] * 2;
        System.out.println(arr1[1]);

        double[][] matr = {
                {1.0, 9.0, 3.1},
                {0.2, 1.0, 5.8},
                {3.7, 0.4, 1.0}};
        for (int i = 0; i < matr.length; i++) {
            String s = "";
            for (int j = 0; j < matr[i].length; j++) {
                s += ("  " + matr[i][j]);
            }
            System.out.println(s);
        }

        int age;
        String name;

    }
}
