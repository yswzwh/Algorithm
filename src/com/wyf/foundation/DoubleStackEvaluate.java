package com.wyf.foundation;

import java.util.Stack;

public class DoubleStackEvaluate {
	
	public static void main(String[] args) {
		String expr = "( ( 2 + 1 ) + ( ( 2 + 3 ) * ( 4 * 5 ) ) )";
		String[] s = expr.split(" ");
		Stack<String> ops = new Stack<String>();
		Stack<Double> vals = new Stack<Double>();
		
		for(int i=0; i<s.length; i++) {
			if(s[i].equals("+")) {
				ops.push("+");
			} else if(s[i].equals("-")) {
				ops.push("-");
			} else if(s[i].equals("*")) {
				ops.push("*");
			} else if(s[i].equals("/")) {
				ops.push("/");
			} else if(s[i].equals("(")) {
				
			} else if(s[i].equals(")")) {
				double d2 = vals.pop();
				double d1 = vals.pop();
				
				String opt = ops.pop();
				if(opt.equals("+")) {
					vals.push(d1+d2);
				} else if(opt.equals("-")) {
					vals.push(d1-d2);
				} else if(opt.equals("*")) {
					vals.push(d1*d2);
				} else if(opt.equals("/")) {
					vals.push(d1/d2);
				}
			} else {
				vals.push(Double.parseDouble(s[i]));
			}
		}
		
		System.out.println(vals.pop());
	}

}
