import  implementations.*;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        testStack();
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
}
