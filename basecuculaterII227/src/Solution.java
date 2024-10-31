import java.util.Stack;

public class Solution {
    public int calculate(String s) {
        String b = s.replace(" ", "");
        String prob[];
        prob=b.split("(?<=[-+*/()])|(?=[-+*/()])");
        if(prob.length==1){
            return Integer.parseInt(b);
        }
        Stack<String> stack = new Stack<>();
        for (int i=0;i<prob.length;i++){
            int a;
            switch (prob[i]){
                case "*":
                    a = Integer.parseInt(stack.pop());
                    stack.push(Integer.toString(a*Integer.parseInt(prob[i+1])));
                    i++;
                    break;
                case "/":
                    a = Integer.parseInt(stack.pop());
                    stack.push(Integer.toString(a/Integer.parseInt(prob[i+1])));
                    i++;
                    break;
                default:
                    stack.push(prob[i]);
                    break;
            }
        }
//        System.out.println(stack);
        int result = 0;
        int a = 0;
        while (stack.size()>0) {
            String token = stack.pop();
//                    System.out.println("pop out:"+token);
            switch (token) {
                case "+":
                    result += a;
                    break;
                case "-":
                    result -= a;
                    a = 0;
                    break;
                default:
                    a = Integer.parseInt(token);
                    break;
            }
        }
        result += a;
//        System.out.println(result);
        return result;
    }
}
