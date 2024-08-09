import java.util.ArrayList;
import java.util.Collection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<String>();

        arr.add('oi');
        arr.add('tchau');
        arr.add('fusca');

        Collection.sort(arr);
        for(String i : arr) {
            System.out.println(i);
        }

    }
}