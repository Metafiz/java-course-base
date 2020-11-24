public class TestOverload {
    public int avg( int a, int b ) {
        return (a + b)/2;
    }
    public double avg( double a, double b ) {
        return (a + b)/2;
    }
    public double avg( double a, double b, double c ) {
        return (a + b + c)/3;
    }

    public double avg( double ... numbers ) {
        double sum = 0;
        for( double n : numbers ) {
            sum += n;
        }
        return( sum / numbers.length );
    }


    public static void main(String[] args) {
        TestOverload to = new TestOverload();
        to.avg(2, 4);
        to.avg(2.2, 4.4);
        to.avg(1.1, 2.2, 3.3);
        to.avg( 2.0f, 5.45f, 4.0f, 3.4f );
    }
}
