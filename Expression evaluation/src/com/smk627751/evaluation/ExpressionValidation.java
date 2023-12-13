package com.smk627751.evaluation;

import java.util.Scanner;
import java.util.Stack;

public class ExpressionValidation {

	public static boolean isValid(String str)
	{
		String Operators = "+-*/%=";
		String brackets = "()[]{}";
		Stack <Character> stack = new Stack<>();
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch == '(')
			{
				stack.push(')');
			}
			else if(ch == '[')
			{
				stack.push(']');
			}
			else if(ch == '{')
			{
				stack.push('}');
			}
			else if(Operators.contains(ch+""))
			{
				if((i-1 > 0 && i+1 < str.length())
						&& !(Character.isLetterOrDigit(str.charAt(i-1)) && 
						Character.isLetterOrDigit(str.charAt(i+1))))
				{
					return false;
				}
			}
			else if(brackets.contains(ch+""))
			{
				if(stack.isEmpty() || ch != stack.pop())
				return false;
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if(isValid(str))
		{
			System.out.println("Valid");
		}
		else System.out.print("Invalid");
	}

}
