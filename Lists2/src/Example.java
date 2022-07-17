import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example {

    public static void main(String[] args) throws Exception {
        List myList = new ArrayList();
        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("d");
        myList.add(new Integer(6));
//        System.out.println(myList.get(0));
        
        Iterator it = myList.iterator();
        while(it.hasNext()) {
        	Object o = it.next();
        	System.out.println(o);
        }
        
    }
}