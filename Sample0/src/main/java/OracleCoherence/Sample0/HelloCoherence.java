package OracleCoherence.Sample0;

/**
 * Hello world!
 *
 */
import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedMap;

public class HelloCoherence {
    // ----- static methods -------------------------------------------------

    public static void main ( final String[] asArgs ) {
        final NamedMap<String, String> map = CacheFactory.getCache( "welcomes to in-memory app" );

        System.out.printf( "Accessing the map \"%s\" containing %d entries\n", map.getName(), map.size() );

        map.put( "item_0", "{'item':'milk','amount':1}" );
        map.put( "item_1", "{'item':'egg'}'amount':1" );
        map.put( "item_2", "{'itam':'oil','amount':1}" );

        // list
        map.entrySet().forEach( System.out::println );
    }
}
