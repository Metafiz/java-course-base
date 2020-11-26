import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        String s = "test";
        ArrayList<String> list = new ArrayList<String>();
        list.add( "is" );
        list.add( "is" );
        list.add( "a" );
        list.add( "a" );
        list.add( null );
        list.add( list.size(), s );
        list.add( 0, "This");
        // list.add( new Double(12.4) ); ошибка компиляции
        System.out.println( list );
        displayCollection( list );

    }
    static void displayCollection( Collection<String> items ) {
        final String BLANK = " ";
        System.out.println("The size of the Collection is : " + items.size());
        StringBuilder sb = new StringBuilder();
        for ( String s : items ) sb.append( s ).append( BLANK );
        System.out.println( sb.toString() );
    }

}
