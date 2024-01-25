public class Main {
    public static void main(String[] args) {
       Queue queue= new Queue(4);


    }
    class Queue {
    void Queue(int length){
            this.length=length;
        }


        void enqueue (int num){
            queue[loc] =num;
            loc++;
        }

        int dequeue(){
            int return_val = queue[loc];
            queue[loc]= 0;
            loc--;
            return return_val;
        }


        boolean isFull(int [] array){
            return loc==length;
        }

        boolean isEmpty(int[]array){
            return loc==0;
        }



        int loc = 0;
        int [] queue;
        int length;
    }
}