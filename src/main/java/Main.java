import  implementations.*;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        testQueue();
    }
    public static void testStack(){
        Stack<Integer> stack = new Stack<>();
        System.out.print("Push + Peek: ");
        for(int i = 0;i<=10; i++){
            stack.push(i);
            System.out.print(stack.peek()+" ");
        }
        System.out.println();
        System.out.println("Size: "+ stack.size());
        System.out.println("Pop: "+stack.pop());
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.println("Empty:"+stack.isEmpty() );
    }
    public static void testQueue() {
        Queue<Integer> queue = new Queue<>();
        queue.offer(1);
        queue.offer(3);
        queue.offer(6);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Size: " + queue.size());
        System.out.println("Queue elements:");
        for (Integer element : queue) {
            System.out.println(element);
        }
        System.out.println("Dequeue elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println("Size after dequeue: " + queue.size());
    }

}
