package com.javaex.practice;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		// 직사각형의 둘레와 면적을 구하는 프로그램을 작성하세요.(너비, 높이 변수 double형으로 작성)
		Scanner sc = new Scanner(System.in);
		double a,b;

		System.out.print("너비를 입력하세요: ");
		
		a = sc.nextDouble();
		
		System.out.print("높이를 입력하세요: ");
		
		b = sc.nextDouble();
		
		System.out.println("사각형의 둘레는" + (a * 2 + b * 2));
		System.out.print("사각형의 넓이는" + a * b);
		
		
	}

}
