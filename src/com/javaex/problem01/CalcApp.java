package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print(">> ");
			
			String num = sc.nextLine();
			
			if(num.equals("/q")) {
				System.out.println("종료합니다.");
				break;
			}
			
			String[] str = num.split(" ");
			
			switch (str[1]) {
			case "+":
				Add add = new Add();
				add.setValue(Integer.parseInt(str[0]), Integer.parseInt(str[2]));
				System.out.println(">> "+add.calculate());
				break;
			case "/":
				Div div = new Div();
				div.setValue(Integer.parseInt(str[0]), Integer.parseInt(str[2]));
				System.out.println(">> "+div.calculate());
				break;
			case "*":
				Mul mul = new Mul();
				mul.setValue(Integer.parseInt(str[0]), Integer.parseInt(str[2]));
				System.out.println(">> "+mul.calculate());
				break;
			case "-":
				Sub sub = new Sub();
				sub.setValue(Integer.parseInt(str[0]), Integer.parseInt(str[2]));
				System.out.println(">> "+sub.calculate());
				break;
			default:
				System.out.println("알 수 없는 연산입니다.");
				break;

			}
		}

		sc.close();

	}
}
