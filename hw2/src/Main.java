import ibadts.*;

public class Main {
    public static void main(String[] args) {
        int[]nums = {1,2,3,4,5};
        StaticQueue queue = new StaticQueue<>(4);
        int start =0;
        int elem=0;
        int end= nums.length-1;
        boolean beg = true;
        while (start<=end&&!queue.isFull()){
            if (beg==true){
                elem=nums[start];
                start++;
            }
            else {
                elem = nums[end];
                end--;
            }
            queue.enqueue(elem);
            beg=!beg;
        }
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}