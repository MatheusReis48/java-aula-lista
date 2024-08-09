import java.util.ArrayList;
import java.util.Collection;

public class SuperHeroi {
        ArrayList<String> arr = new ArrayList<String>();

        arr.add('oi');
        arr.add('tchau');
        arr.add('fusca');

        Collection.sort(arr);
        for(String i : arr) {
            System.out.println(i);
    }

}
