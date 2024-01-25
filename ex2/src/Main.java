
import ibadts.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue <String> q = new Queue<>();
        q.enqueue("A");
        q.enqueue("B");
        q.enqueue("C");
        q.enqueue("D");
        reverse(q);


while (!q.isEmpty()){
    System.out.println(q.dequeue());
}


//iterative solution
        Queue <String> t = new Queue<>();
        Stack stack = new Stack();
        t.enqueue("A");
        t.enqueue("B");
        t.enqueue("C");
        t.enqueue("D");

        System.out.println();


while (!t.isEmpty()){
    stack.push(t.dequeue());

}
while (!stack.isEmpty()){
    t.enqueue((String) stack.pop());
}


while (!t.isEmpty()){
    System.out.println(t.dequeue());
}




    }
    static void reverse (Queue <String> q){

        if (q.isEmpty())
            return;

        else {
            String e = q.dequeue();
            reverse(q);
            q.enqueue(e);
        }






    }
}