public class App {
    public static void main(String[] args) throws Exception {

        Stack<Integer> stack1 = new Stack<Integer>();
        System.out.println(stack1.isEmpty());
        stack1.push(23);
        System.out.println(stack1.isEmpty());
        System.out.println(stack1.peek());
        System.out.println(stack1.pop());
    }
}
