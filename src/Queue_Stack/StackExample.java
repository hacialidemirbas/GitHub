package Queue_Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(15);
        stack.push(6);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(isBalanced("{{{{}}}}"));


    }
    public static boolean isBalanced(String braces){
                Stack<Character> curly=new Stack<>();
        for (int i = 0; i <braces.length() ; i++) {
            curly.push(braces.charAt(i));
        }
        System.out.println(curly);
        int numberOfOpen=0;
        int numberOfClose=0;
        char ch;
        for (int i = 0; i <braces.length() ; i++) {
            ch=curly.pop();
            if(ch=='{'){
                numberOfOpen++;
            }
            else{
                numberOfClose++;
            }

        }
        if(numberOfOpen==numberOfClose){return true;

    }
        else{
            return false;
        }
}}
