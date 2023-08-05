import Searching.BinarySearch;
import  implementations.*;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        testBinarySearch();
    }
    public static void testBinarySearch() {
        BinarySearch binarySearch  = new BinarySearch();
        int arr[] = {1, 1, 2, 3, 3, 4, 6, 6, 7, 8, 9, 9};
        int find = binarySearch.Search(arr, 6, arr.length, 0);
        System.out.println(find);
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
    public static void testSinglyLinkedList() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.addFirst(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addFirst(0);
        linkedList.addInside(2, 4);
        printLinkedList(linkedList);
        System.out.println("\nPhần tử đầu tiên: " + linkedList.getFirst());
        System.out.println("Phần tử cuối cùng: " + linkedList.getLast());
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.removeLast();
        printLinkedList(linkedList);
        System.out.println("\nKích thước danh sách: " + linkedList.size());
        System.out.println("Danh sách có rỗng hay không: " + linkedList.isEmpty());
    }
    public static void printLinkedList(SinglyLinkedList<?> linkedList) {
        System.out.println("Danh sách Node: ");
        Iterator<?> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
