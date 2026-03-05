package bai03;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Character> stack = new Stack<>();
        System.out.print("Nhap bieu thuc: ");
        String equation = sc.nextLine();
        if (equation.isBlank()){
            System.out.println("Bieu thuc khong hop le");
            return;
        }

        for (int i = 0; i < equation.length(); i++) {
            char currentChar = equation.charAt(i);

            if (currentChar == '{' || currentChar == '[' || currentChar == '('){
                stack.push(currentChar);
            }
            if (currentChar == '}' || currentChar == ']' || currentChar == ')'){
                if(stack.isEmpty()){
                    stack.push(currentChar);
                    break;
                }
                if (!stack.contains('{') && currentChar == '}'){
                    stack.push(currentChar);
                    break;
                }else if (!stack.contains('(') && currentChar == ')'){
                    stack.push(currentChar);
                    break;
                } else if (!stack.contains('[') && currentChar == ']'){
                    stack.push(currentChar);
                    break;
                }
            }
            if ('{' == stack.peek() && currentChar == '}'){
                stack.pop();
            }else if ('[' == stack.peek() && currentChar == ']'){
                stack.pop();
            }else if ('(' == stack.peek() && currentChar == ')'){
                stack.pop();
            }


        }
        System.out.println("Ket qua: " + stack.isEmpty());
    }
}

