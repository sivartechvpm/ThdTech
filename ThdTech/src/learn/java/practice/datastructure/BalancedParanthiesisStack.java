package learn.java.practice.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalancedParanthiesisStack {

	
	public static void main(String args[]) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String input=br.readLine();
		
		
		
		Stack<Character> stack = new Stack<>();
		
		//System.out.println(stack.size());
		//System.out.println(stack.pop());
		
		char[] arr = input.toCharArray();
		
		
		boolean isBalancedParanthiesis = true;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]=='{' || arr[i]=='[' || arr[i]=='(') {
				stack.push(arr[i]);
			}
			
			else {
				
				
				switch (arr[i]) {
				
				case '}': 
					if('{'==stack.pop()) {
						continue;
					}else {
						isBalancedParanthiesis=false;
						break;
					}
					
					
					
				case ']':
					if('['==stack.pop()) {
						continue;
					}else {
						isBalancedParanthiesis=false;
						break;
					}
				
				case ')':
					if('('==stack.pop()) {
						continue;
					}else {
						isBalancedParanthiesis=false;
						break;
					}
					
					
				
				
				default:
					throw new IllegalArgumentException("Unexpected value: " + arr[i]);
				}
				
			}
			
		}
		
		if(stack.size()!=0) {
			isBalancedParanthiesis=false;
		}
		
		if(isBalancedParanthiesis) {
			System.out.println("IS BALANCED");
		}else {
			System.out.println("NOT BALANCED");
		}
		
		
		
		
		//{[(])}
		
		
		
		
		
		
	}
	
	
}
