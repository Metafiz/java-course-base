import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        String template = "^[A-Z]\\w*",
                str = "V%";
        Pattern p = Pattern.compile( template );
        Matcher m = p.matcher( str );
        boolean b = m.matches();
        int pos = m.start();
        System.out.printf("Строка %s соответствует шаблону %s? %b, позиция = %d", str, template, b, pos);

    }

}
