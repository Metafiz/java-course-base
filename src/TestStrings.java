public class TestStrings {
    public static void stringReplace( String text ) {
        text = text.replace('j','i');
        System.out.println(text);
    }
    public static void bufferReplace( StringBuilder text ) {
        text.append('C');
    }
    public static void main(String[] args) {
        String textString = new String("java");
        StringBuilder sb = new StringBuilder("java");
        stringReplace( textString );
        bufferReplace( sb );
        System.out.println( textString );
        System.out.println(sb.toString());
    }

}
