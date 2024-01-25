import ibadts.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<Integer>queue=new Queue<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println(": ");

        while (scanner.hasNextInt()) {
            int n  = scanner.nextInt();
            queue.enqueue(n);
        }

        int n = 0;
        while (!queue.isEmpty()){
            queue.dequeue();
            n ++;

        }
        System.out.println(n);
    }
}