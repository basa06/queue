import ibadts.*;
import java.util.Scanner;
//could use a list, but in a queue it is evident that first in first out.
//have two methods to enqueue and dequeue
public class Main {
    public static void main(String[] args) {
        Queue<Integer>queue=new Queue<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("we need some ints: ");
        int max = 0;

        while (scanner.hasNextInt()) {
            int n  = scanner.nextInt();
            queue.enqueue(n);
            if (n > max)
                max = n;
        }
        System.out.println("done");
        while (!queue.isEmpty()){
            int n = queue.dequeue();
            System.out.println((double)(n)/(max)*100);
        }
    }
}