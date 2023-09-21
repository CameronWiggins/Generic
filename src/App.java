public class App {
    public static void main(String[] args) throws Exception {

        /*Stack<Integer> stack1 = new Stack<Integer>();
        System.out.println(stack1.isEmpty());
        stack1.push(23);
        System.out.println(stack1.isEmpty());
        System.out.println(stack1.peek());
        System.out.println(stack1.pop());
        */

        System.out.println(postFix("18*"));
        System.out.println(postFix("18+"));
        System.out.println(postFix("618*+"));
        System.out.println(postFix("9720+**"));
        System.out.println(postFix("111111+++++"));

    }

    public static int postFix(String expression)
    {
        Stack<String> solver = new Stack<String>();
        for (int i = 0; i < expression.length(); i++)
        {
            String newTop = expression.substring(i,i + 1);
            if (newTop.equals("+"))
            {
                int numOne = Integer.parseInt(solver.pop());
                int numTwo = Integer.parseInt(solver.pop());
                solver.push(numOne + numTwo + "");
            }
            else if (newTop.equals("*"))
            {
                int numOne = Integer.parseInt(solver.pop());
                int numTwo = Integer.parseInt(solver.pop());
                solver.push(numOne * numTwo + "");
            }
            else
            {
                solver.push(newTop);
            }
        }
        return Integer.parseInt(solver.pop());
    } 
}
