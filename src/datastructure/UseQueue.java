package datastructure;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;


public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */

    Queue<String > members = new LinkedList<>();
        members.add("MOM");
        members.add("DAD");
        members.add("Sis");
        members.add("Bro");
        members.add("myself");
        System.out.println(members.poll());
        System.out.println(members.peek());


        Iterator n = members.iterator();
        while (n.hasNext()){
            System.out.println(n.next());
        }
        members.remove();
        System.out.println("After removing  member: ");
        for(String m:members){
            System.out.println(m);
        }





    }
}
