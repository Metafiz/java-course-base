public class Loops {
    public static void main(String[] args) {
        int i = 0;
        final int N = 10;
//        while (i < N) {
//            System.out.println(++i);
//        }

        do {
            ++i;
            if (i % 2 == 0) continue;
            System.out.println(i);
        } while (i < N);

        int n=10, sum=0;
        for ( i = 0; i < n; i++ ) {
            sum += i*i;
        }
        System.out.println("sum=" + sum);

        i = 1;
        int j = 2;
        outer: while (i < j) {
            ++i;
            inner: do {
                ++j;
                if( j % 3 == 0 ) continue outer;
                if( i % 3 == 0 ) break inner;
                if( i % 3 == 1 ) break outer;
                System.out.println( i * j );
            } while (j < i);
            System.out.println( i + j );
        }

    }
}
